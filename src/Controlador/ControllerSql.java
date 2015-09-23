    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Proveedor;
import VistaNegocio.VistaProveedor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author negro
 */

  
    public class ControllerSql {//public 

    Connection conexion;
    Statement stm;
    ResultSet rs;
    private static Proveedor Proveedor;
    
    

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

          this.Proveedor = Proveedor.getInstance(nombreProveedor,telefonoProveedor,direccionProveedor, Proveedor);
     
//          VistaProveedor.txtDireccion.setText(String.valueOf(Proveedor.getNombreProveedor()));
//          VistaProveedor.txtTelefono.setText(String.valueOf(Proveedor.getTelefonoProveedor()));
//        VistaProveedor.txtDireccion.setText(String.valueOf(Proveedor.getDireccionProveedor()));

                   
        try {
            String query = " insert into proveedor(nombreProveedor,telefonoProveedor,Direccion)"
                    + " values (?,?,?)";

            // preparo la consulta para mi base de datos
            PreparedStatement preparedStmt = conexion.prepareStatement(query);
            preparedStmt.setString(1,Proveedor.getNombreProveedor());
            preparedStmt.setString(2, Proveedor.getTelefonoProveedor());
            preparedStmt.setString(3, Proveedor.getDireccionProveedor());
            
          
            // ejecuto mi query
            preparedStmt.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
      //funcion AgregarProducto
    public boolean AgregarProducto(int id_producto,String descripcion, Double costo,  Double precio_venta , int id_proveedor) {

         
        try {
            String query = " insert into producto(id_producto,descripcion,costo,precio_venta ,id_proveedor)"
                    + " values (?,?,?,?,?)";

            // preparo la consulta para mi base de datos .
            PreparedStatement preparedStmt = conexion.prepareStatement(query);
            preparedStmt.setInt(1, id_producto);
            preparedStmt.setString(2, descripcion);
            preparedStmt.setDouble(3, costo);
            preparedStmt.setDouble(4, precio_venta);
            preparedStmt.setInt(5, id_proveedor);
          
            // ejecuto mi query
            preparedStmt.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    
    //funcion AgregarCliente
    public boolean AgregarCliente(int idCliente ,String dir_cliente, String nom_cliente,  String tel_cliente ) {

         
        try {
            String query = " insert into cliente(id_cliente,dir_cliente,nom_cliente,tel_cliente)"
                    + " values (?,?,?,?)";

            // preparo la consulta para mi base de datos
            PreparedStatement preparedStmt = conexion.prepareStatement(query);
            preparedStmt.setInt(1, idCliente);
            preparedStmt.setString(2, dir_cliente);
            preparedStmt.setString(3, nom_cliente);
            preparedStmt.setString(4, tel_cliente);
            
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
            String query = " insert into factura(dir_cliente,nom_cliente,tel_cliente)"
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
    
         public Object[] tablecombox(String tabla, String nombrecolIde,String nombreCampo, String sql){
      int registros = 0;      
      PreparedStatement ps ;
      try{
         ps = conexion.prepareStatement("SELECT count(*) as total FROM " + tabla);
         rs = ps.executeQuery();
         rs.next();
         registros = rs.getInt("total");
         rs.close();
      }catch(SQLException e){
         System.out.println(e);
      }

    Object[] datos = new Object[registros];
      try{
         ps = conexion.prepareStatement(sql);
         rs = ps.executeQuery();
         int i = 0;
         while(rs.next()){
            datos[i] = rs.getObject(nombrecolIde);
            datos[i] = rs.getObject(nombreCampo);
            i++;
         }
         rs.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return datos;
 }
   /*
    //funcion ConsultarCliente
    */
    public ResultSet ConsultarCliente(int id_cliente) {
        try {

            String query = "SELECT nom_cliente,tel_cliente,dir_cliente FROM cliente WHERE id_cliente =" + id_cliente + "";
            Statement st = conexion.createStatement();
            rs = st.executeQuery(query);
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error");
            return null;
        }
    }
    
   /*
    //funcion ConsultarCliente
    */
    public ResultSet ConsultarProducto(int id_producto,int band) {
        try {
            if(band==1){

            String query = "SELECT descripcion FROM producto WHERE id_producto like " + id_producto + "";
            Statement st = conexion.createStatement();
            rs = st.executeQuery(query);
            
            }
            if(band==2){

            String query = "SELECT precio_venta FROM producto WHERE id_producto like " + id_producto + "";           
            Statement st = conexion.createStatement();
            rs = st.executeQuery(query);
            
            }
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error");
            return null;
        }
    }
    
    
}
