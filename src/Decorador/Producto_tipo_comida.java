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
public class Producto_tipo_comida extends Producto{

    public Producto_tipo_comida(int idProducto, String NombreProducto, double PrecioVenta, double PrecioCosto, double IvaProducto) {
        super(idProducto, NombreProducto, PrecioVenta, PrecioCosto, IvaProducto, IvaProducto);
    }

    @Override
    public String getPesoYMarca_product() {
        return null;
    }
    
}
