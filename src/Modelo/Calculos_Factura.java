/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Calculos_Factura {
    
   double Precio_producto;
   int Cantidad_del_producto;
   double porcentaje_producto;
   double Subtotal_sin_iva_producto;
   double Valor_iva_producto;
   double Total_con_iva_producto;
////////////////////////////////////////////////////////////////////
   double Subtotal_factura_siniva_final;
   double Total_ConIva_Factura_final;
   double Total_facturaAPagar;
   
    ////////////////////////////////////////////////////////////////////
    public int getCantidad_del_producto() {
        return Cantidad_del_producto;
    }

    public double getPrecio_producto() {
        return Precio_producto;
    }

    public void setPrecio_producto(double Precio_producto) {
        this.Precio_producto = Precio_producto;
    }
    
    
    
    public double getPorcentaje_producto() {
        return porcentaje_producto;
    }

    public void setPorcentaje_producto(double porcentaje_producto) {
        this.porcentaje_producto = porcentaje_producto;
    }
    
    
    public void setCantidad_del_producto(int Cantidad_del_producto) {
        this.Cantidad_del_producto = Cantidad_del_producto;
    }
    
   public double CalcularSubTotalProducto(){
       Subtotal_sin_iva_producto=(getPrecio_producto()/(getPorcentaje_producto()+1)*getCantidad_del_producto());
       return Subtotal_sin_iva_producto;
   }
   /*Subtotal_sin_iva_producto=(getPrecio_producto()/(getPorcentajeProducto()+1)*3);
	return Subtotal_sin_iva_producto;*/
}