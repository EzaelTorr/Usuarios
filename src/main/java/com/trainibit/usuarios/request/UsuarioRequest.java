package com.trainibit.usuarios.request;

import lombok.NonNull;

import java.time.LocalDate;

public class UsuarioRequest {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private LocalDate birthDate;
    private int edad;


    public void setId(Long id) {
    }

    public void setName(@NonNull String name) {
    }
}

