package com.g5.g5web.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private String rol;

}
