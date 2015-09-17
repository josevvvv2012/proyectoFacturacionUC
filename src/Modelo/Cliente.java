/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author negro
 */
public class Cliente {
    
    int CedulaCliente;
    String nombreCliente;
    String DireccionCliente;
    String TelefonoCliente;
    String CuidadCliente;

    public Cliente(int CedulaCliente, String nombreCliente, String DireccionCliente, String TelefonoCliente, String CuidadCliente) {
        this.CedulaCliente = CedulaCliente;
        this.nombreCliente = nombreCliente;
        this.DireccionCliente = DireccionCliente;
        this.TelefonoCliente = TelefonoCliente;
        this.CuidadCliente = CuidadCliente;
    }

    public int getCedulaCliente() {
        return CedulaCliente;
    }

    public void setCedulaCliente(int CedulaCliente) {
        this.CedulaCliente = CedulaCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return DireccionCliente;
    }

    public void setDireccionCliente(String DireccionCliente) {
        this.DireccionCliente = DireccionCliente;
    }

    public String getTelefonoCliente() {
        return TelefonoCliente;
    }

    public void setTelefonoCliente(String TelefonoCliente) {
        this.TelefonoCliente = TelefonoCliente;
    }

    public String getCuidadCliente() {
        return CuidadCliente;
    }

    public void setCuidadCliente(String CuidadCliente) {
        this.CuidadCliente = CuidadCliente;
    }
    
    
    
}
