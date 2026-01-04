
package br.com.aevee.port_finan.adiantamento;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de DT_ZCTFI027 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_ZCTFI027">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BUKRS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
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
 *         &lt;element name="GJAHR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BELNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BUZEI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BUDAT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BLDAT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="WAERS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BLART" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DMBTR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="REBZG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="REBZJ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="REBZZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="XBLNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
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
@XmlType(name = "DT_ZCTFI027", propOrder = {
    "bukrs",
    "lifnr",
    "gjahr",
    "belnr",
    "buzei",
    "budat",
    "bldat",
    "waers",
    "blart",
    "dmbtr",
    "rebzg",
    "rebzj",
    "rebzz",
    "xblnr"
})
public class DTZCTFI027 {

    @XmlElement(name = "BUKRS")
    protected String bukrs;
    @XmlElement(name = "LIFNR")
    protected String lifnr;
    @XmlElement(name = "GJAHR")
    protected String gjahr;
    @XmlElement(name = "BELNR")
    protected String belnr;
    @XmlElement(name = "BUZEI")
    protected String buzei;
    @XmlElement(name = "BUDAT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar budat;
    @XmlElement(name = "BLDAT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bldat;
    @XmlElement(name = "WAERS")
    protected String waers;
    @XmlElement(name = "BLART")
    protected String blart;
    @XmlElement(name = "DMBTR")
    protected BigDecimal dmbtr;
    @XmlElement(name = "REBZG")
    protected String rebzg;
    @XmlElement(name = "REBZJ")
    protected String rebzj;
    @XmlElement(name = "REBZZ")
    protected String rebzz;
    @XmlElement(name = "XBLNR")
    protected String xblnr;

    /**
     * Obtém o valor da propriedade bukrs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUKRS() {
        return bukrs;
    }

    /**
     * Define o valor da propriedade bukrs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUKRS(String value) {
        this.bukrs = value;
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

    /**
     * Obtém o valor da propriedade gjahr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGJAHR() {
        return gjahr;
    }

    /**
     * Define o valor da propriedade gjahr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGJAHR(String value) {
        this.gjahr = value;
    }

    /**
     * Obtém o valor da propriedade belnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBELNR() {
        return belnr;
    }

    /**
     * Define o valor da propriedade belnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBELNR(String value) {
        this.belnr = value;
    }

    /**
     * Obtém o valor da propriedade buzei.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUZEI() {
        return buzei;
    }

    /**
     * Define o valor da propriedade buzei.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUZEI(String value) {
        this.buzei = value;
    }

    /**
     * Obtém o valor da propriedade budat.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBUDAT() {
        return budat;
    }

    /**
     * Define o valor da propriedade budat.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBUDAT(XMLGregorianCalendar value) {
        this.budat = value;
    }

    /**
     * Obtém o valor da propriedade bldat.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBLDAT() {
        return bldat;
    }

    /**
     * Define o valor da propriedade bldat.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBLDAT(XMLGregorianCalendar value) {
        this.bldat = value;
    }

    /**
     * Obtém o valor da propriedade waers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAERS() {
        return waers;
    }

    /**
     * Define o valor da propriedade waers.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAERS(String value) {
        this.waers = value;
    }

    /**
     * Obtém o valor da propriedade blart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLART() {
        return blart;
    }

    /**
     * Define o valor da propriedade blart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLART(String value) {
        this.blart = value;
    }

    /**
     * Obtém o valor da propriedade dmbtr.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDMBTR() {
        return dmbtr;
    }

    /**
     * Define o valor da propriedade dmbtr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDMBTR(BigDecimal value) {
        this.dmbtr = value;
    }

    /**
     * Obtém o valor da propriedade rebzg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREBZG() {
        return rebzg;
    }

    /**
     * Define o valor da propriedade rebzg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREBZG(String value) {
        this.rebzg = value;
    }

    /**
     * Obtém o valor da propriedade rebzj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREBZJ() {
        return rebzj;
    }

    /**
     * Define o valor da propriedade rebzj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREBZJ(String value) {
        this.rebzj = value;
    }

    /**
     * Obtém o valor da propriedade rebzz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREBZZ() {
        return rebzz;
    }

    /**
     * Define o valor da propriedade rebzz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREBZZ(String value) {
        this.rebzz = value;
    }

    /**
     * Obtém o valor da propriedade xblnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXBLNR() {
        return xblnr;
    }

    /**
     * Define o valor da propriedade xblnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXBLNR(String value) {
        this.xblnr = value;
    }

}
