/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Controlador.ControllerSql;
import Modelo.Proveedor;
import java.util.List;



/**
 *
 * @author negro
 */
public class Funciones {
    
private ControllerSql sen;

 public Funciones()
     {
         sen = new ControllerSql();
     }


     public Object[] combox(String tabla, String campoId ,String campo)
     {
        return sen.tablecombox(tabla, campoId,campo, "select "+campoId+" , "+campo+" from "+tabla+";");
     }
     
     public List<Proveedor> listaProvee(){
         return sen.listaProveedores();
     }
}
