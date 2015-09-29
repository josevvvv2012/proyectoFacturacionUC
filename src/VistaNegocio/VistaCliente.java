/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaNegocio;

import Controlador.Conexion;
import Controlador.ControllerSql;
import Modelo.Funciones;
import java.awt.Desktop;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
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
public class VistaCliente extends javax.swing.JFrame {

  
    ControllerSql obj;

    /**
     * Creates new form VistaClientes
     */
    public VistaCliente() {
        initComponents();
        
           ValidadSoloNumeros(txtIdCliente);
        ValidadCaracteres(txt_nombre_cliente);
        ValidadCaracteres(txtDireccion);
        ValidadCaracteres(txtTelefono);
         
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_nombre_cliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txt_nombre_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_clienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre Cliente:");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/guardar.JPG"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setIconTextGap(-3);
        btnGuardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Cancelar.JPG"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setIconTextGap(-3);
        btnCancelar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Direccion");

        jLabel3.setText("Telefono");

        jLabel4.setText("Identificacion");

        jButton1.setText("Reporte Clientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_nombre_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(txtDireccion)
                    .addComponent(txtTelefono)
                    .addComponent(txtIdCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelar)
                            .addComponent(btnGuardar))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(45, 45, 45))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombre_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_clienteActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (ValidarCamposVacios(txtIdCliente, txt_nombre_cliente, txtDireccion, txtTelefono)) {
            JOptionPane.showMessageDialog(this, "Faltan datos en los campos.");

        } else {
            // TODO add your handling code here:
            int idCliente = Integer.parseInt(txtIdCliente.getText());
            String NombreCliente = txt_nombre_cliente.getText();
            String Direccion = txtDireccion.getText();
            String Telefono = txtTelefono.getText();

            try {
                obj = new ControllerSql();
                boolean res = obj.AgregarCliente(idCliente, NombreCliente, Direccion, Telefono);
                if (res == true) {
                    JOptionPane.showMessageDialog(null, "Usuario Registrado Correctamente");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo ingresar un nuevo Empleado ya existe en la base"
                            + "de datos");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "por favor verifique la conexion del servidor");

            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        VistaPrincipal retornar = new VistaPrincipal();
        retornar.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        
        pdf();
        String jasper="reporteclientes";
        ver(jasper);
        
    }//GEN-LAST:event_jButton1ActionPerformed
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
 
  /**
  * Ver reporte
  */
  public void ver( String jasper ){
     JasperReport jasperReport;
     JasperPrint jasperPrint;
     Conexion database1 = new Conexion();
     try{
        URL  in=this.getClass().getResource( "reporteclientes.jasper" );
        jasperReport=(JasperReport)JRLoader.loadObject(in);
        
        jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap() , database1.getConn());
        JasperViewer.viewReport(jasperPrint,false);
    }catch (JRException ex){
        System.err.println( "Error iReport: " + ex.getMessage() );
    }
  }

  /**
   * Imprimir reporte
   */
  public void pdf(){
      
      Conexion database1 = new Conexion();
        JasperReport jasperReport;
        JasperPrint jasperPrint;                
        try
        {
          //se carga el reporte
          URL  in=this.getClass().getResource( "reporteclientes.jasper");
          jasperReport=(JasperReport)JRLoader.loadObject(in);
          //se procesa el archivo jasper
          jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap(), database1.getConn() );
          //se crea el archivo PDF
          JasperExportManager.exportReportToPdfFile( jasperPrint, "./reporteclientes.pdf");
          //Se ejecuta directamete PDF
//          Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "/reporteclientes.pdf");
          
            try {
        Desktop desktop = Desktop.getDesktop();
        if (desktop.isSupported(Desktop.Action.OPEN)) {
            desktop.open(new File("reporteclientes.pdf"));
        } else {
            System.out.println("Open is not supported");
        }
    } catch (IOException exp) {
        exp.printStackTrace();
    }
        }
        catch (JRException ex)
        {
          System.err.println( "Error iReport: " + ex.getMessage() );
        }
  }     
     
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txt_nombre_cliente;
    // End of variables declaration//GEN-END:variables
}
