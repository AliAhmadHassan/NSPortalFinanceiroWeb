
package br.com.aevee.port_finan.publicacao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DT_Base64 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Base64">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PDF_Base64" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_Base64", propOrder = {
    "pdfBase64"
})
public class DTBase64 {

    @XmlElement(name = "PDF_Base64", required = true)
    protected String pdfBase64;

    /**
     * Obtém o valor da propriedade pdfBase64.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDFBase64() {
        return pdfBase64;
    }

    /**
     * Define o valor da propriedade pdfBase64.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDFBase64(String value) {
        this.pdfBase64 = value;
    }

}
