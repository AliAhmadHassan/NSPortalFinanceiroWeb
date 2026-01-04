package br.com.aevee.nsPortFinanc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.model.DualListModel;

import br.com.aevee.nsPortFinanc.DAL.*;
import br.com.aevee.port_finan.fornecedores.DTLFA1;
import br.com.aevee.port_finan.usuario.DTContatos;
import br.com.aevee.port_finan.usuario.DTUSERMAINTReq;
import br.com.aevee.port_finan.usuario.DTUSERMAINTResp;
import br.com.aevee.port_finan.usuario.DTUserProfiles;
import br.com.aevee.port_finan.usuario.DTUserProfilesExt;
import br.com.aevee.port_finan.usuario.DTUsers;

@SessionScoped
@ManagedBean
public class AdministracaoUsuarioBean extends AbstractManagedBean {
	private DTUSERMAINTResp.Records selectRecord;
	private List<DTUSERMAINTResp.Records> records;
	private List<DTUSERMAINTResp.Records> filteredRecords;
	private List<DTUserProfilesExt> dtProfiles;

	private DualListModel<String> perfis;
	private String senhaConfirma = "";
	private boolean novoContato = false;

	public AdministracaoUsuarioBean() {

	}

	@PostConstruct
	public void init() {
		atualizaGrid();
		carregaPerfis();
	}

	private void carregaPerfis() {
		dtProfiles = new br.com.aevee.nsPortFinanc.DAL.UserProfiles()
				.GetAll();

		List<String> selecionavel = new ArrayList<String>();
		List<String> selecionado = new ArrayList<String>();

		for (DTUserProfilesExt item : dtProfiles) {
			if (contemProfile(item))
				selecionado.add(item.getDescricao());
			else
				selecionavel.add(item.getDescricao());
		}

		perfis = new DualListModel<String>(selecionavel, selecionado);
	}

	private boolean contemProfile(DTUserProfilesExt item) {
		for (DTUserProfiles prf : selectRecord.getProfiles()) {
			if (String.valueOf(prf.getPROFILE()).equals(item.getPROFILE()))
				return true;
		}

		return false;
	}

	public void atualizaGrid() {
		records = new Usuario().getAll(this.getUsuario().getUSNAME(), this
				.getUsuario().getLIFNR());

		for (DTUSERMAINTResp.Records record : records) {
			for (int i = record.getContacts().size(); i < 3; i++)
				record.getContacts().add(new DTContatos());
			
			try{
				DTLFA1 fornecedor = new br.com.aevee.nsPortFinanc.DAL.Fornecedores().getByLIFNR(record.getUsers().getLIFNR());
				
				record.getUsers().setDUMMY1(fornecedor.getSTCD1());
				record.getUsers().setDUMMY2(fornecedor.getNAME1());
			}
			catch(Exception error){
			}
		}
		selectRecord = new DTUSERMAINTResp.Records();
		selectRecord.setUsers(new DTUsers());
		selectRecord.getContacts().add(new DTContatos());
		selectRecord.getContacts().add(new DTContatos());
		selectRecord.getContacts().add(new DTContatos());
		selectRecord.getProfiles().add(new DTUserProfiles());

		if (this.getUsuario().getUSTYP().equals("UE")) {
			selectRecord.getUsers().setLIFNR(this.getUsuario().getLIFNR());
			selectRecord.getUsers().setUSTYP(this.getUsuario().getUSTYP());
		}
	}

	public List<DTUSERMAINTResp.Records> getRecords() {

		return records;

	}

	public void setRecords(List<DTUSERMAINTResp.Records> records) {
		this.records = records;
	}

	public DTUSERMAINTResp.Records getSelectRecord() {
		return selectRecord;
	}

	public void setSelectRecord(DTUSERMAINTResp.Records selectRecord) {
		this.selectRecord = selectRecord;
	}

	public DualListModel<String> getPerfis() {
		return perfis;
	}

	public void setPerfis(DualListModel<String> perfis) {
		this.perfis = perfis;
	}

	public String getSenhaConfirma() {
		return senhaConfirma;
	}

	public void setSenhaConfirma(String senhaConfirma) {
		this.senhaConfirma = senhaConfirma;

	}

	public boolean getNovoContato() {
		return novoContato;
	}

	public void setNovoContato(boolean novoContato) {
		this.novoContato = novoContato;

		if (novoContato) {
			selectRecord = new DTUSERMAINTResp.Records();
			selectRecord.setUsers(new DTUsers());
			selectRecord.getContacts().add(new DTContatos());
			selectRecord.getContacts().add(new DTContatos());
			selectRecord.getContacts().add(new DTContatos());
			selectRecord.getProfiles().add(new DTUserProfiles());

			if (this.getUsuario().getUSTYP().equals("UE")) {
				selectRecord.getUsers().setLIFNR(this.getUsuario().getLIFNR());
				selectRecord.getUsers().setUSTYP(this.getUsuario().getUSTYP());
			}
		}

		carregaPerfis();
	}

	public List<DTUSERMAINTResp.Records> getFilteredRecords() {
		return filteredRecords;
	}

	public void setFilteredRecords(List<DTUSERMAINTResp.Records> filteredRecords) {
		this.filteredRecords = filteredRecords;
	}

	public void salvar() {
		if (!ValidaCampos())
			return;

		DTUSERMAINTReq.Records request = new br.com.aevee.port_finan.usuario.DTUSERMAINTReq.Records();

		//selectRecord.getUsers().setLIFNR(selectRecord.getUsers().getLIFNR().substring(0, selectRecord.getUsers().getLIFNR().indexOf('\\')).trim());
		
		request.setUser(selectRecord.getUsers());
		request.getContacts().addAll(selectRecord.getContacts());

		for (String item : perfis.getTarget()) {
			for (DTUserProfilesExt perf : dtProfiles)
				if (perf.getDescricao().equals(item)) {
					DTUserProfiles perfil = new DTUserProfiles();
					perfil.setPROFILE(perf.getPROFILE());
					request.getProfiles().add(perfil);
				}
		}
		
		if(request.getProfiles().size() == 0){
				FacesMessage msg = new FacesMessage("Atenção",
						"Favor Informar os Perfis do Usuario");
				FacesContext.getCurrentInstance().addMessage(null, msg);
				return;

		}

		if (novoContato) {
			if ((!request.getUser().getPASSCODE().equals(senhaConfirma))
					|| (request.getUser().getPASSCODE().isEmpty())) {
				FacesMessage msg = new FacesMessage("Senha Invalida");
				FacesContext.getCurrentInstance().addMessage(null, msg);
				return;
			} else {
				String retorno = new br.com.aevee.nsPortFinanc.DAL.Usuario().inserir(this
						.getUsuario().getUSNAME(),
						this.getUsuario().getLIFNR(), request);
				
				
				FacesMessage msg = new FacesMessage(retorno);
				
				FacesContext.getCurrentInstance().addMessage(null, msg);
				
				if(retorno.contains("Usuario Cadastrado com Sucesso"))
					org.primefaces.context.RequestContext.getCurrentInstance().execute("PF('ajaxStatus').hide()");
			}
		} else {
			String retorno = new br.com.aevee.nsPortFinanc.DAL.Usuario().update(this
					.getUsuario().getUSNAME(), this.getUsuario()
					.getLIFNR(), request);
			
			FacesMessage msg = new FacesMessage(retorno);
			FacesContext.getCurrentInstance().addMessage(null, msg);
			
			if(retorno.equals("Usuario Alterado com Sucesso"))
				org.primefaces.context.RequestContext.getCurrentInstance().execute("PF('ajaxStatus').hide()");
		}
		atualizaGrid();
	}

	private boolean ValidaCampos() {
		boolean semErro = true;

		if(selectRecord.getUsers().getLIFNR() == null)
			selectRecord.getUsers().setLIFNR("");
		
				
		if (selectRecord.getUsers().getLIFNR().isEmpty() && this.getUsuarioInterno() && selectRecord.getUsers().getUSTYP().equals("UE")) {
			FacesMessage msg = new FacesMessage("Atenção",
					"O campo Cod. Fornecedor é Obrigatorio");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			semErro = false;
		}
		
		if (selectRecord.getUsers().getUSNAME().isEmpty()) {
			FacesMessage msg = new FacesMessage("Atenção",
					"O campo Cod.Usuário é Obrigatorio");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			semErro = false;
		}
		if (selectRecord.getUsers().getNAME().isEmpty()) {
			FacesMessage msg = new FacesMessage("Atenção",
					"O campo Nome do Usuário é Obrigatorio");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			semErro = false;
		}
		if (selectRecord.getContacts().get(0).getTELNUMBER().isEmpty()) {
			FacesMessage msg = new FacesMessage("Atenção",
					"O campo Telefone é Obrigatorio");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			semErro = false;
		}
		if (selectRecord.getContacts().get(0).getSMTPADDR().isEmpty()) {
			FacesMessage msg = new FacesMessage("Atenção",
					"O campo E-Mail é Obrigatorio");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			semErro = false;
		}
		else if(!new br.com.aevee.port_finan.EmailValidator().validate(selectRecord.getContacts().get(0).getSMTPADDR()))
		{
			FacesMessage msg = new FacesMessage("Atenção",
					"E-Mail informado é invalido");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			semErro = false;
		}
		
		

		if (selectRecord.getUsers().getGLTGB() == null
				|| selectRecord.getUsers().getGLTGV() == null) {
			FacesMessage msg = new FacesMessage("Atenção",
					"O campo Data de Validade é Obrigatorio");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			semErro = false;
		}

		return semErro;
	}

}
