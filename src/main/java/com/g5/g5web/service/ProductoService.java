package com.g5.g5web.service;

import com.g5.g5web.models.Producto;

import java.util.List;

public interface ProductoService {
    public List<Producto> listarProductos();
    public Producto productoXID(int idProducto);
}
