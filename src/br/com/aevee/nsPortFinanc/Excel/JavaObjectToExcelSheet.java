package br.com.aevee.nsPortFinanc.Excel;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class JavaObjectToExcelSheet {
	
	private OutputStream out;
	private Object javaObject;
	private XSSFWorkbook wb = new XSSFWorkbook();
	private XSSFSheet sheet = this.wb.createSheet();
	private String fileName;


	public void createExcelSheet(ArrayList<?> javaObjects, String fileName)throws Exception{
		
		this.fileName = fileName;
		
		this.createBody(javaObjects);
		
		this.createFile();

		this.downloadExcelSheet();
	}

	private void createFile() throws IOException {

		HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
		
		response.setContentType("application/octet-stream;charset=UTF-8");
		 
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Content-Disposition", "attachment; filename=" + this.fileName + ".xlsx");

		this.out = response.getOutputStream();
	}
	
	private void createHeader(){

		Field[] declaredFields = this.javaObject.getClass().getDeclaredFields();
		int coluna = 0;
		XSSFRow row = this.sheet.createRow(0);
		for (Field field : declaredFields) {
			
			if(!field.isAnnotationPresent(ExcelWriterColumnAnnotation.class)){
				continue;
			}
			
			ExcelWriterColumnAnnotation annotation = field.getAnnotation(ExcelWriterColumnAnnotation.class);

			row.createCell(coluna++).setCellValue(annotation.columnTitle());
		}
	}

	@SuppressWarnings("unchecked")
	private void createRow(Object javaObject, int linha) throws Exception{
		
		if(javaObject == null){
			return;
		}
		
		boolean primeiraLeitura = this.javaObject == null;
		
		if(primeiraLeitura){
			this.javaObject = javaObject;
			this.createHeader();
		}
		
		int coluna = 0;

		XSSFRow row = this.sheet.createRow(linha);
		
		Field[] declaredFields = javaObject.getClass().getDeclaredFields();
		
		
		for (Field field : declaredFields) {
			
			
			field.setAccessible(true);
			
			Object valorColuna = field.get(javaObject);
			
			XSSFCell createCell = row.createCell(coluna);
			
			if(!field.isAnnotationPresent(ExcelWriterColumnAnnotation.class)){
				continue;
			}
			
			ExcelWriterColumnAnnotation annotation = field.getAnnotation(ExcelWriterColumnAnnotation.class);
			
			//Class<?> alteraCelula = annotation.alteraCelula();
			/*if(alteraCelula != Object.class){
				try {
					AlteraCelula<IntencaoCompraCSV> alt = (AlteraCelula<IntencaoCompraCSV>)alteraCelula.newInstance();
					alt.alteraCelula(createCell, (IntencaoCompraCSV)javaObject, this.wb);
				} catch (Exception e) {
				}
			}*/
			
			if(valorColuna == null 
					|| valorColuna.toString().trim().isEmpty() 
					|| valorColuna.equals("null") 
					|| ((valorColuna instanceof Double)&&((Double)valorColuna) == 0)){
				valorColuna = annotation.defaultValue();
				createCell.setCellValue("" + valorColuna);
			}
			else if((valorColuna instanceof BigDecimal)){
				createCell.setCellValue("" + valorColuna.toString().replace('.', ','));
			}
			else if((valorColuna instanceof XMLGregorianCalendar)){
				createCell.setCellValue("" + new br.com.aevee.nsPortFinanc.web.DateConverter().getAsString(null, null, valorColuna));
			}
			else{
				createCell.setCellValue("" + valorColuna);
			}
			coluna++;
		}

	}
	
	private void createBody(ArrayList<?> javaObjects) throws Exception{
		int k = 1;
		for (Object javaObject : javaObjects) {
			this.createRow(javaObject, k++);
		}
	}
	
	private void downloadExcelSheet(){

		try {
			this.wb.write(this.out);

		} catch (Exception e) {

		} finally {
			if (this.out != null) {
				try {
					this.out.flush();
					this.out.close();

					FacesContext.getCurrentInstance().responseComplete();
				} catch (Exception e) {

				}
			}
		}
	}
}
