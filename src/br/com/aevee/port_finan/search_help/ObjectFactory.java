
package br.com.aevee.port_finan.search_help;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.aevee.port_finan.search_help package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.aevee.port_finan.search_help
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTSHLPResp }
     * 
     */
    public DTSHLPResp createDTSHLPResp() {
        return new DTSHLPResp();
    }

    /**
     * Create an instance of {@link DTSHLPReq }
     * 
     */
    public DTSHLPReq createDTSHLPReq() {
        return new DTSHLPReq();
    }

    /**
     * Create an instance of {@link DTSearchhelpFull }
     * 
     */
    public DTSearchhelpFull createDTSearchhelpFull() {
        return new DTSearchhelpFull();
    }

    /**
     * Create an instance of {@link DTParam }
     * 
     */
    public DTParam createDTParam() {
        return new DTParam();
    }

    /**
     * Create an instance of {@link DTSearchhelp }
     * 
     */
    public DTSearchhelp createDTSearchhelp() {
        return new DTSearchhelp();
    }

}
