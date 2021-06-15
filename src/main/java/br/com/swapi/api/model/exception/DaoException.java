package br.com.swapi.api.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DaoException extends RuntimeException {

	/**
	 * Serial id
	 */
	private static final long serialVersionUID = 320544027921912540L;

	/**
	 * Construtor com parametros
	 * 
	 * @param message Mensagem
	 * 
	 * @param cause Objeto de exceção
	 * 
	 */
	public DaoException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Construtor com parametros
	 * 
	 * @param message Mensagem
	 */
	public DaoException(String message) {
		super(message);
	}
	
	

}
