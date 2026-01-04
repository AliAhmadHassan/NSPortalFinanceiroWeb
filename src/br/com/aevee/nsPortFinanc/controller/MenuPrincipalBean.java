package br.com.aevee.nsPortFinanc.controller;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import br.com.aevee.nsPortFinanc.web.MenuItem;
import br.com.aevee.port_finan.aviso.DTAviso;
import br.com.aevee.port_finan.log_in.DTFuncoes;

@SessionScoped
@ManagedBean
public class MenuPrincipalBean extends AbstractManagedBean {
	private String urlMenu = "";
	List<MenuItem> menuGestaoUsuarioItens = new ArrayList<MenuItem>();
	List<MenuItem> menuAntecipacaoFinanceiraItens = new ArrayList<MenuItem>();
	List<MenuItem> menuGestaoFornecedorItens = new ArrayList<MenuItem>();
	List<MenuItem> menuComunicacaoItens = new ArrayList<MenuItem>();
	List<MenuItem> menuPublicacaoItens = new ArrayList<MenuItem>();
	List<DTAviso> lstAvisos = new ArrayList<DTAviso>();
	public boolean naoExibirNovamente;
	
	private DTAviso mensagemAviso = new DTAviso();
		
	public String getUrlMenu() {
		return urlMenu;
	}

	public void setUrlMenu(String urlMenu) {
		this.urlMenu = urlMenu;
	}
	
	public List<DTAviso> getLstAvisos() {
		return lstAvisos;
	}

	public void setLstAvisos(List<DTAviso> lstAvisos) {
		this.lstAvisos = lstAvisos;
	}
	
	public int getLstAvisosLength() { return this.lstAvisos.size(); }

	public DTAviso getMensagemAviso() {
		return mensagemAviso;
	}

	public void setMensagemAviso(DTAviso mensagemAviso) {
		this.mensagemAviso = mensagemAviso;
	}
	
	public boolean isNaoExibirNovamente() {
		return naoExibirNovamente;
	}

	public void setNaoExibirNovamente(boolean naoExibirNovamente) {
		this.naoExibirNovamente = naoExibirNovamente;
	}

	public void atualizaMensagemAviso(){
		Object fCMensagemAviso = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap()
				.get("mensagemAviso");
		
		for (DTAviso dtAviso : lstAvisos) {
			if(dtAviso.getID().toString().equals(fCMensagemAviso.toString())){
				setMensagemAviso(dtAviso);
			
				for (String erro : new br.com.aevee.nsPortFinanc.DAL.Aviso().ConfirmaLeitura(this.getUsuario().getUSNAME(), getMensagemAviso().getID(), super.pegaIPCliente())) {
					FacesMessage msg = new FacesMessage(erro);
					FacesContext.getCurrentInstance().addMessage(null, msg);
				}
				
			}
		}
	}

	public MenuPrincipalBean(){
		
		
	}
	
	@PostConstruct
	public void init() {
		montaAcessos();
		loadAvisos();
	}

	public List<MenuItem> getMenuGestaoUsuarioItens(){
		return this.menuGestaoUsuarioItens;
	}

	public List<MenuItem> getMenuAntecipacaoFinanceiraItens(){
		return this.menuAntecipacaoFinanceiraItens;
	}
	
	public List<MenuItem> getMenuGestaoFornecedorItens() {
		return menuGestaoFornecedorItens;
	}

	public List<MenuItem> getMenuComunicacaoItens() {
		return menuComunicacaoItens;
	}
	
	public List<MenuItem> getMenuPublicacaoItens() {
		return menuPublicacaoItens;
	}


	private void montaAcessos() {
		List<DTFuncoes> funcoes = this.getUsuarioSession().getFuncoes();
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		
		for (DTFuncoes dtFuncoes : funcoes) {
			switch (dtFuncoes.getFUNCAO()) {
			case "ADUS":
				this.menuGestaoUsuarioItens.add(new MenuItem("Administração de Usuários", "ProcessReceivables.png", "administracaoUsuario"));
				break;

			case "ADFN":
				this.menuGestaoFornecedorItens.add(new MenuItem("Dados Cadastrais", "ProcessReceivables.png", "fornecedorDadosCadastrais"));
				break;
				
			case "SOAF":
				this.menuAntecipacaoFinanceiraItens.add(new MenuItem("Solicitação de Antecipação Financeira", "PostIncomingPayments.png", "solicitacaoAcompanhamentoAntecipacaoFinanceira"));
				break;
				
			case "ACAF":
				this.menuAntecipacaoFinanceiraItens.add(new MenuItem("Acompanhamento e Historico de Antecipação Financeira", "ManageCustomerLineItems.png", "historicoAntecipacaoFinanceira"));
				break;
				
			case "PTIT":
				this.menuPublicacaoItens.add(new MenuItem("Contas a Pagar", "ManageCustomerLineItems.png", "publicacao"));
				break;
				
			default:
				break;
			}
		}
		//if(!this.getUsuarioInterno())
		//	this.menuComunicacaoItens.add(new MenuItem("Fale Conosco", "ProcessReceivables.png", "faleConosco"));
		
	}

	private String urlTermo;
	public void menuClick(){
		loadAvisos();
		
		Object fCUrlMenu = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap()
				.get("urlMenu");

		if(!this.getUsuarioInterno()){
			if((fCUrlMenu.toString().contains("historicoAntecipacaoFinanceira"))||(fCUrlMenu.toString().contains("solicitacaoAcompanhamentoAntecipacaoFinanceira"))){
				if((this.getUsuario().getTERMOACEITADO() == null) || !this.getUsuario().getTERMOACEITADO().toUpperCase().equals("X")){
					org.primefaces.context.RequestContext.getCurrentInstance().execute("PF('dlgTermoAdiantamento').show()");
				
					urlTermo = fCUrlMenu.toString();
					return;
				}
			}
		}
		
		
		FacesContext context = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
		Enumeration<?> names = session.getAttributeNames();
		
		while(names.hasMoreElements()){
			Object nextElement = names.nextElement();
			if((nextElement.toString().equals("dtLoginResp") || (nextElement.toString().equals("menuPrincipalBean")))){
				continue;
			}
			else if(nextElement.toString().contains("Bean"))
				session.removeAttribute(nextElement.toString());
		}
		
		this.redirecionarPagina(fCUrlMenu.toString() + ".xhtml");
	}

	public void termoContratoConcordo(){
		List<String> retorno = new br.com.aevee.nsPortFinanc.DAL.AceiteContrato().UserAceiteContrato(this.getUsuario().getUSNAME(), this.pegaIPCliente(), "S");
		
		for (String mensagem : retorno) {
			FacesMessage msg = new FacesMessage(mensagem);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
		
		if(retorno.size() == 0){
			this.getUsuario().setTERMOACEITADO("X");
			this.redirecionarPagina(urlTermo + ".xhtml");
		}
	}
	
	public void termoContratoNaoConcordo(){
		List<String> retorno = new br.com.aevee.nsPortFinanc.DAL.AceiteContrato().UserAceiteContrato(this.getUsuario().getUSNAME(), this.pegaIPCliente(), "N");
		
		for (String mensagem : retorno) {
			FacesMessage msg = new FacesMessage(mensagem);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
		
		if(retorno.size() == 0){
			FacesMessage msg = new FacesMessage("Tela somente será visivel mediante ao Aceite do Termo.");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}
	public void atualizarAviso(){
		if(naoExibirNovamente){
			
			for (String erro : new br.com.aevee.nsPortFinanc.DAL.Aviso().EsconderMensagem(this.getUsuario().getUSNAME(), getMensagemAviso().getID(), super.pegaIPCliente())) {
				FacesMessage msg = new FacesMessage(erro);
				FacesContext.getCurrentInstance().addMessage(null, msg);
			}
			
			loadAvisos();
		}
	}

	private void loadAvisos() {
		lstAvisos.clear();
		for (DTAviso item : new br.com.aevee.nsPortFinanc.DAL.Aviso().listar(this.getUsuario().getUSNAME())) {
			if(item.getTitulo() != null)
			{
				item.setTitulo(item.getTitulo().replace('\n', ' '));
				item.setTitulo(item.getTitulo().replace('\r', ' '));
			}
			lstAvisos.add(item);
		}
	}
}
