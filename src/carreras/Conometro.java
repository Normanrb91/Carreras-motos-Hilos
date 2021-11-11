package carreras;

public class Conometro extends Thread{

    private VentanaCarrera ventana;

    public Conometro(VentanaCarrera ventana) {
        this.ventana = ventana;
    }
    
    @Override
    public void run() {
        try {
            
            while(!interrupted()){
                Thread.sleep(10);
                ejecutarConometro();
            }
       
        } catch (Exception e) {
            this.interrupt();
        }
    }

    private void ejecutarConometro() {
        ventana.milisegundos++;
        
        if(ventana.milisegundos > 59){
            ventana.milisegundos = 0;
            ventana.segundos++;
        }
        
        String txtMiliSegundos ="", txtSegundos ="";
        
        if(ventana.milisegundos < 10) txtMiliSegundos ="0" + ventana.milisegundos;
        else txtMiliSegundos= "" + ventana.milisegundos;
        
        
        if(ventana.segundos < 10) txtSegundos="0" + ventana.segundos;
        else txtSegundos="" + ventana.segundos;

        String reloj = txtSegundos + ":" + txtMiliSegundos;
        ventana.getLblTiempo().setText(reloj);
    }
    

    
}
