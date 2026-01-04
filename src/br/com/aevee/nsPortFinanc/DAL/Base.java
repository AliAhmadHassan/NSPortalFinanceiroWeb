package br.com.aevee.nsPortFinanc.DAL;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

import com.sun.xml.internal.ws.client.BindingProviderProperties;

import br.com.aevee.port_finan.FormatarDatasNoPadraoSAP;
import br.com.aevee.port_finan.RetirarPrefixoDoEnvelopeSOAP;

public class Base {
	private RetirarPrefixoDoEnvelopeSOAP retirarPrefixoDoEnvelopeSOAP = new RetirarPrefixoDoEnvelopeSOAP();
	private FormatarDatasNoPadraoSAP formatarDatasNoPadraoSAP = new FormatarDatasNoPadraoSAP();
	
	private Object servico;
	private Object httpPort;
	
	protected Base( Class<?> serviceClass){
		try {
			if(serviceClass == null){
				throw new Exception("Deve se informar uma classe de serviço para que o serviço possa ser instanciado pelo managedbean");
			}
			// evitar reinstancia de serviÃ§o
			this.servico = serviceClass.newInstance();

			this.createHTPPPort();
		} catch (Exception e) {
		} 
	}

	private void createHTPPPort() throws Exception {
		this.httpPort = this.servico.getClass().getDeclaredMethod("getHTTPPort").invoke(this.servico);
		
		// fornecendo credenciais ao webservice
		BindingProvider bp = (BindingProvider)httpPort;
		Map<String, Object> requestContext = bp.getRequestContext();
		requestContext.put(BindingProvider.USERNAME_PROPERTY, "AHASSAN");
		requestContext.put(BindingProvider.PASSWORD_PROPERTY, "aevee@2016"); //Senha em Dev
		
		
		requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, 1200000);
		requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT, 1200000);
		@SuppressWarnings("rawtypes")
		List<Handler> correcoesNoXMLSOAP = new ArrayList<Handler>();
		correcoesNoXMLSOAP.add(retirarPrefixoDoEnvelopeSOAP);
		correcoesNoXMLSOAP.add(formatarDatasNoPadraoSAP);
		bp.getBinding().setHandlerChain(correcoesNoXMLSOAP);
		this.servico = httpPort;
	}

	public Object getInterface() {
		return httpPort;
	}
}
