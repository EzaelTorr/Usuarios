package com.trainibit.usuarios.service.impl;

import com.trainibit.usuarios.entity.Usuario;
import com.trainibit.usuarios.repository.UsuarioRepository; //Ayuda a la consulta de la bases de datos
import com.trainibit.usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsuarioServiceImpl implements UsuarioService {
    //iNYECCIÓN POR CAMPO
    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).get();
    }

    public Usuario guardaUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
        return usuario;
    }
}