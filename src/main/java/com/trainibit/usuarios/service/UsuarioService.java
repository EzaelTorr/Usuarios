package com.trainibit.usuarios.service;

import com.trainibit.usuarios.entity.Usuario;
import com.trainibit.usuarios.request.UsuarioRequest;
import com.trainibit.usuarios.response.UsuarioResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UsuarioService {
    List<UsuarioResponse> findAll();
    Usuario findById(Long id);
    Usuario save(UsuarioRequest usuarioRequest);
    Usuario update(Long id, Usuario usuario);
    void deleteById(Long id);
   /* UsuarioResponse save(UsuarioResponse usuarioResponse);
    UsuarioResponse update(Long id, UsuarioResponse usuarioResponse);
    UsuarioResponse delete(Long id);
    UsuarioRequest delete(Usuario usuario);
    UsuarioRequest deleteAll();
   */
}
