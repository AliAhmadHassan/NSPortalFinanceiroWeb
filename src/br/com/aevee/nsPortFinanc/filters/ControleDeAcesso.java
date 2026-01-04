package br.com.aevee.nsPortFinanc.filters;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.Filter ;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebFilter(servletNames = {"Faces Servlet"})
public class ControleDeAcesso implements Filter {
	private Calendar ultimaAcao;
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		
		List<String> caminhosValidos = new ArrayList<String>();
		caminhosValidos.add(req.getRequestURI().substring(0, req.getRequestURI().indexOf('/', 1)) + "/faces/index.xhtml");
		caminhosValidos.add(req.getRequestURI().substring(0, req.getRequestURI().indexOf('/', 1)) + "/faces/primeiroAcesso.xhtml");
		caminhosValidos.add(req.getRequestURI().substring(0, req.getRequestURI().indexOf('/', 1)) + "/faces/primeiroAcessoTermos.xhtml");
		caminhosValidos.add(req.getRequestURI().substring(0, req.getRequestURI().indexOf('/', 1)) + "/faces/alteraSenha.xhtml");
		caminhosValidos.add(req.getRequestURI().substring(0, req.getRequestURI().indexOf('/', 1)) + "/faces/esqueciSenha.xhtml");
		caminhosValidos.add(req.getRequestURI().substring(0, req.getRequestURI().indexOf('/', 1)) + "/faces/javax.faces.resource/theme.css");
		caminhosValidos.add(req.getRequestURI().substring(0, req.getRequestURI().indexOf('/', 1)) + "/faces/javax.faces.resource/primefaces.js");
		caminhosValidos.add(req.getRequestURI().substring(0, req.getRequestURI().indexOf('/', 1)) + "/faces/javax.faces.resource/jquery/jquery.js");
		caminhosValidos.add(req.getRequestURI().substring(0, req.getRequestURI().indexOf('/', 1)) + "/faces/javax.faces.resource/jquery/jquery-plugins.js");
		caminhosValidos.add(req.getRequestURI().substring(0, req.getRequestURI().indexOf('/', 1)) + "/faces/javax.faces.resource/primefaces.css");
		caminhosValidos.add(req.getRequestURI().substring(0, req.getRequestURI().indexOf('/', 1)) + "/faces/javax.faces.resource/messages/messages.png");
		caminhosValidos.add(req.getRequestURI().substring(0, req.getRequestURI().indexOf('/', 1)) + "/faces/javax.faces.resource/primefaces-sam/images/ui-bg_flat_0_aaaaaa_40x100.png");
		caminhosValidos.add(req.getRequestURI().substring(0, req.getRequestURI().indexOf('/', 1)) + "/faces/javax.faces.resource/primefaces-sam/images/ui-icons_222222_256x240.png");
		caminhosValidos.add(req.getRequestURI().substring(0, req.getRequestURI().indexOf('/', 1)) + "/faces/javax.faces.resource/primefaces-sam/images/carregandoAguarde.gif");
		caminhosValidos.add(req.getRequestURI().substring(0, req.getRequestURI().indexOf('/', 1)) + "/faces/static/css/fioriLogin.css");
		caminhosValidos.add(req.getRequestURI().substring(0, req.getRequestURI().indexOf('/', 1)) + "/faces/RES_NOT_FOUND");
		
		if (session.getAttribute("dtLoginResp") != null || (caminhosValidos.contains(req.getRequestURI()))) {
			chain.doFilter(request, response);
			
			if(ultimaAcao != null)
			{
			
				Calendar agora = Calendar.getInstance();
				ultimaAcao.add(Calendar.MINUTE, 10);
				int j = agora.compareTo(ultimaAcao);  
				if(j > 0) {
					HttpServletResponse res = (HttpServletResponse) response;
					session.removeAttribute("dtLoginResp");
					res.sendRedirect(req.getRequestURI().substring(0, req.getRequestURI().indexOf('/', 1)) + "/faces/index.xhtml");
				}
			}
			
			ultimaAcao = Calendar.getInstance();
		} else {
			HttpServletResponse res = (HttpServletResponse) response;
			res.sendRedirect(req.getRequestURI().substring(0, req.getRequestURI().indexOf('/', 1)) + "/faces/index.xhtml");
		}
	}
	
	@Override
	public void init (FilterConfig filterConfig) throws ServletException {
	}
	
	@Override
	public void destroy() {
	}
}