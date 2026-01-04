
package br.com.aevee.port_finan.publicacao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de DT_Data_Vencimento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Data_Vencimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="De" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Ate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_Data_Vencimento", propOrder = {
    "de",
    "ate"
})
public class DTDataVencimento {

    @XmlElement(name = "De", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar de;
    @XmlElement(name = "Ate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ate;

    /**
     * Obtém o valor da propriedade de.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDe() {
        return de;
    }

    /**
     * Define o valor da propriedade de.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDe(XMLGregorianCalendar value) {
        this.de = value;
    }

    /**
     * Obtém o valor da propriedade ate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAte() {
        return ate;
    }

    /**
     * Define o valor da propriedade ate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAte(XMLGregorianCalendar value) {
        this.ate = value;
    }

}
