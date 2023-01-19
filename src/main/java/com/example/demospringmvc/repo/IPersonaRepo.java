package com.example.demospringmvc.repo;

import com.example.demospringmvc.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

}
