package VistaNegocio;

import javax.swing.JProgressBar;

public class HiloProgreso extends Thread
{
    JProgressBar progreso;

    public HiloProgreso(JProgressBar progreso1)
    {        
        super();
        this.progreso=progreso1;
    }
    public void run()
    {
        int l=0;
        for(l=1;l<=100;l++)
        {
            progreso.setValue(l);
            pausa(20);
        }
   
    }
    public void pausa(int mlSeg)
    {
        try
        {
            // pausa para el splash
            Thread.sleep(mlSeg);
        }catch(Exception e){}
    }
}
