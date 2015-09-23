/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Calculos_Factura {
    
   double Precio;
   int      Cantidad;
   double    porcentaje;
    double     Subtotal_sin_iva;
    double          Valor_iva;
    double       Total_con_iva;

    public Calculos_Factura(double Precio, int Cantidad, double porcentaje, double Subtotal_sin_iva, double Valor_iva, double Total_con_iva) {
        this.Precio = Precio;
        this.Cantidad = Cantidad;
        this.porcentaje = porcentaje;
        this.Subtotal_sin_iva = Subtotal_sin_iva;
        this.Valor_iva = Valor_iva;
        this.Total_con_iva = Total_con_iva;
    }
    
    
}