
package br.com.aevee.port_finan.contato;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DT_Contato_Envio_req complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DT_Contato_Envio_req">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LIFNR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="USNAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Assunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sub_assunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Filial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mensagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Anexos" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Nome_arquivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Extensao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Conteudo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "DT_Contato_Envio_req", propOrder = {
    "lifnr",
    "usnam",
    "departamento",
    "assunto",
    "subAssunto",
    "filial",
    "mensagem",
    "anexos"
})
public class DTContatoEnvioReq {

    @XmlElement(name = "LIFNR", required = true)
    protected String lifnr;
    @XmlElement(name = "USNAM", required = true)
    protected String usnam;
    @XmlElement(name = "Departamento", required = true)
    protected String departamento;
    @XmlElement(name = "Assunto", required = true)
    protected String assunto;
    @XmlElement(name = "Sub_assunto")
    protected String subAssunto;
    @XmlElement(name = "Filial")
    protected String filial;
    @XmlElement(name = "Mensagem")
    protected String mensagem;
    @XmlElement(name = "Anexos")
    protected List<DTContatoEnvioReq.Anexos> anexos;

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
     * Obtém o valor da propriedade usnam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSNAM() {
        return usnam;
    }

    /**
     * Define o valor da propriedade usnam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSNAM(String value) {
        this.usnam = value;
    }

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
     * Obtém o valor da propriedade mensagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * Define o valor da propriedade mensagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagem(String value) {
        this.mensagem = value;
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
     * {@link DTContatoEnvioReq.Anexos }
     * 
     * 
     */
    public List<DTContatoEnvioReq.Anexos> getAnexos() {
        if (anexos == null) {
            anexos = new ArrayList<DTContatoEnvioReq.Anexos>();
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
     *         &lt;element name="Nome_arquivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Extensao" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Conteudo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "nomeArquivo",
        "extensao",
        "conteudo"
    })
    public static class Anexos {

        @XmlElement(name = "Nome_arquivo", required = true)
        protected String nomeArquivo;
        @XmlElement(name = "Extensao", required = true)
        protected String extensao;
        @XmlElement(name = "Conteudo", required = true)
        protected String conteudo;

        /**
         * Obtém o valor da propriedade nomeArquivo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeArquivo() {
            return nomeArquivo;
        }

        /**
         * Define o valor da propriedade nomeArquivo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeArquivo(String value) {
            this.nomeArquivo = value;
        }

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

        /**
         * Obtém o valor da propriedade conteudo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConteudo() {
            return conteudo;
        }

        /**
         * Define o valor da propriedade conteudo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConteudo(String value) {
            this.conteudo = value;
        }

    }

}
