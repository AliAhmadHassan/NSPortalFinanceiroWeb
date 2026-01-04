
package br.com.aevee.port_finan.usuario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DT_Contatos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Contatos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TEL_NUMBER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TEL_EXTENS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TPUSPTEL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SMTP_ADDR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="241"/>
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
@XmlType(name = "DT_Contatos", propOrder = {
    "telnumber",
    "telextens",
    "tpusptel",
    "smtpaddr"
})
public class DTContatos {

    @XmlElement(name = "TEL_NUMBER")
    protected String telnumber;
    @XmlElement(name = "TEL_EXTENS")
    protected String telextens;
    @XmlElement(name = "TPUSPTEL")
    protected String tpusptel;
    @XmlElement(name = "SMTP_ADDR")
    protected String smtpaddr;

    /**
     * Obtém o valor da propriedade telnumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELNUMBER() {
        return telnumber;
    }

    /**
     * Define o valor da propriedade telnumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELNUMBER(String value) {
        this.telnumber = value;
    }

    /**
     * Obtém o valor da propriedade telextens.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEXTENS() {
        return telextens;
    }

    /**
     * Define o valor da propriedade telextens.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEXTENS(String value) {
        this.telextens = value;
    }

    /**
     * Obtém o valor da propriedade tpusptel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPUSPTEL() {
        return tpusptel;
    }

    /**
     * Define o valor da propriedade tpusptel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPUSPTEL(String value) {
        this.tpusptel = value;
    }

    /**
     * Obtém o valor da propriedade smtpaddr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMTPADDR() {
        return smtpaddr;
    }

    /**
     * Define o valor da propriedade smtpaddr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMTPADDR(String value) {
        this.smtpaddr = value;
    }

}
