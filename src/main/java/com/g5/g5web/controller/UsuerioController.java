package com.g5.g5web.controller;

import com.g5.g5web.models.Usuario;
import com.g5.g5web.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuerioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("usuario", new Usuario());

        return "login";
    }

    @PostMapping("/login")
    public String login(Usuario usuario, Model model){
        int res = usuarioService.login(usuario.getEmail(), usuario.getPassword());
        if(res == 1) {
            return "redirect:/";
        }else{
            model.addAttribute("mensaje", "Credenciales incorrectas");
            return "login";
        }
    }



}
