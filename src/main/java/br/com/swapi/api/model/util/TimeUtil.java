package br.com.swapi.api.model.util;

import java.util.Calendar;
import java.util.Date;

/**
 * Classe para Tratamentos de Timestamp
 * 
 * @author Clayton Morais de Oliveira
 *
 */
public class TimeUtil {


	/**
	 * Adiciona os segundos a data informada
	 * @param dateValue Objeto Date
	 * @param seconds Segundos a serem adicionados
	 * @return Timemilis com os segundos adicionados
	 */
	public static Date addSecondsByTime(Date dateValue,int seconds){
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateValue);
		cal.add(Calendar.SECOND, seconds); // adiciona segundo na data
		return new Date(cal.getTimeInMillis());
	}
	
	/**
	 * Subtrai os segundos a data informada
	 * @param dateValue Objeto Date
	 * @param seconds Segundos a serem subtraidos
	 * @return Timemilis com os segundos subtraido
	 */
	public static Date subSecondsByTime(Date dateValue,int seconds){
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateValue);
		cal.add(Calendar.SECOND, (cal.get(Calendar.SECOND)-seconds)); // adiciona segundo na data		
		return new Date(cal.getTimeInMillis());
	}
	
}
