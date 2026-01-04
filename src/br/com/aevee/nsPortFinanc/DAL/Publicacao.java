package br.com.aevee.nsPortFinanc.DAL;

import java.math.BigInteger;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import br.com.aevee.port_finan.publicacao.DTDataVencimento;
import br.com.aevee.port_finan.publicacao.DTPublicacaoReq;
import br.com.aevee.port_finan.publicacao.DTPublicacaoResp;
import br.com.aevee.port_finan.publicacao.SIPublicacaoReq;
import br.com.aevee.port_finan.publicacao.SIPublicacaoReqService;

public class Publicacao extends Base {
	public Publicacao(){
		super(SIPublicacaoReqService.class);
	}
	
	public DTPublicacaoResp listar(List<String> emprs, List<String> lifnrs, XMLGregorianCalendar de, XMLGregorianCalendar ate, List<BigInteger> status){
		DTPublicacaoResp retorno = null;
		
		SIPublicacaoReq siPublicacaoResp = (SIPublicacaoReq)super.getInterface();
		DTPublicacaoReq mtPublicacaoReq = new DTPublicacaoReq();
		for (String item : emprs) {
			mtPublicacaoReq.getBUKRS().add(item);
		}
		for (String item : lifnrs) {
			mtPublicacaoReq.getLIFNR().add(item);
		}
		
		DTDataVencimento dtDataVencimento = new DTDataVencimento();
		dtDataVencimento.setDe(de);
		dtDataVencimento.setAte(ate);
		
		mtPublicacaoReq.setDataVencimento(dtDataVencimento);
		for (BigInteger bigInteger : status) {
			mtPublicacaoReq.setStatus(bigInteger);	
		}
		
		try {
			retorno = siPublicacaoResp.listar(mtPublicacaoReq);
		}
		catch(Exception erro){
			System.out.println(erro.getMessage());
		}
		
		return retorno;
	}
	
}
