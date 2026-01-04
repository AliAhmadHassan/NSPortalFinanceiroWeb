package br.com.aevee.nsPortFinanc.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.net.URL;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.beanutils.BeanUtils;

import br.com.aevee.nsPortFinanc.Excel.HistoricoPlanilha;
import br.com.aevee.nsPortFinanc.Excel.JavaObjectToExcelSheet;
import br.com.aevee.nsPortFinanc.Excel.PublicacaoPlanilha;
import br.com.aevee.nsPortFinanc.Excel.SolicitacaoPlanilha;
import br.com.aevee.nsPortFinanc.controller.SolicitacaoAcompanhamentoAntecipacaoFinanceiraBean.ResponseExt;
import br.com.aevee.port_finan.adiantamento.DTZCTFI027;
import br.com.aevee.port_finan.log_in.DTFornecedores;
import br.com.aevee.port_finan.publicacao.DTImposto;
import br.com.aevee.port_finan.publicacao.DTLog;
import br.com.aevee.port_finan.publicacao.DTNota;
import br.com.aevee.port_finan.publicacao.DTPublicacaoResp;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

@SessionScoped
@ManagedBean
public class PublicacaoBean extends AbstractManagedBean {

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
		if(response == null)
			return null;
		
		Collections.sort(response, new Comparator<ResponseExt>(){
			   public int compare(final ResponseExt a,ResponseExt b) {
					int Comparison = a
							.getSTATUS()
							.compareTo(
									b.getSTATUS());

					return Comparison == 0 ? a
							.getFAEDT().toGregorianCalendar().compareTo(
									b.getFAEDT().toGregorianCalendar())
							: Comparison;
			     }
			 });
			 
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
		this.totalDMBTR = 0.0d;
		String name = "";
		if (o != null) {
			if (o.toString() instanceof String) {
				name = (String) o.toString();
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
					if (p.getSTATUS().toString().equals(name)) {
						if (p.getDMBTRCRD() != null)
							this.totalDMBTRCRD += Double.valueOf(p
									.getDMBTRCRD().toString());
						
						if (p.getDMBTR() != null)
							this.totalDMBTR += Double.valueOf(p.getDMBTR()
									.toString());
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

	// Methods
	
	public String downloadPlanilhaExcel(){
		
		if(response == null){
			FacesMessage msg = new FacesMessage("Atenção!","Nenhum registro encontrado.");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			return "";
		}
		
		ArrayList<PublicacaoPlanilha> planilha = new ArrayList<PublicacaoPlanilha>();
		
		String CNPJ = "";
		
		for (ResponseExt item : response) {
			PublicacaoPlanilha xlsItem = new PublicacaoPlanilha();
			if(item.getSTATUS().toString().equals("1"))
				xlsItem.setStatus("Em Aberto");
			else if(item.getSTATUS().toString().equals("2"))
				xlsItem.setStatus("Pagos");
			
			xlsItem.setCnpj(item.getCnpj());
			xlsItem.setId(item.getCod());
			xlsItem.setOperacao(item.getOPERACAO());
			xlsItem.setCnpj(item.getCnpj());
			xlsItem.setNotaFiscal(item.getXBLNR());
			xlsItem.setRazaoSocial(item.getNAME1()); //Data
			xlsItem.setDtEmissao(item.getBLDAT());
			xlsItem.setDtRecebimento(item.getBUDAT()); //0.00000
			xlsItem.setValorBruto(item.getDMBTR()); //0.00000
			xlsItem.setDescComerciais(item.getDESCCOMERCIAL()); //Data
			//xlsItem.setIrf(item.getTXANTM()); //Data
			xlsItem.setValorDevolucao(item.getDMBTRCRD()); //Data
			//xlsItem.setMoeda(item.getWAERS());
			xlsItem.setDataVencimento(item.getFAEDT()); //Data
			xlsItem.setDataPagamento(item.getAUGDT()); //MoneyConverter
			xlsItem.setAntecipado(item.getANTECIPADO());
			xlsItem.setComprovante(item.getNOMECOMPROVANTE());
			//xlsItem.setLog(item.getLOG());
			
			planilha.add(xlsItem);
			
			CNPJ = item.getCnpj();
		}
		
		JavaObjectToExcelSheet parser = new JavaObjectToExcelSheet();
		try {
			parser.createExcelSheet(planilha, "Portal_Publicação_"+getDataAtual());
		} catch (Exception e) {
		}
		
		return "";
	}

	public PublicacaoBean() {
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

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		try {
			calendarAgora.setTime(sdf.parse("9999-12-31"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
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
		
		if(lifnrSelecinado.size() == 0){
			FacesMessage msg = new FacesMessage("Atenção!",
					"Selecione ao menos um CNPJ.");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			return;
		}

		response = new ArrayList<ResponseExt>();

		DTPublicacaoResp lista;

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

		List<BigInteger> lstStatus = new ArrayList<BigInteger>();
		
		if(getStatus().equals("T"))
			lstStatus.add(new BigInteger("0"));
		else if(getStatus().equals("A"))
			lstStatus.add(new BigInteger("1"));
		else if(getStatus().equals("P"))
			lstStatus.add(new BigInteger("2"));
		
		lista = new br.com.aevee.nsPortFinanc.DAL.Publicacao()
				.listar(emprs, lifnrs, dtSolicitacaoDe,
						dtSolicitacaoAte, lstStatus);

		for (DTPublicacaoResp.Response item : lista.getResponse()) {
			ResponseExt responseExt = new ResponseExt();
			try {
				BeanUtils.copyProperties(responseExt, item);
				if(item.getLOG().size() > 0)
					responseExt.getLOG().addAll(item.getLOG());
				
				responseExt.setCod(item.getBUKRS() + "/" + item.getBELNR() + "/" + item.getBUZEI() + "/" + item.getGJAHR());
				responseExt
				.setCnpj(new br.com.aevee.nsPortFinanc.DAL.Fornecedores()
						.getByLIFNR(item.getLIFNR()).getSTCD1());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 

			
			switch (String.valueOf(item.getSTATUS())) {
			case "1":
				responseExt.setOrdem(1);
				break;

			case "2":
				responseExt.setOrdem(2);
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
	
	public Double getTotalImpostoBase() {
		Double total = 0D;
		if(selectedOneResponse != null)
			for (DTImposto item : selectedOneResponse.getDOCSIMP()) {
				if (item.getBASE() != null)
					total += Double.parseDouble(item.getBASE().toString());
			}
		return total;
	}
	
	public Double getTotalImpostoMontante() {
		Double total = 0D;
		if(selectedOneResponse != null)
		for (DTImposto item : selectedOneResponse.getDOCSIMP()) {
			if (item.getMONTANTE() != null)
				total += Double.parseDouble(item.getMONTANTE().toString());
		}
		return total;
	}
	
	public class ResponseExt
			extends DTPublicacaoResp.Response
			 {
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
	
	
	public void downloadComprovante() throws IOException{
		
		if(selectedOneResponse.getXBLNR() == null || selectedOneResponse.getXBLNR().isEmpty())
			selectedOneResponse.setXBLNR("");
		
		
		String caminho = new br.com.aevee.nsPortFinanc.DAL.DownloadPDF().Download(selectedOneResponse.getCOMPROVANTE(), "Portal_Comprovante_NF" + selectedOneResponse.getXBLNR() + "_" + selectedOneResponse.getNOMECOMPROVANTE()+".pdf", FacesContext.getCurrentInstance());
		
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext(); 
        File file = new File(caminho); 
        HttpServletResponse response = (HttpServletResponse) context.getResponse();
        response.setHeader("Content-Disposition", "attachment;filename="+"Portal_Comprovante_NF" + selectedOneResponse.getXBLNR() + "_" + selectedOneResponse.getNOMECOMPROVANTE()+".pdf"); 
        response.setContentLength((int) file.length()); 

        try {
            FileInputStream in = new FileInputStream(file);
            OutputStream out = response.getOutputStream();
            byte[] buf = new byte[(int)file.length()];
            int count;
            while ((count = in.read(buf)) >= 0) {
                out.write(buf, 0, count);
            }
            in.close();
            out.flush();
            out.close();
            FacesContext.getCurrentInstance().responseComplete();
        } catch (IOException ex) {
            System.out.println("Error in downloadFile: " + ex.getMessage());
            ex.printStackTrace();
        }  
		   
	}
	
}
