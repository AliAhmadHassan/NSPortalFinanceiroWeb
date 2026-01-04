
package br.com.aevee.port_finan.usuario;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.aevee.port_finan.shared.DTHeader;


/**
 * <p>Classe Java de DT_USER_MAINT_req complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_USER_MAINT_req">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.aevee.com.br/port_finan/SHARED}DT_header"/>
 *         &lt;element name="OPERACAO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="C"/>
 *               &lt;enumeration value="R"/>
 *               &lt;enumeration value="U"/>
 *               &lt;enumeration value="D"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Records" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="User" type="{http://www.aevee.com.br/port_finan/usuario}DT_Users" minOccurs="0"/>
 *                   &lt;element name="Contacts" type="{http://www.aevee.com.br/port_finan/usuario}DT_Contatos" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Profiles" type="{http://www.aevee.com.br/port_finan/usuario}DT_User_Profiles" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "DT_USER_MAINT_req", propOrder = {
    "header",
    "operacao",
    "records"
})
public class DTUSERMAINTReq {

    @XmlElement(name = "Header", required = true)
    protected DTHeader header;
    @XmlElement(name = "OPERACAO", required = true)
    protected String operacao;
    @XmlElement(name = "Records")
    protected List<DTUSERMAINTReq.Records> records;

    /**
     * Obtém o valor da propriedade header.
     * 
     * @return
     *     possible object is
     *     {@link DTHeader }
     *     
     */
    public DTHeader getHeader() {
        return header;
    }

    /**
     * Define o valor da propriedade header.
     * 
     * @param value
     *     allowed object is
     *     {@link DTHeader }
     *     
     */
    public void setHeader(DTHeader value) {
        this.header = value;
    }

    /**
     * Obtém o valor da propriedade operacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERACAO() {
        return operacao;
    }

    /**
     * Define o valor da propriedade operacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERACAO(String value) {
        this.operacao = value;
    }

    /**
     * Gets the value of the records property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the records property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTUSERMAINTReq.Records }
     * 
     * 
     */
    public List<DTUSERMAINTReq.Records> getRecords() {
        if (records == null) {
            records = new ArrayList<DTUSERMAINTReq.Records>();
        }
        return this.records;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="User" type="{http://www.aevee.com.br/port_finan/usuario}DT_Users" minOccurs="0"/>
     *         &lt;element name="Contacts" type="{http://www.aevee.com.br/port_finan/usuario}DT_Contatos" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Profiles" type="{http://www.aevee.com.br/port_finan/usuario}DT_User_Profiles" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "user",
        "contacts",
        "profiles"
    })
    public static class Records {

        @XmlElement(name = "User")
        protected DTUsers user;
        @XmlElement(name = "Contacts")
        protected List<DTContatos> contacts;
        @XmlElement(name = "Profiles")
        protected List<DTUserProfiles> profiles;

        /**
         * Obtém o valor da propriedade user.
         * 
         * @return
         *     possible object is
         *     {@link DTUsers }
         *     
         */
        public DTUsers getUser() {
            return user;
        }

        /**
         * Define o valor da propriedade user.
         * 
         * @param value
         *     allowed object is
         *     {@link DTUsers }
         *     
         */
        public void setUser(DTUsers value) {
            this.user = value;
        }

        /**
         * Gets the value of the contacts property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contacts property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContacts().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTContatos }
         * 
         * 
         */
        public List<DTContatos> getContacts() {
            if (contacts == null) {
                contacts = new ArrayList<DTContatos>();
            }
            return this.contacts;
        }

        /**
         * Gets the value of the profiles property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the profiles property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProfiles().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTUserProfiles }
         * 
         * 
         */
        public List<DTUserProfiles> getProfiles() {
            if (profiles == null) {
                profiles = new ArrayList<DTUserProfiles>();
            }
            return this.profiles;
        }

    }

}
