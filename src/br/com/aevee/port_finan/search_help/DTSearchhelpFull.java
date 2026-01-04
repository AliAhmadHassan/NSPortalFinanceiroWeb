
package br.com.aevee.port_finan.search_help;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DT_searchhelp_full complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_searchhelp_full">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PARAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VALORES" type="{http://www.aevee.com.br/port_finan/search_help}DT_searchhelp" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_searchhelp_full", propOrder = {
    "param",
    "valores"
})
public class DTSearchhelpFull {

    @XmlElement(name = "PARAM", required = true)
    protected String param;
    @XmlElement(name = "VALORES")
    protected List<DTSearchhelp> valores;

    /**
     * Obtém o valor da propriedade param.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARAM() {
        return param;
    }

    /**
     * Define o valor da propriedade param.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARAM(String value) {
        this.param = value;
    }

    /**
     * Gets the value of the valores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVALORES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTSearchhelp }
     * 
     * 
     */
    public List<DTSearchhelp> getVALORES() {
        if (valores == null) {
            valores = new ArrayList<DTSearchhelp>();
        }
        return this.valores;
    }

}
