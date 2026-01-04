
package br.com.aevee.port_finan.fornecedores;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DT_ADRC complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_ADRC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STREET">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HOUSE_NUM1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CITY2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POST_CODE1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CITY1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COUNTRY">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="REGION">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
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
@XmlType(name = "DT_ADRC", propOrder = {
    "street",
    "housenum1",
    "city2",
    "postcode1",
    "city1",
    "country",
    "region"
})
public class DTADRC {

    @XmlElement(name = "STREET", required = true)
    protected String street;
    @XmlElement(name = "HOUSE_NUM1", required = true)
    protected String housenum1;
    @XmlElement(name = "CITY2", required = true)
    protected String city2;
    @XmlElement(name = "POST_CODE1", required = true)
    protected String postcode1;
    @XmlElement(name = "CITY1", required = true)
    protected String city1;
    @XmlElement(name = "COUNTRY", required = true)
    protected String country;
    @XmlElement(name = "REGION", required = true)
    protected String region;

    /**
     * Obtém o valor da propriedade street.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTREET() {
        return street;
    }

    /**
     * Define o valor da propriedade street.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTREET(String value) {
        this.street = value;
    }

    /**
     * Obtém o valor da propriedade housenum1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOUSENUM1() {
        return housenum1;
    }

    /**
     * Define o valor da propriedade housenum1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOUSENUM1(String value) {
        this.housenum1 = value;
    }

    /**
     * Obtém o valor da propriedade city2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITY2() {
        return city2;
    }

    /**
     * Define o valor da propriedade city2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITY2(String value) {
        this.city2 = value;
    }

    /**
     * Obtém o valor da propriedade postcode1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTCODE1() {
        return postcode1;
    }

    /**
     * Define o valor da propriedade postcode1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTCODE1(String value) {
        this.postcode1 = value;
    }

    /**
     * Obtém o valor da propriedade city1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITY1() {
        return city1;
    }

    /**
     * Define o valor da propriedade city1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITY1(String value) {
        this.city1 = value;
    }

    /**
     * Obtém o valor da propriedade country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRY() {
        return country;
    }

    /**
     * Define o valor da propriedade country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRY(String value) {
        this.country = value;
    }

    /**
     * Obtém o valor da propriedade region.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGION() {
        return region;
    }

    /**
     * Define o valor da propriedade region.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGION(String value) {
        this.region = value;
    }

}
