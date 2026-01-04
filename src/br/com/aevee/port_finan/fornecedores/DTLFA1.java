
package br.com.aevee.port_finan.fornecedores;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DT_LFA1 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_LFA1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LIFNR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NAME1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NAME2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="STCD1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="STCD3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SPRAS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Dados_Bancarios" type="{http://www.aevee.com.br/port_finan/fornecedores}DT_LFBK" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Dados_Empresariais" type="{http://www.aevee.com.br/port_finan/fornecedores}DT_LFB1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Dados_Endereco" type="{http://www.aevee.com.br/port_finan/fornecedores}DT_ADRC" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_LFA1", propOrder = {
    "lifnr",
    "name1",
    "name2",
    "stcd1",
    "stcd3",
    "spras",
    "dadosBancarios",
    "dadosEmpresariais",
    "dadosEndereco"
})
public class DTLFA1 {

    @XmlElement(name = "LIFNR", required = true)
    protected String lifnr;
    @XmlElement(name = "NAME1", required = true)
    protected String name1;
    @XmlElement(name = "NAME2", required = true)
    protected String name2;
    @XmlElement(name = "STCD1", required = true)
    protected String stcd1;
    @XmlElement(name = "STCD3", required = true)
    protected String stcd3;
    @XmlElement(name = "SPRAS", required = true)
    protected String spras;
    @XmlElement(name = "Dados_Bancarios")
    protected List<DTLFBK> dadosBancarios;
    @XmlElement(name = "Dados_Empresariais")
    protected List<DTLFB1> dadosEmpresariais;
    @XmlElement(name = "Dados_Endereco")
    protected List<DTADRC> dadosEndereco;

    /**
     * Obtém o valor da propriedade lifnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIFNR() {
        return lifnr;
    }

    /**
     * Define o valor da propriedade lifnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIFNR(String value) {
        this.lifnr = value;
    }

    /**
     * Obtém o valor da propriedade name1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME1() {
        return name1;
    }

    /**
     * Define o valor da propriedade name1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME1(String value) {
        this.name1 = value;
    }

    /**
     * Obtém o valor da propriedade name2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME2() {
        return name2;
    }

    /**
     * Define o valor da propriedade name2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME2(String value) {
        this.name2 = value;
    }

    /**
     * Obtém o valor da propriedade stcd1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTCD1() {
        return stcd1;
    }

    /**
     * Define o valor da propriedade stcd1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTCD1(String value) {
        this.stcd1 = value;
    }

    /**
     * Obtém o valor da propriedade stcd3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTCD3() {
        return stcd3;
    }

    /**
     * Define o valor da propriedade stcd3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTCD3(String value) {
        this.stcd3 = value;
    }

    /**
     * Obtém o valor da propriedade spras.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRAS() {
        return spras;
    }

    /**
     * Define o valor da propriedade spras.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRAS(String value) {
        this.spras = value;
    }

    /**
     * Gets the value of the dadosBancarios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosBancarios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosBancarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTLFBK }
     * 
     * 
     */
    public List<DTLFBK> getDadosBancarios() {
        if (dadosBancarios == null) {
            dadosBancarios = new ArrayList<DTLFBK>();
        }
        return this.dadosBancarios;
    }

    /**
     * Gets the value of the dadosEmpresariais property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosEmpresariais property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosEmpresariais().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTLFB1 }
     * 
     * 
     */
    public List<DTLFB1> getDadosEmpresariais() {
        if (dadosEmpresariais == null) {
            dadosEmpresariais = new ArrayList<DTLFB1>();
        }
        return this.dadosEmpresariais;
    }

    /**
     * Gets the value of the dadosEndereco property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosEndereco property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosEndereco().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTADRC }
     * 
     * 
     */
    public List<DTADRC> getDadosEndereco() {
        if (dadosEndereco == null) {
            dadosEndereco = new ArrayList<DTADRC>();
        }
        return this.dadosEndereco;
    }

}
