
package br.com.aevee.port_finan.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DT_range complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_range">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SIGN">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OPTION">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LOW">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HIGH" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
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
@XmlType(name = "DT_range", propOrder = {
    "sign",
    "option",
    "low",
    "high"
})
public class DTRange {

    @XmlElement(name = "SIGN", required = true)
    protected String sign;
    @XmlElement(name = "OPTION", required = true)
    protected String option;
    @XmlElement(name = "LOW", required = true)
    protected String low;
    @XmlElement(name = "HIGH")
    protected String high;

    /**
     * Obtém o valor da propriedade sign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIGN() {
        return sign;
    }

    /**
     * Define o valor da propriedade sign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIGN(String value) {
        this.sign = value;
    }

    /**
     * Obtém o valor da propriedade option.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPTION() {
        return option;
    }

    /**
     * Define o valor da propriedade option.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPTION(String value) {
        this.option = value;
    }

    /**
     * Obtém o valor da propriedade low.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOW() {
        return low;
    }

    /**
     * Define o valor da propriedade low.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOW(String value) {
        this.low = value;
    }

    /**
     * Obtém o valor da propriedade high.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHIGH() {
        return high;
    }

    /**
     * Define o valor da propriedade high.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHIGH(String value) {
        this.high = value;
    }

}
