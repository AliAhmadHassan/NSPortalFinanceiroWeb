package br.com.aevee.nsPortFinanc.DAL;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import br.com.aevee.port_finan.log_in.DTLOGINReq;
import br.com.aevee.port_finan.log_in.DTLOGINResp;
import br.com.aevee.port_finan.log_in.SILOGINReq;
import br.com.aevee.port_finan.log_in.SILOGINReqService;
import br.com.aevee.port_finan.shared.DTMsg;

public class Login extends Base {
	public Login(){
		super(SILOGINReqService.class);
		
		//new Fornecedores().getAll();
	}
	
	public DTLOGINResp Logar(String usuario, String senha){
		SILOGINReq siLoginInterface = (SILOGINReq)super.getInterface();
		
		DTLOGINReq request = new DTLOGINReq();
		request.setUSNAM(usuario.toUpperCase());
		request.setPASSWORD(senha);
		
		String ipAddress = ((HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest()).getHeader("x-forwarded-for");
		if (ipAddress == null) {
		    ipAddress = ((HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest()).getHeader("X_FORWARDED_FOR");
		    if (ipAddress == null){
		        ipAddress = ((HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest()).getRemoteAddr();
		    }
		}
		request.setIP(ipAddress);
		
		//request.setUSNAM("ALEGRIA");
		//request.setPASSWORD("inicio123*");
		DTLOGINResp response = null;
		try{
			response = siLoginInterface.siLOGINReq(request);
		}
		catch(Exception erro){
			System.out.println(erro.getMessage());
		}
		
		return response;
	}
	
	public List<String> EsqueciSenha(String usuario){
		SILOGINReq siLoginInterface = (SILOGINReq)super.getInterface();
		
		DTLOGINReq request = new DTLOGINReq();
		request.setUSNAM(usuario.toUpperCase());
		request.setRESET("X");

		DTLOGINResp response = null;
		List<String> erros = new ArrayList<String>();
		try{
			response = siLoginInterface.siLOGINReq(request);
			
			if(!response.getResult().getSTATUS().equals(BigInteger.ZERO)){
				for (DTMsg erro : response.getResult().getMSG()){
					erros.add(erro.getMSG());
				}
			}
			else{
				erros.add("E-Mail Enviado Conforme Cadastro de Usuario");
			}
		}
		catch(Exception erro){
			System.out.println(erro.getMessage());
		}
		
		return erros;
	}
}
