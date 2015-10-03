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
public class Producto_tipo_ropaa extends Producto{

    public Producto_tipo_ropaa(int idProducto, String tipoproducto) {
        super(idProducto, tipoproducto);
    }

    public Producto_tipo_ropaa(int idProducto, String NombreProducto, double PrecioVenta, double PrecioCosto, double IvaProducto, double stock) {
        super(idProducto, NombreProducto, PrecioVenta, PrecioCosto, IvaProducto, stock);
    }


    @Override
    public double getPeso_product() {
        return 300; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMarca_product() {
        return "Pronto"; 
    }
    
}
