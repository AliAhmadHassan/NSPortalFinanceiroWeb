package br.com.aevee.nsPortFinanc.DAL;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import br.com.aevee.port_finan.log_in.DTPWDCHANGEReq;
import br.com.aevee.port_finan.log_in.SIPWDCHANGEReq;
import br.com.aevee.port_finan.log_in.SIPWDCHANGEReqService;
import br.com.aevee.port_finan.shared.DTMsg;
import br.com.aevee.port_finan.shared.DTRESPONSE;

public class AlterarSenha extends Base {
	public AlterarSenha(){
		super(SIPWDCHANGEReqService.class);
	}
	
	public List<String> alterar(String usuario, String senha, String cod){
		SIPWDCHANGEReq siPWDCHANGEInterface = (SIPWDCHANGEReq)super.getInterface();
		
		DTPWDCHANGEReq request = new DTPWDCHANGEReq();
		request.setUSNAME(usuario);
		request.setKEY(cod);
		request.setPASSCODE(senha);
		
		List<String> erros = new ArrayList<String>();
		try{
			DTRESPONSE response = siPWDCHANGEInterface.pwdCHANGE(request);
			
			if(!response.getSTATUS().equals(BigInteger.ZERO))
			{
				for (DTMsg erro : response.getMSG()){
					erros.add(erro.getMSG());
				}
			}
			else{
				erros.add("Senha Alterado com Sucesso");
			}
				
		}
		catch(Exception erro){
			System.out.println(erro.getMessage());
		}
		
		return erros;
	}

}
