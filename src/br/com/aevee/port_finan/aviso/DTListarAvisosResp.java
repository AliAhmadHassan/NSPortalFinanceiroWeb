
package br.com.aevee.port_finan.aviso;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DT_Listar_Avisos_resp complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Listar_Avisos_resp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Avisos" type="{http://www.aevee.com.br/port_finan/aviso}DT_Aviso" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_Listar_Avisos_resp", propOrder = {
    "avisos"
})
public class DTListarAvisosResp {

    @XmlElement(name = "Avisos")
    protected List<DTAviso> avisos;

    /**
     * Gets the value of the avisos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avisos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvisos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTAviso }
     * 
     * 
     */
    public List<DTAviso> getAvisos() {
        if (avisos == null) {
            avisos = new ArrayList<DTAviso>();
        }
        return this.avisos;
    }

}
