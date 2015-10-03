/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 */
public abstract class Producto {
    public int idProducto;
    String NombreProducto;
    double PrecioVenta;
    double PrecioCosto;
    double IvaProducto;
    double stock;
    int cantidad;
    int idproveedor;
    String tipoproducto;

    public Producto(int idProducto, String NombreProducto, double PrecioVenta, double PrecioCosto, double IvaProducto, double stock) {
        this.idProducto = idProducto;
        this.NombreProducto = NombreProducto;
        this.PrecioVenta = PrecioVenta;
        this.PrecioCosto = PrecioCosto;
        this.IvaProducto = IvaProducto;
        this.stock = stock;
    }

    public Producto(int idProducto, String tipoproducto)
    {
       this.idProducto = idProducto;
       this.tipoproducto = tipoproducto;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad1(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    @Override
    public String toString() {
        return getNombreProducto() + " " + getPrecioVenta();
    }
    
   public abstract double getPeso_product();
   public abstract String getMarca_product();

    
}
