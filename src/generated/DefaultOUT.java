
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for defaultOUT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="defaultOUT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mensagemServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusServico" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "defaultOUT", propOrder = {
    "mensagemServico",
    "statusServico"
})
public class DefaultOUT {

    protected String mensagemServico;
    protected Integer statusServico;

    /**
     * Gets the value of the mensagemServico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagemServico() {
        return mensagemServico;
    }

    /**
     * Sets the value of the mensagemServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagemServico(String value) {
        this.mensagemServico = value;
    }

    /**
     * Gets the value of the statusServico property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusServico() {
        return statusServico;
    }

    /**
     * Sets the value of the statusServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusServico(Integer value) {
        this.statusServico = value;
    }

}
