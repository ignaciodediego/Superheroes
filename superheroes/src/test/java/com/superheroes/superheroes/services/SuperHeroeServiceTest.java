package com.superheroes.superheroes.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.superheroes.superheroes.models.SuperHeroeModel;
import com.superheroes.superheroes.repositories.SuperHeroeRepository;

class SuperHeroeServiceTest {
	
	/*
	@Test
	void testObtenerSuperHeroe() {
		
		
		fail("Not yet implemented");
	}

	
	@Test
	void testGuardarSuperHeroe() {
		fail("Not yet implemented");
	}
	

	@Test
	void testObtenerPorId() {
	

	}

	
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
