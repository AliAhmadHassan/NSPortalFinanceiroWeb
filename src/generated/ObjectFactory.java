
package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import br.com.aevee.port_finan.publicacao.DTPublicacaoReq;
import br.com.aevee.port_finan.publicacao.DTPublicacaoResp;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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

    private final static QName _MTPublicacaoResp_QNAME = new QName("", "MT_Publicacao_resp");
    private final static QName _MTPublicacaoReq_QNAME = new QName("", "MT_Publicacao_req");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTPublicacaoResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MT_Publicacao_resp")
    public JAXBElement<DTPublicacaoResp> createMTPublicacaoResp(DTPublicacaoResp value) {
        return new JAXBElement<DTPublicacaoResp>(_MTPublicacaoResp_QNAME, DTPublicacaoResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTPublicacaoReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MT_Publicacao_req")
    public JAXBElement<DTPublicacaoReq> createMTPublicacaoReq(DTPublicacaoReq value) {
        return new JAXBElement<DTPublicacaoReq>(_MTPublicacaoReq_QNAME, DTPublicacaoReq.class, null, value);
    }

}
