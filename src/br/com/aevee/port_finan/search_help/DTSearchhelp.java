
package br.com.aevee.port_finan.search_help;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DT_searchhelp complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_searchhelp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VALOR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_searchhelp", propOrder = {
    "valor",
    "descr"
})
public class DTSearchhelp {

    @XmlElement(name = "VALOR", required = true)
    protected String valor;
    @XmlElement(name = "DESCR")
    protected String descr;

    /**
     * Obtém o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALOR() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALOR(String value) {
        this.valor = value;
    }

    /**
     * Obtém o valor da propriedade descr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCR() {
        return descr;
    }

    /**
     * Define o valor da propriedade descr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCR(String value) {
        this.descr = value;
    }

}
