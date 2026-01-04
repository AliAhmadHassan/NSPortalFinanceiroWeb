
package br.com.aevee.port_finan.publicacao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DT_Imposto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Imposto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IMPOSTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BASE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MONTANTE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ALIQUOTA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="4"/>
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
@XmlType(name = "DT_Imposto", propOrder = {
    "imposto",
    "base",
    "montante",
    "aliquota"
})
public class DTImposto {

    @XmlElement(name = "IMPOSTO")
    protected String imposto;
    @XmlElement(name = "BASE")
    protected BigDecimal base;
    @XmlElement(name = "MONTANTE")
    protected BigDecimal montante;
    @XmlElement(name = "ALIQUOTA")
    protected BigDecimal aliquota;

    /**
     * Obtém o valor da propriedade imposto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPOSTO() {
        return imposto;
    }

    /**
     * Define o valor da propriedade imposto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPOSTO(String value) {
        this.imposto = value;
    }

    /**
     * Obtém o valor da propriedade base.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBASE() {
        return base;
    }

    /**
     * Define o valor da propriedade base.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBASE(BigDecimal value) {
        this.base = value;
    }

    /**
     * Obtém o valor da propriedade montante.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMONTANTE() {
        return montante;
    }

    /**
     * Define o valor da propriedade montante.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMONTANTE(BigDecimal value) {
        this.montante = value;
    }

    /**
     * Obtém o valor da propriedade aliquota.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getALIQUOTA() {
        return aliquota;
    }

    /**
     * Define o valor da propriedade aliquota.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setALIQUOTA(BigDecimal value) {
        this.aliquota = value;
    }

}
