package com.trainibit.usuarios.mapper;

import com.trainibit.usuarios.entity.Usuario;
import com.trainibit.usuarios.request.UsuarioRequest;
import com.trainibit.usuarios.response.UsuarioResponse;

import java.util.ArrayList;
import java.util.List;

public class UsuarioMapper {


    public static UsuarioResponse mapEntityToDto(Usuario usuario) {

        UsuarioResponse usuarioResponse = new UsuarioResponse();
        usuarioResponse.setId(usuario.getId());
        usuarioResponse.setName(usuario.getName());
        usuarioResponse.setLastName(usuario.getLastName());
        usuarioResponse.setBirthDate(usuario.getBirthDate());
        usuarioResponse.setEmail(usuario.getEmail());
        usuarioResponse.setPassword(usuario.getPassword());
        return usuarioResponse;
    }
    public static List<UsuarioResponse> mapListEntitytoListDto(List<Usuario> usuarios) {
        List<UsuarioResponse> usuarioResponses = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            usuarioResponses.add(mapEntityToDto(usuario));
        }
        return usuarioResponses;

    }
    public static UsuarioRequest mapDtoToEntity(Usuario usuario) {

        UsuarioRequest  usuarioRequest = new UsuarioRequest();
        usuarioRequest.setId(usuario.getId());
        usuarioRequest.setName(usuario.getName());
        usuarioRequest.setLastName(usuario.getLastName());
        usuarioRequest.setBirthDate(usuario.getBirthDate());
        usuarioRequest.setEmail(usuario.getEmail());
        usuarioRequest.Password(usuario.getPassword());
        return usuarioRequest;
    }
}
