
package br.com.aevee.port_finan.fornecedores;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DT_LFB1 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_LFB1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BUKRS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ZZATIVOANT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ZZGRPTXANT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TXANT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ZZGRPDIAANT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DIASANT" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_LFB1", propOrder = {
    "bukrs",
    "zzativoant",
    "zzgrptxant",
    "txant",
    "zzgrpdiaant",
    "diasant"
})
public class DTLFB1 {

    @XmlElement(name = "BUKRS", required = true)
    protected String bukrs;
    @XmlElement(name = "ZZATIVOANT", required = true)
    protected String zzativoant;
    @XmlElement(name = "ZZGRPTXANT", required = true)
    protected String zzgrptxant;
    @XmlElement(name = "TXANT", required = true)
    protected BigDecimal txant;
    @XmlElement(name = "ZZGRPDIAANT", required = true)
    protected String zzgrpdiaant;
    @XmlElement(name = "DIASANT", required = true)
    protected BigInteger diasant;

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
     * Obtém o valor da propriedade zzativoant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZATIVOANT() {
        return zzativoant;
    }

    /**
     * Define o valor da propriedade zzativoant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZATIVOANT(String value) {
        this.zzativoant = value;
    }

    /**
     * Obtém o valor da propriedade zzgrptxant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZGRPTXANT() {
        return zzgrptxant;
    }

    /**
     * Define o valor da propriedade zzgrptxant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZGRPTXANT(String value) {
        this.zzgrptxant = value;
    }

    /**
     * Obtém o valor da propriedade txant.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTXANT() {
        return txant;
    }

    /**
     * Define o valor da propriedade txant.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTXANT(BigDecimal value) {
        this.txant = value;
    }

    /**
     * Obtém o valor da propriedade zzgrpdiaant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZGRPDIAANT() {
        return zzgrpdiaant;
    }

    /**
     * Define o valor da propriedade zzgrpdiaant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZGRPDIAANT(String value) {
        this.zzgrpdiaant = value;
    }

    /**
     * Obtém o valor da propriedade diasant.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDIASANT() {
        return diasant;
    }

    /**
     * Define o valor da propriedade diasant.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDIASANT(BigInteger value) {
        this.diasant = value;
    }

}
