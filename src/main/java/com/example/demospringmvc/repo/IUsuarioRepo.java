package com.example.demospringmvc.repo;

import com.example.demospringmvc.model.Persona;
import com.example.demospringmvc.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {

    Usuario findByUsuario(String usuario);
}
