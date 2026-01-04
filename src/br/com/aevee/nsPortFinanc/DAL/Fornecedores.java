package br.com.aevee.nsPortFinanc.DAL;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.aevee.port_finan.fornecedores.DTADRC;
import br.com.aevee.port_finan.fornecedores.DTLFA1;
import br.com.aevee.port_finan.fornecedores.DTLFB1;
import br.com.aevee.port_finan.fornecedores.DTLFBK;
import br.com.aevee.port_finan.fornecedores.DTListarFornecedoresINB;
import br.com.aevee.port_finan.fornecedores.DTListarFornecedoresOUT;
import br.com.aevee.port_finan.fornecedores.SIFornecedoresReq;
import br.com.aevee.port_finan.fornecedores.SIFornecedoresReqService;
import br.com.aevee.port_finan.shared.DTRange;

import java.util.Date;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Fornecedores extends Base {
	public Fornecedores(){
		super(SIFornecedoresReqService.class);
		
		if(fornecedores == null)
			Atualiza();
		else if(atualizar.compareTo(new Date()) < 0)
			Atualiza();
	}
	
	private static List<DTLFA1> fornecedores  = null;
	
	private static Date atualizar;

	public List<DTLFA1> getAll(){
		
		if(fornecedores == null)
			Atualiza();
		else if(atualizar.compareTo(new Date()) < 0)
			Atualiza();
		
		return fornecedores;
	}

	public DTLFA1 getByLIFNR(String lifnr){
		for (DTLFA1 item : fornecedores) {
			if(item.getLIFNR().equals(lifnr))
				return item;			
		}
		return null;		
	}
	
	public List<DTLFA1> getByNAME1(String name1){
		List<DTLFA1> itens = new ArrayList<DTLFA1>();
		
		for (DTLFA1 item : fornecedores) {
			if(item.getNAME1().contains(name1))
				itens.add(item);			
		}		
		
		return itens;				
	}
	
	public List<DTLFA1> getBySTCD1(String stcd1){
		List<DTLFA1> itens = new ArrayList<DTLFA1>();
		
		for (DTLFA1 item : fornecedores) {
			if(item.getSTCD1().contains(stcd1))
				itens.add(item);			
		}		
		
		return itens;				
	}
	
	public List<DTLFA1> getByRoot(String root){
		List<DTLFA1> itens = new ArrayList<DTLFA1>();
		
		for (DTLFA1 item : fornecedores) {
			if(item.getSTCD1().length() > 8)
			if(item.getSTCD1().substring(0, 8).equals(root))
				itens.add(item);			
		}		
		
		return itens;				
	}
	
	public List<DTLFA1> getContent(String campoPesquisa){
		List<DTLFA1> itens = new ArrayList<DTLFA1>();
		
		campoPesquisa = campoPesquisa.toUpperCase();
		
		for (DTLFA1 item : fornecedores) {
			if((item.getSTCD1().toUpperCase().contains(campoPesquisa))
					||(item.getLIFNR().toUpperCase().contains(campoPesquisa))
					||(item.getNAME1().toUpperCase().contains(campoPesquisa))
					||(item.getNAME2().toUpperCase().contains(campoPesquisa))
					||(item.getSPRAS().toUpperCase().contains(campoPesquisa))
					||(item.getSTCD1().toUpperCase().contains(campoPesquisa)))
				itens.add(item);			
		}		
		
		return itens;				
	}
	
	private void Atualiza() {
	
		/*if(DadosUsuarioExterno()){
			
			return;
		}*/
		SIFornecedoresReq siFornecedores = (SIFornecedoresReq)super.getInterface();
		
		DTListarFornecedoresINB listaFornecedores = new DTListarFornecedoresINB();
		//DTRange range = new DTRange();

		/*range.setOPTION("EQ");
		//range.setOPTION("BT");
		range.setLOW("7497263");
		range.setSIGN("I");
		//range.setHIGH(value);
		
		listaFornecedores.getSLIFNR().add(range);*/
		try{
			DTListarFornecedoresOUT Fornecedores = siFornecedores.listar(listaFornecedores);
			fornecedores = Fornecedores.getResponse();
		}
		catch(Exception erro){
			System.out.println(erro.getMessage());
		}
		atualizar = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(atualizar); 
		c.add(Calendar.DATE, 1);
		atualizar = c.getTime();
		
	}
	
	public void AtualizaUE(String linfr){
		SIFornecedoresReq siFornecedores = (SIFornecedoresReq)super.getInterface();
		
		DTListarFornecedoresINB listaFornecedores = new DTListarFornecedoresINB();
		DTRange range = new DTRange();

		range.setOPTION("EQ");
		range.setLOW(linfr);
		range.setSIGN("I");
		listaFornecedores
		.getSLIFNR().add(range);
		try{
			DTListarFornecedoresOUT Fornecedores = siFornecedores.listar(listaFornecedores);
			List<DTLFA1> auxFornecedores = Fornecedores.getResponse();
			
			List<DTLFA1> fornecedoresTemp = new ArrayList<DTLFA1>(); 
					
			for (DTLFA1 item : fornecedores) {
				if(item.getSTCD1().length() > 8)
					if(item.getSTCD1().substring(0, 8).equals(auxFornecedores.get(0).getSTCD1().substring(0, 8)))
						continue;
				fornecedoresTemp.add(item);
			}
			
			
			for (DTLFA1 itemNovo : auxFornecedores) {
				fornecedoresTemp.add(itemNovo);
			}
			
			fornecedores = fornecedoresTemp;
		}
		catch(Exception erro){
			System.out.println(erro.getMessage());
		}
		
		
		
	}

	private boolean DadosUsuarioExterno() {
		fornecedores = new ArrayList<DTLFA1>();
		DTLFA1 fornecedor = new DTLFA1();
		fornecedor.setLIFNR("0000054813");
		fornecedor.setNAME1("NIKE DO BRASIL COMERCIO E PARTICIPA");
		fornecedor.setNAME2("COES LTDA.");
		fornecedor.setSTCD1("59546515000487");
		fornecedor.setSTCD3("421085072118");
		fornecedor.setSPRAS("P");
		
		DTLFBK banco = new DTLFBK(); 
		banco.setAGENCIA("1145");
		banco.setBANCO("237");
		banco.setCONTA("86100-6");
		fornecedor.getDadosBancarios().add(banco);
		
		DTLFB1 empresario = new DTLFB1();
		empresario.setBUKRS("1000");
		empresario.setDIASANT(new BigInteger("8"));
		empresario.setTXANT(new BigDecimal("2.80000"));
		empresario.setZZATIVOANT("X");
		empresario.setZZGRPDIAANT("D1");
		empresario.setZZGRPTXANT("T2");
		fornecedor.getDadosEmpresariais().add(empresario);
		
		DTADRC endereco = new DTADRC();
		endereco.setSTREET("ESTRADA DA CRUZ GRANDE");
		endereco.setHOUSENUM1("1.700");
		endereco.setCITY2("STO ANTONIO");
		endereco.setPOSTCODE1("13290-000");
		endereco.setCITY1("LOUVEIRA");
		endereco.setCOUNTRY("BR");
		endereco.setREGION("SP");
		
		fornecedor.getDadosEndereco().add(endereco);
		fornecedores.add(fornecedor);
		
		
		
		
		
		
		DTLFA1 fornecedor2 = new DTLFA1();
		fornecedor2.setLIFNR("0001413599");
		fornecedor2.setNAME1("NIKE DO BRASIL COM  E PARTICIPACOES");
		fornecedor2.setNAME2("NIKE DO BRASIL COM");
		fornecedor2.setSTCD1("59546515000134");
		fornecedor2.setSTCD3("206095929113");
		fornecedor2.setSPRAS("P");
		
		DTLFBK banco2 = new DTLFBK(); 
		banco2.setAGENCIA("3390");
		banco2.setBANCO("237");
		banco2.setCONTA("86100-6");
		fornecedor2.getDadosBancarios().add(banco2);
		
		DTLFB1 empresario2 = new DTLFB1();
		empresario2.setBUKRS("1000");
		empresario2.setDIASANT(new BigInteger("8"));
		empresario2.setTXANT(new BigDecimal("2.80000"));
		empresario2.setZZATIVOANT("X");
		empresario2.setZZGRPDIAANT("D1");
		empresario2.setZZGRPTXANT("T2");
		fornecedor2.getDadosEmpresariais().add(empresario2);
		
		DTADRC endereco2 = new DTADRC();
		endereco2.setSTREET("Al. Araguaia");
		endereco2.setHOUSENUM1("1142");
		endereco2.setCITY2("LAPA DE BAIXO");
		endereco2.setPOSTCODE1("06455-940");
		endereco2.setCITY1("BARUERI");
		endereco2.setCOUNTRY("BR");
		endereco2.setREGION("SP");
		
		fornecedor2.getDadosEndereco().add(endereco2);
		fornecedores.add(fornecedor2);
		
		
		
		
		
		DTLFA1 fornecedor3 = new DTLFA1();
		fornecedor3.setLIFNR("0007497263");
		fornecedor3.setNAME1("NIKE DO BRASIL COMERCIO E PARTICIPA");
		fornecedor3.setNAME2("COES LTDA");
		fornecedor3.setSTCD1("59546515002269");
		fornecedor3.setSTCD3("142884469114");
		fornecedor3.setSPRAS("P");
		
		DTLFBK banco3 = new DTLFBK(); 
		banco3.setAGENCIA("0000");
		banco3.setBANCO("341");
		banco3.setCONTA("66000-44");
		fornecedor3.getDadosBancarios().add(banco3);
		
		DTLFBK banco31 = new DTLFBK(); 
		banco31.setAGENCIA("3410");
		banco31.setBANCO("237");
		banco31.setCONTA("58756-55");
		fornecedor3.getDadosBancarios().add(banco31);
		
		DTLFB1 empresario3 = new DTLFB1();
		empresario3.setBUKRS("1000");
		empresario3.setDIASANT(new BigInteger("8"));
		empresario3.setTXANT(new BigDecimal("2.95000"));
		empresario3.setZZATIVOANT("X");
		empresario3.setZZGRPDIAANT("D2");
		empresario3.setZZGRPTXANT("T1");
		fornecedor3.getDadosEmpresariais().add(empresario3);
		
		DTADRC endereco3 = new DTADRC();
		endereco3.setSTREET("R WERNER SIEMENS");
		endereco3.setHOUSENUM1("111");
		endereco3.setCITY2("LAPA DE BAIXO");
		endereco3.setPOSTCODE1("05069-010");
		endereco3.setCITY1("BARUERI");
		endereco3.setCOUNTRY("BR");
		endereco3.setREGION("SP");
		
		fornecedor3.getDadosEndereco().add(endereco3);
		fornecedores.add(fornecedor3);
		
		
		
		atualizar = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(atualizar); 
		c.add(Calendar.DATE, 1);
		atualizar = c.getTime();
		
		return true;
	}


}
