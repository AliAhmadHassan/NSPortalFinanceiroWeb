package br.com.aevee.nsPortFinanc.web;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.aevee.port_finan.fornecedores.DTLFA1;

@FacesConverter("br.com.netshoes.nsPortFinanc.web.FornecedorConverter")
public class FornecedorConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {

		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if (arg2 == null) {
			return "";
		}
		
		String retorno = "";
		try{
			DTLFA1 fornecedor = new br.com.aevee.nsPortFinanc.DAL.Fornecedores().getByLIFNR(arg2.toString());
			retorno = fornecedor.getLIFNR() + " (" + fornecedor.getSPRAS() + "\\"  + fornecedor.getNAME1() + ")";
		}
		catch(Exception error){
			retorno = arg2.toString() + " (Não Encontrado)";
		}
		return retorno;
	}

}
