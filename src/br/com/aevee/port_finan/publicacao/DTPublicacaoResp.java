
package br.com.aevee.port_finan.publicacao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.com.aevee.port_finan.adiantamento.DTZCTFI027;
import br.com.aevee.port_finan.shared.DTRESPONSE;


/**
 * <p>Classe Java de DT_Publicacao_resp complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Publicacao_resp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
 *                   &lt;element name="AUGDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
 *                   &lt;element name="DESC_COMERCIAL" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="15"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="IMPOSTOS" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="13"/>
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
 *                   &lt;element name="ZLSCH" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="COMPROVANTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPROVANTE_BASE64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NOME_COMPROVANTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NOTA" type="{http://www.aevee.com.br/port_finan/publicacao}DT_Nota" minOccurs="0"/>
 *                   &lt;element name="DOCSIMP" type="{http://www.aevee.com.br/port_finan/publicacao}DT_Imposto" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="DOCSCRD" type="{http://www.aevee.com.br/port_finan/adiantamento}DT_ZCTFI027" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="LOG" type="{http://www.aevee.com.br/port_finan/publicacao}DT_Log" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DT_Publicacao_resp", propOrder = {
    "response",
    "result"
})
public class DTPublicacaoResp {

    @XmlElement(name = "Response")
    protected List<DTPublicacaoResp.Response> response;
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
     * {@link DTPublicacaoResp.Response }
     * 
     * 
     */
    public List<DTPublicacaoResp.Response> getResponse() {
        if (response == null) {
            response = new ArrayList<DTPublicacaoResp.Response>();
        }
        return this.response;
    }

    /**
     * Obt�m o valor da propriedade result.
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
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
     *         &lt;element name="AUGDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
     *         &lt;element name="DESC_COMERCIAL" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="15"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="IMPOSTOS" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="13"/>
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
     *         &lt;element name="ZLSCH" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="COMPROVANTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPROVANTE_BASE64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NOME_COMPROVANTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NOTA" type="{http://www.aevee.com.br/port_finan/publicacao}DT_Nota" minOccurs="0"/>
     *         &lt;element name="DOCSIMP" type="{http://www.aevee.com.br/port_finan/publicacao}DT_Imposto" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="DOCSCRD" type="{http://www.aevee.com.br/port_finan/adiantamento}DT_ZCTFI027" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="LOG" type="{http://www.aevee.com.br/port_finan/publicacao}DT_Log" maxOccurs="unbounded" minOccurs="0"/>
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
        "augdt",
        "dmbtr",
        "dmbtrcrd",
        "desccomercial",
        "impostos",
        "xblnr",
        "faedt",
        "waers",
        "lifnr",
        "stcd1",
        "name1",
        "zlsch",
        "antecipado",
        "comprovante",
        "comprovantebase64",
        "nomecomprovante",
        "nota",
        "docsimp",
        "docscrd",
        "log"
    })
    public static class Response {

        @XmlElement(name = "STATUS")
        protected BigInteger status;
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
        @XmlElement(name = "AUGDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar augdt;
        @XmlElement(name = "DMBTR")
        protected BigDecimal dmbtr;
        @XmlElement(name = "DMBTR_CRD")
        protected BigDecimal dmbtrcrd;
        @XmlElement(name = "DESC_COMERCIAL")
        protected BigDecimal desccomercial;
        @XmlElement(name = "IMPOSTOS")
        protected BigDecimal impostos;
        @XmlElement(name = "XBLNR")
        protected String xblnr;
        @XmlElement(name = "FAEDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar faedt;
        @XmlElement(name = "WAERS")
        protected String waers;
        @XmlElement(name = "LIFNR")
        protected String lifnr;
        @XmlElement(name = "STCD1")
        protected String stcd1;
        @XmlElement(name = "NAME1")
        protected String name1;
        @XmlElement(name = "ZLSCH")
        protected String zlsch;
        @XmlElement(name = "ANTECIPADO")
        protected String antecipado;
        @XmlElement(name = "COMPROVANTE")
        protected String comprovante;
        @XmlElement(name = "COMPROVANTE_BASE64")
        protected String comprovantebase64;
        @XmlElement(name = "NOME_COMPROVANTE")
        protected String nomecomprovante;
        @XmlElement(name = "NOTA")
        protected DTNota nota;
        @XmlElement(name = "DOCSIMP")
        protected List<DTImposto> docsimp;
        @XmlElement(name = "DOCSCRD")
        protected List<DTZCTFI027> docscrd;
        @XmlElement(name = "LOG")
        protected List<DTLog> log;

        /**
         * Obt�m o valor da propriedade status.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSTATUS() {
            return status;
        }

        /**
         * Define o valor da propriedade status.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSTATUS(BigInteger value) {
            this.status = value;
        }

        /**
         * Obt�m o valor da propriedade operacao.
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
         * Obt�m o valor da propriedade bukrs.
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
         * Obt�m o valor da propriedade belnr.
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
         * Obt�m o valor da propriedade buzei.
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
         * Obt�m o valor da propriedade gjahr.
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
         * Obt�m o valor da propriedade bldat.
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
         * Obt�m o valor da propriedade budat.
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
         * Obt�m o valor da propriedade augdt.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAUGDT() {
            return augdt;
        }

        /**
         * Define o valor da propriedade augdt.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAUGDT(XMLGregorianCalendar value) {
            this.augdt = value;
        }

        /**
         * Obt�m o valor da propriedade dmbtr.
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
         * Obt�m o valor da propriedade dmbtrcrd.
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
         * Obt�m o valor da propriedade desccomercial.
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
         * Obt�m o valor da propriedade impostos.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getIMPOSTOS() {
            return impostos;
        }

        /**
         * Define o valor da propriedade impostos.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setIMPOSTOS(BigDecimal value) {
            this.impostos = value;
        }

        /**
         * Obt�m o valor da propriedade xblnr.
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
         * Obt�m o valor da propriedade faedt.
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
         * Obt�m o valor da propriedade waers.
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
         * Obt�m o valor da propriedade lifnr.
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
         * Obt�m o valor da propriedade stcd1.
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
         * Obt�m o valor da propriedade name1.
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
         * Obt�m o valor da propriedade zlsch.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZLSCH() {
            return zlsch;
        }

        /**
         * Define o valor da propriedade zlsch.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZLSCH(String value) {
            this.zlsch = value;
        }

        
        public String getANTECIPADO() {
            return antecipado;
        }

        public void setANTECIPADO(String value) {
            this.antecipado = value;
        }

        
        
        
        /**
         * Obt�m o valor da propriedade comprovante.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPROVANTE() {
            return comprovante;
        }

        /**
         * Define o valor da propriedade comprovante.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPROVANTE(String value) {
            this.comprovante = value;
        }

        /**
         * Obt�m o valor da propriedade comprovantebase64.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPROVANTEBASE64() {
            return comprovantebase64;
        }

        /**
         * Define o valor da propriedade comprovantebase64.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPROVANTEBASE64(String value) {
            this.comprovantebase64 = value;
        }

        /**
         * Obt�m o valor da propriedade nomecomprovante.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNOMECOMPROVANTE() {
            return nomecomprovante;
        }

        /**
         * Define o valor da propriedade nomecomprovante.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNOMECOMPROVANTE(String value) {
            this.nomecomprovante = value;
        }

        /**
         * Obt�m o valor da propriedade nota.
         * 
         * @return
         *     possible object is
         *     {@link DTNota }
         *     
         */
        public DTNota getNOTA() {
            return nota;
        }

        /**
         * Define o valor da propriedade nota.
         * 
         * @param value
         *     allowed object is
         *     {@link DTNota }
         *     
         */
        public void setNOTA(DTNota value) {
            this.nota = value;
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
         * {@link DTImposto }
         * 
         * 
         */
        public List<DTImposto> getDOCSIMP() {
            if (docsimp == null) {
                docsimp = new ArrayList<DTImposto>();
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
         * Gets the value of the log property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the log property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLOG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTLog }
         * 
         * 
         */
        public List<DTLog> getLOG() {
            if (log == null) {
                log = new ArrayList<DTLog>();
            }
            return this.log;
        }

    }

}
