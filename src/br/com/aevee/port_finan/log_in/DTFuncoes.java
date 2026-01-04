
package br.com.aevee.port_finan.log_in;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DT_Funcoes complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Funcoes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FUNCAO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PARAMETRO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
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
@XmlType(name = "DT_Funcoes", propOrder = {
    "funcao",
    "parametro"
})
public class DTFuncoes {

    @XmlElement(name = "FUNCAO", required = true)
    protected String funcao;
    @XmlElement(name = "PARAMETRO")
    protected String parametro;

    /**
     * Obtém o valor da propriedade funcao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNCAO() {
        return funcao;
    }

    /**
     * Define o valor da propriedade funcao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNCAO(String value) {
        this.funcao = value;
    }

    /**
     * Obtém o valor da propriedade parametro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARAMETRO() {
        return parametro;
    }

    /**
     * Define o valor da propriedade parametro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARAMETRO(String value) {
        this.parametro = value;
    }

}
