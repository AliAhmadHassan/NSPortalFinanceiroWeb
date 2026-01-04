package br.com.aevee.nsPortFinanc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;

import br.com.aevee.nsPortFinanc.DAL.*;
import br.com.aevee.port_finan.usuario.DTContatos;
import br.com.aevee.port_finan.usuario.DTUSERMAINTResp;
import br.com.aevee.port_finan.usuario.DTUserProfiles;
import br.com.aevee.port_finan.usuario.DTUsers;
import br.com.aevee.port_finan.usuario.DTUSERMAINTReq.Records;

@SessionScoped
@ManagedBean
public class AdministracaoUsuarioBeanOld extends AbstractManagedBean {
	private List<br.com.aevee.port_finan.usuario.DTUsers> users;
	private Map<String, List<DtContatoExtends>> contatos;
	private Map<String, List<DTUserProfiles>> profiles;
	private String LIFNR = "";

	private br.com.aevee.port_finan.usuario.DTUsers userAlteracao;

	// Contact
	private br.com.aevee.port_finan.usuario.DTContatos contatoAlteracao;

	private String usName;

	public AdministracaoUsuarioBeanOld() {
		atualizaGrid();
	}

	public void atualizaGrid() {
		String lifnr = this.getUsuario().getLIFNR();
		
		if((this.getUsuario().getUSTYP().equals("UI"))&&(!getLIFNR().isEmpty()))
			lifnr = getLIFNR();
			
			
		List<DTUSERMAINTResp.Records> records = new Usuario().getAll(this
				.getUsuario().getUSNAME(), lifnr);

		users = new ArrayList<br.com.aevee.port_finan.usuario.DTUsers>();
		contatos = new HashMap<String, List<DtContatoExtends>>();
		profiles = new HashMap<String, List<DTUserProfiles>>();

		for (DTUSERMAINTResp.Records record : records) {
			users.add(record.getUsers());

			List<DtContatoExtends> listaContatos = new ArrayList<AdministracaoUsuarioBeanOld.DtContatoExtends>();
			for (DTContatos aux : record.getContacts()) {
				listaContatos.add(new DtContatoExtends(aux));
			}

			contatos.put(record.getUsers().getUSNAME(), listaContatos);
			profiles.put(record.getUsers().getUSNAME(), record.getProfiles());
		}

		contatoAlteracao = new DTContatos();
		userAlteracao = new DTUsers();
	}
	
	public List<br.com.aevee.port_finan.usuario.DTUsers> getUsers() {
		return this.users;
	}

	public List<DtContatoExtends> getContacts() {
		List<DtContatoExtends> aux = contatos.get(getUsName());

		return aux;
	}

	public List<br.com.aevee.port_finan.usuario.DTUserProfiles> getProfiles() {
		List<DTUserProfiles> aux = profiles.get(getUsName());

		return aux;
	}

	public String getUsName() {
		return usName;
	}

	public void setUsName(String usName) {
		this.usName = usName;
	}

	public br.com.aevee.port_finan.usuario.DTContatos getContatoAlteracao() {
		return contatoAlteracao;
	}

	public void setContatoAlteracao(
			br.com.aevee.port_finan.usuario.DTContatos contatoAlteracao) {
		this.contatoAlteracao = contatoAlteracao;
	}

	public br.com.aevee.port_finan.usuario.DTUsers getUserAlteracao() {
		return userAlteracao;
	}

	public void setUserAlteracao(
			br.com.aevee.port_finan.usuario.DTUsers userAlteracao) {
		this.userAlteracao = userAlteracao;
	}

	public String getLIFNR() {
		return LIFNR;
	}

	public void setLIFNR(String lIFNR) {
		LIFNR = lIFNR;
	}

	public void onContactCreate() {
		Records record = new Records();
		record.getContacts().clear();
		
		for (DtContatoExtends item : contatos.get(getUsName())) 
			record.getContacts().add(item);
		
		record.getContacts().add(contatoAlteracao);
		
		
		for (DTUsers item : users) {
			if(item.getUSNAME().equals(getUsName()))
			{
				record.setUser(item);
				break;
			}
		}
		
		
		try{
			
			new Usuario().update(this.getUsuario().getUSNAME(), this
					.getUsuario().getLIFNR(), record);
			
			atualizaGrid();
			FacesMessage msg = new FacesMessage("Contato Alterado com Sucesso");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
		catch(Exception erro){
			
			FacesMessage msg = new FacesMessage("Falha ao Alterar Contato");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}



	}
	public void onContactEdit(RowEditEvent event) {
		Records record = new Records();
		record.getContacts().clear();
		
		DtContatoExtends contatoAlteracao = ((DtContatoExtends) event
				.getObject());

		for (DtContatoExtends item : contatos.get(getUsName())) {
			if (contatoAlteracao.getCod().equals(item.getCod()))
				record.getContacts().add(contatoAlteracao);
			else
				record.getContacts().add(item);
		}
		
		for (DTUsers item : users) {
			if(item.getUSNAME().equals(getUsName()))
				record.setUser(item);
		}
		
		
		try{
			
			new Usuario().update(this.getUsuario().getUSNAME(), this
					.getUsuario().getLIFNR(), record);
			
			atualizaGrid();
			FacesMessage msg = new FacesMessage("Contato Alterado com Sucesso");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
		catch(Exception erro){
			
			FacesMessage msg = new FacesMessage("Falha ao Alterar Contato");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}



	}

	public void onContactCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Alteração Cancelada");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onUserCreate(){
		if(this.getUsuario().getUSTYP() == "UE")
			userAlteracao.setLIFNR(this.getUsuario().getLIFNR());
		else
			userAlteracao.setLIFNR(this.getLIFNR());
		
		Records records = new Records();
		records.setUser(userAlteracao);
		

		try {
			new Usuario().inserir(this.getUsuario().getUSNAME(), this
					.getUsuario().getLIFNR(), records);

			FacesMessage msg = new FacesMessage("Usuario Criado com Sucesso");
			FacesContext.getCurrentInstance().addMessage(null, msg);

			atualizaGrid();
		} catch (Exception erro) {
			FacesMessage msg = new FacesMessage("Erro ao Criar Usuario");
			System.out.println("Erro WebService: " + erro.getMessage());
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}
	
	public void onUserEdit(RowEditEvent event) {
		br.com.aevee.port_finan.usuario.DTUsers usuarioAlterado = ((br.com.aevee.port_finan.usuario.DTUsers) event
				.getObject());

		Records records = new Records();
		records.setUser(usuarioAlterado);

		try {
			new Usuario().update(this.getUsuario().getUSNAME(), this
					.getUsuario().getLIFNR(), records);

			FacesMessage msg = new FacesMessage("Usuario Alterado com Sucesso");
			FacesContext.getCurrentInstance().addMessage(null, msg);

			atualizaGrid();
		} catch (Exception erro) {
			FacesMessage msg = new FacesMessage("Erro ao Alterar Usuario");
			System.out.println("Erro WebService: " + erro.getMessage());
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}

	public void onUserCancel(RowEditEvent event) {
		br.com.aevee.port_finan.usuario.DTUsers usuarioAlterado = ((br.com.aevee.port_finan.usuario.DTUsers) event
				.getObject());

		FacesMessage msg = new FacesMessage("Alteração Cancelada");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	private class DtContatoExtends extends
			br.com.aevee.port_finan.usuario.DTContatos {

		public DtContatoExtends(
				br.com.aevee.port_finan.usuario.DTContatos dtContatos) {
			this.setCod(java.util.UUID.randomUUID().toString());
			this.setSMTPADDR(dtContatos.getSMTPADDR());
			this.setTELEXTENS(dtContatos.getTELEXTENS());
			this.setTELNUMBER(dtContatos.getTELNUMBER());
			this.setTPUSPTEL(dtContatos.getTPUSPTEL());
		}

		private String cod;

		public String getCod() {
			return cod;
		}

		public void setCod(String cod) {
			this.cod = cod;
		}
	}
}
