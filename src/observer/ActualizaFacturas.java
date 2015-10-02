/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer;

import Modelo.Producto;
import java.util.Observable;

/**
 *
 */
//CLASE PARA ACTUALIZAR LAS FACTURAS
public class ActualizaFacturas extends Observable{
    
    private Producto estado = null;//Estado inicial

    public ActualizaFacturas(Producto estado) {
        this.estado = estado;
    }

    public void setEstado(Producto estado) {
        this.estado = estado;
        setChanged();
        notifyObservers();
    }

    public Producto getEstado() {
        return estado;
    }
    
}
