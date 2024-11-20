package com.trainibit.usuarios.controller;

import com.trainibit.usuarios.entity.Usuario;
import com.trainibit.usuarios.service.UsuarioService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> getUsuario() {
        return ResponseEntity.ok(usuarioService.findAll());


    }

@GetMapping("{id}") //Permite realizar la busqueda por ID
    public Usuario obtenerUsuarioPorId(@PathVariable long id) {
        return usuarioService.findById(id);
}
}
