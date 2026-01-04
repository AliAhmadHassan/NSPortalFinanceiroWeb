package br.com.aevee.nsPortFinanc.Excel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) 
public @interface ExcelWriterColumnAnnotation {

	public Class<?> alteraCelula() default Object.class;
	public String defaultValue() default "";
	public String columnTitle();
}
