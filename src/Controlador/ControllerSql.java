    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Decorador.Producto_tipo_comida;
import Modelo.Cliente;
import Modelo.Factura;
import Modelo.Producto;
import Modelo.Proveedor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import observer.ActualizaFacturas;

/**
 *
 * @author negro
 */
public class ControllerSql extends ActualizaFacturas{//public 

    Connection conexion;
    Statement stm;
    ResultSet rs;
    Producto Producto;
    Cliente Cliente;
    Proveedor Proveedor;
    
    private static ControllerSql cs = new ControllerSql();//instancia para que el patron observer se ejecute solamente cuando se abre la aplicacion
    
      public static ControllerSql getInstancia(){
        return cs;
    }
    
    public ControllerSql() {  //class public
        super(null);
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
    public boolean AgregarProveedor(int idProveedor,String nombreProveedor, String telefonoProveedor, String direccionProveedor) {

        Proveedor proveedor = new Proveedor(idProveedor,nombreProveedor, telefonoProveedor, direccionProveedor);

        try {
            String query = " insert into proveedor(idProveedor,nombreProveedor,telefonoProveedor,Direccion)"
                    + " values (?,?,?,?)";

            // preparo la consulta para mi base de datos
            PreparedStatement preparedStmt = conexion.prepareStatement(query);
            preparedStmt.setInt(1, proveedor.getIdProveedor());
            preparedStmt.setString(2, proveedor.getNombreProveedor());
            preparedStmt.setString(3, proveedor.getTelefonoProveedor());
            preparedStmt.setString(4, proveedor.getDireccionProveedor());

            // ejecuto mi query
            preparedStmt.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    
    //Se creo funcion  agregar marca para que ingrese la marca del producto
    public boolean Agregarmarca(int id_producto,String marca) {
        try {
            
            String query ="UPDATE producto SET marcaproducto=? WHERE id_producto = ? ";             
            PreparedStatement preparedStmt = conexion.prepareStatement(query);
            preparedStmt.setString(1, marca);
            preparedStmt.setInt(2, id_producto);

            // ejecuto mi query
            preparedStmt.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }       
    }
    
    //Se creo funcion  agregar peso para que ingrese el peso  del producto
    public boolean Agregarpeso(int id_producto,double peso) {
        try {
            
            /*String query = " UPDATE proveedor SET nombreProveedor=?, telefonoProveedor =?, Direccion = ?  WHERE  idProveedor=?";
*/   
            String query ="UPDATE producto SET pesoproducto=? WHERE id_producto = ? ";             
            PreparedStatement preparedStmt = conexion.prepareStatement(query);
            preparedStmt.setDouble(id_producto, peso);
            preparedStmt.setInt(2, id_producto);

            // ejecuto mi query
            preparedStmt.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }       
    }
    
    
    
    //funcion AgregarProducto
    public boolean AgregarProducto(
            int id_producto, 
            String descripcion,
            Double costo, 
            Double precio_venta, 
            int id_proveedor,
            Double ivaproducto,
            String tipoProducto) {
            
            
//            int id_producto, 
//            String descripcion,
//            Double costo, 
//            Double precio_venta, 
//            int id_proveedor,
//            Double ivaproducto) {
//           
        try {
            String query = " insert into producto("
                    + "id_producto,"
                    + "descripcion,"
                    + "costo,"
                    + "precio_venta,"
                    + "id_proveedor,"
                    + "ivaproducto,"
                    + "tipoproducto)"
                    + " values (?,?,?,?,?,?,?)";
            
//               String query = " insert into producto("
//                    + "id_producto,"
//                    + "descripcion,"
//                    + "costo,"
//                    + "precio_venta ,"
//                    + "id_proveedor,"
//                    + "ivaproducto)"
//                    + " values (?,?,?,?,?,?)";

            // preparo la consulta para mi base de datos .
            PreparedStatement preparedStmt = conexion.prepareStatement(query);
            preparedStmt.setInt(1, id_producto);
            preparedStmt.setString(2, descripcion);
            preparedStmt.setDouble(3, costo);
            preparedStmt.setDouble(4, precio_venta);
            preparedStmt.setInt(5, id_proveedor);
            preparedStmt.setDouble(6, ivaproducto);
            preparedStmt.setString(7, tipoProducto);
            
            // ejecuto mi query
            preparedStmt.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    //funcion AgregarCliente
    public boolean AgregarCliente(int idCliente, String nom_cliente, String dir_cliente, String tel_cliente) {

        try {
            String query = " insert into cliente(id_cliente,nom_cliente,dir_cliente,tel_cliente)"
                    + " values (?,?,?,?)";

            // preparo la consulta para mi base de datos
            PreparedStatement preparedStmt = conexion.prepareStatement(query);
            preparedStmt.setInt(1, idCliente);
            preparedStmt.setString(2, nom_cliente);
            preparedStmt.setString(3, dir_cliente);
            preparedStmt.setString(4, tel_cliente);

            // ejecuto mi query
            preparedStmt.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    //funcion AgregarFactura
    public boolean AgregarFactura(Factura factura) {

        try {
            String query = " insert into factura(fecha_fact,subtotal,valor_iva, total_fact, neto_fact, id_cliente)"
                    + " values (?,?,?,?,?,?)";
            

            // preparo la consulta para mi base de datos
            PreparedStatement preparedStmt = conexion.prepareStatement(query);
            preparedStmt.setString(1, factura.getFecha_fact()+"");
            preparedStmt.setDouble(2, factura.getSubtotal());
            preparedStmt.setDouble(3, factura.getValor_iva());
            preparedStmt.setDouble(4, factura.getTotal_fact());
            preparedStmt.setDouble(5, factura.getNeto_fact());
            preparedStmt.setInt(6, factura.getId_cliente());
            // ejecuto mi query
            preparedStmt.execute();
            
            preparedStmt = conexion.prepareStatement("SELECT max(id_factura)  FROM factura");
            rs = preparedStmt.executeQuery();
            if(rs.next()){
                factura.setId_factura(rs.getInt(1));
            }
            
            for (Producto p : factura.getProductos()){
                agregarProductoFactura(p, factura.getId_factura());
            }
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public boolean agregarProductoFactura(Producto p, int id_factura){
        try {
            String query = " insert into facpr(id_factura,id_producto,cantidad, valor)"
                    + " values (?,?,?,?)";
            
            // preparo la consulta para mi base de datos
            PreparedStatement preparedStmt = conexion.prepareStatement(query);
            preparedStmt.setInt(1, id_factura);
            preparedStmt.setInt(2, p.getIdProducto());
            preparedStmt.setInt(3, p.getCantidad());
            preparedStmt.setDouble(3, p.getCantidad() * p.getPrecioVenta());
            // ejecuto mi query
            preparedStmt.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public List<Producto> listaProductos(){
        List<Producto> productos = new Stack<Producto>();
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement("SELECT id_producto ,descripcion ,costo,precio_venta, id_proveedor ,ivaproducto FROM producto");
            rs = ps.executeQuery();
            while(rs.next()){
                Producto p = new Producto_tipo_comida(rs.getInt(1), 
                        rs.getString(2), 
                        rs.getDouble(4), 
                        rs.getDouble(3), 
                        rs.getDouble(6));
                p.setIdproveedor(rs.getInt(5));
                productos.add(p);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return productos;
    }
    
    public List<Proveedor> listaProveedores(){
        List<Proveedor> proveedores = new Stack<Proveedor>();
        PreparedStatement ps;
        try {
            //String nombreProveedor, String telefonoProveedor, String direccionProveedor, int idProveedor
            ps = conexion.prepareStatement("SELECT nombreProveedor ,telefonoProveedor ,direccion,idProveedor  FROM proveedor");
            rs = ps.executeQuery();
            while(rs.next()){
                Proveedor p = new Proveedor(rs.getInt(4),rs.getString(1), rs.getString(2), rs.getString(3));
                proveedores.add(p);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return proveedores;
    }

    public Object[] tablecombox(String tabla, String nombrecolIde, String nombreCampo, String sql) {
        int registros = 0;
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement("SELECT count(*) as total FROM " + tabla);
            rs = ps.executeQuery();
            rs.next();
            registros = rs.getInt("total");
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

        Object[] datos = new Object[registros];
        try {
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                datos[i] = rs.getObject(nombrecolIde);
                datos[i] = rs.getObject(nombreCampo);
                i++;
            }
            rs.close();
        } catch (SQLException e) {
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
    public ResultSet ConsultarProducto(int id_producto) {
        try {

            String query = "SELECT precio_venta FROM producto WHERE id_producto like " + id_producto + "";
            Statement st = conexion.createStatement();
            rs = st.executeQuery(query);
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error");
            return null;
        }
    }
      
        public ResultSet ConsultarIdFactura() {
        try {

            String query = "select * from factura";
            Statement st = conexion.createStatement();
            rs = st.executeQuery(query);
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error");
            return null;
        }
    }
        
        //metodo  para actualizar todas las facturas que tenga guardadas en la BD
    public boolean actualizarFactura(Factura factura) {

        try {
            String query = " update factura set subtotal = ? ,valor_iva = ? , total_fact = ?, neto_fact = ? where id_factura = ?";

            PreparedStatement preparedStmt = conexion.prepareStatement(query);
            preparedStmt.setDouble(1, factura.getSubtotal());
            preparedStmt.setDouble(2, factura.getValor_iva());
            preparedStmt.setDouble(3, factura.getTotal_fact());
            preparedStmt.setDouble(4, factura.getNeto_fact());
            preparedStmt.setInt(5, factura.getId_factura());
            preparedStmt.execute();

            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean actualizaProducto(Producto producto){
        try {
            String query = " update producto set costo = ? , precio_venta = ?, ivaproducto = ? where id_producto = ?";

            PreparedStatement preparedStmt = conexion.prepareStatement(query);
            preparedStmt.setDouble(1, producto.getPrecioCosto());
            preparedStmt.setDouble(2, producto.getPrecioVenta());
            preparedStmt.setDouble(3, producto.getIvaProducto());
            preparedStmt.setInt(4, producto.getIdProducto());

            preparedStmt.execute();
            
            super.setEstado(producto);
            
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
        public boolean actualizaCliente(int idCliente,String dir_cliente, String nom_cliente, String tel_cliente){
        try {
           
            //Cliente = new Cliente(idCliente, nom_cliente, dir_cliente, tel_cliente, dir_cliente);
            
            String query = " update cliente set dir_cliente = ? , nom_cliente = ?, tel_cliente = ? where id_cliente = ?";
            log(query);

            PreparedStatement preparedStmt = conexion.prepareStatement(query);
            
            preparedStmt.setString(1, dir_cliente);
            preparedStmt.setString(2, nom_cliente);
            preparedStmt.setString(3, tel_cliente);
            preparedStmt.setInt(4,idCliente );
            
            preparedStmt.execute();
        
            
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
   
    public boolean actualizaProveedor(int idProveedor,String nombreProveedor, String telefonoProveedor, String direccionProveedor) {
        try {
            String query = " UPDATE proveedor SET nombreProveedor=?, telefonoProveedor =?, Direccion = ?  WHERE  idProveedor=?";

            PreparedStatement preparedStmt = conexion.prepareStatement(query);
            
            
            preparedStmt.setString(1,nombreProveedor);
            preparedStmt.setString(2,telefonoProveedor );
            preparedStmt.setString(3, direccionProveedor);
            preparedStmt.setInt(4, idProveedor);

            preparedStmt.execute();

            return true;
        } catch (SQLException e) {
            return false;
        }
    }
        
        
   public Producto consultarProductoObserver(int idProducto) {
        Producto p = null;
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement("SELECT id_producto ,descripcion ,costo,precio_venta, id_proveedor ,ivaproducto FROM producto");
            rs = ps.executeQuery();
            if (rs.next()) {
                p = new Producto_tipo_comida(rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(4),
                        rs.getDouble(3),
                        rs.getDouble(6));
                p.setIdproveedor(rs.getInt(5));
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return p;
    }

   
   
public boolean AgregarDetalleFactura(int nfac, int codpro, int cant,double pre_u,double valor_total_pro) {

        log("agregrar Detalle de factura");

        try {
            String query = "INSERT INTO facpr (id_factura,id_producto_f,cantidad,valor,valor_total_pro) "
                    + "VALUES (?, ?, ?, ?, ?); ";

            // preparo la consulta para mi base de datos
            PreparedStatement preparedStmt = conexion.prepareStatement(query);
            preparedStmt.setInt(1, nfac);
            preparedStmt.setInt(2, codpro);
            preparedStmt.setInt(3, cant);
            preparedStmt.setDouble(4, pre_u);
            preparedStmt.setDouble(5, valor_total_pro);

            // ejecuto mi query
            preparedStmt.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }   
   
    
  public void log(String a)
    {
   System.out.println("la valor  = "+" "+a);   
    }     

   

}
