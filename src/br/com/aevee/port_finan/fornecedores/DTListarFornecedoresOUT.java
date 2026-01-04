
package br.com.aevee.port_finan.fornecedores;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.aevee.port_finan.shared.DTRESPONSE;


/**
 * <p>Classe Java de DT_Listar_Fornecedores_OUT complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Listar_Fornecedores_OUT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{http://www.aevee.com.br/port_finan/fornecedores}DT_LFA1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://www.aevee.com.br/port_finan/SHARED}DT_RESPONSE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_Listar_Fornecedores_OUT", propOrder = {
    "response",
    "result"
})
public class DTListarFornecedoresOUT {

    @XmlElement(name = "Response")
    protected List<DTLFA1> response;
    @XmlElement(name = "Result", required = true)
    protected DTRESPONSE result;

    /**
     * Gets the value of the response property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the response property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTLFA1 }
     * 
     * 
     */
    public List<DTLFA1> getResponse() {
        if (response == null) {
            response = new ArrayList<DTLFA1>();
        }
        return this.response;
    }

    /**
     * Obtém o valor da propriedade result.
     * 
     * @return
     *     possible object is
     *     {@link DTRESPONSE }
     *     
     */
    public DTRESPONSE getResult() {
        return result;
    }

    /**
     * Define o valor da propriedade result.
     * 
     * @param value
     *     allowed object is
     *     {@link DTRESPONSE }
     *     
     */
    public void setResult(DTRESPONSE value) {
        this.result = value;
    }

}
