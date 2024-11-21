package com.trainibit.usuarios.service;

import com.trainibit.usuarios.entity.Usuario;
import com.trainibit.usuarios.response.UsuarioResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UsuarioService {
    List<UsuarioResponse> findAll();
    Usuario findById(Long id);
    Usuario save(Usuario usuario);
    Usuario update(Long id, Usuario usuario);
    void deleteById(Long id);
}
