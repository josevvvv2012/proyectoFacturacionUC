/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Controlador.Conexion;
import Controlador.ControllerSql;
import Modelo.Proveedor;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;



/**
 *
 * @author negro
 */
public class FuncionesController {
    
private ControllerSql sen;
private Conexion cn;

 public FuncionesController()
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
