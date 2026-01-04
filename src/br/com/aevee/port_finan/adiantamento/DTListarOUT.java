
package br.com.aevee.port_finan.adiantamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.com.aevee.port_finan.shared.DTRESPONSE;


/**
 * <p>Classe Java de DT_Listar_OUT complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Listar_OUT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="STATUS" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OPERACAO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BUKRS" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BELNR" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BUZEI" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="GJAHR" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BLDAT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="BUDAT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="GRPTXANT" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TXANTM" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="9"/>
 *                         &lt;fractionDigits value="5"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TXANTD" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="9"/>
 *                         &lt;fractionDigits value="5"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="GRPDIAANT" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DTANTFIN" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="VLRJRANT" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="13"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="VLRLIQANT" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="13"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="VRTXOPER" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="13"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DMBTR" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="13"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DMBTR_CRD" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="13"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DESC_COMERCIAL">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="15"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="XBLNR" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="16"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FAEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="DIASVCTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="WAERS" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="5"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="LIFNR" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="STCD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NOTA" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NOTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TOTAL" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;totalDigits value="15"/>
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DOCSIMP" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="IMPOSTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BASE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;totalDigits value="15"/>
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="MONTANTE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;totalDigits value="15"/>
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DOCSCRD" type="{http://www.aevee.com.br/port_finan/adiantamento}DT_ZCTFI027" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "DT_Listar_OUT", propOrder = {
    "response",
    "result"
})
public class DTListarOUT {

    @XmlElement(name = "Response")
    protected List<DTListarOUT.Response> response;
    @XmlElement(name = "Result", required = true)
    protected DTRESPONSE result;

    /**
     * Gets the value of the response property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the response property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTListarOUT.Response }
     * 
     * 
     */
    public List<DTListarOUT.Response> getResponse() {
        if (response == null) {
            response = new ArrayList<DTListarOUT.Response>();
        }
        return this.response;
    }

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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="STATUS" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OPERACAO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BUKRS" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BELNR" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BUZEI" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="GJAHR" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BLDAT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="BUDAT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="GRPTXANT" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TXANTM" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="9"/>
     *               &lt;fractionDigits value="5"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TXANTD" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="9"/>
     *               &lt;fractionDigits value="5"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="GRPDIAANT" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DTANTFIN" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="VLRJRANT" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="13"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="VLRLIQANT" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="13"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="VRTXOPER" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="13"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DMBTR" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="13"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DMBTR_CRD" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="13"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DESC_COMERCIAL">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="15"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="XBLNR" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="16"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FAEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="DIASVCTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="WAERS" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="5"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="LIFNR" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="STCD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NOTA" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NOTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TOTAL" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;totalDigits value="15"/>
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DOCSIMP" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="IMPOSTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BASE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;totalDigits value="15"/>
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="MONTANTE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;totalDigits value="15"/>
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DOCSCRD" type="{http://www.aevee.com.br/port_finan/adiantamento}DT_ZCTFI027" maxOccurs="unbounded" minOccurs="0"/>
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
        "status",
        "operacao",
        "bukrs",
        "belnr",
        "buzei",
        "gjahr",
        "bldat",
        "budat",
        "grptxant",
        "txantm",
        "txantd",
        "grpdiaant",
        "dtantfin",
        "vlrjrant",
        "vlrliqant",
        "vrtxoper",
        "dmbtr",
        "dmbtrcrd",
        "desccomercial",
        "xblnr",
        "faedt",
        "diasvcto",
        "waers",
        "lifnr",
        "stcd1",
        "name1",
        "nota",
        "docsimp",
        "docscrd"
    })
    public static class Response {

        @XmlElement(name = "STATUS")
        protected String status;
        @XmlElement(name = "OPERACAO")
        protected String operacao;
        @XmlElement(name = "BUKRS")
        protected String bukrs;
        @XmlElement(name = "BELNR")
        protected String belnr;
        @XmlElement(name = "BUZEI")
        protected String buzei;
        @XmlElement(name = "GJAHR")
        protected String gjahr;
        @XmlElement(name = "BLDAT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar bldat;
        @XmlElement(name = "BUDAT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar budat;
        @XmlElement(name = "GRPTXANT")
        protected String grptxant;
        @XmlElement(name = "TXANTM")
        protected BigDecimal txantm;
        @XmlElement(name = "TXANTD")
        protected BigDecimal txantd;
        @XmlElement(name = "GRPDIAANT")
        protected String grpdiaant;
        @XmlElement(name = "DTANTFIN")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dtantfin;
        @XmlElement(name = "VLRJRANT")
        protected BigDecimal vlrjrant;
        @XmlElement(name = "VLRLIQANT")
        protected BigDecimal vlrliqant;
        @XmlElement(name = "VRTXOPER")
        protected BigDecimal vrtxoper;
        @XmlElement(name = "DMBTR")
        protected BigDecimal dmbtr;
        @XmlElement(name = "DMBTR_CRD")
        protected BigDecimal dmbtrcrd;
        @XmlElement(name = "DESC_COMERCIAL", required = true)
        protected BigDecimal desccomercial;
        @XmlElement(name = "XBLNR")
        protected String xblnr;
        @XmlElement(name = "FAEDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar faedt;
        @XmlElement(name = "DIASVCTO")
        protected String diasvcto;
        @XmlElement(name = "WAERS")
        protected String waers;
        @XmlElement(name = "LIFNR")
        protected String lifnr;
        @XmlElement(name = "STCD1")
        protected String stcd1;
        @XmlElement(name = "NAME1")
        protected String name1;
        @XmlElement(name = "NOTA")
        protected List<DTListarOUT.Response.NOTA> nota;
        @XmlElement(name = "DOCSIMP")
        protected List<DTListarOUT.Response.DOCSIMP> docsimp;
        @XmlElement(name = "DOCSCRD")
        protected List<DTZCTFI027> docscrd;

        /**
         * Obtém o valor da propriedade status.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATUS() {
            return status;
        }

        /**
         * Define o valor da propriedade status.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATUS(String value) {
            this.status = value;
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
         * Obtém o valor da propriedade bukrs.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBUKRS() {
            return bukrs;
        }

        /**
         * Define o valor da propriedade bukrs.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBUKRS(String value) {
            this.bukrs = value;
        }

        /**
         * Obtém o valor da propriedade belnr.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBELNR() {
            return belnr;
        }

        /**
         * Define o valor da propriedade belnr.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBELNR(String value) {
            this.belnr = value;
        }

        /**
         * Obtém o valor da propriedade buzei.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBUZEI() {
            return buzei;
        }

        /**
         * Define o valor da propriedade buzei.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBUZEI(String value) {
            this.buzei = value;
        }

        /**
         * Obtém o valor da propriedade gjahr.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGJAHR() {
            return gjahr;
        }

        /**
         * Define o valor da propriedade gjahr.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGJAHR(String value) {
            this.gjahr = value;
        }

        /**
         * Obtém o valor da propriedade bldat.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBLDAT() {
            return bldat;
        }

        /**
         * Define o valor da propriedade bldat.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBLDAT(XMLGregorianCalendar value) {
            this.bldat = value;
        }

        /**
         * Obtém o valor da propriedade budat.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBUDAT() {
            return budat;
        }

        /**
         * Define o valor da propriedade budat.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBUDAT(XMLGregorianCalendar value) {
            this.budat = value;
        }

        /**
         * Obtém o valor da propriedade grptxant.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGRPTXANT() {
            return grptxant;
        }

        /**
         * Define o valor da propriedade grptxant.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGRPTXANT(String value) {
            this.grptxant = value;
        }

        /**
         * Obtém o valor da propriedade txantm.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTXANTM() {
            return txantm;
        }

        /**
         * Define o valor da propriedade txantm.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTXANTM(BigDecimal value) {
            this.txantm = value;
        }

        /**
         * Obtém o valor da propriedade txantd.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTXANTD() {
            return txantd;
        }

        /**
         * Define o valor da propriedade txantd.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTXANTD(BigDecimal value) {
            this.txantd = value;
        }

        /**
         * Obtém o valor da propriedade grpdiaant.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGRPDIAANT() {
            return grpdiaant;
        }

        /**
         * Define o valor da propriedade grpdiaant.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGRPDIAANT(String value) {
            this.grpdiaant = value;
        }

        /**
         * Obtém o valor da propriedade dtantfin.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDTANTFIN() {
            return dtantfin;
        }

        /**
         * Define o valor da propriedade dtantfin.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDTANTFIN(XMLGregorianCalendar value) {
            this.dtantfin = value;
        }

        /**
         * Obtém o valor da propriedade vlrjrant.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVLRJRANT() {
            return vlrjrant;
        }

        /**
         * Define o valor da propriedade vlrjrant.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVLRJRANT(BigDecimal value) {
            this.vlrjrant = value;
        }

        /**
         * Obtém o valor da propriedade vlrliqant.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVLRLIQANT() {
            return vlrliqant;
        }

        /**
         * Define o valor da propriedade vlrliqant.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVLRLIQANT(BigDecimal value) {
            this.vlrliqant = value;
        }

        /**
         * Obtém o valor da propriedade vrtxoper.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVRTXOPER() {
            return vrtxoper;
        }

        /**
         * Define o valor da propriedade vrtxoper.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVRTXOPER(BigDecimal value) {
            this.vrtxoper = value;
        }

        /**
         * Obtém o valor da propriedade dmbtr.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDMBTR() {
            return dmbtr;
        }

        /**
         * Define o valor da propriedade dmbtr.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDMBTR(BigDecimal value) {
            this.dmbtr = value;
        }

        /**
         * Obtém o valor da propriedade dmbtrcrd.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDMBTRCRD() {
            return dmbtrcrd;
        }

        /**
         * Define o valor da propriedade dmbtrcrd.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDMBTRCRD(BigDecimal value) {
            this.dmbtrcrd = value;
        }

        /**
         * Obtém o valor da propriedade desccomercial.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDESCCOMERCIAL() {
            return desccomercial;
        }

        /**
         * Define o valor da propriedade desccomercial.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDESCCOMERCIAL(BigDecimal value) {
            this.desccomercial = value;
        }

        /**
         * Obtém o valor da propriedade xblnr.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXBLNR() {
            return xblnr;
        }

        /**
         * Define o valor da propriedade xblnr.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXBLNR(String value) {
            this.xblnr = value;
        }

        /**
         * Obtém o valor da propriedade faedt.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFAEDT() {
            return faedt;
        }

        /**
         * Define o valor da propriedade faedt.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFAEDT(XMLGregorianCalendar value) {
            this.faedt = value;
        }

        /**
         * Obtém o valor da propriedade diasvcto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDIASVCTO() {
            return diasvcto;
        }

        /**
         * Define o valor da propriedade diasvcto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDIASVCTO(String value) {
            this.diasvcto = value;
        }

        /**
         * Obtém o valor da propriedade waers.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWAERS() {
            return waers;
        }

        /**
         * Define o valor da propriedade waers.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWAERS(String value) {
            this.waers = value;
        }

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
         * Gets the value of the nota property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nota property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNOTA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTListarOUT.Response.NOTA }
         * 
         * 
         */
        public List<DTListarOUT.Response.NOTA> getNOTA() {
            if (nota == null) {
                nota = new ArrayList<DTListarOUT.Response.NOTA>();
            }
            return this.nota;
        }

        /**
         * Gets the value of the docsimp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the docsimp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDOCSIMP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTListarOUT.Response.DOCSIMP }
         * 
         * 
         */
        public List<DTListarOUT.Response.DOCSIMP> getDOCSIMP() {
            if (docsimp == null) {
                docsimp = new ArrayList<DTListarOUT.Response.DOCSIMP>();
            }
            return this.docsimp;
        }

        /**
         * Gets the value of the docscrd property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the docscrd property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDOCSCRD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTZCTFI027 }
         * 
         * 
         */
        public List<DTZCTFI027> getDOCSCRD() {
            if (docscrd == null) {
                docscrd = new ArrayList<DTZCTFI027>();
            }
            return this.docscrd;
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
         *         &lt;element name="IMPOSTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BASE" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;totalDigits value="15"/>
         *               &lt;fractionDigits value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="MONTANTE" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;totalDigits value="15"/>
         *               &lt;fractionDigits value="2"/>
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
        @XmlType(name = "", propOrder = {
            "imposto",
            "base",
            "montante"
        })
        public static class DOCSIMP {

            @XmlElement(name = "IMPOSTO")
            protected String imposto;
            @XmlElement(name = "BASE")
            protected BigDecimal base;
            @XmlElement(name = "MONTANTE")
            protected BigDecimal montante;

            /**
             * Obtém o valor da propriedade imposto.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIMPOSTO() {
                return imposto;
            }

            /**
             * Define o valor da propriedade imposto.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIMPOSTO(String value) {
                this.imposto = value;
            }

            /**
             * Obtém o valor da propriedade base.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBASE() {
                return base;
            }

            /**
             * Define o valor da propriedade base.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBASE(BigDecimal value) {
                this.base = value;
            }

            /**
             * Obtém o valor da propriedade montante.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMONTANTE() {
                return montante;
            }

            /**
             * Define o valor da propriedade montante.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMONTANTE(BigDecimal value) {
                this.montante = value;
            }

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
         *         &lt;element name="NOTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TOTAL" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;totalDigits value="15"/>
         *               &lt;fractionDigits value="2"/>
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
        @XmlType(name = "", propOrder = {
            "nota",
            "total"
        })
        public static class NOTA {

            @XmlElement(name = "NOTA")
            protected String nota;
            @XmlElement(name = "TOTAL")
            protected BigDecimal total;

            /**
             * Obtém o valor da propriedade nota.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOTA() {
                return nota;
            }

            /**
             * Define o valor da propriedade nota.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOTA(String value) {
                this.nota = value;
            }

            /**
             * Obtém o valor da propriedade total.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTOTAL() {
                return total;
            }

            /**
             * Define o valor da propriedade total.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTOTAL(BigDecimal value) {
                this.total = value;
            }

        }

    }

}
