package br.com.aevee.nsPortFinanc.DAL;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import br.com.aevee.port_finan.aviso.DTAviso;
import br.com.aevee.port_finan.aviso.DTAvisosReq;
import br.com.aevee.port_finan.aviso.DTAvisosResp;
import br.com.aevee.port_finan.aviso.DTEsconderMensagemResp;
import br.com.aevee.port_finan.aviso.DTListarAvisosReq;
import br.com.aevee.port_finan.aviso.DTListarAvisosResp;
import br.com.aevee.port_finan.aviso.DTMensagemLida;
import br.com.aevee.port_finan.aviso.SIAvisosReqService;
import br.com.aevee.port_finan.aviso.SIAvisosReq;
import br.com.aevee.port_finan.shared.DTMsg;

public class Aviso extends Base {
	public Aviso() {
		super(SIAvisosReqService.class);
	}

	public List<DTAviso> listar(String usName) {
		List<DTAviso> retorno = null;
		SIAvisosReq siAviso = (SIAvisosReq) super.getInterface();

		DTListarAvisosReq mtListarAvisosReq = new DTListarAvisosReq();

		mtListarAvisosReq.setUSNAM(usName);

		try {
			DTListarAvisosResp dtAvisosResp = siAviso.listar(mtListarAvisosReq);
			retorno = dtAvisosResp.getAvisos();
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		return retorno;
	}
	
	public List<String> EsconderMensagem(String usName, BigInteger Id, String IP) {
		List<String> retorno = new ArrayList<String>();
		SIAvisosReq siAviso = (SIAvisosReq) super.getInterface();

		DTMensagemLida mtEsconderMensagemReq = new DTMensagemLida();

		mtEsconderMensagemReq.setUSNAME(usName);
		mtEsconderMensagemReq.setID(Id);
		mtEsconderMensagemReq.setIP(IP);
		

		try {
			DTEsconderMensagemResp dTEsconderMensagemResp = siAviso.esconderMensagem(mtEsconderMensagemReq);
			if (!dTEsconderMensagemResp.getResult().getSTATUS().equals(BigInteger.ZERO)) {
				for (DTMsg mensagem : dTEsconderMensagemResp.getResult().getMSG()) {
					retorno.add(mensagem.getMSG());
				}
			}
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
			retorno.add("Falha Interna.");
		}

		return retorno;
	}
	public List<String> ConfirmaLeitura(String usName, BigInteger Id, String IP) {
		List<String> retorno = new ArrayList<String>();
		SIAvisosReq siAviso = (SIAvisosReq) super.getInterface();

		DTMensagemLida mtMensagemLidaReq = new DTMensagemLida();

		mtMensagemLidaReq.setUSNAME(usName);
		mtMensagemLidaReq.setID(Id);
		mtMensagemLidaReq.setIP(IP);
		

		try {
			DTEsconderMensagemResp dTEsconderMensagemResp = siAviso.mensagemLida(mtMensagemLidaReq);
			if (!dTEsconderMensagemResp.getResult().getSTATUS().equals(BigInteger.ZERO)) {
				for (DTMsg mensagem : dTEsconderMensagemResp.getResult().getMSG()) {
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
