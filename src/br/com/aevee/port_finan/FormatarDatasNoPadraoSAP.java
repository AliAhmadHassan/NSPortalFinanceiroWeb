package br.com.aevee.port_finan;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.Set;

import javax.faces.context.FacesContext;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.sun.org.apache.xerces.internal.dom.ParentNode;

import br.com.aevee.nsPortFinanc.controller.AbstractManagedBean;

public class FormatarDatasNoPadraoSAP extends AbstractManagedBean implements
		SOAPHandler<SOAPMessageContext> {

	public Set<QName> getHeaders() {
		return Collections.emptySet();
	}

	public boolean handleMessage(SOAPMessageContext messageContext) {
		this.corrigirConteudoRequisicaoSOAP(messageContext);
		return true;
	}

	private void parseToSapDate(Node item) {
		if (item instanceof ParentNode) {
			ParentNode pn = (ParentNode) item;

			String textContent = pn.getTextContent();

			if (textContent == null) {
				textContent = "";
			}
			if (textContent
					.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}T[0-9]{2}:[0-9]{2}:[0-9]{2}")) {
				pn.setTextContent(textContent + "Z");
				return;
			}
			/*
			 * if(textContent.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}Z")){
			 * pn.setTextContent(textContent.substring(0, textContent.length() -
			 * 1) + "T00:00:00Z"); return; }
			 */
			if (textContent.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}")) {
				pn.setTextContent(textContent + "Z");
				return;
			}
		}

		NodeList childNodes = item.getChildNodes();
		for (int k = 0; k < childNodes.getLength(); k++) {
			this.parseToSapDate(childNodes.item(k));
		}

	}

	private void corrigirConteudoRequisicaoSOAP(
			SOAPMessageContext messageContext) {
		SOAPMessage msg = messageContext.getMessage();

		try {
			NodeList childNodes = msg.getSOAPBody().getChildNodes();

			for (int k = 0; k < childNodes.getLength(); k++) {
				Node item = childNodes.item(k);
				{
					this.parseToSapDate(item);
				}
			}
			msg.saveChanges();

			ByteArrayOutputStream out = new ByteArrayOutputStream();
			try {
				msg.writeTo(out);
			} catch (SOAPException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			String strMsg2 = new String(out.toByteArray());
			logMessage("XML: " + strMsg2);

		} catch (Exception e) {
		}
	}

	public boolean handleFault(SOAPMessageContext messageContext) {
		return true;
	}

	public void close(MessageContext messageContext) {
	}

	public void logMessage(String message) 
	{
		java.util.Date date = new java.util.Date();
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyyMMdd");
		java.text.SimpleDateFormat formatterMsg = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");

		String realPath = Common.getCorrectLogPath();
		try {
			
			new File(realPath).mkdir();

			String filePathString = realPath + "Port_Finan"+ formatter.format(date) + ".log";

		
			File f = new File(filePathString);
			
			String UsNameAux = "";
			if(this.getUsuarioExiste())
				UsNameAux = this.getUsuario().getUSNAME();
			
			if(f.exists())			
				Files.write(Paths.get(filePathString), (formatterMsg.format(date)+ ";" + UsNameAux + ";" + message + "\r\n").getBytes(), StandardOpenOption.APPEND);
			else
				Files.write(Paths.get(filePathString), (formatterMsg.format(date)+ ";" + UsNameAux + ";" + message + "\r\n").getBytes(), StandardOpenOption.CREATE);
			
			System.out.println(message);
		} catch (Exception e) {
			System.out.println(message);
		}
	}
}
