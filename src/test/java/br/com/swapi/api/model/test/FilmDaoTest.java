package br.com.swapi.api.model.test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;

import br.com.swapi.api.model.bean.FilmBean;
import br.com.swapi.api.model.constants.Constants;
import br.com.swapi.api.model.exception.DaoException;
import br.com.swapi.api.model.vo.Film;
import br.com.swapi.api.model.vo.InputParameter;
import br.com.swapi.api.model.vo.ObjectResponse;
import br.com.swapi.api.model.vo.ReturnService;
import br.com.swapi.api.test.AbstractTest;

public class FilmDaoTest extends AbstractTest implements Constants {
	
	@Autowired
	private transient FilmBean dao;
	
	private static MockHttpServletRequest request;
	
	static {
		request = new MockHttpServletRequest();
		request.setServerName("http://mock.local");
		request.setRequestURI("/api");
		request.getServletContext().setAttribute(FILMS_ATTRIBUTE, new FilmServiceMock().listAllFilmsByService());
		
		
		
	}
	
	@Test
	public void listAllSuccess() {
		ReturnService ret = dao.listAll(request);
		Assert.assertTrue(ret != null);
	}
	
	@Test
	public void findByIdSuccess() {
		Film ret = dao.findById(request,1);
		Assert.assertTrue(ret != null);
	}
	
	@Test
	public void findByIdFail() {
		try {
			Film ret = dao.findById(request,99);
			Assert.fail(ret.getTitle());
		}catch (DaoException e){
			Assert.assertTrue(e.getMessage(),true);
		}
	}
	
	@Test
	public void updateDescriptionSucess() {
		InputParameter input = new InputParameter();
		input.setDescription("nova descriçao");
		ObjectResponse ret = dao.updateDescription(request, 1, input);
		Assert.assertTrue(ret != null);	
	}

}
