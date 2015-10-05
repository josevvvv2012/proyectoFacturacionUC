/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Decorador;
import Modelo.Producto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Controlador.Conexion;
import Controlador.ControllerSql;
import javax.swing.JOptionPane;


/**
 *
 * @author USER
 */
public class Marca_del_producto extends Decorador_producto{
public ControllerSql obj;
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
        String marca=producto.getMarca_product();
                System.out.println("Entro aca la marca en este momento tiene :"+marca);

        obj = ControllerSql.getInstancia();
        try {
                    boolean res = obj.Agregarmarca(idProducto,marca);
                    
                    if (res == true) {
                        JOptionPane.showMessageDialog(null, "Se agrego la marca al producto");
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo agregar ya existe en la base"
                                + "de datos");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "por favor verifique la conexion del servidor ");

                }
        ///////
      
        ///////
    
  
        return producto.getMarca_product()+"Rancheras";
}

}