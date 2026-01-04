package br.com.aevee.nsPortFinanc.Excel;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)  
public @interface ExcelReaderColumnAnnotation {

	public String cellCoordiante();
	public boolean required();
}
