package com.g5.g5web.controller;

import com.g5.g5web.models.Menu;
import com.g5.g5web.service.MenuService;
import com.g5.g5web.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class MenuController {

    @Autowired
    private MenuService menuService;

    @Autowired
    private ProductoService productoService;

    @GetMapping("/menus")
    public String listarMenus(Model model) {
        model.addAttribute("menus", menuService.listarMenus());
        return "menus";
    }

    @GetMapping("/menu")
    public String guardarMenu(Model model) {
        Menu menu = new Menu();

        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd");
        String stringDate= DateFor.format(date);
        menu.setFecha(stringDate);

        model.addAttribute("menu", menu);
        model.addAttribute("productos", productoService.listarProductos());
        return "menu";
    }

    @PostMapping("/menu")
    public String guardarMenu(Menu menu) {
        menuService.guardarMenu(menu);
        return "redirect:/menus";
    }

    @GetMapping("/menu/editar/{id}")
    public String editarMenu(@PathVariable int id, Model model) {
        model.addAttribute("menu", menuService.menuXID(id));
        model.addAttribute("productos", productoService.listarProductos());

        return "menu";
    }

    @GetMapping("/menu/eliminar")
    public String eliminarMenu(@RequestParam("idmenu") String idMenu) {
        menuService.eliminarMenu(idMenu);
        return "redirect:/menus";
    }


}
