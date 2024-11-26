package com.trainibit.usuarios.service.impl;

import com.trainibit.usuarios.entity.Usuario;
import com.trainibit.usuarios.mapper.UsuarioMapper;
import com.trainibit.usuarios.repository.UsuarioRepository; //Ayuda a la consulta de la bases de datos
import com.trainibit.usuarios.request.UsuarioRequest;
import com.trainibit.usuarios.response.UsuarioResponse;
import com.trainibit.usuarios.service.UsuarioService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

@ComponentScan
@Service
public class UsuarioServiceImpl implements UsuarioService {
    //iNYECCIÓN POR CAMPO
    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public List<UsuarioResponse> findAll() {
        return UsuarioMapper.mapListEntitytoListDto(usuarioRepository.findAll());
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuario con id " + id + " no encontrado"));
    }

    @Override           //tipo de dato  nombre de la variable
    public Usuario save(UsuarioRequest usuarioRequest) {
        return usuarioRepository.save(UsuarioMapper.mapDtoToEntity(usuarioRequest));
    }

    @Override
    public Usuario update(Long id, UsuarioRequest usuarioRequest) {
        // Primero buscamos el usuario por ID
        Usuario usuarioExistente = usuarioRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuario con id " + id + " no encontrado"));
        // Mapear el DTO (usuarioRequest) al Usuario
        Usuario usuarioActualizado = UsuarioMapper.mapDtoToEntity(usuarioRequest);
        // Guardamos el usuario actualizado
        return usuarioRepository.save(usuarioExistente);
    }

    @Override
    public Usuario deleteById(Long id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Usuario con id" + id + " no encontrado");
        }
        return null;
    }
}