package br.com.aevee.nsPortFinanc.controller;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.beanutils.BeanUtils;
import org.primefaces.event.SelectEvent;

import br.com.aevee.nsPortFinanc.Excel.JavaObjectToExcelSheet;
import br.com.aevee.nsPortFinanc.Excel.SolicitacaoPlanilha;
import br.com.aevee.port_finan.adiantamento.DTSolicitacaoINB;
import br.com.aevee.port_finan.adiantamento.DTZCTFI027;
import br.com.aevee.port_finan.adiantamento.DTAcompanhamentoOUT.Response;
import br.com.aevee.port_finan.adiantamento.DTSolicitacaoINB.Input;
import br.com.aevee.port_finan.log_in.DTFornecedores;
import br.com.aevee.port_finan.shared.DTHeader;
import br.com.aevee.port_finan.shared.DTMsg;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;

@SessionScoped
@ManagedBean
public class SolicitacaoAcompanhamentoAntecipacaoFinanceiraBean extends
		AbstractManagedBean {

	// Attribute
	private List<ResponseExt> response;
	private List<ResponseExt> selectedResponse;
	private List<ResponseExt> selectedResponseRecalculado;
	private List<ResponseExt> selectedResponseParaAgendar;
	private ResponseExt selectedOneResponse;
	private Map<String, String> fornecedores;
	private Boolean bollSelecionadoTudo = true;
	private String opcaoSelecionada = "1";

	private Boolean disabled = true;
	private String lifnr;
	private List<String> lifnrSelecinado;
	private String internolifnr;
	private XMLGregorianCalendar novaDataAnteciopacao;
	private String empr;

	private Double totalDMBTR;
	private Double totalDMBTRCRD;
	private Double totalVLRJRANT;
	private Double totalVLRLIQANT;
	private Double totalVRTXOPER;

	// Constructors
	public SolicitacaoAcompanhamentoAntecipacaoFinanceiraBean() {
		fornecedores = new HashMap<String, String>();

		for (DTFornecedores fornecedor : this.getUsuarioSession()
				.getFornecedores()) {

			if (new br.com.aevee.nsPortFinanc.DAL.Fornecedores()
					.getByLIFNR(fornecedor.getLIFNR()) != null)
				fornecedores.put(
						CnpjMask(fornecedor.getCNPJ()) + " - " + fornecedor.getNAME1()
								, fornecedor.getLIFNR());
		}
	}

	@PostConstruct
	public void init() {
		selectedResponse = new ArrayList<ResponseExt>();
		selectedResponseRecalculado = new ArrayList<SolicitacaoAcompanhamentoAntecipacaoFinanceiraBean.ResponseExt>();
		selectedResponseParaAgendar = new ArrayList<SolicitacaoAcompanhamentoAntecipacaoFinanceiraBean.ResponseExt>();
		/*
		 * if (!this.getUsuarioInterno()) { atualizaGrid(); }
		 */

	}

	// GETTER E SETTER
	public List<ResponseExt> getResponse() {
		return response;
	}

	public Map<String, String> getFornecedores() {
		return fornecedores;
	}

	public List<String> getLifnrSelecinado() {
		return lifnrSelecinado;
	}

	public void setLifnrSelecinado(List<String> lifnrSelecinado) {
		this.lifnrSelecinado = lifnrSelecinado;
	}

	public void setResponse(List<ResponseExt> response) {
		this.response = response;
	}

	public List<ResponseExt> getSelectedResponse() {
		return selectedResponse;
	}

	public void setSelectedResponse(List<ResponseExt> selectedResponse) {
		this.selectedResponse = selectedResponse;
	}
	
	public List<ResponseExt> getSelectedResponseRecalculado() {
		return selectedResponseRecalculado;
	}

	public void setSelectedResponseRecalculado(List<ResponseExt> selectedResponseRecalculado) {
		this.selectedResponseRecalculado = selectedResponseRecalculado;
	}
	
	public List<ResponseExt> getSelectedResponseParaAgendar() {
		return selectedResponseParaAgendar;
	}

	public void setSelectedResponseParaAgendar(
			List<ResponseExt> selectedResponseParaAgendar) {
		this.selectedResponseParaAgendar = selectedResponseParaAgendar;
	}

	public ResponseExt getSelectedOneResponse() {
		return selectedOneResponse;
	}

	public void setSelectedOneResponse(ResponseExt selectedOneResponse) {
		this.selectedOneResponse = selectedOneResponse;
	}

	public String getLifnr() {
		return lifnr;
	}

	public void setLifnr(String lifnr) {
		this.lifnr = lifnr;
	}

	public XMLGregorianCalendar getNovaDataAnteciopacao() {
		return novaDataAnteciopacao;
	}

	public void setNovaDataAnteciopacao(XMLGregorianCalendar novaDataAnteciopacao) {
		this.novaDataAnteciopacao = novaDataAnteciopacao;
	}

	public String getOpcaoSelecionada() {
		return opcaoSelecionada;
	}

	public void setOpcaoSelecionada(String opcaoSelecionada) {
		this.opcaoSelecionada = opcaoSelecionada;
	}

	public String getEmpr() {
		return empr;
	}

	public void setEmpr(String empr) {
		this.empr = empr;
	}

	public Boolean getDisabled() {
		return disabled;
	}

	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;
	}

	public Double getTotalDMBTR() {
		return totalDMBTR;
	}

	public Double getTotalDMBTRCRD() {
		return totalDMBTRCRD;
	}

	public Double getTotalVLRJRANT() {
		return totalVLRJRANT;
	}

	public Double getTotalVLRLIQANT() {
		return totalVLRLIQANT;
	}

	public Double getTotalVRTXOPER() {
		return totalVRTXOPER;
	}

	public Boolean getBollSelecionadoTudo(){
		return bollSelecionadoTudo;
	}
	
	// Method
	
	public void preparaTelaAceite(){
		selectedResponseParaAgendar.clear();
		if(opcaoSelecionada.equals("1"))
		{
			for (ResponseExt responseExt : selectedResponse) {
				selectedResponseParaAgendar.add(new ResponseExt(responseExt));				
			}
		}
		else
		{
			for (ResponseExt responseExt : selectedResponseRecalculado) {
				selectedResponseParaAgendar.add(new ResponseExt(responseExt));				
			}
		}
	}

	public void recalculo(){
		
		opcaoSelecionada = "1";
		selectedResponseRecalculado.clear();
		List<String> mensagemErro = new ArrayList<String>();

		for (String itemLifnr : lifnrSelecinado) {
			String CNPJ = "";
			List<br.com.aevee.port_finan.adiantamento.DTSolicitacaoINB.Input> solicitacoes = new ArrayList<DTSolicitacaoINB.Input>();

			
			
			for (ResponseExt item : selectedResponse) {

				if (item.getLIFNR().equals(itemLifnr)) {
					br.com.aevee.port_finan.adiantamento.DTSolicitacaoINB.Input input = new br.com.aevee.port_finan.adiantamento.DTSolicitacaoINB.Input();

					input.setBELNR(item.getBELNR());
					input.setBUKRS(item.getBUKRS());
					input.setBUZEI(item.getBUZEI());
					//input.setDIASVCTO(item.getDIASVCTO());
					input.setGJAHR(item.getGJAHR());
					input.setGRPTXANT(item.getGRPTXANT());
					input.setTXANTM(item.getTXANTM());
					input.setTXANTD(item.getTXANTD());
					input.setGRPDIAANT(item.getGRPDIAANT());
					//input.setDIASVCTO(item.getDIASVCTO());
					input.setDTANTFIN(getNovaDataAnteciopacao());
					
					
					if((getNovaDataAnteciopacao().getDay() == item.getDTANTFIN().getDay()) &&
					(getNovaDataAnteciopacao().getMonth() == item.getDTANTFIN().getMonth()) &&
					(getNovaDataAnteciopacao().getYear() == item.getDTANTFIN().getYear()) 
							){
						FacesMessage msg = new FacesMessage("Data de agendamento inválida.");
						FacesContext.getCurrentInstance().addMessage(null, msg);
						return;
					}
					input.setVLRJRANT(item.getVLRJRANT());
					input.setVLRLIQANT(item.getVLRLIQANT());
					input.setVRTXOPER(item.getVRTXOPER());
					input.setDMBTRCRD(item.getDMBTRCRD());
					input.setDMBTR(item.getDMBTR());
					input.setFAEDT(item.getFAEDT());
					input.setXBLNR(item.getXBLNR());
					input.getDOCSCRD().addAll(item.getDOCSCRD());
					

					CNPJ = item.getCnpj();

					solicitacoes.add(input);
				}
			}

			if (solicitacoes.size() > 0) {
				br.com.aevee.port_finan.adiantamento.DTRecalculoOUT retorno = new br.com.aevee.nsPortFinanc.DAL.Adiantamento()
						.getRecalcular(this.getUsuario().getUSNAME(), itemLifnr,
								solicitacoes, FacesContext.getCurrentInstance());
				
				
				for (br.com.aevee.port_finan.adiantamento.DTRecalculoOUT.Response itemRetorno : retorno.getResponse()) {
					
					if (itemRetorno.getResult().getSTATUS().equals(BigInteger.ZERO)) {
						selectedResponseRecalculado.add(new ResponseExt(itemRetorno));
						
					}
					else{
						for (DTMsg mensagem : itemRetorno.getResult().getMSG()) {
							if(!mensagemErro.contains(mensagem.getMSG())){
								FacesMessage msg = new FacesMessage(mensagem.getMSG());
								FacesContext.getCurrentInstance().addMessage(null, msg);
								
								mensagemErro.add(mensagem.getMSG());
							}
						}
						
						
					}
				}
				
				retorno.getResponse();
			}
		}
		
		ajustaListas();
	}

	private void ajustaListas(){
		List<ResponseExt> aux = new ArrayList<SolicitacaoAcompanhamentoAntecipacaoFinanceiraBean.ResponseExt>();
		
		for (ResponseExt item : selectedResponse) {
			for (ResponseExt itemCalculado : selectedResponseRecalculado) {
				if(item.getCod().equals(itemCalculado.getCod())){
					aux.add(item);
					break;
				}
			}
			
		}
		
		selectedResponse = aux; 
	}
	
	public void calculateTotal(Object o) {
		this.totalDMBTRCRD = 0.0d;
		this.totalVLRJRANT = 0.0d;
		this.totalVLRLIQANT = 0.0d;
		this.totalDMBTR = 0.0d;
		this.totalVRTXOPER = 0.0d;

		Integer name = 0;
		if (o != null) {
			if (o instanceof Integer) {
				name = (Integer) o;
				for (ResponseExt p : (List<ResponseExt>) response) { // The loop
																		// should
																		// find
																		// the
																		// sortBy
																		// value
																		// rows
																		// in
																		// all
																		// dataTable
																		// data.
					if (p.getOrdem().equals(name)) {
						if (p.getDMBTRCRD() != null)
							this.totalDMBTRCRD += Double.valueOf(p
									.getDMBTRCRD().toString());
						if (p.getVLRJRANT() != null)
							this.totalVLRJRANT += Double.valueOf(p
									.getVLRJRANT().toString());
						if (p.getVLRLIQANT() != null)
							this.totalVLRLIQANT += Double.valueOf(p
									.getVLRLIQANT().toString());

						if (p.getDMBTR() != null)
							this.totalDMBTR += Double.valueOf(p.getDMBTR()
									.toString());
						if (p.getVRTXOPER() != null)
							this.totalVRTXOPER += Double.valueOf(p
									.getVRTXOPER().toString());
					}
				}
			}
		}
	}

	public Double getTotalConfirmacaoVLRJRANT() {
		Double total = 0D;
		for (ResponseExt item : selectedResponseParaAgendar) {
			if (item.getVLRJRANT() != null)
				total += Double.parseDouble(item.getVLRJRANT().toString());
		}

		return total;
	}

	public Double getTotalConfirmacaoVLRLIQANT() {
		Double total = 0D;
		for (ResponseExt item : selectedResponseParaAgendar) {
			if (item.getVLRLIQANT() != null)
				total += Double.parseDouble(item.getVLRLIQANT().toString());
		}
		return total;
	}

	public Double getTotalConfirmacaoDMBTR() {
		Double total = 0D;
		for (ResponseExt item : selectedResponseParaAgendar) {
			if (item.getDMBTR() != null)
				total += Double.parseDouble(item.getDMBTR().toString());
		}
		return total;
	}

	public Double getTotalConfirmacaoDMBTRCRD() {
		Double total = 0D;
		for (ResponseExt item : selectedResponseParaAgendar) {
			if (item.getDMBTRCRD() != null)
				total += Double.parseDouble(item.getDMBTRCRD().toString());
		}
		return total;
	}

	public Double getTotalConfirmacaoVRTXOPER() {
		Double total = 0D;
		for (ResponseExt item : selectedResponseParaAgendar) {
			if (item.getVRTXOPER() != null)
				total += Double.parseDouble(item.getVRTXOPER().toString());
		}
		return total;
	}

	public Double getTotalDocsDMBTRCRD() {
		Double total = 0D;
		for (DTZCTFI027 item : selectedOneResponse.getDOCSCRD()) {
			if (item.getDMBTR() != null)
				total += Double.parseDouble(item.getDMBTR().toString());
		}
		return total;
	}

	public void atualizaGrid() {

		
		
		response = new ArrayList<ResponseExt>();
		List<br.com.aevee.port_finan.adiantamento.DTListarOUT.Response> lista;

		List<String> emprs = new ArrayList<String>();
		List<String> lifnrs = new ArrayList<String>();
		if (this.getUsuarioInterno()) {
			emprs.add(empr);
			lifnrs.add(lifnr);
		} else {
			for (DTFornecedores item : this.getUsuarioSession()
					.getFornecedores()) {
				for (String itemLifnr : lifnrSelecinado) {
					if (item.getLIFNR().equals(itemLifnr)) {
						emprs.add(item.getBUKRS());
						lifnrs.add(item.getLIFNR());

						lifnr = item.getLIFNR();
						empr = item.getBUKRS();
						break;
					}
				}
			}
		}

		// empr, lifnr

		lista = new br.com.aevee.nsPortFinanc.DAL.Adiantamento().getALL(
				emprs, lifnrs);

		internolifnr = lifnr;

		for (br.com.aevee.port_finan.adiantamento.DTListarOUT.Response item : lista) {

			ResponseExt responseExt = null;
			try {
				responseExt = new ResponseExt(item);
				
				if(novaDataAnteciopacao == null)
					novaDataAnteciopacao = item.getDTANTFIN();
			} catch (Exception erro) {
				continue;
			}

			response.add(responseExt);
		}
	}
	
	public void selecionaTudo(){
		if(response.size() > 0){
			selectedResponse.clear();
			for (ResponseExt item : response) {
				if(item.getSTATUS().equals("AA"))
					selectedResponse.add(item);
			}
			
			bollSelecionadoTudo = false;
			if(selectedResponseRecalculado != null)
				selectedResponseRecalculado.clear();
		}
	}
	
	public void desSelecionaTudo(){
		if(response.size() > 0){
			selectedResponse.clear();
			bollSelecionadoTudo = true;
			if(selectedResponseRecalculado != null)
				selectedResponseRecalculado.clear();
		}
	}
	
	public void limpaSelectedResponseRecalculado(){
		if(selectedResponseRecalculado != null)
			selectedResponseRecalculado.clear();
	}
	
	public int getCounter() {
		int counter = 0;
		if(selectedResponse != null){
            counter = selectedResponse.size();
        }
		return counter;
	}
	
	public int getTitulosAptosAntecipar(){
		int counter = 0;
		if(response != null)
		for (ResponseExt item : response) {
			if(item.getSTATUS().equals("AA"))
				counter++;
		}
		return counter;		
	}
	
	public Double getMontanteTitulos(){
		Double counter = 0.0d;
		if(response != null)
		for (ResponseExt item : response) {
			if(item.getSTATUS().equals("AA"))
				counter += Double.valueOf(item.getDMBTR().toString());
		}
		return counter;		
	}
	
	public Double getNotasSelecionadasValorNotaFiscal(){
		Double counter = 0.0d;
		if(selectedResponse != null)
		for (ResponseExt item : selectedResponse) {
			if(item.getDMBTR() != null)
				counter += Double.valueOf(item.getDMBTR().toString());
		}
		return counter;		
	}
	
	public Double getNotasSelecionadasValorDevolucao(){
		Double counter = 0.0d;
		if(selectedResponse != null)
		for (ResponseExt item : selectedResponse) {
			if(item.getDMBTRCRD() != null)
				counter += Double.valueOf(item.getDMBTRCRD().toString());
		}
		return counter;		
	}
	
	public Double getNotasSelecionadasValorJurosAntecipacao(){
		Double counter = 0.0d;
		if(selectedResponse != null)
		for (ResponseExt item : selectedResponse) {
			if(item.getVLRJRANT() != null)
				counter += Double.valueOf(item.getVLRJRANT().toString());
		}
		return counter;		
	}
	
	public Double getNotasSelecionadasValorTaxaOperacional(){
		Double counter = 0.0d;
		if(selectedResponse != null)
		for (ResponseExt item : selectedResponse) {
			if(item.getVRTXOPER() != null)
				counter += Double.valueOf(item.getVRTXOPER().toString());
		}
		return counter;		
	}
	
	public Double getNotasSelecionadasValorLiquidoAntecipacao(){
		Double counter = 0.0d;
		if(selectedResponse != null)
		for (ResponseExt item : selectedResponse) {
			if(item.getVLRLIQANT() != null)
				counter += Double.valueOf(item.getVLRLIQANT().toString());
		}
		return counter;		
	}
	
	public XMLGregorianCalendar getNotasSelecionadasDataAnteciopacao(){
		if(selectedResponse != null)
			for (ResponseExt item : selectedResponse) {
				return item.getDTANTFIN();
			}
		return null;
	}
	
	
	
	
	
	public Double getNotasSelecionadasRecalculoValorNotaFiscal(){
		Double counter = 0.0d;
		if(selectedResponseRecalculado != null)
		for (ResponseExt item : selectedResponseRecalculado) {
			if(item.getDMBTR() != null)
				counter += Double.valueOf(item.getDMBTR().toString());
		}
		return counter;		
	}
	
	public Double getNotasSelecionadasRecalculoValorDevolucao(){
		Double counter = 0.0d;
		if(selectedResponseRecalculado != null)
		for (ResponseExt item : selectedResponseRecalculado) {
			if(item.getDMBTRCRD() != null)
				counter += Double.valueOf(item.getDMBTRCRD().toString());
		}
		return counter;		
	}
	
	public Double getNotasSelecionadasRecalculoValorJurosAntecipacao(){
		Double counter = 0.0d;
		if(selectedResponseRecalculado != null)
		for (ResponseExt item : selectedResponseRecalculado) {
			if(item.getVLRJRANT() != null)
				counter += Double.valueOf(item.getVLRJRANT().toString());
		}
		return counter;		
	}
	
	public Double getNotasSelecionadasRecalculoValorTaxaOperacional(){
		Double counter = 0.0d;
		if(selectedResponseRecalculado != null)
		for (ResponseExt item : selectedResponseRecalculado) {
			if(item.getVRTXOPER() != null)
				counter += Double.valueOf(item.getVRTXOPER().toString());
		}
		return counter;		
	}
	
	public Double getNotasSelecionadasRecalculoValorLiquidoAntecipacao(){
		Double counter = 0.0d;
		if(selectedResponseRecalculado != null)
		for (ResponseExt item : selectedResponseRecalculado) {
			if(item.getVLRLIQANT() != null)
				counter += Double.valueOf(item.getVLRLIQANT().toString());
		}
		return counter;		
	}
	
	public XMLGregorianCalendar getNotasSelecionadasRecalculoDataAnteciopacao(){
		if(selectedResponseRecalculado != null)
			for (ResponseExt item : selectedResponseRecalculado) {
				return item.getDTANTFIN();
			}
		return null;
	}
	
	public String downloadPlanilhaExcel(){
		ArrayList<SolicitacaoPlanilha> planilha = new ArrayList<SolicitacaoPlanilha>();
		
		String CNPJ = "";
		
		for (ResponseExt item : response) {
			SolicitacaoPlanilha xlsItem = new SolicitacaoPlanilha();
			if(item.getSTATUS().equals("AA"))
				xlsItem.setStatus("Apto a Antecipação Financeira");
			else if(item.getSTATUS().equals("BK"))
				xlsItem.setStatus("Item Bloqueado");
			else if(item.getSTATUS().equals("BD"))
				xlsItem.setStatus("Vencimento fora do permitido");
			
			xlsItem.setCnpj(item.getCnpj());
			xlsItem.setId(item.getCod());
			xlsItem.setOperacao(item.getOPERACAO());
			xlsItem.setCnpj(item.getCnpj());
			xlsItem.setNotaFiscal(item.getXBLNR());
			xlsItem.setRazaoSocial(item.getNAME1()); //Data
			xlsItem.setDtEmissao(item.getBLDAT());
			xlsItem.setDtRecebimento(item.getBUDAT()); //0.00000
			xlsItem.setValorBruto(item.getDMBTR()); //0.00000
			xlsItem.setTaxaMes(item.getTXANTM()); //0.00000
			xlsItem.setDescComerciais(item.getDESCCOMERCIAL()); //Data
			//xlsItem.setIrf(item.getTXANTM()); //Data
			xlsItem.setValorDevolucao(item.getDMBTRCRD()); //Data
			//xlsItem.setMoeda(item.getWAERS());
			xlsItem.setDataVencimento(item.getFAEDT()); //Data
			xlsItem.setDataAntecipacao(item.getDTANTFIN()); //MoneyConverter
			
			xlsItem.setValorJurosAntecipacao(item.getVLRJRANT()); //MoneyConverter
			xlsItem.setValorLiquidoAntecipacao(item.getVLRLIQANT()); //MoneyConverter
			planilha.add(xlsItem);
			
			CNPJ = item.getCnpj();
		}
		
		JavaObjectToExcelSheet parser = new JavaObjectToExcelSheet();
		try {
			parser.createExcelSheet(planilha, "Portal_Antecipação_"+getDataAtual());
		} catch (Exception e) {
		}
		
		return "";
	}
	
	public void solicitacaoAceito() {
		boolean comSucesso = false;
		
		for (String itemLifnr : lifnrSelecinado) {
			String CNPJ = "";
			List<br.com.aevee.port_finan.adiantamento.DTSolicitacaoINB.Input> solicitacoes = new ArrayList<DTSolicitacaoINB.Input>();

			for (ResponseExt item : selectedResponseParaAgendar) {
				if (item.getLIFNR().equals(itemLifnr)) {
					br.com.aevee.port_finan.adiantamento.DTSolicitacaoINB.Input input = new br.com.aevee.port_finan.adiantamento.DTSolicitacaoINB.Input();

					input.setBELNR(item.getBELNR());
					input.setBUKRS(item.getBUKRS());
					input.setBUZEI(item.getBUZEI());
					//input.setDIASVCTO(item.getDIASVCTO());
					input.setGJAHR(item.getGJAHR());
					input.setGRPTXANT(item.getGRPTXANT());
					input.setTXANTM(item.getTXANTM());
					input.setTXANTD(item.getTXANTD());
					input.setGRPDIAANT(item.getGRPDIAANT());
					//input.setDIASVCTO(item.getDIASVCTO());
					input.setDTANTFIN(item.getDTANTFIN());
					input.setVLRJRANT(item.getVLRJRANT());
					input.setVLRLIQANT(item.getVLRLIQANT());
					input.setVRTXOPER(item.getVRTXOPER());
					input.setDMBTRCRD(item.getDMBTRCRD());
					input.setDMBTR(item.getDMBTR());
					input.setFAEDT(item.getFAEDT());
					input.setXBLNR(item.getXBLNR());
					input.getDOCSCRD().addAll(item.getDOCSCRD());

					CNPJ = item.getCnpj();

					solicitacoes.add(input);
				}
			}

			if (solicitacoes.size() > 0) {
				List<String> retorno = new br.com.aevee.nsPortFinanc.DAL.Adiantamento()
						.Solicitar(this.getUsuario().getUSNAME(), itemLifnr,
								solicitacoes);

				for (String mensagem : retorno) {
					FacesMessage msg = new FacesMessage(CNPJ + " - " + mensagem);
					FacesContext.getCurrentInstance().addMessage(null, msg);
					
					if(mensagem.contains("Solicitação realizada com Sucesso")){
						comSucesso = true;
					}
				}
			}
		}
		
		if(comSucesso){
			selectedResponse.clear();
			selectedResponseRecalculado.clear();
			selectedResponseParaAgendar.clear();
			atualizaGrid();
		}
	}

	public void solicitacaoNaoAceito() {
		FacesMessage msg = new FacesMessage("Solicitação Cancelada");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onRowSelect(SelectEvent event) {
		setDisabled(false);
	}

	public void onRowUnselect(SelectEvent event) {
		setDisabled(true);
	}

	public class ResponseExt extends
			br.com.aevee.port_finan.adiantamento.DTListarOUT.Response {

		private String cod = "";
		private Integer ordem;
		private String cnpj;

		public String getCod() {
			return cod;
		}

		public void setCod(String cod) {
			this.cod = cod;
		}

		public Integer getOrdem() {
			return ordem;
		}

		public void setOrdem(Integer ordem) {
			this.ordem = ordem;
		}

		public String getCnpj() {
			return cnpj;
		}

		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}

		/*public ResponseExt(){
			
		}*/
		public ResponseExt(br.com.aevee.port_finan.adiantamento.DTListarOUT.Response response){
			try {
				BeanUtils.copyProperties(this, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			this.setCod(response.getBUKRS() + "/" + response.getBELNR() + "/"
					+ response.getBUZEI() + "/" + response.getGJAHR());
				this.setCnpj(new br.com.aevee.nsPortFinanc.DAL.Fornecedores().getByLIFNR(response.getLIFNR()).getSTCD1());
		
				
			switch (response.getSTATUS()) {
			case "AA":
				this.setOrdem(1);
				break;

			case "BK":
				this.setOrdem(2);
				break;

			case "BD":
				this.setOrdem(3);
				break;

			default:
				break;
			}
		}
		
		public ResponseExt(br.com.aevee.port_finan.adiantamento.DTRecalculoOUT.Response response){
			this.setBELNR(response.getBELNR());
			this.setBUDAT(response.getBUDAT());
			this.setBUKRS(response.getBUKRS());
			this.setBUZEI(response.getBUZEI());
			//this.setDIASVCTO(response.getDIASVCTO());
			this.setDMBTR(response.getDMBTR());
			this.setDMBTRCRD(response.getDMBTRCRD());
			this.setDTANTFIN(response.getDTANTFIN());
			this.setFAEDT(response.getFAEDT());
			this.setGJAHR(response.getGJAHR());
			this.setGRPDIAANT(response.getGRPDIAANT());
			this.setGRPTXANT(response.getGRPTXANT());
			this.setSTATUS(response.getSTATUS());
			this.setTXANTD(response.getTXANTD());
			this.setTXANTM(response.getTXANTM());
			this.setVLRJRANT(response.getVLRJRANT());
			this.setVLRLIQANT(response.getVLRLIQANT());
			this.setVRTXOPER(response.getVRTXOPER());
			this.setWAERS(response.getWAERS());
			this.setXBLNR(response.getXBLNR());
			this.setCod(response.getBUKRS() + "/" + response.getBELNR() + "/"
					+ response.getBUZEI() + "/" + response.getGJAHR());
			this.getDOCSCRD().addAll(response.getDOCSCRD());
			this.setLIFNR(response.getLIFNR());
			//try {
			
				this.setCnpj(new br.com.aevee.nsPortFinanc.DAL.Fornecedores().getByLIFNR(response.getLIFNR()).getSTCD1());
			/*} catch (Exception erro) {
				
			}*/
			this.getCod();
			switch (response.getSTATUS()) {
			case "AA":
				this.setOrdem(1);
				break;

			case "BK":
				this.setOrdem(2);
				break;

			case "BD":
				this.setOrdem(3);
				break;

			default:
				break;
			}
		}
		
	}

	
}
