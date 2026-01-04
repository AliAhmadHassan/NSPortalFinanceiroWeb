
package br.com.aevee.port_finan.contato;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.aevee.port_finan.contato package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.aevee.port_finan.contato
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTContatoEnvioReq }
     * 
     */
    public DTContatoEnvioReq createDTContatoEnvioReq() {
        return new DTContatoEnvioReq();
    }

    /**
     * Create an instance of {@link DTContatoResp }
     * 
     */
    public DTContatoResp createDTContatoResp() {
        return new DTContatoResp();
    }

    /**
     * Create an instance of {@link DTContatoReq }
     * 
     */
    public DTContatoReq createDTContatoReq() {
        return new DTContatoReq();
    }

    /**
     * Create an instance of {@link DTContatoEnvioResp }
     * 
     */
    public DTContatoEnvioResp createDTContatoEnvioResp() {
        return new DTContatoEnvioResp();
    }

    /**
     * Create an instance of {@link DTContatoEnvioReq.Anexos }
     * 
     */
    public DTContatoEnvioReq.Anexos createDTContatoEnvioReqAnexos() {
        return new DTContatoEnvioReq.Anexos();
    }

    /**
     * Create an instance of {@link DTContatoResp.DepartamentosAssuntos }
     * 
     */
    public DTContatoResp.DepartamentosAssuntos createDTContatoRespDepartamentosAssuntos() {
        return new DTContatoResp.DepartamentosAssuntos();
    }

}
