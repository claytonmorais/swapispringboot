package br.com.swapi.api.model.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe utilitária para Date
 * 
 * @author Clayton Morais de Oliveira
 *
 */
public class DateUtil {

	/**
	 * Transforma uma String em java.sql.Date
	 * @param dataString data a ser transformada
	 * @param mask mascara
	 * @return date convertido
	 * @throws ParseException 
	 * @throws Exception
	 */
	public static final Date stringToDate(String dataString, String mask) throws ParseException{
		DateFormat fmt = new SimpleDateFormat(mask);
		return fmt.parse(dataString);
	}
	
	/**
	 * Transforma em String
	 * @param dataString data a ser transformada
	 * @param mask mascara
	 * @return date convertido
	 * @throws Exception
	 */
	public static final String dateToString(Date dateValue, String mask){
		DateFormat fmt = new SimpleDateFormat(mask);
		return fmt.format(dateValue);
	}	

	/**
	 * Obtém a dataHora Atual
	 * @return Data/Hora Atual
	 */
	public static Date getActualDate(){
		return new Date();
	}
	
	
}
