package br.com.swapi.api.model.util;

/**
 * Classe para Tratar os String
 * 
 * @author Clayton Morais de Oliveira
 *
 */
public class StringUtils {

	/**
	 * Limita o tamanho da String
	 * 
	 * @param inputString
	 *            string de entrada
	 * @param lenght
	 *            Tamanho máximo
	 * @return String truncada
	 */
	public static String truncate(String inputString, int lenght) {
		if (inputString == null){
			return "";
		}
		int maxLength = (inputString.length() < lenght) ? inputString.length() : lenght;
		return inputString.substring(0, maxLength);
	}
}