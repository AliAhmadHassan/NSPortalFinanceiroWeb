
package br.com.aevee.port_finan.publicacao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DT_Download_PDF_req complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Download_PDF_req">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comprovante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_Download_PDF_req", propOrder = {
    "comprovante"
})
public class DTDownloadPDFReq {

    @XmlElement(name = "Comprovante", required = true)
    protected String comprovante;

    /**
     * Obtém o valor da propriedade comprovante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComprovante() {
        return comprovante;
    }

    /**
     * Define o valor da propriedade comprovante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComprovante(String value) {
        this.comprovante = value;
    }

}
