package br.com.aevee.nsPortFinanc.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.aevee.port_finan.fornecedores.DTLFA1;

@SessionScoped
@ManagedBean
public class FornecedorFiltroBean extends AbstractManagedBean {
	private String campoPesquisa;
	private List<DTLFA1> fornecedores;
	
	public String getCampoPesquisa() {
		return campoPesquisa;
	}
	public void setCampoPesquisa(String campoPesquisa) {
		this.campoPesquisa = campoPesquisa;
	}
	public List<DTLFA1> getFornecedores() {
		return fornecedores;
	}


	public void atualizaGrid(){
		if(campoPesquisa.length() > 2){
			fornecedores = new br.com.aevee.nsPortFinanc.DAL.Fornecedores().getContent(campoPesquisa);			
		}
	}
	
	public FornecedorFiltroBean(){
		
	}
}
