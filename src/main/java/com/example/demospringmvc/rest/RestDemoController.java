package com.example.demospringmvc.rest;

import com.example.demospringmvc.model.Persona;
import com.example.demospringmvc.repo.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestDemoController {

    @Autowired
    private IPersonaRepo repo;

    @GetMapping
    @RequestMapping("/lista-personas")
    public List<Persona> listPerson(){
        return repo.findAll();
    }

    @PostMapping
    @RequestMapping("insert-person")
    public void insertPerson(@RequestBody Persona persona){
        repo.save(persona);
    }

    @PutMapping
    @RequestMapping("/update-person")
    public void updatePerson(@RequestBody Persona persona){
        repo.save(persona);
    }

    @DeleteMapping
    @RequestMapping("/delete-person/{id}")
    public void deletePerson(@PathVariable("id") Integer id){
        repo.deleteById(id);
    }
}
