package com.g5.g5web.service;

import com.g5.g5web.models.Menu;
import com.g5.g5web.models.Producto;

import java.util.List;

public interface MenuService {
    public List<Menu> listarMenus();
    public void guardarMenu(Menu menu);
    public String menuXFecha(String fecha);
    public void actualizarMenu(Menu menu);
    public String eliminarMenu(String idMenu);
    public String listarProductosMenu(String fecha);

    public Menu menuXID(int idMenu);
}
