
package br.com.aevee.port_finan.search_help;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DT_SHLP_resp complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_SHLP_resp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Search_Help" type="{http://www.aevee.com.br/port_finan/search_help}DT_searchhelp_full" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_SHLP_resp", propOrder = {
    "searchHelp"
})
public class DTSHLPResp {

    @XmlElement(name = "Search_Help")
    protected List<DTSearchhelpFull> searchHelp;

    /**
     * Gets the value of the searchHelp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchHelp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchHelp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTSearchhelpFull }
     * 
     * 
     */
    public List<DTSearchhelpFull> getSearchHelp() {
        if (searchHelp == null) {
            searchHelp = new ArrayList<DTSearchhelpFull>();
        }
        return this.searchHelp;
    }

}
