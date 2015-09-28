/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer;

import java.util.Observable;

/**
 *
 */
public class ActualizaFacturas extends Observable{
    
    private int estado = 0;//Estado inicial

    public ActualizaFacturas(int estado) {
        this.estado = estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
        setChanged();
        notifyObservers();
    }

    public int getEstado() {
        return estado;
    }
    
}
