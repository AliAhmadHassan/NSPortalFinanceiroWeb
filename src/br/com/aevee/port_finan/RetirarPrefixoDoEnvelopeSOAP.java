package br.com.aevee.port_finan;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class RetirarPrefixoDoEnvelopeSOAP implements SOAPHandler<SOAPMessageContext> {
	public Set<QName> getHeaders() {
		return Collections.emptySet();
	}

	public boolean handleMessage(SOAPMessageContext messageContext) {
		this.corrigirConteudoRequisicaoSOAP(messageContext);
		return true;
	}
	
	private void corrigirConteudoRequisicaoSOAP(SOAPMessageContext messageContext){
		SOAPMessage msg = messageContext.getMessage();
		try {
			NodeList childNodes = msg.getSOAPBody().getChildNodes();
			
			for(int k = 0; k < childNodes.getLength(); k++){
				Node item = childNodes.item(k);
				{
					item.setPrefix("");
					Method m = SOAPElement.class.getDeclaredMethod("setElementQName", QName.class);
					m.invoke(item, new QName("", item.getLocalName()));
					//this.parseToSapDate(item);
					msg.saveChanges();
				}
			}
			
			//"".endsWith("");
			//msg.writeTo(System.out);
			//System.out.println();
			

		} catch (Exception e) {
			
		}
	}

	public boolean handleFault(SOAPMessageContext messageContext) {
		return true;
	}

	public void close(MessageContext messageContext) {
	}

}
