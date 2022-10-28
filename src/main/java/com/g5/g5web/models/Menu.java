package com.g5.g5web.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private int idMenu;
    private String fecha;
    private List<Integer> idProductos;
}
