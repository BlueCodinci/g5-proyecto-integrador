package com.g5.g5web.controller;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PostMapping;

import com.g5.g5web.models.Usuario;
import com.g5.g5web.service.MesaService;
import com.g5.g5web.service.ProductoService;
import com.g5.g5web.service.UsuarioService;

@Controller
public class RecuperarController {

	


	    @Autowired
	    UsuarioService usuarioService;
	    
	    @Autowired
		  ProductoService productoService;

	    
	    
	    @GetMapping("/recuperar")
		public String cargarFormRecuperar(Model model) {
		model.addAttribute("usuario", new Usuario());
			
		return "recuperar";	
		}

		@PostMapping("/usuario/grabar")
		public String grabarRegistro(@ModelAttribute Usuario usuario, Model model) { // QmodelAtributte sirva para grabar
			
			System.out.println(usuario);
			try {
				//repou.save(usuario);
				model.addAttribute("success", "Registro Exitoso");
			} catch (Exception e) {
				model.addAttribute("error", "Error al registrar" + e.getMessage());
			}
			return "login";
		}
		
		@GetMapping("/reporte")
	    public String listarReporte(Model model) {
//			var reporte = productoService.listarProductos();
//
//	        model.addAttribute("lstCompras", reporte);
	        return "listaDeCompras";
	    }
		

	}

