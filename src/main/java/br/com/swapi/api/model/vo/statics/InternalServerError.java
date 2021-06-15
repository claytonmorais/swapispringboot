package br.com.swapi.api.model.vo.statics;

import br.com.swapi.api.model.vo.ObjectResponse;


public class InternalServerError extends ObjectResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3760853210902578059L;

	public InternalServerError() {		
		super("Erro interno no servidor. Contate o administrador.");		
	}

}
