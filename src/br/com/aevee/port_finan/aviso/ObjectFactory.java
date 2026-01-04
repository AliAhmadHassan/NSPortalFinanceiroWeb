
package br.com.aevee.port_finan.aviso;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.aevee.port_finan.aviso package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.aevee.port_finan.aviso
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTAviso }
     * 
     */
    public DTAviso createDTAviso() {
        return new DTAviso();
    }

    /**
     * Create an instance of {@link DTMensagemLida }
     * 
     */
    public DTMensagemLida createDTMensagemLida() {
        return new DTMensagemLida();
    }

    /**
     * Create an instance of {@link DTListarAvisosResp }
     * 
     */
    public DTListarAvisosResp createDTListarAvisosResp() {
        return new DTListarAvisosResp();
    }

    /**
     * Create an instance of {@link DTEsconderMensagemResp }
     * 
     */
    public DTEsconderMensagemResp createDTEsconderMensagemResp() {
        return new DTEsconderMensagemResp();
    }

    /**
     * Create an instance of {@link DTListarAvisosReq }
     * 
     */
    public DTListarAvisosReq createDTListarAvisosReq() {
        return new DTListarAvisosReq();
    }

}
