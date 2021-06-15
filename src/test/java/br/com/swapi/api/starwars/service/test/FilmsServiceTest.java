package br.com.swapi.api.starwars.service.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.swapi.api.model.exception.FilmException;
import br.com.swapi.api.model.starwars.service.FilmService;
import br.com.swapi.api.model.vo.ReturnService;


public class FilmsServiceTest {
	
	private transient static FilmService service;
	
	static { 
		service = new FilmService();
	}
	
	@Test
	public void listAllFilmsSuccess() {
		
		ReturnService list;
		
		try {
			
			list = service.listAllFilmsByService();
			Assert.assertTrue(list != null);
		} catch (FilmException e) {
			Assert.fail(e.getMessage());
		}
				
	}

}
