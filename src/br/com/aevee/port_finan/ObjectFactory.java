
package br.com.aevee.port_finan;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import br.com.aevee.port_finan.search_help.DTSHLPReq;
import br.com.aevee.port_finan.search_help.DTSHLPResp;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.netshoes.port_finan package. 
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

    private final static QName _MTSEARCHHELPReq_QNAME = new QName("http://www.netshoes.com.br/port_finan", "MT_SEARCH_HELP_req");
    private final static QName _MTSEARCHHELPResp_QNAME = new QName("http://www.netshoes.com.br/port_finan", "MT_SEARCH_HELP_resp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.netshoes.port_finan
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTSHLPReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.netshoes.com.br/port_finan", name = "MT_SEARCH_HELP_req")
    public JAXBElement<DTSHLPReq> createMTSEARCHHELPReq(DTSHLPReq value) {
        return new JAXBElement<DTSHLPReq>(_MTSEARCHHELPReq_QNAME, DTSHLPReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTSHLPResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.netshoes.com.br/port_finan", name = "MT_SEARCH_HELP_resp")
    public JAXBElement<DTSHLPResp> createMTSEARCHHELPResp(DTSHLPResp value) {
        return new JAXBElement<DTSHLPResp>(_MTSEARCHHELPResp_QNAME, DTSHLPResp.class, null, value);
    }

}
