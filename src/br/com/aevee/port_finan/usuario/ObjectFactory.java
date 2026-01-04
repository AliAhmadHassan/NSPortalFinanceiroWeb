
package br.com.aevee.port_finan.usuario;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.aevee.port_finan.usuario package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.aevee.port_finan.usuario
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTUSERMAINTReq }
     * 
     */
    public DTUSERMAINTReq createDTUSERMAINTReq() {
        return new DTUSERMAINTReq();
    }

    /**
     * Create an instance of {@link DTUSERMAINTResp }
     * 
     */
    public DTUSERMAINTResp createDTUSERMAINTResp() {
        return new DTUSERMAINTResp();
    }

    /**
     * Create an instance of {@link DTUsers }
     * 
     */
    public DTUsers createDTUsers() {
        return new DTUsers();
    }

    /**
     * Create an instance of {@link DTUserProfiles }
     * 
     */
    public DTUserProfiles createDTUserProfiles() {
        return new DTUserProfiles();
    }

    /**
     * Create an instance of {@link DTContatos }
     * 
     */
    public DTContatos createDTContatos() {
        return new DTContatos();
    }

    /**
     * Create an instance of {@link DTUSERMAINTReq.Records }
     * 
     */
    public DTUSERMAINTReq.Records createDTUSERMAINTReqRecords() {
        return new DTUSERMAINTReq.Records();
    }

    /**
     * Create an instance of {@link DTUSERMAINTResp.Records }
     * 
     */
    public DTUSERMAINTResp.Records createDTUSERMAINTRespRecords() {
        return new DTUSERMAINTResp.Records();
    }

}
