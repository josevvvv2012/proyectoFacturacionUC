/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Subject {

    private ArrayList<Observador> observadores = new ArrayList<Observador>();
    private double[] data;
    private int dias;

    public void setState(double[] state, int dias) {
        data = state;
        notifyAllObservers();
    }

    public double[] getData() {
        return data;
    }

    public int getDias() {
        return dias;
    }
    
    public void agregar(Observador observer) {
        observadores.add(observer);
    }

    public void notifyAllObservers() {
        for (Observador observer : observadores) {
           // observer.update();
        }
    }

}