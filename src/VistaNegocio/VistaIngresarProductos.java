/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaNegocio;

import Controlador.ControllerSql;
import Decorador.Marca_del_producto;
import Decorador.Producto_tipo_automotor;
import Decorador.Producto_tipo_comida;
import Decorador.Producto_tipo_electronico;
import Decorador.Producto_tipo_ropa;
import Funciones.FuncionesController;
import Modelo.Producto;
import Modelo.Proveedor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author negro
 */
public class VistaIngresarProductos extends javax.swing.JFrame {

    public ControllerSql obj;
    FuncionesController cc = new FuncionesController();
    private Producto prodAc;
    private List<Proveedor> proveedores;

    /**
     * Creates new form VistaIngresarProductos
     */
    public VistaIngresarProductos() {
        initComponents();
     ValidadSoloNumeros(TextCodProduct);
        ValidadCaracteres(TextDescripcion);
        ValidadSoloNumeros(TextPrecio);
        ValidadSoloNumeros(TextCostoproduc);
        ValidadSoloNumeros(txtIvap);
        
        
        LitsadeProovedores.setModel(new javax.swing.DefaultComboBoxModel(cc.listaProvee().toArray()));
        
              obj = ControllerSql.getInstancia();
        proveedores = cc.listaProvee();
    //    LitsadeProovedores.setModel(new javax.swing.DefaultComboBoxModel(proveedores.toArray()));
        LitsadeProovedores.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        LabelProducto = new javax.swing.JLabel();
        TextCodProduct = new javax.swing.JTextField();
        TextDescripcion = new javax.swing.JTextField();
        LabelDescripcion = new javax.swing.JLabel();
        TextCostoproduc = new javax.swing.JTextField();
        LabelCosto = new javax.swing.JLabel();
        TextPrecio = new javax.swing.JTextField();
        LabelPrecioVent = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BotonIngresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Boton_cancelar = new javax.swing.JButton();
        LitsadeProovedores = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtIvap = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcboxTipoProducto = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jButton4.setText("jButton4");

        jButton3.setText("jButton3");

        jLabel3.setText("jLabel3");

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LabelProducto.setText("Codigo de Producto");

        TextCodProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCodProductActionPerformed(evt);
            }
        });

        LabelDescripcion.setText("Descripcion/Nombre");

        TextCostoproduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCostoproducActionPerformed(evt);
            }
        });

        LabelCosto.setText("Costo del producto");

        TextPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPrecioActionPerformed(evt);
            }
        });

        LabelPrecioVent.setText("Precio de Venta");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Ingreso de Productos ");

        BotonIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/guardar.JPG"))); // NOI18N
        BotonIngresar.setText("Ingresar");
        BotonIngresar.setBorder(null);
        BotonIngresar.setContentAreaFilled(false);
        BotonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonIngresar.setDefaultCapable(false);
        BotonIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonIngresar.setIconTextGap(-3);
        BotonIngresar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BotonIngresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.JPG")));
        BotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarActionPerformed(evt);
            }
        });

        jLabel6.setText("Codigo Proovedor");

        Boton_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Cancelar.JPG"))); // NOI18N
        Boton_cancelar.setText("Cancelar");
        Boton_cancelar.setBorder(null);
        Boton_cancelar.setBorderPainted(false);
        Boton_cancelar.setContentAreaFilled(false);
        Boton_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton_cancelar.setIconTextGap(-3);
        Boton_cancelar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Boton_cancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_cancelarActionPerformed(evt);
            }
        });

        LitsadeProovedores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione opcion", "Alqueria", "Ajax", "Kodak", "Cocacola", "Pepsi", "Postobon" }));
        LitsadeProovedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LitsadeProovedoresActionPerformed(evt);
            }
        });

        jLabel1.setText("Iva");

        jButton2.setText("Agregar marca y peso");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de producto");

        jcboxTipoProducto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Electronicos", "Ropa", "Alimentos", "Automotor" }));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Cerrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                        .addComponent(LitsadeProovedores, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(LabelProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LabelDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                            .addComponent(LabelPrecioVent, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextCodProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TextDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TextPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TextCostoproduc, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcboxTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtIvap, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(32, 32, 32)
                        .addComponent(BotonIngresar)
                        .addGap(92, 92, 92)
                        .addComponent(Boton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TextCodProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelDescripcion)))
                            .addComponent(LabelProducto))
                        .addGap(18, 18, 18)
                        .addComponent(TextCostoproduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelCosto))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jcboxTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(LabelPrecioVent))
                            .addComponent(TextPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIvap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LitsadeProovedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonIngresar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton5)
                                .addComponent(Boton_cancelar)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButton2)
                        .addGap(39, 39, 39))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextCostoproducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCostoproducActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCostoproducActionPerformed

    private void TextPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPrecioActionPerformed

    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed
        
         if (ValidarCamposVacios(TextCodProduct, TextDescripcion, TextCostoproduc, TextPrecio) && LitsadeProovedores.getSelectedIndex() > 0) {
            JOptionPane.showMessageDialog(this, "Faltan datos en los campos.");
        } else {
        //Producto producto = new Producto_tipo_comida( idProducto,  NombreProducto,  PrecioVenta,  PrecioCosto,  IvaProducto,  stock);
            //cliente = new Bono_Dotacion_Ropade_Trabajo(nombre, apellido, Cedula, cargo, sueldo);
            //cliente = new Bonos_hijos_empleado(nombre, apellido, Cedula, cargo, sueldo);

             
            if (prodAc == null) {
                // TODO add your handling code here:
                log(String.valueOf(prodAc == null));
                int id_producto = Integer.parseInt(TextCodProduct.getText());
                String Descripcion_prod = TextDescripcion.getText();
                double Costo_Venta_prod = Double.parseDouble(TextCostoproduc.getText());
                double Precio_prod = Double.parseDouble(TextPrecio.getText());
                int Codigo_proveedor = ((Proveedor) LitsadeProovedores.getSelectedItem()).getIdProveedor();
                double ivaproducto = Double.parseDouble(txtIvap.getText());
                Object tipodelproducto=jcboxTipoProducto.getSelectedItem();
                try {
                    boolean res = obj.AgregarProducto(id_producto, Descripcion_prod,
                            Costo_Venta_prod,
                            Precio_prod,
                            Codigo_proveedor,
                            ivaproducto,
                            (String)tipodelproducto);
                    if (res == true) {
                        JOptionPane.showMessageDialog(null, "Producto Registrado Correctamente");
                        //this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo ingresar un nuevo producto ya existe en la base"
                                + "de datos");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "por favor verifique la conexion del servidor ");

                }
            } else {
                
                log("actualizo");
                double Costo_Venta_prod = Double.parseDouble(TextCostoproduc.getText());
                double Precio_prod = Double.parseDouble(TextPrecio.getText());
                double ivaproducto = Double.parseDouble(txtIvap.getText());
                
                prodAc.setPrecioCosto(Costo_Venta_prod);
                prodAc.setPrecioVenta(Precio_prod);
                prodAc.setIvaProducto(ivaproducto);
                
                obj.actualizaProducto(prodAc);
                JOptionPane.showMessageDialog(this, "Producto actualizado Correctamente");
                
            }

        }
         
//       this.dispose(); 
        
    }//GEN-LAST:event_BotonIngresarActionPerformed

    private void TextCodProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCodProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCodProductActionPerformed

    private void Boton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_cancelarActionPerformed
        this.setVisible(false);
        VistaPrincipal retornar = new VistaPrincipal();
        retornar.setVisible(true); //       // TODO add your handling code here:
    }//GEN-LAST:event_Boton_cancelarActionPerformed

    private void LitsadeProovedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LitsadeProovedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LitsadeProovedoresActionPerformed

    /*implementacion patron decorador*/
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ///Captura los datos que se acaban de ingresar del producto
        int id_producto = Integer.parseInt(TextCodProduct.getText());
        String Descripcion_prod = TextDescripcion.getText();
        double Costo_Venta_prod = Double.parseDouble(TextCostoproduc.getText());
        double Precio_prod = Double.parseDouble(TextPrecio.getText());
        int Codigo_proveedor = ((Proveedor) LitsadeProovedores.getSelectedItem()).getIdProveedor();
        double ivaproducto = Double.parseDouble(txtIvap.getText());
        //Captura el tipo del producto
        Object tipodelproducto=jcboxTipoProducto.getSelectedItem();
        //Se crea un nuevo objeto de tipo producto para hacer el llamado al decorador
        Producto p;
        //Switch para Ingresar al tipo de producto deseado 
                switch((String) tipodelproducto)
                {
                    case "Alimentos":
                        log(String.valueOf(tipodelproducto));
                        //Creamos un nuevo producto de tipo en este caso comida y le enviamois
                        //el id y el tipo de producto
                        p = new Producto_tipo_comida(id_producto,(String) tipodelproducto);
                        //el producto p , ahora tendra una adicion de marca del producto
                        //ingreso
                        p= new Marca_del_producto(p,id_producto, Descripcion_prod,Costo_Venta_prod,Precio_prod,ivaproducto,Costo_Venta_prod);
                        p.getMarca_product();
                        p.getPeso_product();
                        //ingreso
                    break;
                    case "Ropa": 
                        p = new Producto_tipo_ropa(id_producto,(String) tipodelproducto);
                        p= new Marca_del_producto(p,id_producto, Descripcion_prod,Costo_Venta_prod,Precio_prod,ivaproducto,Costo_Venta_prod);
                        p.getMarca_product();
                        p.getPeso_product();


                     break;
                        
                    case "Automotor": 
                        p = new Producto_tipo_automotor(id_producto,(String) tipodelproducto);
                        p= new Marca_del_producto(p,id_producto, Descripcion_prod,Costo_Venta_prod,Precio_prod,ivaproducto,Costo_Venta_prod);
                        p.getMarca_product();
                        p.getPeso_product();

                        break;
                        
                    case "Electronico": 
                        p = new Producto_tipo_electronico(id_producto,(String) tipodelproducto);
                        p= new Marca_del_producto(p,id_producto, Descripcion_prod,Costo_Venta_prod,Precio_prod,ivaproducto,Costo_Venta_prod);
                        p.getMarca_product();
                        p.getPeso_product();


                        break;    
                }  
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //METODO PARA BUSCAR EL PRODUCTO
        prodAc = obj.consultarProductoObserver(Integer.parseInt(TextCodProduct.getText()));
        if (prodAc == null) {
            JOptionPane.showMessageDialog(this, "No se encuentra producto con ese ID");
        } else {
            TextCodProduct.setText(prodAc.getIdProducto() + "");
            TextCodProduct.setEnabled(false);
            TextDescripcion.setText(prodAc.getNombreProducto());
            TextDescripcion.setEnabled(false);
            TextCostoproduc.setText(prodAc.getPrecioCosto() + "");
            TextPrecio.setText(prodAc.getPrecioVenta() + "");
            txtIvap.setText(prodAc.getIvaProducto() + "");
            for (Proveedor pr : proveedores) {
                if (pr.getIdProveedor() == prodAc.getIdproveedor()) {
                    LitsadeProovedores.setSelectedItem(pr);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        VistaPrincipal retornar = new VistaPrincipal();
        retornar.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
    public boolean ValidarCamposVacios(JTextField... textFields) {
        for (JTextField textField : textFields) {
            if (textField.getText().isEmpty()) {
                return true;
            }
        }
        return false;
    }
    
    

 public  void ValidadSoloNumeros(JTextField a)
{
    a.addKeyListener(new KeyAdapter(){
        public void keyTyped(KeyEvent e)
    {
        Character ch = e.getKeyChar(); 
        if (!Character.isDigit(e.getKeyChar()) && (ch != KeyEvent.VK_BACK_SPACE)&& (ch !='.')) { 
         // if(((ch < '0') || (ch > '9')) && (ch != KeyEvent.VK_BACK_SPACE)&& (ch !='.')){ 
   
            getToolkit().beep();
            e.consume();;
        }
    }
            });
}
    
    
     public  void ValidadCaracteres(JTextField a)
{
    a.addKeyListener(new KeyAdapter(){
        public void keyTyped(KeyEvent e)
    {
        Character ch = e.getKeyChar(); 
        if (Character.isDigit(e.getKeyChar())) { 
         // if(((ch < '0') || (ch > '9')) && (ch != KeyEvent.VK_BACK_SPACE)&& (ch !='.')){ 
   
            getToolkit().beep();
            e.consume();;
        }
        
    }
            });
}    
     public void log(String a)
    {
   System.out.println("la valor  = "+" "+a);   
    } 
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JButton Boton_cancelar;
    private javax.swing.JLabel LabelCosto;
    private javax.swing.JLabel LabelDescripcion;
    private javax.swing.JLabel LabelPrecioVent;
    private javax.swing.JLabel LabelProducto;
    public static javax.swing.JComboBox LitsadeProovedores;
    private javax.swing.JTextField TextCodProduct;
    private javax.swing.JTextField TextCostoproduc;
    private javax.swing.JTextField TextDescripcion;
    private javax.swing.JTextField TextPrecio;
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcboxTipoProducto;
    private javax.swing.JTextField txtIvap;
    // End of variables declaration//GEN-END:variables
}
