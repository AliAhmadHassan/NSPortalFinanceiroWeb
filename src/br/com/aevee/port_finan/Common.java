package br.com.aevee.port_finan;

import javax.faces.context.FacesContext;

public class Common {
	public static String getCorrectWSDLPath(String nameWSDL){
    	String pathWSDL = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/wsdl");
    	if(pathWSDL.startsWith("//")){
    		pathWSDL = pathWSDL.substring(1);
    	}
    	
    	return "file:" + pathWSDL + "/" + nameWSDL;
    }
	
	public static String getCorrectComprovantePath(){
    	String pathWSDL = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/comprovante").replace('/', '\\');
    	if(pathWSDL.startsWith("\\\\")){
    		pathWSDL = pathWSDL.substring(1);
    	}
    	
    	return pathWSDL + "\\";
    }
	
	public static String getCorrectLogPath(){
    	String pathWSDL = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/log").replace('/', '\\');
    	if(pathWSDL.startsWith("\\\\")){
    		pathWSDL = pathWSDL.substring(1);
    	}
    	
    	return pathWSDL + "\\";
    }
}


