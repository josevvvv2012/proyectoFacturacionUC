/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Decorador;
import Controlador.ControllerSql;
import Modelo.Producto;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Peso_Del_producto extends Decorador_producto{
public ControllerSql obj;

    public Peso_Del_producto(Producto producto,int idProducto, String NombreProducto, double PrecioVenta, double PrecioCosto, double IvaProducto, double stock) {
        super(idProducto, NombreProducto, PrecioVenta, PrecioCosto, IvaProducto, stock);
                this.producto=producto;
    }

  
    @Override
    public String getMarca_product() {
        
    
  
        return producto.getMarca_product()+"Rancheras";
}

    @Override
    public double getPeso_product() {
        
        double peso=producto.getPeso_product();
                System.out.println("Entro aca la marca en este momento tiene :"+peso);

        obj = ControllerSql.getInstancia();
        try {
                    boolean res = obj.Agregarpeso(idProducto,peso);
                    
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
    
return 0;

    
}
}
