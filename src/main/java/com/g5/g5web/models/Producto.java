package com.g5.g5web.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    private int idProducto;
    private String nombre;
    private String descripcion;
    private double precio;
    private String imagen;
}
