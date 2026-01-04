
package br.com.aevee.port_finan.search_help;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DT_param complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_param">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PARAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SUBPARAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_param", propOrder = {
    "param",
    "subparam"
})
public class DTParam {

    @XmlElement(name = "PARAM", required = true)
    protected String param;
    @XmlElement(name = "SUBPARAM")
    protected String subparam;

    /**
     * Obtém o valor da propriedade param.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARAM() {
        return param;
    }

    /**
     * Define o valor da propriedade param.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARAM(String value) {
        this.param = value;
    }

    /**
     * Obtém o valor da propriedade subparam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBPARAM() {
        return subparam;
    }

    /**
     * Define o valor da propriedade subparam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBPARAM(String value) {
        this.subparam = value;
    }

}
