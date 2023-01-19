package com.example.demospringmvc;

import com.example.demospringmvc.model.Usuario;
import com.example.demospringmvc.repo.IUsuarioRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoSpringMvcApplicationTests {

    @Autowired
    private IUsuarioRepo repo;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Test
    void crearUsuarioTest() {
        Usuario usuario = new Usuario();
        usuario.setId(4);
        usuario.setUsuario("fperez");
        usuario.setClave(passwordEncoder.encode("14725"));
        Usuario retorno = repo.save(usuario);

        assertTrue(retorno.getClave().equals(usuario.getClave()));

    }
}
