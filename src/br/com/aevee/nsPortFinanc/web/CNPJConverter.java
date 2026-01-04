package br.com.aevee.nsPortFinanc.web;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("br.com.netshoes.nsPortFinanc.web.CNPJConverter")
public class CNPJConverter  implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		
		if(arg2 == null)
			return "";
		
		String retorno = "";
		
		
		if(arg2.toString().length() == 14) {
			retorno += arg2.toString().substring(0,  2) + ".";
			retorno += arg2.toString().substring(2,  5) + ".";
			retorno += arg2.toString().substring(5,  8) + "/";
			retorno += arg2.toString().substring(8,  12) + "-";
			retorno += arg2.toString().substring(12,  14);			
		}
		else if(arg2.toString().length() == 15) {
			retorno += arg2.toString().substring(0,  3) + ".";
			retorno += arg2.toString().substring(3,  6) + ".";
			retorno += arg2.toString().substring(6,  9) + "/";
			retorno += arg2.toString().substring(9,  13) + "-";
			retorno += arg2.toString().substring(13,  15);			
		}
		
		return retorno;
	}

}
