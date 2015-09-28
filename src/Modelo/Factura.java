/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Stack;

/**
 *
 */
public class Factura implements Observer{

    private int id_factura;
    private Date fecha_fact;
    private long subtotal;
    private double valor_iva;
    private double valor_iva_total;
    private double total_fact;

    public double getTotal_fact() {
        return total_fact;
    }

    public void setTotal_fact(double total_fact) {
        this.total_fact = total_fact;
    }
    private double descuento_fact;
    private double neto_fact;
    private int id_cliente;
    private int cantidad;
    private List<Producto> productos;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Factura() {
        productos = new Stack<Producto>();
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public Date getFecha_fact() {
        return fecha_fact;
    }

    public void setFecha_fact(Date fecha_fact) {
        this.fecha_fact = fecha_fact;
    }

    public long getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(long subtotal) {
        this.subtotal = subtotal;
    }

    public double getValor_iva() {
        return valor_iva;
    }

    public void setValor_iva(double valor_iva) {
        this.valor_iva = valor_iva;
    }

   

    public void setTotal_fact(long total_fact) {
        this.total_fact = total_fact;
    }

    public double getDescuento_fact() {
        return descuento_fact;
    }

    public void setDescuento_fact(double descuento_fact) {
        this.descuento_fact = descuento_fact;
    }

    public double getNeto_fact() {
        return neto_fact;
    }

    public void setNeto_fact(double neto_fact) {
        this.neto_fact = neto_fact;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void calcular(){

        valor_iva = 0;
        valor_iva_total=0;
        total_fact =0;
        Producto  Producto  ;
        for (Producto p : productos){
            subtotal += (p.getPrecioVenta()/(p.getIvaProducto()+1.0))*p.getCantidad();
            System.out.println(subtotal);
             valor_iva += p.getIvaProducto();
        }
       valor_iva_total = subtotal*valor_iva;
       total_fact = subtotal+valor_iva_total;
       System.out.println(total_fact);
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    

    @Override
    public void update(Observable o, Object arg) {
        
    }
}
