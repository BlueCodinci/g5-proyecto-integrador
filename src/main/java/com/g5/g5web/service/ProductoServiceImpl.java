package com.g5.g5web.service;

import com.g5.g5web.models.Producto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Override
    public List<Producto> listarProductos() {
        String uri = "http://localhost:8080/productos";
        RestTemplate restTemplate = new RestTemplate();
        List<Producto> result = restTemplate.getForObject(uri, List.class);
        return result;
    }

    @Override
    public Producto productoXID(int idProducto) {
        return null;
    }
}
