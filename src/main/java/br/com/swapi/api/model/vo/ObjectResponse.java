package br.com.swapi.api.model.vo;

import java.io.Serializable;

/**
 * Classe para Tratar os Retornos de Negocio
 * 
 * @author Clayton Morais de Oliveira
 *
 */
public class ObjectResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3465927850655752542L;
	
	private String detail;

	/**
	 * Construtor com parametros
	 * @param detail Mensagem
	 */
	public ObjectResponse(String detail) {
		this.detail = detail;
	}

	/**
	 * Retorna o valor de detail
	 * @return the detail
	 */
	public String getDetail() {
		return detail;
	}
	
	
	
	

}
