package br.com.aevee.nsPortFinanc.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.faces.component.UIComponent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.aevee.port_finan.log_in.DTLOGINResp;
import br.com.aevee.port_finan.log_in.DTUsers;

public abstract class AbstractManagedBean {
	private boolean usuarioInterno = false;

	public AbstractManagedBean() {
		if (getUsuarioSession() != null) {
			if (getUsuarioSession().getUser().getUSTYP().equals("UI"))
				usuarioInterno = true;
			else
				usuarioInterno = false;
		}
	}

	protected void redirecionarPagina(String qualTela) {
		try {
			ExternalContext context = FacesContext.getCurrentInstance()
					.getExternalContext();

			String string = context.getRequestContextPath() + "/faces/"
					+ qualTela + "?faces-redirect=true";

			context.redirect(string);

		} catch (IOException e) {
			System.out.println("Erro ao redirecionar a página '" + qualTela
					+ "'. Erro: " + e.getMessage());
		}
	}

	public DTLOGINResp getUsuarioSession() {
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		HttpSession session = (HttpSession) ec.getSession(false);

		DTLOGINResp dtLoginResp = (DTLOGINResp) session
				.getAttribute("dtLoginResp");
		if (dtLoginResp != null) {
			return dtLoginResp;
		} else {
			return null;
		}
	}

	public br.com.aevee.port_finan.log_in.DTUsers getUsuario() {
		DTUsers user = getUsuarioSession().getUser();
		return user;
	}
	
	public boolean getUsuarioExiste(){
		if(getUsuarioSession() == null)
			return false;
		else
			return true;
	}
	
	public String getDataAtual(){
		Calendar agora = Calendar.getInstance();
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd_MM_yyyy");
		
		return format1.format(agora.getTime());
	}

	public boolean getUsuarioInterno() {
		return usuarioInterno;
	}

	public void logoff() {
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		HttpSession session = (HttpSession) ec.getSession(false);
		session.removeAttribute("dtLoginResp");
		this.redirecionarPagina("index.xhtml");
	}

	public String pegaIPCliente(){
		String ipAddress = ((HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest()).getHeader("x-forwarded-for");
		if (ipAddress == null) {
		    ipAddress = ((HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest()).getHeader("X_FORWARDED_FOR");
		    if (ipAddress == null){
		        ipAddress = ((HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest()).getRemoteAddr();
		    }
		}
		return ipAddress;
		
	}
	
public String CnpjMask(String arg2) {
		
		if(arg2 == null)
			return "";
		
		String retorno = "";
		
		
		if(arg2.toString().length() == 14) {
			retorno += arg2.toString().substring(0,  2) + ".";
			retorno += arg2.toString().substring(2,  5) + ".";
			retorno += arg2.toString().substring(5,  8) + "/";
			retorno += arg2.toString().substring(8,  12) + "-";
			retorno += arg2.toString().substring(12,  14);			
		}
		else if(arg2.toString().length() == 15) {
			retorno += arg2.toString().substring(0,  3) + ".";
			retorno += arg2.toString().substring(3,  6) + ".";
			retorno += arg2.toString().substring(6,  9) + "/";
			retorno += arg2.toString().substring(9,  13) + "-";
			retorno += arg2.toString().substring(13,  15);			
		}
		
		return retorno;
	}
}
