package br.com.aevee.nsPortFinanc.DAL;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.aevee.port_finan.adiantamento.DTAcompanhamentoINB;
import br.com.aevee.port_finan.adiantamento.DTListarINB;
import br.com.aevee.port_finan.adiantamento.DTListarOUT;
import br.com.aevee.port_finan.adiantamento.DTSolicitacaoINB;
import br.com.aevee.port_finan.adiantamento.SIADIANTAMENTOReq;
import br.com.aevee.port_finan.adiantamento.SIADIANTAMENTOReqService;
import br.com.aevee.port_finan.adiantamento.DTListarOUT.Response;
import br.com.aevee.port_finan.shared.DTDateRange;
import br.com.aevee.port_finan.shared.DTHeader;
import br.com.aevee.port_finan.shared.DTMsg;
import br.com.aevee.port_finan.shared.DTRange;

public class Adiantamento extends Base {
	public Adiantamento() {
		super(SIADIANTAMENTOReqService.class);
	}

	public List<Response> getALL(List<String> emprs, List<String> lifnrs) {

		DTListarINB listarInb = new DTListarINB();
		for (String empr : emprs) {
			DTRange rangeSBUKRS = new DTRange();
			rangeSBUKRS.setOPTION("EQ");
			rangeSBUKRS.setLOW(empr);
			rangeSBUKRS.setSIGN("I");
			listarInb.getSBUKRS().add(rangeSBUKRS);
		}
		
		for (String lifnr : lifnrs) {
			DTRange rangeSLIFNR = new DTRange();
			rangeSLIFNR.setOPTION("EQ");
			rangeSLIFNR.setLOW(lifnr);
			rangeSLIFNR.setSIGN("I");
			listarInb.getSLIFNR().add(rangeSLIFNR);
		}

		SIADIANTAMENTOReq siAdiamtamento = (SIADIANTAMENTOReq) super
				.getInterface();

		DTListarOUT dtListar = new DTListarOUT();

		dtListar = siAdiamtamento.listar(listarInb);

		return dtListar.getResponse();

	}

	public List<String> Solicitar(String usname, String lifnr,
			List<DTSolicitacaoINB.Input> solicitacoes) {

		List<String> retorno = new ArrayList<String>();
		SIADIANTAMENTOReq siAdiamtamento = (SIADIANTAMENTOReq) super
				.getInterface();
		DTSolicitacaoINB solicitacaoINB = new DTSolicitacaoINB();

		DTHeader header = new DTHeader();
		header.setLIFNR(lifnr);
		header.setUSNAME(usname);

		solicitacaoINB.setHeader(header);
		solicitacaoINB.getInput().addAll(solicitacoes);

		br.com.aevee.port_finan.adiantamento.DTSolicitacaoOUT solicitacaoOUT = null;
		try {
			solicitacaoOUT = siAdiamtamento.solicitacao(solicitacaoINB);

			if (solicitacaoOUT.getResult().getSTATUS().equals(BigInteger.ZERO)) {
				retorno.add("Solicita��o realizada com Sucesso");
			} else {
				for (DTMsg mensagem : solicitacaoOUT.getResult().getMSG()) {
					retorno.add(mensagem.getMSG());
				}
			}
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
			retorno.add("Falha Interna.");
		}

		return retorno;
	}

	public List<br.com.aevee.port_finan.adiantamento.DTAcompanhamentoOUT.Response> getAcompanhamento(
			List<String> emprs, List<String> lifnrs,
			XMLGregorianCalendar dtCompensacaoDe,
			XMLGregorianCalendar dtCompensacaoAte, String status,
			XMLGregorianCalendar dtSolicitacaoDe,
			XMLGregorianCalendar dtSolicitacaoAte) {
		SIADIANTAMENTOReq siAdiamtamento = (SIADIANTAMENTOReq) super
				.getInterface();
		DTAcompanhamentoINB acompanhamentoInb = new DTAcompanhamentoINB();

		for (String empr : emprs) {

			DTRange rangeSBUKRS = new DTRange();// * Empresa
			rangeSBUKRS.setOPTION("EQ");
			rangeSBUKRS.setLOW(empr);
			rangeSBUKRS.setSIGN("I");
			acompanhamentoInb.getSBUKRS().add(rangeSBUKRS);

			
		}
		
		for (String lifnr : lifnrs) {
			// *********************************************************************
						DTRange rangeSLIFNR = new DTRange(); // * Fornecedor
						rangeSLIFNR.setOPTION("EQ");
						rangeSLIFNR.setLOW(lifnr);
						rangeSLIFNR.setSIGN("I");
						acompanhamentoInb.getSLIFNR().add(rangeSLIFNR);
		}

		// *********************************************************************
		if (dtCompensacaoDe != null) {
			DTDateRange rangeSAUGDT = new DTDateRange();// Data de Compensação
														// [UI] Range Data
														// Limitado 1 Ms BT
			rangeSAUGDT.setOPTION("BT");
			rangeSAUGDT.setLOW(dtCompensacaoDe);
			rangeSAUGDT.setHIGH(dtCompensacaoAte);
			rangeSAUGDT.setSIGN("I");
			acompanhamentoInb.getSAUGDT().add(rangeSAUGDT);
		}

		// *********************************************************************
		if (status.equals("T")) // *
		// I EQ P => Pendente
		// I EQ A => Aprovado
		// I EQ R => Rejeitado
		{

			DTRange rangeSSTATUSP = new DTRange();
			rangeSSTATUSP.setOPTION("EQ");
			rangeSSTATUSP.setLOW("P");
			rangeSSTATUSP.setSIGN("I");
			acompanhamentoInb.getSSTATUS().add(rangeSSTATUSP);

			DTRange rangeSSTATUSA = new DTRange();
			rangeSSTATUSA.setOPTION("EQ");
			rangeSSTATUSA.setLOW("A");
			rangeSSTATUSA.setSIGN("I");
			acompanhamentoInb.getSSTATUS().add(rangeSSTATUSA);

			DTRange rangeSSTATUSR = new DTRange();
			rangeSSTATUSR.setOPTION("EQ");
			rangeSSTATUSR.setLOW("R");
			rangeSSTATUSR.setSIGN("I");
			acompanhamentoInb.getSSTATUS().add(rangeSSTATUSR);

		} else {
			DTRange rangeSSTATUS = new DTRange();// *
			// I EQ P => Pendente
			// I EQ A => Aprovado
			// I EQ R => Rejeitado
			rangeSSTATUS.setOPTION("EQ");
			rangeSSTATUS.setLOW(status);
			rangeSSTATUS.setSIGN("I");
			acompanhamentoInb.getSSTATUS().add(rangeSSTATUS);
		}

		// *********************************************************************
		DTDateRange rangeSERDAT = new DTDateRange();// Data Solicitação* Limite
													// 1 Mês BT
		rangeSERDAT.setOPTION("BT");
		rangeSERDAT.setLOW(dtSolicitacaoDe);
		rangeSERDAT.setHIGH(dtSolicitacaoAte);
		rangeSERDAT.setSIGN("I");
		acompanhamentoInb.getSERDAT().add(rangeSERDAT);

		br.com.aevee.port_finan.adiantamento.DTAcompanhamentoOUT acompanhamentoOUT = siAdiamtamento
				.acompanhamento(acompanhamentoInb);

		return acompanhamentoOUT.getResponse();
	}
	
	public br.com.aevee.port_finan.adiantamento.DTRecalculoOUT getRecalcular(String usname, String lifnr, List<DTSolicitacaoINB.Input> listInput, FacesContext context) {
		
		SIADIANTAMENTOReq siAdiamtamento = (SIADIANTAMENTOReq) super
				.getInterface();

		DTSolicitacaoINB mtRecalculoReq = new DTSolicitacaoINB();
		
		DTHeader header = new DTHeader();
		header.setLIFNR(lifnr);
		header.setUSNAME(usname);

		mtRecalculoReq.setHeader(header);
		mtRecalculoReq.getInput().addAll(listInput);
		
		//br.com.netshoes.port_finan.adiantamento.DTListarOUT retorno = siAdiamtamento.recalcular(mtRecalculoReq);
		br.com.aevee.port_finan.adiantamento.DTRecalculoOUT retorno = siAdiamtamento.recalcular(mtRecalculoReq);

		if (!retorno.getResult().getSTATUS().equals(BigInteger.ZERO)) {
			
			for (DTMsg mensagem : retorno.getResult().getMSG()) {
				FacesMessage msg = new FacesMessage(mensagem.getMSG());
				context.addMessage(null, msg);
			}
		}
		
		return retorno;
	}

	
}



