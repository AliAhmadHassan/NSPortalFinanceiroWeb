
package br.com.aevee.port_finan.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DT_header complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_header">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="USNAME">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LIFNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_header", propOrder = {
    "usname",
    "lifnr"
})
public class DTHeader {

    @XmlElement(name = "USNAME", required = true)
    protected String usname;
    @XmlElement(name = "LIFNR")
    protected String lifnr;

    /**
     * Obtém o valor da propriedade usname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSNAME() {
        return usname;
    }

    /**
     * Define o valor da propriedade usname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSNAME(String value) {
        this.usname = value;
    }

    /**
     * Obtém o valor da propriedade lifnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIFNR() {
        return lifnr;
    }

    /**
     * Define o valor da propriedade lifnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIFNR(String value) {
        this.lifnr = value;
    }

}
