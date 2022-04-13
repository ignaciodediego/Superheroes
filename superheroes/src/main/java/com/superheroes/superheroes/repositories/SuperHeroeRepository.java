package com.superheroes.superheroes.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.superheroes.superheroes.models.SuperHeroeModel;

@Repository
public interface SuperHeroeRepository extends CrudRepository<SuperHeroeModel, Long> {
    public abstract ArrayList<SuperHeroeModel> findByPrioridad(Integer prioridad);
    
    public abstract ArrayList<SuperHeroeModel> findByNombre(String nombre);

}
