package br.com.swapi.api.model.vo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Classe de Dados de autenticação
 * 
 * @author Clayton Morais de Oliveira
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Film implements Serializable {

	/**
	 * Serial id
	 */
	private static final long serialVersionUID = 8260132585702238499L;

	private String title;
	
	@JsonProperty("episode_id")
	private Integer id;
	
	@JsonProperty("opening_crawl")
	private String openigCrawl;
	
	private String director;
	
	private String producer;
	
	@JsonProperty("release_date")
	private String releaseDate;
	
	private List<String> characters;
	
	private List<String> planets;	
	
	private List<String> starships;
	
	private List<String> vehicles;
	
	private List<String> species;
	
	private String created;
	
	private String edited;
	
	private String url;
	
	private Integer version;

	/**
	 * Construtor default com parametros
	 * 
	 * @param title Título do filme
	 * 
	 * @param id Identificador do Filme
	 * 
	 * @param openigCrawl Descrição do Filme
	 * 
	 * @param director Diretor do Filme
	 * 
	 * @param producer Produtora do Filme
	 * 
	 * @param releaseDate Data de lançamento
	 * 
	 * @param characters Elenco do filme
	 * 
	 * @param planets Planetas
	 * 
	 * @param starships Nave espacial
	 * 
	 * @param vehicles Veiculos utilizados no filme
	 * 
	 * @param species Especies 
	 * 
	 * @param created Criado em 
	 * 
	 * @param edited Editado em
	 * 
	 * @param url Url 
	 * 
	 * @param version Versão
	 * 
	 * 
	 */
	@JsonCreator
	public Film(
			@JsonProperty("title") String title, 
			@JsonProperty("episode_id") Integer id, 
			@JsonProperty("opening_crawl") String openigCrawl, 
			@JsonProperty("director") String director, 
			@JsonProperty("producer") String producer, 
			@JsonProperty("release_date") String releaseDate,
			@JsonProperty("characters") List<String> characters, 
			@JsonProperty("planets") List<String> planets, 
			@JsonProperty("starships") List<String> starships, 
			@JsonProperty("vehicles") List<String> vehicles, 
			@JsonProperty("species") List<String> species, 
			@JsonProperty("created") String created, 
			@JsonProperty("edited") String edited,
			@JsonProperty("url") String url) {
		
		super();
		this.title = title;
		this.id = id;
		this.openigCrawl = openigCrawl;
		this.director = director;
		this.producer = producer;
		this.releaseDate = releaseDate;
		this.characters = characters;
		this.planets = planets;
		this.starships = starships;
		this.vehicles = vehicles;
		this.created = created;
		this.species = species;
		this.edited = edited;
		this.url = url;
		this.version = 1;
		
	}

	/**
	 * Retorna o atributos
	 * @return Valor do objeto title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Retorna o atributos
	 * @return Valor do objeto id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Retorna o atributos
	 * @return Valor do objeto openigCrawl
	 */
	public String getOpenigCrawl() {
		return openigCrawl;
	}

	/**
	 * Retorna o atributos
	 * @return Valor do objeto director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * Retorna o atributos
	 * @return Valor do objeto producer
	 */
	public String getProducer() {
		return producer;
	}

	/**
	 * Retorna o atributos
	 * @return Valor do objeto releaseDate
	 */
	public String getReleaseDate() {
		return releaseDate;
	}

	/**
	 * Retorna o atributos
	 * @return Valor do objeto characters
	 */
	public List<String> getCharacters() {
		return characters;
	}

	/**
	 * Retorna o atributos
	 * @return Valor do objeto planets
	 */
	public List<String> getPlanets() {
		return planets;
	}	

	/**
	 * Retorna o atributos
	 * @return Valor do objeto starships
	 */
	public List<String> getStarships() {
		return starships;
	}

	/**
	 * Retorna o atributos
	 * @return Valor do objeto vehicles
	 */
	public List<String> getVehicles() {
		return vehicles;
	}

	/**
	 * Retorna o atributos
	 * @return Valor do objeto created
	 */
	public String getCreated() {
		return created;
	}

	/**
	 * Retorna o atributos
	 * @return Valor do objeto edited
	 */
	public String getEdited() {
		return edited;
	}

	/**
	 * Retorna o atributos
	 * @return Valor do objeto url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Retorna o atributos
	 * @return Valor do objeto species
	 */
	public List<String> getSpecies() {
		return species;
	}

	/**
	 * Retorna o atributos
	 * @return Valor do objeto version
	 */
	public Integer getVersion() {
		return version;
	}
	
	/**
	 * Atualiza a descrição, atualizando a versão do filme
	 * @param description Descrição do filme
	 * @return O próprio objeto
	 */
	public Film updateDescription (String description) {
		this.openigCrawl = description;
		this.version = version+1;
		return this;
	}

}