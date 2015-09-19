/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.Conexion;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Jose Vanegas - jvanegas@ucentral.edu.co
 */
public class VistaConexionBD extends javax.swing.JFrame {

    /**
     * Creates new form InterfazP
     */
    public VistaConexionBD() {
        initComponents();
        ValidadCaracteres(txtNombreBD);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnTest = new javax.swing.JButton();
        btnCreaBd = new javax.swing.JButton();
        ComboBoxDrivers = new javax.swing.JComboBox();
        jlSalida = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreBD = new javax.swing.JTextField();
        txtRespuesta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("DRIVER");

        jLabel2.setBackground(new java.awt.Color(102, 255, 255));
        jLabel2.setText("USER");

        jLabel3.setBackground(new java.awt.Color(102, 255, 255));
        jLabel3.setText("PASSWORD");

        txtPassword.setBackground(new java.awt.Color(204, 204, 204));

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnTest.setBackground(new java.awt.Color(204, 204, 204));
        btnTest.setText("TEST ");
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestActionPerformed(evt);
            }
        });

        btnCreaBd.setBackground(new java.awt.Color(204, 204, 204));
        btnCreaBd.setText("CREAR BASE DE DATOS");
        btnCreaBd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaBdActionPerformed(evt);
            }
        });

        ComboBoxDrivers.setBackground(new java.awt.Color(204, 204, 204));
        ComboBoxDrivers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "com.mysql.jdbc.Driver" }));

        jLabel4.setBackground(new java.awt.Color(102, 255, 255));
        jLabel4.setText("NOMBRE BASE DE DATOS");

        txtNombreBD.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreBDActionPerformed(evt);
            }
        });

        txtRespuesta.setBackground(new java.awt.Color(102, 255, 102));
        txtRespuesta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtRespuesta.setForeground(new java.awt.Color(255, 0, 0));
        txtRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtRespuesta.setText("Esperando Conexion..");

        jLabel5.setText("Diligencia los campos correspondientes como tiene configurado");

        jLabel6.setText("el servicio de base de datos ");

        jLabel7.setText("User y Password");

        jLabel8.setText("@Jose Vanegas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNombre))
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboBoxDrivers, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombreBD)
                                .addGap(1, 1, 1))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnTest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreaBd)
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(68, 68, 68))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(txtRespuesta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36)
                        .addComponent(jlSalida))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ComboBoxDrivers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombreBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreaBd)
                    .addComponent(btnTest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlSalida)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel8))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        // TODO add your handling code here:

        if (ValidarCamposVacios(txtNombre, txtNombreBD)) {
            JOptionPane.showMessageDialog(this, "Faltan datos en los campos.");

        } else {

            try {
                if (Conexion.conectar()) {
                    txtRespuesta.setText("Conexion Exitosa");

                    this.setVisible(false);
                    /*        
                    Vista.VistaPrincipal.btnCalculosMensuales.setEnabled(true);
                    Vista.VistaPrincipal.btnCargarEmpleado.setEnabled(true);
                    Vista.VistaPrincipal.btnNominaGeneral.setEnabled(true);
                    Vista.VistaPrincipal.btnNominaPorCedula.setEnabled(true);
                    Vista.VistaPrincipal.btnConfiguracion.setEnabled(false);
*/
                    
                    
                } else {
                    txtRespuesta.setText("Conexion Fallida");
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }

        }

    }//GEN-LAST:event_btnTestActionPerformed

    private void txtNombreBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreBDActionPerformed

    private void btnCreaBdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaBdActionPerformed
        // TODO add your handling code here:

        if (ValidarCamposVacios(txtNombre, txtNombreBD)) {
            JOptionPane.showMessageDialog(this, "Faltan datos en los campos.");

        } else {

            if (ValidarCamposVacios(txtNombre, txtNombreBD)) {
                JOptionPane.showMessageDialog(this, "Faltan datos en los campos.");

            } else {

                try {

                    if (Conexion.createDatabase()) {
                        txtRespuesta.setText("Creacion Exitosa Base de datos");
                        

                        if (Conexion.createTable()) {
                            txtRespuesta.setText("Creacion Exitosa script sql");
                            
                                this.setVisible(false);
/*
                     Vista.VistaPrincipal.btnCalculosMensuales.setEnabled(true);
                    Vista.VistaPrincipal.btnCargarEmpleado.setEnabled(true);
                    Vista.VistaPrincipal.btnNominaGeneral.setEnabled(true);
                    Vista.VistaPrincipal.btnNominaPorCedula.setEnabled(true);
                    Vista.VistaPrincipal.btnConfiguracion.setEnabled(false);
*/
                        } else {
                            txtRespuesta.setText("Creacion Fallida script sql");
                        }

                    } else {
                        txtRespuesta.setText("Creacion Fallida de Base de datos ");
                    }

                } catch (Exception ex) {
                    System.out.println(ex);
                }

            }
        }
    }//GEN-LAST:event_btnCreaBdActionPerformed

    /*
     @autor Jose Vanegas
     */
    public void ValidadCaracteres(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                Character ch = e.getKeyChar();
                if (Character.isDigit(e.getKeyChar()) && !Character.isDigit(e.getKeyChar()) ) {
                    // if(((ch < '0') || (ch > '9')) && (ch != KeyEvent.VK_BACK_SPACE)&& (ch !='.')){ 

                    getToolkit().beep();
                    e.consume();;
                }

            }
        });
    }


    /*
     @autor Jose Vanegas
     */
    public boolean ValidarCamposVacios(JTextField... textFields) {
        for (JTextField textField : textFields) {
            if (textField.getText().isEmpty()) {
                return true;
            }
        }
        return false;
    }
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaConexionBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaConexionBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaConexionBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaConexionBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaConexionBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox ComboBoxDrivers;
    public static javax.swing.JButton btnCreaBd;
    public static javax.swing.JButton btnTest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jlSalida;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtNombreBD;
    public static javax.swing.JTextField txtPassword;
    public static javax.swing.JLabel txtRespuesta;
    // End of variables declaration//GEN-END:variables
}
