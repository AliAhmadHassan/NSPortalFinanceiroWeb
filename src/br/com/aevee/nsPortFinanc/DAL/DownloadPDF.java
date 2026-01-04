package br.com.aevee.nsPortFinanc.DAL;

import br.com.aevee.port_finan.Common;
import br.com.aevee.port_finan.publicacao.DTBase64;
import br.com.aevee.port_finan.publicacao.DTDownloadPDFReq;
import br.com.aevee.port_finan.publicacao.DTDownloadPDFResp;
import br.com.aevee.port_finan.publicacao.SIDownloadPDFReq;
import br.com.aevee.port_finan.publicacao.SIDownloadPDFReqService;
import br.com.aevee.port_finan.shared.DTMsg;

import java.io.*;
import java.math.BigInteger;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import sun.misc.BASE64Decoder;


public class DownloadPDF extends Base {
	public DownloadPDF(){
		super(SIDownloadPDFReqService.class);
	}
	
	public String Download(String comprovante, String NomeArquivo, FacesContext context){
		SIDownloadPDFReq siDownloadPDFResp = (SIDownloadPDFReq)super.getInterface();
		
		DTDownloadPDFReq mtDownloadPDFReq = new DTDownloadPDFReq();
		mtDownloadPDFReq.setComprovante(comprovante);		
		
		String retorno = "";
		try{
			
			DTDownloadPDFResp tmep = siDownloadPDFResp.siDownloadPDFReq(mtDownloadPDFReq);
			retorno = convertBase64PDF(tmep.getPDF(), NomeArquivo);
			
			if (!tmep.getResult().getSTATUS().equals(BigInteger.ZERO)) {
				
				for (DTMsg mensagem : tmep.getResult().getMSG()) {
					FacesMessage msg = new FacesMessage(mensagem.getMSG());
					context.addMessage(null, msg);
				}
			}
			
		}
		catch(Exception erro){
			System.out.println(erro.getMessage());
			
			FacesMessage msg = new FacesMessage("Falha ao Consultar Comprovante.");
			context.addMessage(null, msg);
		}
		
		return retorno;
	}
	
	private String convertBase64PDF(DTBase64 valor, String NomeArquivo){

		String realPath = Common.getCorrectComprovantePath();
		new File(realPath).mkdir();
		
		realPath += NomeArquivo;
		
		BASE64Decoder decoder = new BASE64Decoder();
		byte[] decodedBytes;
		try {
			decodedBytes = decoder.decodeBuffer(valor.getPDFBase64());
	
		File file = new File(realPath);;
		FileOutputStream fop = new FileOutputStream(file);

		fop.write(decodedBytes);
		fop.flush();
		fop.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			realPath = "";
			e.printStackTrace();
		}

		return realPath;
	}
}
