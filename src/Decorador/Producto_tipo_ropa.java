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
public class Producto_tipo_ropa extends Producto{

    public Producto_tipo_ropa(int idProducto, String NombreProducto, double PrecioVenta, double PrecioCosto, double IvaProducto, double stock) {
        super(idProducto, NombreProducto, PrecioVenta, PrecioCosto, IvaProducto, stock);
    }

    @Override
    public String getPesoYMarca_product() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
