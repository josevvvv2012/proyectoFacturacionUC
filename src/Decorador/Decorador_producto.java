/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorador;
import Modelo.Producto;
/**
 *
 * @author USER
 */
public abstract class Decorador_producto extends Producto{
    Producto producto;

    public Decorador_producto(int idProducto, String NombreProducto, double PrecioVenta, double PrecioCosto, double IvaProducto, double stock) {
        super(idProducto, NombreProducto, PrecioVenta, PrecioCosto, IvaProducto, stock);
    }
   
    
}
