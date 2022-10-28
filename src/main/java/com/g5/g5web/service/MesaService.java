/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5.g5web.service;

import com.g5.g5web.models.Mesa;
import java.util.List;

/**
 *
 * @author Windows !0
 */
public interface MesaService {
    
    public int seleccionMesa(String nromesa);
    public List<Mesa>listarMesa();
    
    public void guardar(Mesa mesa);
    
    
    public void eliminar(Mesa mesa);
    
    public Mesa encontrarMesa(Mesa mesa);
}
