/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author negro
 */

  
    public class ControllerSql {//public 

    Connection conexion;
    Statement stm;
    ResultSet rs;
    

    public ControllerSql() {  //class public

        try {

            Class.forName("com.mysql.jdbc.Driver");
            String db = "jdbc:mysql://localhost/" + Conexion.dbName;
            conexion = DriverManager.getConnection(db, Conexion.login, Conexion.password);
            stm = conexion.createStatement();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
       //funcion AgregarProveedor
    public boolean AgregarProveedor(String nombreProveedor, String telefonoProveedor,  String direccionProveedor) {

         
        try {
            String query = " insert into proveedor(nombreProveedor,telefonoProveedor,Direccion)"
                    + " values (?,?,?)";

            // preparo la consulta para mi base de datos
            PreparedStatement preparedStmt = conexion.prepareStatement(query);
            preparedStmt.setString(1, nombreProveedor);
            preparedStmt.setString(2, telefonoProveedor);
            preparedStmt.setString(3, direccionProveedor);
          
            // ejecuto mi query
            preparedStmt.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
      //funcion AgregarProducto
    public boolean AgregarProducto(String descripcion, Double costo,  Double precio_venta , int id_proveedor) {

         
        try {
            String query = " insert into producto(descripcion,costo,precio_venta ,id_proveedor)"
                    + " values (?,?,?,?)";

            // preparo la consulta para mi base de datos
            PreparedStatement preparedStmt = conexion.prepareStatement(query);
            preparedStmt.setString(1, descripcion);
            preparedStmt.setDouble(2, costo);
            preparedStmt.setDouble(3, precio_venta);
            preparedStmt.setInt(3, id_proveedor);
          
            // ejecuto mi query
            preparedStmt.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    
    //funcion AgregarCliente
    public boolean AgregarCliente(String dir_cliente, String nom_cliente,  int tel_cliente ) {

         
        try {
            String query = " insert into producto(dir_cliente,nom_cliente,tel_cliente)"
                    + " values (?,?,?)";

            // preparo la consulta para mi base de datos
            PreparedStatement preparedStmt = conexion.prepareStatement(query);
            preparedStmt.setString(1, dir_cliente);
            preparedStmt.setString(2, nom_cliente);
            preparedStmt.setInt(3, tel_cliente);
            
            // ejecuto mi query
            preparedStmt.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    //funcion AgregarFactura
    public boolean AgregarFactura(String fecha_fact, 
                                    int cantidad,  
                                    Double subtotal,
                                    Double valor_iva,
                                    Double total_fact,
                                    int descuento_fact,
                                    Double neto_fact,
                                    int id_cliente,
                                    int id_producto) {

         
        try {
            String query = " insert into producto(dir_cliente,nom_cliente,tel_cliente)"
                    + " values (?,?,?)";

            // preparo la consulta para mi base de datos
            PreparedStatement preparedStmt = conexion.prepareStatement(query);
            preparedStmt.setString(1, fecha_fact);
            preparedStmt.setInt(2, cantidad);
            preparedStmt.setDouble(3, subtotal);
            preparedStmt.setDouble(4, valor_iva);
            preparedStmt.setDouble(5, total_fact);
            preparedStmt.setInt(6, descuento_fact);
            preparedStmt.setDouble(7, neto_fact);
            preparedStmt.setInt(8, id_cliente);
            preparedStmt.setInt(9, id_producto);
            
            
            // ejecuto mi query
            preparedStmt.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    
   
    
}
