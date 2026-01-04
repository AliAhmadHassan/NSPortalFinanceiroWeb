
package br.com.aevee.port_finan.usuario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DT_User_Profiles complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_User_Profiles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROFILE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "DT_User_Profiles", propOrder = {
    "profile"
})
public class DTUserProfiles {

    @XmlElement(name = "PROFILE", required = true)
    protected String profile;

    /**
     * Obtém o valor da propriedade profile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROFILE() {
        return profile;
    }

    /**
     * Define o valor da propriedade profile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROFILE(String value) {
        this.profile = value;
    }

}
