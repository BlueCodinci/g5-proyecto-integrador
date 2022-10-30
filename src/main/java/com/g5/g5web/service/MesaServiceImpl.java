/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5.g5web.service;

import com.g5.g5web.models.Mesa;
import com.g5.g5web.models.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Windows !0
 */
@Service
public class MesaServiceImpl implements MesaService{

      Mesa[] mesas = {
                new Mesa("M0001","Mesa1"),
                new Mesa("M0002","Mesa2"),
                new Mesa("M0003","Mesa3"),
                 new Mesa("M0004","Mesa4")
        };

    @Override
    public int seleccionMesa(String nromesa) {
       for (Mesa m : mesas) {
            if (m.getNromesa().equals(nromesa)) {
                return 1;
            }
        }

        return 0;
    }

    @Override
    public List<Mesa> listarMesa() {

        return null;
    }

    @Override
    public void guardar(Mesa mesa) {

    }

    @Override
    public void eliminar(Mesa mesa) {

    }

    @Override
    public Mesa encontrarMesa(Mesa mesa) {
        return null;
    }
    
}
