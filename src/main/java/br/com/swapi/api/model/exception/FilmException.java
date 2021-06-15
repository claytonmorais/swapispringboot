package br.com.swapi.api.model.exception;

public class FilmException extends Exception {

	/**
	 * Serial id
	 */
	private static final long serialVersionUID = 7344015246384446900L;

	/**
	 * Construtor com parametros
	 * 
	 * @param message Mensagem
	 * 
	 * @param cause Objeto de exceção
	 * 
	 */
	public FilmException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Construtor com parametros
	 * 
	 * @param message Mensagem
	 */
	public FilmException(String message) {
		super(message);
	}
	
	

}
