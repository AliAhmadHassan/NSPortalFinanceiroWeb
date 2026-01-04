package br.com.aevee.nsPortFinanc.web;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("br.com.netshoes.nsPortFinanc.web.MoneyConverter")
public class MoneyConverter implements Converter {

	public static String toBrValor(Object valor) {

		if (valor == null) {
			return "";
		}
		
		NumberFormat nf = new DecimalFormat ("#,##0.00", new DecimalFormatSymbols (new Locale ("pt", "BR")));  
		return "R$ " + nf.format (valor);
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		
		return toBrValor(arg2);
	}
}
