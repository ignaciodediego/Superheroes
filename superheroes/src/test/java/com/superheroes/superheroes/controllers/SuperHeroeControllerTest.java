package com.superheroes.superheroes.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.superheroes.superheroes.models.SuperHeroeModel;
import com.superheroes.superheroes.services.SuperHeroeService;



@RunWith(MockitoJUnitRunner.class)
class SuperHeroeControllerTest {

	@Mock
	public SuperHeroeService superHeroeService = mock(SuperHeroeService.class);
	
	@InjectMocks
    private SuperHeroeController controlador;
	
	
	@Before
    public void setUp() {
		
		
		SuperHeroeModel sh1 = new SuperHeroeModel((long) 10 , "Pedro", "volar", 1);
		
		//Cuando llames a este método más adelante devuelve el objeto creado???
		when(superHeroeService.obtenerPorId(any(Long.class))).thenReturn(Optional.of(sh1));
	}
	
	/*
	@Test
	void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
    public void testObtenerSuper() {
		
		Optional<SuperHeroeModel> valor = controlador.obtenerUsuarioPorId((long) 10);
		
        assertEquals("Pedro", valor.get().getNombre());
    }

}
