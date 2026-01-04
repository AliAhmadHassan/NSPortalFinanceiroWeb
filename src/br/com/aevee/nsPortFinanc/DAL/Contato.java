package br.com.aevee.nsPortFinanc.DAL;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import br.com.aevee.port_finan.contato.DTContatoEnvioReq;
import br.com.aevee.port_finan.contato.DTContatoEnvioResp;
import br.com.aevee.port_finan.contato.DTContatoReq;
import br.com.aevee.port_finan.contato.DTContatoResp;
import br.com.aevee.port_finan.contato.SIContatoReq;
import br.com.aevee.port_finan.contato.SIContatoReqService;
import br.com.aevee.port_finan.shared.DTMsg;

public class Contato  extends Base{

	public Contato() {
		super(SIContatoReqService.class);
	}

	public DTContatoResp getAll(String usnam){
		DTContatoResp retorno = null;
		SIContatoReq siContato = (SIContatoReq)super.getInterface();
		
		DTContatoReq mtContatoReq = new DTContatoReq();
		mtContatoReq.setUSNAM(usnam);	
		try {
			retorno = siContato.inicio(mtContatoReq);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		return retorno;
	}
	
	public List<String> enviar(DTContatoEnvioReq mtContatoEnvioReq){
		List<String> retorno = new ArrayList<String>();
		
		SIContatoReq siContato = (SIContatoReq)super.getInterface();
		
		
		
		
		try {
			DTContatoEnvioResp response = siContato.enviar(mtContatoEnvioReq);
			
			
			if(response.getResult().getSTATUS().equals(BigInteger.ZERO)){
				retorno.add("Enviado com Sucesso!");
			} else {
				for (DTMsg mensagem : response.getResult().getMSG()) {
					retorno.add(mensagem.getMSG());
				}
			}
			
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
			retorno.add("Falha Interna.");
		}
			
		return retorno;
	}


}
