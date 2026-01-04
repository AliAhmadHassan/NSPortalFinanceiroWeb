package br.com.aevee.port_finan.usuario;

import javax.faces.context.FacesContext;

public class Common {
	public static String getCorrectWSDLPath(String nameWSDL){
    	String pathWSDL = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/wsdl");
    	if(pathWSDL.startsWith("//")){
    		pathWSDL = pathWSDL.substring(1);
    	}
    	
    	return "file:" + pathWSDL + "/" + nameWSDL;
    }
}


