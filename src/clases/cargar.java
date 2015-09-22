/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JProgressBar;

/**
 *
 * @author IsraelCM
 */
public class cargar extends Thread{
    JProgressBar progreso;
    public cargar(JProgressBar progreso){
        super();
        this.progreso=progreso;
    }
    @Override
    public void run(){
        for(int i=1;i<=100;i++){
            progreso.setValue(i);
            pausa(30);
        }
    }
    public void pausa(int mlSeg){
        try{
            Thread.sleep(mlSeg);
        }
        catch(Exception e){
            
        }
    }
}
