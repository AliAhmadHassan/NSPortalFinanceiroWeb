
package br.com.aevee.port_finan.usuario;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.aevee.port_finan.shared.DTRESPONSE;


/**
 * <p>Classe Java de DT_USER_MAINT_resp complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_USER_MAINT_resp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{http://www.aevee.com.br/port_finan/SHARED}DT_RESPONSE"/>
 *         &lt;element name="Records" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Users" type="{http://www.aevee.com.br/port_finan/usuario}DT_Users" minOccurs="0"/>
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
@XmlType(name = "DT_USER_MAINT_resp", propOrder = {
    "result",
    "records"
})
public class DTUSERMAINTResp {

    @XmlElement(name = "Result", required = true)
    protected DTRESPONSE result;
    @XmlElement(name = "Records")
    protected List<DTUSERMAINTResp.Records> records;

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
     * {@link DTUSERMAINTResp.Records }
     * 
     * 
     */
    public List<DTUSERMAINTResp.Records> getRecords() {
        if (records == null) {
            records = new ArrayList<DTUSERMAINTResp.Records>();
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
     *         &lt;element name="Users" type="{http://www.aevee.com.br/port_finan/usuario}DT_Users" minOccurs="0"/>
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
        "users",
        "contacts",
        "profiles"
    })
    public static class Records {

        @XmlElement(name = "Users")
        protected DTUsers users;
        @XmlElement(name = "Contacts")
        protected List<DTContatos> contacts;
        @XmlElement(name = "Profiles")
        protected List<DTUserProfiles> profiles;

        /**
         * Obtém o valor da propriedade users.
         * 
         * @return
         *     possible object is
         *     {@link DTUsers }
         *     
         */
        public DTUsers getUsers() {
            return users;
        }

        /**
         * Define o valor da propriedade users.
         * 
         * @param value
         *     allowed object is
         *     {@link DTUsers }
         *     
         */
        public void setUsers(DTUsers value) {
            this.users = value;
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
