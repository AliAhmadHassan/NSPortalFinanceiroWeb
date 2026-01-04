package br.com.aevee.nsPortFinanc.DAL;
/*package br.com.netshoes.nsPortFinanc.DAL;

import generated.LoginExecutarIN;
import generated.LoginExecutarOUT;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

import br.com.netshoes.port_finan.FormatarDatasNoPadraoSAP;
import br.com.netshoes.port_finan.RetirarPrefixoDoEnvelopeSOAP;
import br.com.netshoes.port_finan.UsuarioInterfaces;
import br.com.netshoes.port_finan.UsuarioServices;

import com.sun.xml.internal.ws.client.BindingProviderProperties;

public class UsuarioOld extends Base{
	public UsuarioOld(){
		super(UsuarioServices.class);
	}
	
	public generated.Usuario Logar(generated.Usuario usuario){
		UsuarioInterfaces usuarioInterface = (UsuarioInterfaces) super.getInterface();

		
		LoginExecutarIN login = new LoginExecutarIN();
		login.setParametroEntrada(usuario);				
		
		LoginExecutarOUT loginOUT = usuarioInterface.loginExecutar(login);
		
		
		return loginOUT.getRegistroSelecionado();
	}
}*/


/*public class Usuario {
	private static final RetirarPrefixoDoEnvelopeSOAP retirarPrefixoDoEnvelopeSOAP = new RetirarPrefixoDoEnvelopeSOAP();
	private static final FormatarDatasNoPadraoSAP formatarDatasNoPadraoSAP = new FormatarDatasNoPadraoSAP();
	
	public generated.Usuario Logar(generated.Usuario usuario){
		UsuarioServices servico = new UsuarioServices();
		UsuarioInterfaces usuarioInterface = servico.getHTTPPort();
		
		BindingProvider bp = (BindingProvider)usuarioInterface;
		Map<String, Object> requestContext = bp.getRequestContext();
		requestContext.put(BindingProvider.USERNAME_PROPERTY, "cshinohara");
		requestContext.put(BindingProvider.PASSWORD_PROPERTY, "shinohara01");
		requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, 1200000);
		requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT, 1200000);
		
		@SuppressWarnings("rawtypes")
		List<Handler> correcoesNoXMLSOAP = new ArrayList<Handler>();
		correcoesNoXMLSOAP.add(retirarPrefixoDoEnvelopeSOAP);
		correcoesNoXMLSOAP.add(formatarDatasNoPadraoSAP);
		bp.getBinding().setHandlerChain(correcoesNoXMLSOAP);
		
		LoginExecutarIN login = new LoginExecutarIN();
		login.setParametroEntrada(usuario);				
		
		LoginExecutarOUT loginOUT = usuarioInterface.loginExecutar(login);
		
		
		return loginOUT.getRegistroSelecionado();
		
	}
	
}*/


