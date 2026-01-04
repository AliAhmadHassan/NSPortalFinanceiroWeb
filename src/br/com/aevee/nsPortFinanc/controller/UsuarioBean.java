package br.com.aevee.nsPortFinanc.controller;

import java.util.Enumeration;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.aevee.port_finan.fornecedores.DTLFA1;
import br.com.aevee.port_finan.log_in.DTLOGINResp;
import br.com.aevee.port_finan.shared.DTMsg;

@SessionScoped
@ManagedBean
public class UsuarioBean extends AbstractManagedBean {

	private String txtUsuario;
	private String txtSenha;
	private String txtNovaSenha;
	private String txtRepeteSenha;
	private String codAlteraSenha;

	public String getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(String txtUsuario) {
		this.txtUsuario = txtUsuario;
	}

	public String getTxtSenha() {
		return txtSenha;
	}

	public void setTxtSenha(String txtSenha) {
		this.txtSenha = txtSenha;
	}

	public void autentica() {

		// new
		// br.com.netshoes.nsPortFinanc.DAL.DownloadPDF().Download("6362A1E605231AFC9D530A3780244830EEE16E828CB63DA8BE2078D0AC4B8F29",
		// "Teste.pdf");

		LimpaSessao();

		if (getTxtSenha() == "") {
			FacesMessage msg = new FacesMessage("Atenção!", "Inserir Senha.");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			return;
		}
		if (getTxtUsuario() == "" || getTxtSenha() == "") {
			FacesMessage msg = new FacesMessage("Atenção!", "Insira usuário e senha.");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			return;
		}

		DTLOGINResp dtLoginResp = new br.com.aevee.nsPortFinanc.DAL.Login().Logar(getTxtUsuario(), getTxtSenha());

		FacesContext fc = FacesContext.getCurrentInstance();

		if (dtLoginResp.getUser() != null) {

			if (dtLoginResp.getUser().getUFLAG().equals("0")) {

				if (dtLoginResp.getUser().getPWDST() != null)
					if (dtLoginResp.getUser().getPWDST().equals("X")) {
						FacesMessage msg = new FacesMessage("Atenção!", "Favor alterar a senha.");
						FacesContext.getCurrentInstance().addMessage(null, msg);

						this.redirecionarPagina("primeiroAcesso.xhtml");
						return;
					}

				ExternalContext ec = fc.getExternalContext();
				HttpSession session = (HttpSession) ec.getSession(false);

				if (!dtLoginResp.getUser().getUSTYP().equals("UI"))
					new br.com.aevee.nsPortFinanc.DAL.Fornecedores().AtualizaUE(dtLoginResp.getUser().getLIFNR());

				session.setAttribute("dtLoginResp", dtLoginResp);
				this.redirecionarPagina("menuPrincipal.xhtml");
			} else {
				org.primefaces.context.RequestContext.getCurrentInstance().execute("PF('ajaxStatus').hide()");
				FacesMessage msg = new FacesMessage("Atenção", "Usuario Bloqueado!");
				fc.addMessage(null, msg);

			}
		} else {
			for (DTMsg erro : dtLoginResp.getResult().getMSG()) {
				org.primefaces.context.RequestContext.getCurrentInstance().execute("PF('ajaxStatus').hide()");
				FacesMessage msg = new FacesMessage("Atenção", erro.getMSG());
				fc.addMessage(null, msg);

			}
		}
	}

	private void LimpaSessao() {
		FacesContext context = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
		Enumeration<?> names = session.getAttributeNames();

		while (names.hasMoreElements()) {
			Object nextElement = names.nextElement();
			if (nextElement.toString().equals("usuarioBean")) {
				continue;
			} else if (nextElement.toString().contains("Bean"))
				session.removeAttribute(nextElement.toString());
		}

	}

	private boolean alteradoComSucesso = false;

	public void alteraSenhaLogin() {
		alteradoComSucesso = false;
		alteraSenhaSemCod();

		if (alteradoComSucesso) {
			txtSenha = txtNovaSenha;
			autentica();
		}
	}

	public void alteraSenha() {
		if (txtSenha.equals(txtRepeteSenha)) {

			List<String> erros = new br.com.aevee.nsPortFinanc.DAL.AlterarSenha().alterar(txtUsuario, txtSenha,
					codAlteraSenha);

			FacesContext fc = FacesContext.getCurrentInstance();
			for (String erro : erros) {

				FacesMessage msg = new FacesMessage("Atenção", erro);
				fc.addMessage(null, msg);

				if (erro.equals("Senha Alterado com Sucesso")) {
					autentica();
				} else {
					org.primefaces.context.RequestContext.getCurrentInstance().execute("PF('ajaxStatus').hide()");
				}
			}
		} else {
			org.primefaces.context.RequestContext.getCurrentInstance().execute("PF('ajaxStatus').hide()");
			FacesContext fc = FacesContext.getCurrentInstance();
			FacesMessage msg = new FacesMessage("Atenção", "Campo senha divergente do campo de confirmação.");
			fc.addMessage(null, msg);
		}

	}

	public void alteraSenhaSemCod() {
		if (txtNovaSenha.equals(txtRepeteSenha)) {

			List<String> erros = new br.com.aevee.nsPortFinanc.DAL.AlterarSenha().alterar(txtUsuario, txtNovaSenha,
					null);

			FacesContext fc = FacesContext.getCurrentInstance();
			for (String erro : erros) {

				FacesMessage msg = new FacesMessage("Atenção", erro);
				fc.addMessage(null, msg);

				if (erro.equals("Senha Alterado com Sucesso"))
					alteradoComSucesso = true;
			}
		} else {
			FacesContext fc = FacesContext.getCurrentInstance();
			FacesMessage msg = new FacesMessage("Atenção", "Campo senha divergente do campo de confirmação.");
			fc.addMessage(null, msg);
		}

	}

	public String registraSaida() {
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		HttpSession session = (HttpSession) ec.getSession(false);
		session.removeAttribute("usuario");
		return "/index";
	}

	public String getName() {
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		HttpSession session = (HttpSession) ec.getSession(false);

		DTLOGINResp dtLoginResp = (DTLOGINResp) session.getAttribute("dtLoginResp");
		if (dtLoginResp != null) {
			return dtLoginResp.getUser().getNAME();
		} else {
			return "";
		}
	}

	public String getNomeFornecedor() {
		String retorno = "";

		DTLFA1 fornecedor = new br.com.aevee.nsPortFinanc.DAL.Fornecedores()
				.getByLIFNR(this.getUsuario().getLIFNR());

		if (fornecedor != null) {
			if (fornecedor.getNAME1().length() > 12)
				retorno = fornecedor.getNAME1().substring(0, 12);
		}

		return retorno;
	}

	public String getTxtRepeteSenha() {
		return txtRepeteSenha;
	}

	public void setTxtRepeteSenha(String txtRepeteSenha) {
		this.txtRepeteSenha = txtRepeteSenha;
	}

	public String getCodAlteraSenha() {
		return codAlteraSenha;
	}

	public void setCodAlteraSenha(String codAlteraSenha) {
		this.codAlteraSenha = codAlteraSenha;
	}

	public String getTxtNovaSenha() {
		return txtNovaSenha;
	}

	public void setTxtNovaSenha(String txtNovaSenha) {
		this.txtNovaSenha = txtNovaSenha;
	}

	public void solicitarNovaSenha() {
		List<String> erros = new br.com.aevee.nsPortFinanc.DAL.Login().EsqueciSenha(txtUsuario);

		FacesContext fc = FacesContext.getCurrentInstance();
		for (String erro : erros) {
			org.primefaces.context.RequestContext.getCurrentInstance().execute("PF('ajaxStatus').hide()");
			FacesMessage msg = new FacesMessage("Atenção", erro);
			fc.addMessage(null, msg);
			org.primefaces.context.RequestContext.getCurrentInstance().execute("setTimeout(function(){ $('#rdr-btn').click(); }, 3000);"); // 3 seconds delay. I put the script in Constants to config later.

		}
	}

	public void solicitarEMail() {
		this.redirecionarPagina("esqueciSenha.xhtml");
	}

	public void goToIndex() {
		this.redirecionarPagina("index.xhtml");
	}

}
