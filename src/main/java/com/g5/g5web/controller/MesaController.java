/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5.g5web.controller;


import com.g5.g5web.models.Mesa;
import com.g5.g5web.service.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Windows !0
 */

@Controller
public class MesaController {
   
    @Autowired
 
    MesaService mesaService;
    
    @GetMapping("/listado")
    public String listadoMesas(Model model) {
        var mesas = mesaService.listarMesa();

        model.addAttribute("mesas", mesas);

        return "crudmesa";
    }
    
    @PostMapping("/seleccionmesa")
    public String seleccionMesa(Mesa mesa, Model model){
        int m = mesaService.seleccionMesa(mesa.getNromesa());
        if(m == 1) {
            return "pedidos";
        }else{
            model.addAttribute("mensajemesa", "Mesa incorrecta");
            return "seleccionmesa";
        }
    }
    
    @GetMapping("/agregarmesa")
    public String agregarMesa(Mesa mesa) {
        return "modificarmesa";
    }

    
    @PostMapping("/guardar")
     public String guardarMesa (Mesa mesa,Model model)  {
        mesaService.guardar(mesa);
    
        return "crudmesa";
     }
     
    @GetMapping("/editar/{nromesa}")
    public String editarMesa(Mesa mesa, Model model) {
        mesa = mesaService.encontrarMesa(mesa);
        model.addAttribute("mesa",mesa);
        return "modificarmesa";
    }

    @GetMapping("/eliminar{nromesa}")
    public String eliminarMesa(Mesa mesa) {
        mesaService.eliminar(mesa);
        return "crudmesa";
    }
}
