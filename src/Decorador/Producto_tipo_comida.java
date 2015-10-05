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

    public Producto_tipo_comida(int idProducto, String tipoproducto) {
        super(idProducto, tipoproducto);
    }
    
//    public void imprimirIDTIPOPRODUCTO(){
//        System.out.println(idProducto+tipoproducto);
//    }
    
    public Producto_tipo_comida(int idProducto, String NombreProducto, double PrecioVenta, double PrecioCosto, double IvaProducto) {
        super(idProducto, NombreProducto, PrecioVenta, PrecioCosto, IvaProducto, IvaProducto);
    }

   public double agregarmarca()
    {
        System.out.println("holamundo");
        return 0;
    }
    
    @Override
    public double getPeso_product() {
        return 240; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMarca_product() {
        return "Carrefour"; 
    }
    
}
