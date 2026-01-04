
package br.com.aevee.port_finan.contato;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DT_Contato_resp complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Contato_resp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartamentosAssuntos" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Assunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Sub_assunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Filial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Cnpj_Filial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Anexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Resposta_auto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Anexos" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TamanhoMax">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="5"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TamanhoUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ListaExtensao" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Extensao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "DT_Contato_resp", propOrder = {
    "departamentosAssuntos",
    "anexos"
})
public class DTContatoResp {

    @XmlElement(name = "DepartamentosAssuntos")
    protected List<DTContatoResp.DepartamentosAssuntos> departamentosAssuntos;
    @XmlElement(name = "Anexos")
    protected List<DTContatoResp.Anexos> anexos;

    /**
     * Gets the value of the departamentosAssuntos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the departamentosAssuntos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartamentosAssuntos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTContatoResp.DepartamentosAssuntos }
     * 
     * 
     */
    public List<DTContatoResp.DepartamentosAssuntos> getDepartamentosAssuntos() {
        if (departamentosAssuntos == null) {
            departamentosAssuntos = new ArrayList<DTContatoResp.DepartamentosAssuntos>();
        }
        return this.departamentosAssuntos;
    }

    /**
     * Gets the value of the anexos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anexos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnexos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTContatoResp.Anexos }
     * 
     * 
     */
    public List<DTContatoResp.Anexos> getAnexos() {
        if (anexos == null) {
            anexos = new ArrayList<DTContatoResp.Anexos>();
        }
        return this.anexos;
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
     *         &lt;element name="TamanhoMax">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="5"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TamanhoUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ListaExtensao" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Extensao" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
        "tamanhoMax",
        "tamanhoUM",
        "listaExtensao"
    })
    public static class Anexos {

        @XmlElement(name = "TamanhoMax", required = true)
        protected BigDecimal tamanhoMax;
        @XmlElement(name = "TamanhoUM", required = true)
        protected String tamanhoUM;
        @XmlElement(name = "ListaExtensao", required = true)
        protected List<DTContatoResp.Anexos.ListaExtensao> listaExtensao;

        /**
         * Obtém o valor da propriedade tamanhoMax.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTamanhoMax() {
            return tamanhoMax;
        }

        /**
         * Define o valor da propriedade tamanhoMax.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTamanhoMax(BigDecimal value) {
            this.tamanhoMax = value;
        }

        /**
         * Obtém o valor da propriedade tamanhoUM.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTamanhoUM() {
            return tamanhoUM;
        }

        /**
         * Define o valor da propriedade tamanhoUM.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTamanhoUM(String value) {
            this.tamanhoUM = value;
        }

        /**
         * Gets the value of the listaExtensao property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listaExtensao property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getListaExtensao().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTContatoResp.Anexos.ListaExtensao }
         * 
         * 
         */
        public List<DTContatoResp.Anexos.ListaExtensao> getListaExtensao() {
            if (listaExtensao == null) {
                listaExtensao = new ArrayList<DTContatoResp.Anexos.ListaExtensao>();
            }
            return this.listaExtensao;
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
         *         &lt;element name="Extensao" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "extensao"
        })
        public static class ListaExtensao {

            @XmlElement(name = "Extensao", required = true)
            protected String extensao;

            /**
             * Obtém o valor da propriedade extensao.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtensao() {
                return extensao;
            }

            /**
             * Define o valor da propriedade extensao.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtensao(String value) {
                this.extensao = value;
            }

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
     *         &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Assunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Sub_assunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Filial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Cnpj_Filial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Anexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Resposta_auto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "departamento",
        "assunto",
        "subAssunto",
        "filial",
        "cnpjFilial",
        "anexo",
        "respostaAuto"
    })
    public static class DepartamentosAssuntos {

        @XmlElement(name = "Departamento", required = true)
        protected String departamento;
        @XmlElement(name = "Assunto", required = true)
        protected String assunto;
        @XmlElement(name = "Sub_assunto")
        protected String subAssunto;
        @XmlElement(name = "Filial")
        protected String filial;
        @XmlElement(name = "Cnpj_Filial")
        protected String cnpjFilial;
        @XmlElement(name = "Anexo")
        protected String anexo;
        @XmlElement(name = "Resposta_auto")
        protected String respostaAuto;

        /**
         * Obtém o valor da propriedade departamento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartamento() {
            return departamento;
        }

        /**
         * Define o valor da propriedade departamento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartamento(String value) {
            this.departamento = value;
        }

        /**
         * Obtém o valor da propriedade assunto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssunto() {
            return assunto;
        }

        /**
         * Define o valor da propriedade assunto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssunto(String value) {
            this.assunto = value;
        }

        /**
         * Obtém o valor da propriedade subAssunto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubAssunto() {
            return subAssunto;
        }

        /**
         * Define o valor da propriedade subAssunto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubAssunto(String value) {
            this.subAssunto = value;
        }

        /**
         * Obtém o valor da propriedade filial.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFilial() {
            return filial;
        }

        /**
         * Define o valor da propriedade filial.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFilial(String value) {
            this.filial = value;
        }

        /**
         * Obtém o valor da propriedade cnpjFilial.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnpjFilial() {
            return cnpjFilial;
        }

        /**
         * Define o valor da propriedade cnpjFilial.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnpjFilial(String value) {
            this.cnpjFilial = value;
        }

        /**
         * Obtém o valor da propriedade anexo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAnexo() {
            return anexo;
        }

        /**
         * Define o valor da propriedade anexo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAnexo(String value) {
            this.anexo = value;
        }

        /**
         * Obtém o valor da propriedade respostaAuto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRespostaAuto() {
            return respostaAuto;
        }

        /**
         * Define o valor da propriedade respostaAuto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRespostaAuto(String value) {
            this.respostaAuto = value;
        }

    }

}
