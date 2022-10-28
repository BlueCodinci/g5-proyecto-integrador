package com.g5.g5web.service;

import com.g5.g5web.models.Usuario;


public interface UsuarioService {
     public int login(String email, String password);
     public int registrar(Usuario usuario);
}
