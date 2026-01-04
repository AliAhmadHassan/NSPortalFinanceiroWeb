package br.com.aevee.nsPortFinanc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;

import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.poi.util.IOUtils;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import br.com.aevee.port_finan.contato.DTContatoEnvioReq;
import br.com.aevee.port_finan.contato.DTContatoResp;
import br.com.aevee.port_finan.contato.DTContatoResp.Anexos;
import br.com.aevee.port_finan.contato.DTContatoResp.Anexos.ListaExtensao;

@SessionScoped
@ManagedBean
public class ContatoBean extends AbstractManagedBean {

	private DTContatoResp informacoes;
	private Map<String, String> departamentos;
	private Map<String, String> assuntos;
	private Map<String, String> subAssuntos;
	private Map<String, String> filial;
	private String departamentoSelecionado;
	private String assuntoSelecionado;
	private String subAssuntoSelecionado;
	private String filialSelecionado;
	private String mensagem;
	private boolean destinatarioVisible = false;
	private String destinatario = "";
	private boolean anexoVisible = false;
	private Part anexo;
	private String respostaAuto;
	private UploadedFile file;  
	List<DTContatoEnvioReq.Anexos> anexos = new ArrayList<DTContatoEnvioReq.Anexos>();
	private String anexoSelected;
	private String anexoExtensions;
	private String anexoSize;
	private String anexoSize2;

	public DTContatoResp getInformacoes() {
		return informacoes;
	}

	public Map<String, String> getDepartamentos() {
		return departamentos;
	}

	public Map<String, String> getAssuntos() {
		return assuntos;
	}

	public Map<String, String> getSubAssuntos() {
		return subAssuntos;
	}

	public String getDepartamentoSelecionado() {
		return departamentoSelecionado;
	}

	public void setDepartamentoSelecionado(String departamentoSelecionado) {
		this.departamentoSelecionado = departamentoSelecionado;
		
		

	}

	public String getAssuntoSelecionado() {
		return assuntoSelecionado;
	}

	public void setAssuntoSelecionado(String assuntoSelecionado) {
		this.assuntoSelecionado = assuntoSelecionado;
	}

	public String getSubAssuntoSelecionado() {
		return subAssuntoSelecionado;
	}

	public void setSubAssuntoSelecionado(String subAssuntoSelecionado) {
		this.subAssuntoSelecionado = subAssuntoSelecionado;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public boolean getDestinatarioVisible() {
		return destinatarioVisible;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public boolean getAnexoVisible() {
		return anexoVisible;
	}

	public Map<String, String> getFilial() {
		return filial;
	}

	public void setFilial(Map<String, String> filial) {
		this.filial = filial;
	}

	public String getFilialSelecionado() {
		return filialSelecionado;
	}

	public void setFilialSelecionado(String filialSelecionado) {
		this.filialSelecionado = filialSelecionado;
	}

	public Part getAnexo() {
		return anexo;
	}

	public void setAnexo(Part anexo) {
		this.anexo = anexo;
	}

	public String getRespostaAuto() {
		return respostaAuto;
	}


	public List<DTContatoEnvioReq.Anexos> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<DTContatoEnvioReq.Anexos> anexos) {
		this.anexos = anexos;
	}

	public String getAnexoSelected() {
		return anexoSelected;
	}

	public void setAnexoSelected(String anexoSelected) {
		this.anexoSelected = anexoSelected;
	}

	public String getAnexoExtensions() {
		return anexoExtensions;
	}

	public void setAnexoExtensions(String anexoExtensions) {
		this.anexoExtensions = anexoExtensions;
	}

	public String getAnexoSize() {
		return anexoSize;
	}

	public void setAnexoSize(String anexoSize) {
		this.anexoSize = anexoSize;
	}

	public String getAnexoSize2() {
		return anexoSize2;
	}

	public void setAnexoSize2(String anexoSize2) {
		this.anexoSize2 = anexoSize2;
	}

	public ContatoBean() {
		informacoes = new br.com.aevee.nsPortFinanc.DAL.Contato().getAll(this.getUsuario().getUSNAME());

		departamentos = new HashMap<String, String>();
		assuntos = new HashMap<String, String>();
		subAssuntos = new HashMap<String, String>();
		filial = new HashMap<String, String>();
		for (DTContatoResp.DepartamentosAssuntos item : informacoes.getDepartamentosAssuntos()) {
			if (!departamentos.containsKey(item.getDepartamento()))
				departamentos.put(item.getDepartamento(), item.getDepartamento());
		}
		
		
		for(Anexos anexo : informacoes.getAnexos()) {
			anexoExtensions = "";
			for(ListaExtensao extension : anexo.getListaExtensao())
				anexoExtensions += extension.getExtensao() + ",";
			anexoSize = anexo.getTamanhoMax().toString();
			anexoSize2 = anexo.getTamanhoUM();
			if(anexoExtensions.length() > 0)
				anexoExtensions = anexoExtensions.substring(0, anexoExtensions.length()-1);
		}
		
		
	}

	public void filtraAssuntos() {
		assuntos.clear();
		filial.clear();
		subAssuntos.clear();
		
		for (DTContatoResp.DepartamentosAssuntos item : informacoes.getDepartamentosAssuntos()) {
			if (departamentoSelecionado.equals(item.getDepartamento())) {
				assuntos.put(item.getAssunto(), item.getAssunto());

			}
		}
	}

	public void filtraSubAssuntos() {
		destinatario = "";
		anexoVisible = false;
		destinatarioVisible = false;

		subAssuntos.clear();
		filial.clear();

		// List<DTContatoResp.ListaFilial> filiais = informacoes.getListaFilial();
		for (DTContatoResp.DepartamentosAssuntos item : informacoes.getDepartamentosAssuntos()) {
			if (departamentoSelecionado.equals(item.getDepartamento())
					&& assuntoSelecionado.equals(item.getAssunto())) {
				if (item.getSubAssunto() != null) {
					subAssuntos.put(item.getSubAssunto(), item.getSubAssunto());
				}

				if (item.getAnexo() != null && item.getAnexo().equals("X"))
					anexoVisible = true;

				if (item.getFilial() != null) {
					filial.put(item.getFilial() + " - " + CnpjMask(item.getCnpjFilial()), item.getFilial() + " - " + item.getCnpjFilial());
				}
				
				if(item.getRespostaAuto() != null && !item.getRespostaAuto().isEmpty()) {
					respostaAuto = item.getRespostaAuto();
					org.primefaces.context.RequestContext.getCurrentInstance().update("panelRespostaAuto");
					//org.primefaces.context.RequestContext.getCurrentInstance().execute("PF('dlgFaleConosco').hide()");
					org.primefaces.context.RequestContext.getCurrentInstance().execute("PF('dlgRespostaAuto').show()");

				}
			}
		}
	}
	
	public void redirectMain() {
		super.redirecionarPagina("menuPrincipal.xhtml");
	}

	public void filtraDestinatarios() {
		destinatario = "";
		destinatarioVisible = false;

		
	}
	
	
	
public void handleFileUpload(FileUploadEvent event) {
        
		DTContatoEnvioReq.Anexos anexo = new DTContatoEnvioReq.Anexos();
		
		try {
			
			//String conteudo = new Scanner(event.getFile().getInputstream()).useDelimiter("\\A").next();
			
			byte[] bytes = IOUtils.toByteArray(event.getFile().getInputstream());
			
			
			if((atualizaLimiteTamanhoAnexo() + bytes.length) > Double.parseDouble(anexoSize)*1024*1024)
			{
				FacesMessage message = new FacesMessage("Tamanho total dos arquivos não pode ultrapassar " + anexoSize + " " + anexoSize2+".");
		        FacesContext.getCurrentInstance().addMessage(null, message);
		        return;
			}
			
			String conteudo = Base64.getEncoder().encodeToString(bytes);
			
			anexo.setConteudo(conteudo);
			anexo.setNomeArquivo(event.getFile().getFileName());
			anexo.setExtensao(event.getFile().getFileName().substring(event.getFile().getFileName().lastIndexOf(".")).toLowerCase());
			
			if(!anexoExtensions.toUpperCase().contains(anexo.getExtensao().toUpperCase().replace(".", ""))) {
				FacesMessage message = new FacesMessage("Apenas arquivos "+ anexoExtensions +" são permitidos.");
		        FacesContext.getCurrentInstance().addMessage(null, message);
		        return;
			}
			
			anexos.add(anexo);
			
			FacesMessage message = new FacesMessage("Sucesso", event.getFile().getFileName() + " foi carregado.");
	        FacesContext.getCurrentInstance().addMessage(null, message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			FacesMessage message = new FacesMessage("Atenção!", "Erro ao carregar o arquivo " + event.getFile().getFileName());
	        FacesContext.getCurrentInstance().addMessage(null, message);
		}
		
		
        
        
    }
	
	private double atualizaLimiteTamanhoAnexo() {
		double total = 0;
		for (DTContatoEnvioReq.Anexos item : anexos) {
			total += Base64.getDecoder().decode(item.getConteudo()).length;
		}
		
		return total;
		
	}
	
	

	public void enviar() {

		DTContatoEnvioReq mtContatoEnvioReq = new DTContatoEnvioReq();

		if (departamentoSelecionado.isEmpty()) {
			FacesMessage msg = new FacesMessage("Atenção!", "Favor selecionar um departamento.");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			return;
		} else if (assuntoSelecionado.isEmpty()) {
			FacesMessage msg = new FacesMessage("Atenção!", "Favor selecionar um assunto.");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			return;
		} else if (!subAssuntos.isEmpty() && subAssuntoSelecionado.isEmpty()) {
			FacesMessage msg = new FacesMessage("Atenção!", "Favor selecionar um sub-assunto.");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			return;
		} else if (!filial.isEmpty() && filialSelecionado.isEmpty()) {
			FacesMessage msg = new FacesMessage("Atenção!", "Favor selecionar uma filial.");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			return;
		} else if (mensagem.isEmpty()) {
			FacesMessage msg = new FacesMessage("Atenção!", "Favor descrever a mensagem.");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			return;
		} else if (anexoVisible && anexos.isEmpty()) {
			FacesMessage msg = new FacesMessage("Atenção!", "Favor anexar os documentos.");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			return;
		}

		mtContatoEnvioReq.setAssunto(assuntoSelecionado);
		mtContatoEnvioReq.setDepartamento(departamentoSelecionado);
		mtContatoEnvioReq.setMensagem(mensagem);
		mtContatoEnvioReq.setLIFNR(this.getUsuario().getLIFNR());
		mtContatoEnvioReq.setSubAssunto(subAssuntoSelecionado);
		mtContatoEnvioReq.setFilial(filialSelecionado.substring(0, filialSelecionado.indexOf("-")).trim());
		mtContatoEnvioReq.setUSNAM(this.getUsuario().getUSNAME());

		if(anexoVisible) {
				mtContatoEnvioReq.getAnexos().addAll(anexos);
				
		}

		List<String> retorno = new br.com.aevee.nsPortFinanc.DAL.Contato().enviar(mtContatoEnvioReq);

		for (String mensagem : retorno) {
			FacesMessage msg = new FacesMessage(mensagem);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
		
		limparContato();
		org.primefaces.context.RequestContext.getCurrentInstance().execute("PF('dlgFaleConosco').hide()");
	}

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}
	
	public void deleteAnexo(){
		for(int i=0; i< anexos.size();i++){
			if(anexos.get(i).getNomeArquivo().equals(anexoSelected)){
				anexos.remove(i);
				break;
			}
				
		}
	}
	
	public void limparContato(){
		
		departamentoSelecionado = "";
		assuntoSelecionado = "";
		subAssuntoSelecionado = "";
		
		anexos.clear();
		assuntos.clear();
		subAssuntos.clear();
		filial.clear();
		mensagem = "";
		destinatarioVisible = false;
		anexoVisible = false;
	}
	
	public void redirectToIndex() {
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		HttpSession session = (HttpSession) ec.getSession(false);

		session.removeAttribute("dtLoginResp");
		
		this.redirecionarPagina("index.xhtml");
	}
}
