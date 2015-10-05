/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaNegocio;

import Controlador.ControllerSql;
import Decorador.Producto_tipo_comida;
import Funciones.FuncionesController;
import Modelo.Factura;
import Modelo.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author negro
 */
public class VistaFactura extends javax.swing.JFrame {

    ControllerSql ControllerSql = new ControllerSql();
     FuncionesController cc = new FuncionesController();
    Factura factura;
    public int nunfac;
    
    
    CallableStatement cts;
    Connection cn;
    ResultSet r;
    
  
    /**
     * Creates new form VistaFactura
     */
    public VistaFactura() {
        initComponents();
        cargarProductos();
        factura = new Factura();
        factura.setFecha_fact(new Date());
        jtFecha.setText(factura.getFecha_fact().toString());
        recargarTabla(); 
        
         try {
                // TODO add your handling cod e here:
                ResultSet rs;
               
              nunfac=1;
                   rs = ControllerSql.ConsultarIdFactura();
                while(rs.next()) {
               nunfac++;
                }
                String x = String.valueOf(nunfac);
                txtNoFactura.setText(x);
                
            } catch (SQLException ex) {
                //Logger.getLogger(VistaCalculosMensuales.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
    }
    
    private void cargarProductos(){
        jcProductos.setModel(new javax.swing.DefaultComboBoxModel(ControllerSql.listaProductos().toArray()));
        jcProductos.setSelectedIndex(-1);
    }
    
    private void recargarTabla(){
        Object[][] data = new Object[factura.getProductos().size()][5];
        for (int i = 0 ; i < factura.getProductos().size(); i++){
            Producto p = factura.getProductos().get(i);
            Object[] inter = new Object[5];
            inter[0] = p.getIdProducto();
            inter[1] = p.getNombreProducto();
            inter[2] = p.getCantidad();
            inter[3] = p.getPrecioVenta();
            inter[4] = p.getPrecioVenta() * p.getCantidad();
            data[i] = inter;
            
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            data,
            new String [] {
                "Item", "Descripcion", "Cantidad", "Valor Unitario", "Valor Total"
            }
        ));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNoFactura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtFecha = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCantidadProducto = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtDireccion = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Text_Subtotal_Producto = new javax.swing.JTextField();
        TextValorTotal_Iva = new javax.swing.JTextField();
        TextTotal_Factura_Pagar = new javax.swing.JTextField();
        jcProductos = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        btnPrueba = new javax.swing.JButton();
        btnPrueba2 = new javax.swing.JButton();
        txtPrueba = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Factura No");

        txtNoFactura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNoFactura.setForeground(new java.awt.Color(255, 0, 0));
        txtNoFactura.setEnabled(false);
        txtNoFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoFacturaActionPerformed(evt);
            }
        });

        jLabel2.setText("Documento del Cliente x Cedula");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre : ");

        jLabel4.setText("Direccion :");

        jLabel5.setText(" Telefono : ");

        txtNombreCliente.setEnabled(false);

        txtTelefonoCliente.setEnabled(false);
        txtTelefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoClienteActionPerformed(evt);
            }
        });

        jLabel6.setText("Codigo Producto");

        jLabel7.setText("Fecha de Factura:");

        jtFecha.setEnabled(false);

        jLabel11.setText("Cantidad del producto: x");

        jButton3.setText("Ingresar a la factura");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Nuevo producto");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Generar PDF de factura");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item", "Descripcion", "Cantidad", "Valor Unitario", "Valor Total"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        txtDireccion.setEnabled(false);

        jButton7.setText("Crear Cliente");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton5.setText("Guardar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setText("Cancelar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel10.setText("Subtotal  :");

        jLabel12.setText("Valor total con iva :");

        jLabel16.setText("Total factura para pagar :");

        jcProductos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcProductosActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar Fila");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnPrueba.setText("Lista de Clientes");
        btnPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPruebaActionPerformed(evt);
            }
        });

        btnPrueba2.setText("F2");
        btnPrueba2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrueba2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addComponent(jButton6)
                                .addGap(27, 27, 27)
                                .addComponent(jButton5)
                                .addGap(37, 37, 37)
                                .addComponent(jButton8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel16))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextTotal_Factura_Pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextValorTotal_Iva, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Text_Subtotal_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(57, 57, 57))))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jcProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrueba2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrueba))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton7)
                    .addComponent(btnPrueba))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrueba2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton4)
                        .addGap(13, 13, 13)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Text_Subtotal_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TextValorTotal_Iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(TextTotal_Factura_Pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5)
                    .addComponent(jButton8)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (ValidarCamposVacios(txtCedula)) {
            JOptionPane.showMessageDialog(this, "Faltan datos en los campos.");
        } else {

            try {
                // TODO add your handling cod e here:
                ResultSet rs;
                int Cedula = Integer.parseInt(txtCedula.getText());
                ControllerSql = new ControllerSql();
                rs = ControllerSql.ConsultarCliente(Cedula);

                if (rs.next()) {
                    txtDireccion.setText("" + rs.getString("dir_cliente"));
                    txtNombreCliente.setText(rs.getString("nom_cliente"));
                    txtTelefonoCliente.setText("" + rs.getString("tel_cliente"));
                    factura.setId_cliente(Cedula);
                }else{
                    JOptionPane.showMessageDialog(this, "Verifique la informacion del cliente");
                }
            } catch (SQLException ex) {
                //Logger.getLogger(VistaCalculosMensuales.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTelefonoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoClienteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        VistaIngresarProductos vip = new VistaIngresarProductos();
        vip.setVisible(true);
        vip.setLocationRelativeTo(this);
        cargarProductos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtNoFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoFacturaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jcProductos.getSelectedIndex() >= 0 && !ValidarCamposVacios(txtCantidadProducto)){
            Producto p = (Producto) jcProductos.getSelectedItem();
            Producto fac = new Producto_tipo_comida(p.getIdProducto(), p.getNombreProducto(), p.getPrecioVenta(), p.getPrecioCosto(), p.getIvaProducto());
            fac.setCantidad1(Integer.parseInt(txtCantidadProducto.getText()));
            factura.agregarProducto(fac);
            recargarTabla();
            factura.calcular();
            
          
            Text_Subtotal_Producto.setText(factura.getSubtotal()+"");
            TextValorTotal_Iva.setText((factura.getSubtotal() * factura.getValor_iva())+"");
            TextTotal_Factura_Pagar.setText(String.valueOf(factura.getTotal_fact()));

        }else{
            JOptionPane.showMessageDialog(this, "Existen campos sin diligenciar");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        VistaCliente vistacli = new VistaCliente();
        vistacli.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
      agregraFactura();
      agregarDetalleFactura();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jcProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcProductosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        // TODO add your handling code here:
         DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        //ahora obtenemos la fila selccionada
        int fila_select = jTable1.getSelectedRow();

        if(fila_select<0){
            // no se puede eliminar
            JOptionPane.showMessageDialog(this,"Tabla vacia o no ha seleccionado uan fila.");
        }else {
          // la eliminamos del modelo:
        modelo.removeRow(fila_select);
        }
        recalcular();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPruebaActionPerformed
        // TODO add your handling code here
        BuscarClienteFactura BuscarClienteFactura = new BuscarClienteFactura();
        BuscarClienteFactura.setVisible(true);
        BuscarClienteFactura.setLocation(835, 20);
        
    }//GEN-LAST:event_btnPruebaActionPerformed

    private void btnPrueba2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrueba2ActionPerformed
        // TODO add your handling code here:
        BuscarProductoFactura BuscarProductoFactura = new BuscarProductoFactura();
        BuscarProductoFactura.setVisible(true);
        BuscarProductoFactura.setLocation(835,365);
                
    }//GEN-LAST:event_btnPrueba2ActionPerformed

    /*
     @autor  Jose Vanegas jvanegasv@ucentral.edu.co
     */
    public boolean ValidarCamposVacios(JTextField... textFields) {
        for (JTextField textField : textFields) {
            if (textField.getText().isEmpty()) {
                return true;
            }
        }
        return false;
    }
    
    
    
    public void recalcular()
    {
     Object[][] data = new Object[factura.getProductos().size()][5];
     
        for (int i = 0 ; i < factura.getProductos().size(); i++){
            Producto p = factura.getProductos().get(i);
            Object[] inter = new Object[5];
            inter[0] = p.getIdProducto();
            inter[1] = p.getNombreProducto();
            inter[2] = p.getCantidad();
            inter[3] = p.getPrecioVenta();
            inter[4] = p.getPrecioVenta() * p.getCantidad();
            data[i] = inter; 
            factura.quitarProducto(p);         
           
            factura.calcular();
            Text_Subtotal_Producto.setText(String.valueOf(factura.getSubtotal()));
            TextValorTotal_Iva.setText(String.valueOf(factura.getSubtotal() * factura.getValor_iva()));
            TextTotal_Factura_Pagar.setText(String.valueOf(String.valueOf(factura.getTotal_fact())));
        }   
            //recargarTabla();
            //factura.calcular();
            

    }
    
    public void agregraFactura() {

          if (ControllerSql.AgregarFactura(factura)){
            JOptionPane.showMessageDialog(this, "Factura almacendada con exito");
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo guardar la factura");
        }
    }

    public void agregarDetalleFactura() {
 
        log("agregar Detalle de factura vista");
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            int nfac = Integer.parseInt(txtNoFactura.getText());
            
            int codpro = Integer.parseInt(jTable1.getValueAt(i, 0).toString());
            int cant = Integer.parseInt(jTable1.getValueAt(i, 2).toString());
            double pre_u = Double.parseDouble(jTable1.getValueAt(i, 3).toString());

            log("idfactura"+String.valueOf(nfac));
            log("idproducto_f "+String.valueOf(codpro));
            log("cantidadProducto "+String.valueOf(cant));
            log("valorProducto "+String.valueOf(pre_u));
            
             try {
                ControllerSql = new ControllerSql();
                boolean res = ControllerSql.AgregarDetalleFactura(nfac, codpro, cant,pre_u);
                if (res == true) {
                    JOptionPane.showMessageDialog(null, "La factura se  Registrado Correctamente");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo ingresar un nuevoEmpleado ya existe en la base"
                            + "de datos");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "por favor verifique la conexion del servidor");

            }
            
        }
        
        
    }

  public void log(String a) {
        System.out.println("la valor  = " + " " + a);
    }    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextTotal_Factura_Pagar;
    private javax.swing.JTextField TextValorTotal_Iva;
    private javax.swing.JTextField Text_Subtotal_Producto;
    private javax.swing.JButton btnPrueba;
    private javax.swing.JButton btnPrueba2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox jcProductos;
    private javax.swing.JTextField jtFecha;
    private javax.swing.JTextField txtCantidadProducto;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNoFactura;
    private javax.swing.JTextField txtNombreCliente;
    public static javax.swing.JTextField txtPrueba;
    private javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
