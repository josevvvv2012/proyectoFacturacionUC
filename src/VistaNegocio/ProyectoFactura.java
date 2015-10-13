/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaNegocio;

import UpperEssential.UpperEssentialLookAndFeel;
import debug.Consola;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author negro
 */
public class ProyectoFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            UIManager.setLookAndFeel(new UpperEssentialLookAndFeel());

        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        Principal Principal = new Principal();
        Principal.setVisible(true);
        
        
        Consola Consola = new Consola();

    }
    
}
