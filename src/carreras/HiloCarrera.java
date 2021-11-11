package carreras;

import java.util.Random;
import javax.swing.JProgressBar;

public class HiloCarrera extends Thread{
    
    private String nombre;
    private JProgressBar barra;
    private VentanaCarrera ventana;
    int progreso = 0;

    public HiloCarrera(String nombre, JProgressBar barra, VentanaCarrera ventana) {
        this.nombre = nombre;
        this.barra = barra;
        this.ventana = ventana;
    }

    @Override
    public void run() {
        
        Random r = new Random();
        //int sleepRandom = r.nextInt(200-80)+80;
        if(barra.getValue() > 0) progreso = barra.getValue();
        
        try{
            while( progreso <= 100 && !interrupted()){
                int sleepRandom = r.nextInt(300-80)+80;
                Thread.sleep(sleepRandom);
                ejecutarCarrera();
            }
            
        }catch (Exception e) {
            this.interrupt();
        }
        
        if(progreso >= 100){
            ventana.getBtnPausa().setEnabled(false);
            ventana.getPodium().add(nombre);
            ventana.getPodiumTime().add(ventana.getLblTiempo().getText());
        }
        
    }

    private void ejecutarCarrera() {
        progreso++;
        barra.setValue(progreso);  
    }

}
