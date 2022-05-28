package com.superheroes.superheroes.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.superheroes.superheroes.models.SuperHeroeModel;
import com.superheroes.superheroes.services.SuperHeroeService;

@RestController
@RequestMapping("/superHeroe")
public class SuperHeroeController {
	
	
    @Autowired
    public SuperHeroeService superHeroeService;

    @GetMapping()
    public ArrayList<SuperHeroeModel> obtenerSuperHeroes(){
        return superHeroeService.obtenerSuperHeroe();
    }

    @PostMapping()
    public SuperHeroeModel guardarSuperHeroe(@RequestBody SuperHeroeModel superHeroe){
        return this.superHeroeService.guardarSuperHeroe(superHeroe);
    }
    
    @GetMapping( path = "/{id}")
    public Optional<SuperHeroeModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.superHeroeService.obtenerPorId(id);
    }

    /*
    @GetMapping("/query")
    public ArrayList<SuperHeroeModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.superHeroeService.obtenerPorPrioridad(prioridad);
    }*/
    
    @GetMapping("/query")
    public ArrayList<SuperHeroeModel> obtenerUsuarioPorNombre(@RequestParam("nombre") String nombre){
        return this.superHeroeService.obtenerPorNombre(nombre);
    }    
    
    
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.superHeroeService.eliminarSuperHeroe(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }

}
