package br.com.swapi.api.test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Classe Abstrata de Teste para carregar informações do Springboot
 *  
 * @author Clayton Morais de Oliveira
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
@ActiveProfiles("dev")
public abstract class AbstractTest {}
