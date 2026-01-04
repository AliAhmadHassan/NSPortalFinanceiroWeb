
package br.com.aevee.port_finan.shared;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DT_RESPONSE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_RESPONSE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="MSG" type="{http://www.aevee.com.br/port_finan/SHARED}DT_msg" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_RESPONSE", propOrder = {
    "status",
    "msg"
})
public class DTRESPONSE {

    @XmlElement(name = "STATUS", required = true)
    protected BigInteger status;
    @XmlElement(name = "MSG")
    protected List<DTMsg> msg;

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSTATUS() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSTATUS(BigInteger value) {
        this.status = value;
    }

    /**
     * Gets the value of the msg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMSG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTMsg }
     * 
     * 
     */
    public List<DTMsg> getMSG() {
        if (msg == null) {
            msg = new ArrayList<DTMsg>();
        }
        return this.msg;
    }

}
