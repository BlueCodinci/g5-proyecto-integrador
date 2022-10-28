package com.g5.g5web.service;

import com.g5.g5web.models.Menu;
import com.g5.g5web.models.Producto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Override
    public List<Menu> listarMenus() {
        String uri = "http://localhost:8080/menus";
        RestTemplate restTemplate = new RestTemplate();
        List<Menu> result = restTemplate.getForObject(uri, List.class);
        return result;
    }

    @Override
    public void guardarMenu(Menu menu) {
        String uri = "http://localhost:8080/menu";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(uri, menu, Menu.class);
    }

    @Override
    public String menuXFecha(String fecha) {
        return null;
    }

    @Override
    public void actualizarMenu(Menu menu) {

    }

    @Override
    public String eliminarMenu(String idMenu) {
        String uri = "http://localhost:8080/menu?idMenu=" + idMenu;
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(uri);
        return "Menu eliminado";
    }

    @Override
    public String listarProductosMenu(String fecha) {
        return null;
    }

    @Override
    public Menu menuXID(int idMenu) {
        String uri = "http://localhost:8080/menu/" + idMenu;
        RestTemplate restTemplate = new RestTemplate();
        Menu result = restTemplate.getForObject(uri, Menu.class);
        return result;
    }
}
