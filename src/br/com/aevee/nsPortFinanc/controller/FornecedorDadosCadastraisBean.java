package br.com.aevee.nsPortFinanc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.aevee.port_finan.fornecedores.DTLFA1;

@SessionScoped
@ManagedBean
public class FornecedorDadosCadastraisBean  extends AbstractManagedBean {
	private String campoPesquisa;
	private List<DTLFA1> fornecedores;
	private List<DTLFA1> filteredfornecedores;
	private Map<String,String> fornecedoresUsuarioExterno;
	private String campoPesquisaSelecionado;
	
	private DTLFA1 fornecedorSelecionado;
	
	public String getCampoPesquisa() {
		return campoPesquisa;
	}
	public void setCampoPesquisa(String campoPesquisa) {
		this.campoPesquisa = campoPesquisa;
	}
	public String getCampoPesquisaSelecionado() {
		return campoPesquisaSelecionado;
	}
	public void setCampoPesquisaSelecionado(String campoPesquisaSelecionado) {
		this.campoPesquisaSelecionado = campoPesquisaSelecionado;
	}
	public DTLFA1 getFornecedorSelecionado() {
		return fornecedorSelecionado;
	}
	public void setFornecedorSelecionado(DTLFA1 fornecedorSelecionado) {
		this.fornecedorSelecionado = fornecedorSelecionado;
	}
	public List<DTLFA1> getFornecedores() {
		return fornecedores;
	}
	public Map<String,String> getFornecedoresUsuarioExterno() {
		return fornecedoresUsuarioExterno;
	}
	
	public List<DTLFA1> getFilteredfornecedores() {
		return filteredfornecedores;
	}
	public void setFilteredfornecedores(List<DTLFA1> filteredfornecedores) {
		this.filteredfornecedores = filteredfornecedores;
	}
	public FornecedorDadosCadastraisBean(){
		if(!this.getUsuarioInterno()){
			
			fornecedoresUsuarioExterno = new HashMap<String, String>();
			fornecedores = new ArrayList<DTLFA1>();
			String rootCNPJ = new br.com.aevee.nsPortFinanc.DAL.Fornecedores().getByLIFNR(this.getUsuario().getLIFNR()).getSTCD1().substring(0, 8);
			for (DTLFA1 item : new br.com.aevee.nsPortFinanc.DAL.Fornecedores().getByRoot(rootCNPJ)) {
				 fornecedoresUsuarioExterno.put(item.getSTCD1() + " - " + item.getNAME1(), item.getLIFNR());
				 fornecedores.add(item);
			}
		}
	}
	

	public void atualizaGrid(){
		if(this.getUsuarioInterno()){
			if(campoPesquisa.length() > 2){
				fornecedores = new br.com.aevee.nsPortFinanc.DAL.Fornecedores().getContent(campoPesquisa);			
			}
		}else{
			fornecedores = new br.com.aevee.nsPortFinanc.DAL.Fornecedores().getContent(campoPesquisaSelecionado);
		}
	}
	
	
}
