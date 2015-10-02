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
public class Marca_del_producto extends Decorador_producto{

    public Marca_del_producto(Producto producto,int idProducto, String NombreProducto, double PrecioVenta, double PrecioCosto, double IvaProducto, double stock) {
        super(idProducto, NombreProducto, PrecioVenta, PrecioCosto, IvaProducto, stock);
                this.producto=producto;
    }
    
    @Override
    public double getPeso_product() {
        return producto.getPeso_product()+100;
    }

    @Override
    public String getMarca_product() {
        return producto.getMarca_product()+"Rancheras"; //To change body of generated methods, choose Tools | Templates.
    }
  
}
