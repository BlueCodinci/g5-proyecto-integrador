package com.g5.g5web.service;

import com.g5.g5web.models.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

     Usuario[] usuarios = {
                new Usuario("Juan", "Perez", "admin@email.com", "123", "ADMIN"),
                new Usuario("Pedro", "Perez", "usuario@email.com", "123", "USER")

        };
    
    @Override
    public int login(String email, String password) {
      

        // Verificar si el usuario existe en el array
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(email) && u.getPassword().equals(password)) {
                return 1;
            }
        }

        return 0;
    }

    @Override
    public int registrar(Usuario usuario) {
         return 0;
      
    }
}
