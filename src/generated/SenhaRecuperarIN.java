
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for senhaRecuperarIN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="senhaRecuperarIN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parametroEntrada" type="{}usuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "senhaRecuperarIN", propOrder = {
    "parametroEntrada"
})
public class SenhaRecuperarIN {

    protected Usuario parametroEntrada;

    /**
     * Gets the value of the parametroEntrada property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getParametroEntrada() {
        return parametroEntrada;
    }

    /**
     * Sets the value of the parametroEntrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setParametroEntrada(Usuario value) {
        this.parametroEntrada = value;
    }

}
