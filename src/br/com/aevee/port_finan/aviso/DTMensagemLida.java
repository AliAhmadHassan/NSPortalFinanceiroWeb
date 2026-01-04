
package br.com.aevee.port_finan.aviso;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de DT_Mensagem_Lida complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Mensagem_Lida">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="USNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DATA" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="HORA" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_Mensagem_Lida", propOrder = {
    "id",
    "usname",
    "data",
    "hora",
    "ip"
})
public class DTMensagemLida {

    @XmlElement(name = "ID", required = true)
    protected BigInteger id;
    @XmlElement(name = "USNAME", required = true)
    protected String usname;
    @XmlElement(name = "DATA")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar data;
    @XmlElement(name = "HORA")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar hora;
    @XmlElement(name = "IP")
    protected String ip;

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade usname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSNAME() {
        return usname;
    }

    /**
     * Define o valor da propriedade usname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSNAME(String value) {
        this.usname = value;
    }

    /**
     * Obtém o valor da propriedade data.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATA() {
        return data;
    }

    /**
     * Define o valor da propriedade data.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATA(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Obtém o valor da propriedade hora.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHORA() {
        return hora;
    }

    /**
     * Define o valor da propriedade hora.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHORA(XMLGregorianCalendar value) {
        this.hora = value;
    }

    /**
     * Obtém o valor da propriedade ip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP() {
        return ip;
    }

    /**
     * Define o valor da propriedade ip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP(String value) {
        this.ip = value;
    }

}
