package br.com.swapi.api.model.starwars.service;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.swapi.api.model.constants.Constants;
import br.com.swapi.api.model.exception.FilmException;
import br.com.swapi.api.model.vo.ReturnService;

@Component
public class FilmService implements Constants{
	
	
	

	/**
	 * Servi�o que retorna a lista de filmes
	 * @return
	 * @throws FilmException 
	 */
	public ReturnService listAllFilmsByService() throws FilmException{
		
		 try {
			HttpClient client = HttpClientBuilder.create().build();   
			HttpResponse resp = client.execute(new HttpGet(URL_STARWARS_API_LIST_FILMS));			
		    int statusCode = resp.getStatusLine().getStatusCode();
		    if (statusCode != 200) {
		    	throw new FilmException( new StringBuilder("Erro ao listar os filmes: HTTP STATUS: [").append(statusCode).append(']').toString());
		    }			 
		    ObjectMapper mapper = new ObjectMapper();		    
		    return mapper.readValue(EntityUtils.toString(resp.getEntity()),ReturnService.class);
			
		} catch (IOException e) {
			 throw new FilmException("Erro ao invocar o servi�o de listar Filmes",e);
		}
		


	}

}
