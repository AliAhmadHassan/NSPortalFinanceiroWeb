
package br.com.aevee.port_finan.publicacao;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.aevee.port_finan.publicacao package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.aevee.port_finan.publicacao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTPublicacaoResp }
     * 
     */
    public DTPublicacaoResp createDTPublicacaoResp() {
        return new DTPublicacaoResp();
    }

    /**
     * Create an instance of {@link DTLog }
     * 
     */
    public DTLog createDTLog() {
        return new DTLog();
    }

    /**
     * Create an instance of {@link DTPublicacaoReq }
     * 
     */
    public DTPublicacaoReq createDTPublicacaoReq() {
        return new DTPublicacaoReq();
    }

    /**
     * Create an instance of {@link DTNota }
     * 
     */
    public DTNota createDTNota() {
        return new DTNota();
    }

    /**
     * Create an instance of {@link DTImposto }
     * 
     */
    public DTImposto createDTImposto() {
        return new DTImposto();
    }

    /**
     * Create an instance of {@link DTDataVencimento }
     * 
     */
    public DTDataVencimento createDTDataVencimento() {
        return new DTDataVencimento();
    }

    /**
     * Create an instance of {@link DTPublicacaoResp.Response }
     * 
     */
    public DTPublicacaoResp.Response createDTPublicacaoRespResponse() {
        return new DTPublicacaoResp.Response();
    }

}
