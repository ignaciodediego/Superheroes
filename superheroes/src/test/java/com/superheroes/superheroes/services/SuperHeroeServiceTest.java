package com.superheroes.superheroes.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.superheroes.superheroes.models.SuperHeroeModel;
import com.superheroes.superheroes.repositories.SuperHeroeRepository;



@RunWith(MockitoJUnitRunner.class)
class SuperHeroeServiceTest {
	
	
	private SuperHeroeService superHeroeService; 
	/*
	@Test
	void testObtenerSuperHeroe() {
		
		
		fail("Not yet implemented");
	}

	
	@Test
	void testGuardarSuperHeroe() {
		fail("Not yet implemented");
	}
	*/

	@Test
	void testObtenerPorId() {
		//superHeroeService = Mockito.mock(SuperHeroeService.class);
		
		SuperHeroeModel superheroe = new SuperHeroeModel();
		superheroe.setId(Long.valueOf(1));
		superheroe.setNombre("Ant");
		superheroe.setPrioridad(3);
		superheroe.setSuperPoder("Pequeño");
		
		Optional<SuperHeroeModel> valor = Optional.of(superheroe);
		
		assertTrue(valor.isPresent());
		
		//Mockito.when(superHeroeService.obtenerPorId(Long.valueOf(1))).thenReturn(valor);
		
		//System.out.println(superHeroeService.obtenerPorId(Long.valueOf(1)));

	}

	/*
	@Test
	void testObtenerPorPrioridad() {
		fail("Not yet implemented");
	}
	*/
	
	@Test
	void testObtenerPorNombre() {
		
		SuperHeroeModel superheroe = new SuperHeroeModel();
		superheroe.setNombre("Ironman");
		assertEquals(superheroe.getNombre(), "Ironman" );
	}
/*
	@Test
	void testEliminarSuperHeroe() {
		fail("Not yet implemented");
	}
	*/

}
