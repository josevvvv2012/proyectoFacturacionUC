/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author negro
 */
public class Proveedor {
  
    
    
    String nombreProveedor;
    String telefonoProveedor;
    String direccionProveedor;
    private Proveedor Proveedor;
    

    private Proveedor(String nombreProveedor, String telefonoProveedor, String direccionProveedor) {
        
        this.nombreProveedor = nombreProveedor;
        this.telefonoProveedor = telefonoProveedor;
        this.direccionProveedor = direccionProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }
 
    
       public static Proveedor getInstance(String nombreProveedor, String telefonoProveedor,String direccionProveedor, Proveedor Proveedor){
        if(Proveedor==null){
            Proveedor = new Proveedor(nombreProveedor, telefonoProveedor,direccionProveedor);
        }
        return Proveedor;
    }
    
    
}
