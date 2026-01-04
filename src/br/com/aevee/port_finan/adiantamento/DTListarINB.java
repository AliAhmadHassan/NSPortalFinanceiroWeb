
package br.com.aevee.port_finan.adiantamento;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.aevee.port_finan.shared.DTDateRange;
import br.com.aevee.port_finan.shared.DTRange;


/**
 * <p>Classe Java de DT_Listar_INB complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Listar_INB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SLIFNR" type="{http://www.aevee.com.br/port_finan/SHARED}DT_range" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SBUKRS" type="{http://www.aevee.com.br/port_finan/SHARED}DT_range" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SBUDAT" type="{http://www.aevee.com.br/port_finan/SHARED}DT_Date_range" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_Listar_INB", propOrder = {
    "slifnr",
    "sbukrs",
    "sbudat"
})
public class DTListarINB {

    @XmlElement(name = "SLIFNR")
    protected List<DTRange> slifnr;
    @XmlElement(name = "SBUKRS")
    protected List<DTRange> sbukrs;
    @XmlElement(name = "SBUDAT")
    protected List<DTDateRange> sbudat;

    /**
     * Gets the value of the slifnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slifnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSLIFNR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTRange }
     * 
     * 
     */
    public List<DTRange> getSLIFNR() {
        if (slifnr == null) {
            slifnr = new ArrayList<DTRange>();
        }
        return this.slifnr;
    }

    /**
     * Gets the value of the sbukrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbukrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSBUKRS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTRange }
     * 
     * 
     */
    public List<DTRange> getSBUKRS() {
        if (sbukrs == null) {
            sbukrs = new ArrayList<DTRange>();
        }
        return this.sbukrs;
    }

    /**
     * Gets the value of the sbudat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbudat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSBUDAT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTDateRange }
     * 
     * 
     */
    public List<DTDateRange> getSBUDAT() {
        if (sbudat == null) {
            sbudat = new ArrayList<DTDateRange>();
        }
        return this.sbudat;
    }

}
