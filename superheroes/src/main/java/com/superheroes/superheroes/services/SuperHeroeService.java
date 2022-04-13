package com.superheroes.superheroes.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superheroes.superheroes.models.SuperHeroeModel;
import com.superheroes.superheroes.repositories.SuperHeroeRepository;

@Service
public class SuperHeroeService {

	
	@Autowired
    SuperHeroeRepository superHeroeRepository;
	
	public ArrayList<SuperHeroeModel> obtenerSuperHeroe(){
        return (ArrayList<SuperHeroeModel>) superHeroeRepository.findAll();
    }

    public SuperHeroeModel guardarSuperHeroe(SuperHeroeModel superHeroe){
        return superHeroeRepository.save(superHeroe);
    }
    
    public Optional<SuperHeroeModel> obtenerPorId(Long id){
        return superHeroeRepository.findById(id);
    }


    public ArrayList<SuperHeroeModel>  obtenerPorPrioridad(Integer prioridad) {
        return superHeroeRepository.findByPrioridad(prioridad);
    }
    
    public ArrayList<SuperHeroeModel>  obtenerPorNombre(String nombre) {
        return superHeroeRepository.findByNombre(nombre);
    }
    
    public boolean eliminarSuperHeroe(Long id) {
        try{
        	superHeroeRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
	
}
