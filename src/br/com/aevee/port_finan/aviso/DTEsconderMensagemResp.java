
package br.com.aevee.port_finan.aviso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.aevee.port_finan.shared.DTRESPONSE;


/**
 * <p>Classe Java de DT_Esconder_Mensagem_resp complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Esconder_Mensagem_resp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{http://www.aevee.com.br/port_finan/SHARED}DT_RESPONSE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_Esconder_Mensagem_resp", propOrder = {
    "result"
})
public class DTEsconderMensagemResp {

    @XmlElement(name = "Result", required = true)
    protected DTRESPONSE result;

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

}
