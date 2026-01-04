
package br.com.aevee.port_finan.log_in;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.aevee.port_finan.shared.DTRESPONSE;


/**
 * <p>Classe Java de DT_LOGIN_resp complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_LOGIN_resp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.aevee.com.br/port_finan/SHARED}DT_RESPONSE"/>
 *         &lt;element name="funcoes" type="{http://www.aevee.com.br/port_finan/log_in}DT_Funcoes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="user" type="{http://www.aevee.com.br/port_finan/log_in}DT_Users" minOccurs="0"/>
 *         &lt;element name="fornecedor" type="{http://www.aevee.com.br/port_finan/log_in}DT_Fornecedor" minOccurs="0"/>
 *         &lt;element name="fornecedores" type="{http://www.aevee.com.br/port_finan/log_in}DT_Fornecedores" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_LOGIN_resp", propOrder = {
    "result",
    "funcoes",
    "user",
    "fornecedor",
    "fornecedores"
})
public class DTLOGINResp {

    @XmlElement(required = true)
    protected DTRESPONSE result;
    protected List<DTFuncoes> funcoes;
    protected DTUsers user;
    protected DTFornecedor fornecedor;
    protected List<DTFornecedores> fornecedores;

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
     * Gets the value of the funcoes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the funcoes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFuncoes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTFuncoes }
     * 
     * 
     */
    public List<DTFuncoes> getFuncoes() {
        if (funcoes == null) {
            funcoes = new ArrayList<DTFuncoes>();
        }
        return this.funcoes;
    }

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
     * Obtém o valor da propriedade fornecedor.
     * 
     * @return
     *     possible object is
     *     {@link DTFornecedor }
     *     
     */
    public DTFornecedor getFornecedor() {
        return fornecedor;
    }

    /**
     * Define o valor da propriedade fornecedor.
     * 
     * @param value
     *     allowed object is
     *     {@link DTFornecedor }
     *     
     */
    public void setFornecedor(DTFornecedor value) {
        this.fornecedor = value;
    }

    /**
     * Gets the value of the fornecedores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fornecedores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFornecedores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTFornecedores }
     * 
     * 
     */
    public List<DTFornecedores> getFornecedores() {
        if (fornecedores == null) {
            fornecedores = new ArrayList<DTFornecedores>();
        }
        return this.fornecedores;
    }

}
