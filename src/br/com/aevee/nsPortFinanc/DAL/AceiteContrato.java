package br.com.aevee.nsPortFinanc.DAL;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import br.com.aevee.port_finan.shared.DTMsg;
import br.com.aevee.port_finan.usuario.DTAceiteContratoReq;
import br.com.aevee.port_finan.usuario.DTAceiteContratoResp;
import br.com.aevee.port_finan.usuario.SIUserAceiteContratoReq;
import br.com.aevee.port_finan.usuario.SIUserAceiteContratoReqService;

public class AceiteContrato extends Base {

	public AceiteContrato(){
		super(SIUserAceiteContratoReqService.class);
	}
	
	public List<String> UserAceiteContrato(String usname, String ip, String termoaceitado){
		List<String> retorno = new ArrayList<String>();
		SIUserAceiteContratoReq siAceiteContrato = (SIUserAceiteContratoReq) super.getInterface();
		
		DTAceiteContratoReq mtAceiteContratoReq = new DTAceiteContratoReq();
		
		//Calendar calendarAgora = Calendar.getInstance();
		//GregorianCalendar gregoryAgora = new GregorianCalendar();
		//gregoryAgora.setTime(calendarAgora.getTime());
		//mtAceiteContratoReq.setDATA(new XMLGregorianCalendarImpl(gregoryAgora));
		//mtAceiteContratoReq.setHORA(new XMLGregorianCalendarImpl(gregoryAgora));
		mtAceiteContratoReq.setIP(ip);
		mtAceiteContratoReq.setTERMOACEITADO(termoaceitado);
		mtAceiteContratoReq.setUSNAME(usname);		
		
		try {
			DTAceiteContratoResp aceiteContratoResp = siAceiteContrato.siUserAceiteContrato(mtAceiteContratoReq);
			
			
			if (aceiteContratoResp.getResult().getSTATUS().equals(BigInteger.ZERO)) {
				//retorno.add("Solicição realizada com Sucesso");
			} else {
				for (DTMsg mensagem : aceiteContratoResp.getResult().getMSG()) {
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
