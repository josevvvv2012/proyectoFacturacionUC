 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import VistaNegocio.VistaConexionBD;


/**
 *
 * @author NEGRO
 */
public class Conexion {

    VistaConexionBD vistaMBD = new VistaConexionBD();
    public static String url;
    public static String dbAddress = "jdbc:mysql://localhost:3306/";
    public final static String driver = "com.mysql.jdbc.Driver";
    public static Connection conn = null;
    public static String login;
    public static String password;
    public static String dbName;

    private static Conexion conex = null;

    private Conexion() {
        try {
            conectar();
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Conexion getInstance() {
        if (conex == null) {
            conex = new Conexion();
        }
        return conex;
    }

    //metodo para conectar con la BD
    public static boolean conectar() throws Exception {
        try {
            url = "jdbc:mysql://localhost:3306/" + dbName;
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, login, password);

            if (conn != null) {
                System.out.println("Conexión..." + url + "...Ok" + "...Usuario:..." + login);
                //return Boolean.getBoolean(dbName);
            }

            return true;
        } catch (SQLException ex) {

            System.out.println("Erroronectar con la DB..." + url + "...Usuario:..." + login);
            return false;
        }
    }//fin del metodo conectar

    public static boolean createDatabase() throws Exception {

        try {

            url = "jdbc:mysql://localhost:3306/";
            Class.forName(driver);
            conn = DriverManager.getConnection(url, login, password);
            Statement s = conn.createStatement();
            int myResult = s.executeUpdate("CREATE DATABASE IF NOT EXISTS " + dbName);

            if (conn != null) {
                System.out.println("Conexión..Creacion database." + url + "...Ok" + "...Usuario:..." + login);
            }

            return true;

        } catch (ClassNotFoundException  ex) {

            System.out.println("Erroronectar con la DB..." + url + "...Usuario:..." + login);
            return false;
        }

    }

    public static boolean createTable() throws Exception {

        login = VistaConexionBD.txtNombre.getText();
        password = VistaConexionBD.txtPassword.getText();
        dbName = VistaConexionBD.txtNombreBD.getText();

       String myTableName1="CREATE TABLE IF NOT EXISTS `cliente` (\n" +
"  `id_cliente` int(11) NOT NULL,\n" +
"  `dir_cliente` varchar(50) DEFAULT NULL,\n" +
"  `nom_cliente` varchar(50) DEFAULT NULL,\n" +
"  `tel_cliente` varchar(50) DEFAULT NULL,\n" +
"  PRIMARY KEY (`id_cliente`)\n" +
")ENGINE=InnoDB DEFAULT CHARSET=utf8;";
             
       
       
       String myTableName2="CREATE TABLE IF NOT EXISTS `proveedor` (\n" +
"  `idProveedor` int(11) NOT NULL AUTO_INCREMENT,\n" +
"  `nombreProveedor` varchar(100) NOT NULL,\n" +
"  `telefonoProveedor` varchar(50) DEFAULT NULL,\n" +
"  `Direccion` varchar(50) DEFAULT NULL,\n" +
"  PRIMARY KEY (`idProveedor`)\n" +
")ENGINE=InnoDB DEFAULT CHARSET=utf8;";
       
       String myTableName3="CREATE TABLE IF NOT EXISTS `producto` (\n" +
"  `id_producto` int(11) NOT NULL,\n" +
"  `descripcion` varchar(50) NOT NULL,\n" +
"  `costo` double NOT NULL,\n" +
"  `precio_venta` double NOT NULL,\n" +
"  `id_proveedor` int(11) NOT NULL,\n" +
"  `ivaproducto` double NOT NULL,\n" +
"  PRIMARY KEY (`id_producto`),\n" +
"  KEY `id_proveedor` (`id_proveedor`),\n" +
"  CONSTRAINT `FK_producto_proveedor` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`idProveedor`)\n" +
")ENGINE=InnoDB DEFAULT CHARSET=utf8;";

       String myTableName4="CREATE TABLE IF NOT EXISTS `factura` (\n" +
"  `id_factura` int(11) NOT NULL AUTO_INCREMENT,\n" +
"  `fecha_fact` varchar(50) DEFAULT NULL,\n" +
"  `subtotal` decimal(10,0) DEFAULT NULL,\n" +
"  `valor_iva` decimal(10,0) DEFAULT NULL,\n" +
"  `total_fact` double DEFAULT NULL,\n" +
"  `neto_fact` double DEFAULT NULL,\n" +
"  `id_cliente` int(11) DEFAULT NULL,\n" +
"  PRIMARY KEY (`id_factura`),\n" +
"  KEY `id_cliente` (`id_cliente`),\n" +
"  CONSTRAINT `FK_factura_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`)\n" +
")ENGINE=InnoDB DEFAULT CHARSET=utf8;";
       
       
       String myTableName5="CREATE TABLE IF NOT EXISTS `facpr` (\n" +
"  `id_facpr` int(11) NOT NULL AUTO_INCREMENT,\n" +
"  `id_factura` int(11) NOT NULL,\n" +
"  `id_producto_f` int(11) NOT NULL,\n" +
"  `cantidad` int(11) NOT NULL,\n" +
"  `valor` double NOT NULL,\n" +
"  PRIMARY KEY (`id_facpr`),\n" +
"  KEY `id_factura` (`id_factura`),\n" +
"  KEY `id_producto_f` (`id_producto_f`),\n" +
"  CONSTRAINT `FK_facpr_producto` FOREIGN KEY (`id_producto_f`) REFERENCES `producto` (`id_producto`),\n" +
"  CONSTRAINT `FK_facpr_factura` FOREIGN KEY (`id_factura`) REFERENCES `factura` (`id_factura`)\n" +
")ENGINE=InnoDB DEFAULT CHARSET=utf8;";
       

        
                        
        try {
            Class.forName(driver);

            url = "jdbc:mysql://localhost:3306/";
            conn = DriverManager.getConnection(url + dbName, login, password);
            Statement s = conn.createStatement();
            s.executeUpdate(myTableName1);
            s.executeUpdate(myTableName2);
            s.executeUpdate(myTableName3);
            s.executeUpdate(myTableName4);
            s.executeUpdate(myTableName5);
            
            
        
            System.out.println("Tables Created");

            if (conn != null) {
                System.out.println("Conexión..Creacion table." + url + "...Ok" + "...Usuario:..." + login);
            }

            return true;
        } catch (SQLException e) {
            System.out.println("Error en la creacion de la table");
        }

        return false;
    }

    public Connection getConn() {
        return conn;
    }

}//fin de la clase

