package br.com.aevee.nsPortFinanc.controller;

import java.lang.reflect.InvocationTargetException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.aevee.nsPortFinanc.Excel.HistoricoPlanilha;
import br.com.aevee.nsPortFinanc.Excel.JavaObjectToExcelSheet;
import br.com.aevee.nsPortFinanc.Excel.SolicitacaoPlanilha;
import br.com.aevee.nsPortFinanc.controller.SolicitacaoAcompanhamentoAntecipacaoFinanceiraBean.ResponseExt;
import br.com.aevee.port_finan.adiantamento.DTZCTFI027;
import br.com.aevee.port_finan.log_in.DTFornecedores;
import org.apache.commons.beanutils.BeanUtils;


import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;


@SessionScoped
@ManagedBean
public class HistoricoAntecipacaoFinanceiraBean extends AbstractManagedBean {

	// Attributes
	private List<ResponseExt> response;
	private ResponseExt selectedOneResponse;
	private Map<String, String> fornecedores;

	private String lifnr;
	private List<String> lifnrSelecinado;
	private String empr;
	private XMLGregorianCalendar dtCompensacaoDe;
	private XMLGregorianCalendar dtCompensacaoAte;
	private String status;
	private XMLGregorianCalendar dtSolicitacaoDe;
	private XMLGregorianCalendar dtSolicitacaoAte;
	private Double totalDMBTR;
	private Double totalDMBTRCRD;
	private Double totalVLRJRANT;
	private Double totalVLRLIQANT;
	private Double totalVRTXOPER;

	// Getters Setters
	public String getLifnr() {
		return lifnr;
	}

	public Map<String, String> getFornecedores() {
		return fornecedores;
	}

	public void setLifnr(String lifnr) {
		this.lifnr = lifnr;
	}

	public String getEmpr() {
		return empr;
	}

	public void setEmpr(String empr) {
		this.empr = empr;
	}

	public XMLGregorianCalendar getDtCompensacaoDe() {
		return dtCompensacaoDe;
	}

	public void setDtCompensacaoDe(XMLGregorianCalendar dtCompensacaoDe) {
		this.dtCompensacaoDe = dtCompensacaoDe;
	}

	public XMLGregorianCalendar getDtCompensacaoAte() {
		return dtCompensacaoAte;
	}

	public void setDtCompensacaoAte(XMLGregorianCalendar dtCompensacaoAte) {
		this.dtCompensacaoAte = dtCompensacaoAte;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getLifnrSelecinado() {
		return lifnrSelecinado;
	}

	public void setLifnrSelecinado(List<String> lifnrSelecinado) {
		this.lifnrSelecinado = lifnrSelecinado;
	}

	public XMLGregorianCalendar getDtSolicitacaoDe() {
		return dtSolicitacaoDe;
	}

	public void setDtSolicitacaoDe(XMLGregorianCalendar dtSolicitacaoDe) {
		this.dtSolicitacaoDe = dtSolicitacaoDe;
	}

	public XMLGregorianCalendar getDtSolicitacaoAte() {
		return dtSolicitacaoAte;
	}

	public void setDtSolicitacaoAte(XMLGregorianCalendar dtSolicitacaoAte) {
		this.dtSolicitacaoAte = dtSolicitacaoAte;
	}

	public List<ResponseExt> getResponse() {
		return response;
	}

	public void setResponse(List<ResponseExt> response) {
		this.response = response;
	}

	public ResponseExt getSelectedOneResponse() {
		return selectedOneResponse;
	}

	// Constructors
	public void calculateTotal(Object o) {
		this.totalDMBTRCRD = 0.0d;
		this.totalVLRJRANT = 0.0d;
		this.totalVLRLIQANT = 0.0d;
		this.totalDMBTR = 0.0d;
		this.totalVRTXOPER = 0.0d;
		String name = "";
		if (o != null) {
			if (o instanceof String) {
				name = (String) o;
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
					if (p.getSTATUS().equals(name)) {
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

	public void setSelectedOneResponse(ResponseExt selectedOneResponse) {
		this.selectedOneResponse = selectedOneResponse;
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

	public Double getTotalDocsDMBTR() {
		Double total = 0d;

		for (br.com.aevee.port_finan.adiantamento.DTZCTFI027 item : selectedOneResponse
				.getDOCSCRD()) {
			if (item.getDMBTR() != null)
				total += Double.valueOf(item.getDMBTR().toString());
		}

		return total;
	}

	// Methods
	
	public String downloadPlanilhaExcel(){
		ArrayList<HistoricoPlanilha> planilha = new ArrayList<HistoricoPlanilha>();
		
		String CNPJ = "";
		
		for (ResponseExt item : response) {
			HistoricoPlanilha xlsItem = new HistoricoPlanilha();
			if(item.getSTATUS().equals("A"))
				xlsItem.setStatus("Aprovado");
			else if(item.getSTATUS().equals("R"))
				xlsItem.setStatus("Recusado");
			else if(item.getSTATUS().equals("P"))
				xlsItem.setStatus("Pendente de Aprovação");
			
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
			parser.createExcelSheet(planilha, "Portal_Status_Antecipação"+getDataAtual());
		} catch (Exception e) {
		}
		
		return "";
	}

	public HistoricoAntecipacaoFinanceiraBean() {
		fornecedores = new HashMap<String, String>();

		for (DTFornecedores fornecedor : this.getUsuarioSession()
				.getFornecedores()) {
			if (new br.com.aevee.nsPortFinanc.DAL.Fornecedores()
					.getByLIFNR(fornecedor.getLIFNR()) != null)
				fornecedores.put(
						CnpjMask(fornecedor.getCNPJ()) + " - " + fornecedor.getNAME1()
								, fornecedor.getLIFNR());
		}

		Calendar calendarLimite = Calendar.getInstance();
		Calendar calendarAgora = Calendar.getInstance();
		calendarLimite.add(Calendar.MONTH, -3);
		calendarLimite.add(Calendar.DAY_OF_MONTH, 1);

		GregorianCalendar gregoryLimite = new GregorianCalendar();
		GregorianCalendar gregoryAgora = new GregorianCalendar();
		gregoryLimite.setTime(calendarLimite.getTime());
		gregoryAgora.setTime(calendarAgora.getTime());

		this.dtSolicitacaoDe = new XMLGregorianCalendarImpl(gregoryLimite);
		this.dtSolicitacaoAte = new XMLGregorianCalendarImpl(gregoryAgora);
	}

	public void atualizaGrid() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -3);

		GregorianCalendar gregory = new GregorianCalendar();
		gregory.setTime(calendar.getTime());

		XMLGregorianCalendar dataLimite = new XMLGregorianCalendarImpl(gregory);

		if (dtSolicitacaoDe.compare(dataLimite) == -1) {
			FacesMessage msg = new FacesMessage("Atenção!",
					"Data de Solicitação não pode ser maior que 3 meses.");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			return;
		}

		response = new ArrayList<ResponseExt>();

		List<br.com.aevee.port_finan.adiantamento.DTAcompanhamentoOUT.Response> lista;

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

						break;
					}
				}

			}
		}

		lista = new br.com.aevee.nsPortFinanc.DAL.Adiantamento()
				.getAcompanhamento(emprs, lifnrs, dtCompensacaoDe,
						dtCompensacaoAte, status, dtSolicitacaoDe,
						dtSolicitacaoAte);

		for (br.com.aevee.port_finan.adiantamento.DTAcompanhamentoOUT.Response item : lista) {
			ResponseExt responseExt = new ResponseExt();
			
			
			try {
				BeanUtils.copyProperties(responseExt, item);
				responseExt
				.setCnpj(new br.com.aevee.nsPortFinanc.DAL.Fornecedores()
						.getByLIFNR(item.getLIFNR()).getSTCD1());
	
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			responseExt.setCod(item.getBUKRS() + "/" + item.getBELNR() + "/"
					+ item.getBUZEI() + "/" + item.getGJAHR());
			

			switch (item.getSTATUS()) {
			case "P":
				responseExt.setOrdem(1);
				break;

			case "A":
				responseExt.setOrdem(2);
				break;

			case "R":
				responseExt.setOrdem(3);
				break;
			default:
				break;
			}
			
			

			response.add(responseExt);
		}
	}
	
	public Double getTotalDocsDMBTRCRD() {
		Double total = 0D;
		for (DTZCTFI027 item : selectedOneResponse.getDOCSCRD()) {
			if (item.getDMBTR() != null)
				total += Double.parseDouble(item.getDMBTR().toString());
		}
		return total;
	}

	public class ResponseExt
			extends
			br.com.aevee.port_finan.adiantamento.DTAcompanhamentoOUT.Response {
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
	}
}
