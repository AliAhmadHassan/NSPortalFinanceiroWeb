package br.com.aevee.nsPortFinanc.web;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.xml.datatype.XMLGregorianCalendar;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

@FacesConverter("br.com.netshoes.nsPortFinanc.web.DateConverter")
public class DateConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		try {
			if(arg2.isEmpty()){
				return null;
			}
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date date = sdf.parse(arg2);
			return toXMLDate(date);
		} catch (Exception e) {
			System.out.println("Data Invalida: '" + arg2 + "'");
			return null;
		}
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object date1) {

		return toDate(date1);
	}
	
	public static XMLGregorianCalendar toXMLDate(Date date) {

		if (date == null) {
			return null;
		}
		XMLGregorianCalendar d = new XMLGregorianCalendarImpl();

		Calendar c = Calendar.getInstance();

		c.setTime(date);

		d.setYear(c.get(Calendar.YEAR));
		d.setMonth(c.get(Calendar.MONTH) + 1);
		d.setDay(c.get(Calendar.DAY_OF_MONTH));

		d.setHour(0);
		d.setMinute(0);
		d.setSecond(0);

		return d;
	}
	
	public static String toDate(Object date1) {

		// 2015-02-19T00:00:00
		if (date1 == null) {
			return "";
		}
		
		String[] split = null;
		if(date1.toString().contains("Z"))
		{
			String date = date1.toString().split("Z")[0];
			split = date.split("-");
		}
		else
		{
		String date = date1.toString().split("T")[0];
		split = date.split("-");
		}
		return split[2] + "/" + split[1] + "/" + split[0];
	}
}
