package br.com.aevee.nsPortFinanc.Excel;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import br.com.aevee.nsPortFinanc.Excel.ExcelReaderColumnAnnotation;
import br.com.aevee.nsPortFinanc.Excel.ExcelWriterColumnAnnotation;

public class SolicitacaoPlanilha {
	@ExcelWriterColumnAnnotation(columnTitle = "Status")
	@ExcelReaderColumnAnnotation(cellCoordiante = "A", required = true)
	private String status;
	
	@ExcelWriterColumnAnnotation(columnTitle = "Operação")
	@ExcelReaderColumnAnnotation(cellCoordiante = "B", required = true)
	private String operacao;
	
	
	@ExcelWriterColumnAnnotation(columnTitle = "CNPJ")
	@ExcelReaderColumnAnnotation(cellCoordiante = "C", required = true)
	private String cnpj;

	@ExcelWriterColumnAnnotation(columnTitle = "Razão Social")
	@ExcelReaderColumnAnnotation(cellCoordiante = "D", required = true)
	private String razaoSocial;
	
	@ExcelWriterColumnAnnotation(columnTitle = "Nota Fiscal")
	@ExcelReaderColumnAnnotation(cellCoordiante = "E", required = true)
	private String notaFiscal;
	
	@ExcelWriterColumnAnnotation(columnTitle = "Data de Emissao")
	@ExcelReaderColumnAnnotation(cellCoordiante = "F", required = true)
	private XMLGregorianCalendar dtEmissao;
	
	@ExcelWriterColumnAnnotation(columnTitle = "Data de Recebimento")
	@ExcelReaderColumnAnnotation(cellCoordiante = "G", required = true)
	private XMLGregorianCalendar dtRecebimento;
	
	@ExcelWriterColumnAnnotation(columnTitle = "Valor Bruto")
	@ExcelReaderColumnAnnotation(cellCoordiante = "H", required = true)
	private BigDecimal valorBruto;
	
	
	
	@ExcelWriterColumnAnnotation(columnTitle = "IRF")
	@ExcelReaderColumnAnnotation(cellCoordiante = "I", required = true)
	private String irf;
	
	@ExcelWriterColumnAnnotation(columnTitle = "Taxa Mês (%)")
	@ExcelReaderColumnAnnotation(cellCoordiante = "J", required = true)
	private BigDecimal TaxaMes;
	
	@ExcelWriterColumnAnnotation(columnTitle = "Desconto Comenciais")
	@ExcelReaderColumnAnnotation(cellCoordiante = "K", required = true)
	private BigDecimal descComerciais;
	
	
	@ExcelWriterColumnAnnotation(columnTitle = "Valor Devolução")
	@ExcelReaderColumnAnnotation(cellCoordiante = "L", required = true)
	private BigDecimal valorDevolucao;
	
	@ExcelWriterColumnAnnotation(columnTitle = "Data de Vencimento")
	@ExcelReaderColumnAnnotation(cellCoordiante = "M", required = true)
	private XMLGregorianCalendar dataVencimento;
	
	@ExcelWriterColumnAnnotation(columnTitle = "Data de Antecipação")
	@ExcelReaderColumnAnnotation(cellCoordiante = "N", required = true)
	private XMLGregorianCalendar dataAntecipacao;
	
	@ExcelWriterColumnAnnotation(columnTitle = "Valor Juros Antecipação")
	@ExcelReaderColumnAnnotation(cellCoordiante = "O", required = true)
	private BigDecimal valorJurosAntecipacao;
	
	@ExcelWriterColumnAnnotation(columnTitle = "Valor Líquido Antecipação")
	@ExcelReaderColumnAnnotation(cellCoordiante = "P", required = true)
	private BigDecimal valorLiquidoAntecipacao;
	
	@ExcelWriterColumnAnnotation(columnTitle = "Id")
	@ExcelReaderColumnAnnotation(cellCoordiante = "Q", required = true)
	private String id;
	

	public String getStatus() {
		return status;
	}

	public String getOperacao() {
		return operacao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getNotaFiscal() {
		return notaFiscal;
	}

	public XMLGregorianCalendar getDtEmissao() {
		return dtEmissao;
	}

	public XMLGregorianCalendar getDtRecebimento() {
		return dtRecebimento;
	}

	public BigDecimal getValorBruto() {
		return valorBruto;
	}

	public String getIrf() {
		return irf;
	}

	public BigDecimal getTaxaMes() {
		return TaxaMes;
	}

	public BigDecimal getDescComerciais() {
		return descComerciais;
	}

	public BigDecimal getValorDevolucao() {
		return valorDevolucao;
	}

	public XMLGregorianCalendar getDataVencimento() {
		return dataVencimento;
	}

	public XMLGregorianCalendar getDataAntecipacao() {
		return dataAntecipacao;
	}

	public BigDecimal getValorJurosAntecipacao() {
		return valorJurosAntecipacao;
	}

	public BigDecimal getValorLiquidoAntecipacao() {
		return valorLiquidoAntecipacao;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void setNotaFiscal(String notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public void setDtEmissao(XMLGregorianCalendar dtEmissao) {
		this.dtEmissao = dtEmissao;
	}

	public void setDtRecebimento(XMLGregorianCalendar dtRecebimento) {
		this.dtRecebimento = dtRecebimento;
	}

	public void setValorBruto(BigDecimal valorBruto) {
		this.valorBruto = valorBruto;
	}

	public void setIrf(String irf) {
		this.irf = irf;
	}

	public void setTaxaMes(BigDecimal taxaMes) {
		TaxaMes = taxaMes;
	}

	public void setDescComerciais(BigDecimal descComerciais) {
		this.descComerciais = descComerciais;
	}

	public void setValorDevolucao(BigDecimal valorDevolucao) {
		this.valorDevolucao = valorDevolucao;
	}

	public void setDataVencimento(XMLGregorianCalendar dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public void setDataAntecipacao(XMLGregorianCalendar dataAntecipacao) {
		this.dataAntecipacao = dataAntecipacao;
	}

	public void setValorJurosAntecipacao(BigDecimal valorJurosAntecipacao) {
		this.valorJurosAntecipacao = valorJurosAntecipacao;
	}

	public void setValorLiquidoAntecipacao(BigDecimal valorLiquidoAntecipacao) {
		this.valorLiquidoAntecipacao = valorLiquidoAntecipacao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
