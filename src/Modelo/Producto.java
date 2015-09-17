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
public class Producto {
    int idProducto;
    String NombreProducto;
    double PrecioVenta;
    double PrecioCosto;
    double IvaProducto;
    double stock;

    public Producto(int idProducto, String NombreProducto, double PrecioVenta, double PrecioCosto, double IvaProducto, double stock) {
        this.idProducto = idProducto;
        this.NombreProducto = NombreProducto;
        this.PrecioVenta = PrecioVenta;
        this.PrecioCosto = PrecioCosto;
        this.IvaProducto = IvaProducto;
        this.stock = stock;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public double getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(double PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public double getPrecioCosto() {
        return PrecioCosto;
    }

    public void setPrecioCosto(double PrecioCosto) {
        this.PrecioCosto = PrecioCosto;
    }

    public double getIvaProducto() {
        return IvaProducto;
    }

    public void setIvaProducto(double IvaProducto) {
        this.IvaProducto = IvaProducto;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    
}
