package com.trainibit.usuarios.service;

import com.trainibit.usuarios.entity.Usuario;
import com.trainibit.usuarios.request.UsuarioRequest;
import com.trainibit.usuarios.response.UsuarioResponse;

import java.util.List;

public interface UsuarioService {
    List<UsuarioResponse> findAll();
    Usuario findById(Long id);
    Usuario save(UsuarioRequest usuarioRequest);
    Usuario update(Long id, UsuarioRequest usuarioRequest);
    Usuario deleteById(Long id);

}