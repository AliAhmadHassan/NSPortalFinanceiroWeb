
package br.com.aevee.port_finan.publicacao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DT_Publicacao_req complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Publicacao_req">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LIFNR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="BUKRS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="DataVencimento" type="{http://www.aevee.com.br/port_finan/publicacao}DT_Data_Vencimento"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_Publicacao_req", propOrder = {
    "lifnr",
    "bukrs",
    "dataVencimento",
    "status"
})
public class DTPublicacaoReq {

    @XmlElement(name = "LIFNR", required = true)
    protected List<String> lifnr;
    @XmlElement(name = "BUKRS", required = true)
    protected List<String> bukrs;
    @XmlElement(name = "DataVencimento", required = true)
    protected DTDataVencimento dataVencimento;
    @XmlElement(name = "Status")
    protected BigInteger status;

    /**
     * Gets the value of the lifnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lifnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLIFNR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLIFNR() {
        if (lifnr == null) {
            lifnr = new ArrayList<String>();
        }
        return this.lifnr;
    }

    /**
     * Gets the value of the bukrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bukrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBUKRS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBUKRS() {
        if (bukrs == null) {
            bukrs = new ArrayList<String>();
        }
        return this.bukrs;
    }

    /**
     * Obtém o valor da propriedade dataVencimento.
     * 
     * @return
     *     possible object is
     *     {@link DTDataVencimento }
     *     
     */
    public DTDataVencimento getDataVencimento() {
        return dataVencimento;
    }

    /**
     * Define o valor da propriedade dataVencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link DTDataVencimento }
     *     
     */
    public void setDataVencimento(DTDataVencimento value) {
        this.dataVencimento = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatus() {
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
    public void setStatus(BigInteger value) {
        this.status = value;
    }

}
