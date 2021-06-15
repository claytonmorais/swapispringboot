package br.com.swapi.api.model.dao.list;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import br.com.swapi.api.model.constants.Constants;
import br.com.swapi.api.model.vo.Film;
import br.com.swapi.api.model.vo.InputParameter;
import br.com.swapi.api.model.vo.ReturnService;

public class ReturnServiceHelper implements Serializable,Constants {

	/**
	 * Serial id
	 */
	private static final long serialVersionUID = 8499983558013110698L;
	
	private static ReturnService _INSTANCE;
	
	private transient HttpServletRequest request;

	/**
	 * Construtor default
	 * 
	 * @param request objeto HttpServletRequest
	 */
	public ReturnServiceHelper(HttpServletRequest request) {
		this.request = request;
		if (_INSTANCE == null) {
			_INSTANCE =  ReturnService.class.cast(request.getServletContext().getAttribute(FILMS_ATTRIBUTE));
		}
	}
	
	/**
	 * Lista todos os filmes
	 * @return Lista de filmes
	 */
	public ReturnService listAllFilms(){
		return _INSTANCE;
	}
	
	/**
	 * Obtém o elemento pelo id
	 * @param id Id A ser Consultado
	 * @return Objeto Filme
	 */
	public Film getById(Integer id) {
		return _INSTANCE.getResults().stream().filter(item -> item.getId().equals(id)).findAny()
				  .orElse(null);
	}
	
	/**
	 * Altera a descrição do filme e Atualiza a versão
	 * 
	 * 
	 * @param film Objeto film
	 * 
	 * @param inputParameter Parametros a serem atualizados
	 * 
	 */
	public void updateDescription(Film film, InputParameter input) {
		
		List<Film> nwFilms = listAllFilms().getResults().stream().map(
					item -> {
						if (item.getId().equals(film.getId())) {
							Film instItem = item.updateDescription(input.getDescription());
							return instItem;
						}else {
							return item;
						}	
					}
		).collect(Collectors.toList());
		
		ReturnService.class.cast(request.getServletContext().getAttribute(FILMS_ATTRIBUTE)).setResults(nwFilms);
		
		return;
	}
	
	
	

}
