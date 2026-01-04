
package br.com.aevee.port_finan.usuario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Usuários
 * 
 * <p>Classe Java de DT_Users complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Users">
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
 *         &lt;element name="NAME" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GLTGV" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="GLTGB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="USTYP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UFLAG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PASSCODE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PWDST" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DUMMY1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DUMMY2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_Users", propOrder = {
    "usname",
    "lifnr",
    "name",
    "gltgv",
    "gltgb",
    "ustyp",
    "uflag",
    "passcode",
    "pwdst",
    "dummy1",
    "dummy2"
})
public class DTUsers {

    @XmlElement(name = "USNAME", required = true)
    protected String usname;
    @XmlElement(name = "LIFNR")
    protected String lifnr;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "GLTGV")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gltgv;
    @XmlElement(name = "GLTGB")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gltgb;
    @XmlElement(name = "USTYP")
    protected String ustyp;
    @XmlElement(name = "UFLAG")
    protected String uflag;
    @XmlElement(name = "PASSCODE")
    protected String passcode;
    @XmlElement(name = "PWDST")
    protected String pwdst;
    @XmlElement(name = "DUMMY1", required = true)
    protected String dummy1;
    @XmlElement(name = "DUMMY2", required = true)
    protected String dummy2;

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

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade gltgv.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGLTGV() {
        return gltgv;
    }

    /**
     * Define o valor da propriedade gltgv.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGLTGV(XMLGregorianCalendar value) {
        this.gltgv = value;
    }

    /**
     * Obtém o valor da propriedade gltgb.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGLTGB() {
        return gltgb;
    }

    /**
     * Define o valor da propriedade gltgb.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGLTGB(XMLGregorianCalendar value) {
        this.gltgb = value;
    }

    /**
     * Obtém o valor da propriedade ustyp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSTYP() {
        return ustyp;
    }

    /**
     * Define o valor da propriedade ustyp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSTYP(String value) {
        this.ustyp = value;
    }

    /**
     * Obtém o valor da propriedade uflag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUFLAG() {
        return uflag;
    }

    /**
     * Define o valor da propriedade uflag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUFLAG(String value) {
        this.uflag = value;
    }

    /**
     * Obtém o valor da propriedade passcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSCODE() {
        return passcode;
    }

    /**
     * Define o valor da propriedade passcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSCODE(String value) {
        this.passcode = value;
    }

    /**
     * Obtém o valor da propriedade pwdst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPWDST() {
        return pwdst;
    }

    /**
     * Define o valor da propriedade pwdst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPWDST(String value) {
        this.pwdst = value;
    }

    /**
     * Obtém o valor da propriedade dummy1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUMMY1() {
        return dummy1;
    }

    /**
     * Define o valor da propriedade dummy1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUMMY1(String value) {
        this.dummy1 = value;
    }

    /**
     * Obtém o valor da propriedade dummy2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUMMY2() {
        return dummy2;
    }

    /**
     * Define o valor da propriedade dummy2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUMMY2(String value) {
        this.dummy2 = value;
    }

}
