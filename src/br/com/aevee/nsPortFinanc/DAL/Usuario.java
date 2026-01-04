package br.com.aevee.nsPortFinanc.DAL;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import br.com.aevee.port_finan.shared.DTHeader;
import br.com.aevee.port_finan.shared.DTMsg;
import br.com.aevee.port_finan.usuario.DTContatos;
import br.com.aevee.port_finan.usuario.DTUSERMAINTReq;
import br.com.aevee.port_finan.usuario.DTUSERMAINTResp;
import br.com.aevee.port_finan.usuario.SIUSERMAINTReq;
import br.com.aevee.port_finan.usuario.SIUSERMAINTReqService;

public class Usuario extends Base {
	public Usuario() {
		super(SIUSERMAINTReqService.class);
	}

	public List<DTUSERMAINTResp.Records> getAll(String usname, String fornecedor) {
		// R listar todos
		// LIFNR => Fornecedor


		SIUSERMAINTReq siUserMainTInterface = (SIUSERMAINTReq) super
				.getInterface();

		DTUSERMAINTReq request = new DTUSERMAINTReq();
		DTHeader header = new DTHeader();
		header.setLIFNR(fornecedor);
		header.setUSNAME(usname);
		request.setHeader(header);
		request.setOPERACAO("R");

		List<DTUSERMAINTResp.Records> records = null;
		try {
			DTUSERMAINTResp response = siUserMainTInterface
					.siUSERMAINTReq(request);
			records = response.getRecords();
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		return records;

	}

	public String inserir(String usName, String lifnr,
			DTUSERMAINTReq.Records records) {
		String retorno = "";

		// D Deletar
		// C Criar
		// U Atualizar

		records.getUser().setUSNAME(records.getUser().getUSNAME().toUpperCase());

		List<DTContatos> contatos = new ArrayList<DTContatos>();
		for (int i=0; i < records.getContacts().size(); i++) {
			if(!records.getContacts().get(i).getSMTPADDR().isEmpty() ||
					!records.getContacts().get(i).getTELEXTENS().isEmpty() ||
					!records.getContacts().get(i).getTELNUMBER().isEmpty())
				contatos.add(records.getContacts().get(i));
		}
		records.getContacts().clear();
		records.getContacts().addAll(contatos);


		SIUSERMAINTReq siUserMainTInterface = (SIUSERMAINTReq) super
				.getInterface();

		DTUSERMAINTReq request = new DTUSERMAINTReq();
		request.getRecords().clear();

		DTHeader header = new DTHeader();
		header.setLIFNR(lifnr); // LIFNR => Fornecedor
		header.setUSNAME(usName); // USNAME => Usuario

		request.getRecords().add(records);

		header.setLIFNR(lifnr);
		request.setOPERACAO("C");
		request.setHeader(header);

		try {
			DTUSERMAINTResp response = siUserMainTInterface
					.siUSERMAINTReq(request);

			if (response.getResult().getSTATUS().equals(BigInteger.ZERO)) {
				retorno = "Usuario Cadastrado com Sucesso";
			} else {
				for (DTMsg mensagem : response.getResult().getMSG()) {
					retorno = mensagem.getMSG();
				}
			}
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
			retorno = "Falha ao Cadastrado Usuario";
		}
		return retorno;
	}

	public String update(String usName, String lifnr,
			DTUSERMAINTReq.Records records) {
		
		String retorno = "";
		// D Deletar
		// C Criar
		// U Atualizar


		List<DTContatos> contatos = new ArrayList<DTContatos>();
		for (int i=0; i < records.getContacts().size(); i++) {
			if(!records.getContacts().get(i).getSMTPADDR().isEmpty() ||
					!records.getContacts().get(i).getTELEXTENS().isEmpty() ||
					!records.getContacts().get(i).getTELNUMBER().isEmpty())
				contatos.add(records.getContacts().get(i));
		}
		records.getContacts().clear();
		records.getContacts().addAll(contatos);

		SIUSERMAINTReq siUserMainTInterface = (SIUSERMAINTReq) super
				.getInterface();

		DTUSERMAINTReq request = new DTUSERMAINTReq();
		request.getRecords().clear();

		DTHeader header = new DTHeader();
		header.setLIFNR(lifnr); // LIFNR => Fornecedor
		header.setUSNAME(usName); // USNAME => Usuario

		request.getRecords().add(records);

		header.setLIFNR(lifnr);
		request.setOPERACAO("U");
		request.setHeader(header);

		try {
			DTUSERMAINTResp response = siUserMainTInterface
					.siUSERMAINTReq(request);
			
			if (response.getResult().getSTATUS().equals(BigInteger.ZERO)) {
				retorno = "Usuario Alterado com Sucesso";
			} else {
				for (DTMsg mensagem : response.getResult().getMSG()) {
					retorno = mensagem.getMSG();
				}
			}
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
			retorno = "Falha ao Alterar Usuario";
			return retorno;
		}
		return retorno;
	}
}
