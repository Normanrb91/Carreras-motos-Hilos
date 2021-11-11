package carreras;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;

public class VentanaCarrera extends javax.swing.JFrame implements ActionListener{
    private ArrayList<String> podium = new ArrayList<String>();
    private ArrayList<String> podiumTime = new ArrayList<String>();
    private HiloCarrera hcM; HiloCarrera hcQ; HiloCarrera hcB; HiloCarrera hcZ;
    private Conometro conometro;
    int milisegundos = 0;
    int segundos = 0;

    public VentanaCarrera() {
        initComponents();
        btnInicio.addActionListener(this);
        btnReinicio.addActionListener(this);
        btnPausa.addActionListener(this);
        
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        proBagnaia = new javax.swing.JProgressBar();
        proQuartararo = new javax.swing.JProgressBar();
        proZarco = new javax.swing.JProgressBar();
        proMarquez = new javax.swing.JProgressBar();
        lblMarquez = new javax.swing.JLabel();
        lblQuartararo = new javax.swing.JLabel();
        lblBagnaia = new javax.swing.JLabel();
        lblZarco = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnPausa = new javax.swing.JButton();
        btnReinicio = new javax.swing.JButton();
        lblPodium = new javax.swing.JLabel();
        lblPuesto = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        proBagnaia.setForeground(new java.awt.Color(255, 51, 51));
        proBagnaia.setStringPainted(true);

        proQuartararo.setForeground(new java.awt.Color(102, 102, 255));
        proQuartararo.setStringPainted(true);

        proZarco.setForeground(new java.awt.Color(51, 51, 51));
        proZarco.setStringPainted(true);

        proMarquez.setForeground(new java.awt.Color(255, 153, 51));
        proMarquez.setStringPainted(true);

        lblMarquez.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMarquez.setText("Marquez");

        lblQuartararo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblQuartararo.setText("Quartararo");

        lblBagnaia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblBagnaia.setText("Bagnaia");

        lblZarco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblZarco.setText("Zarco");

        btnInicio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnInicio.setText("Iniciar");

        btnPausa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPausa.setText("Pausar");
        btnPausa.setEnabled(false);

        btnReinicio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnReinicio.setText("Reiniciar");
        btnReinicio.setEnabled(false);

        lblPodium.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblPodium.setText("Podium");

        lblPuesto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPuesto.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblTiempo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblTiempo.setText("00:00");

        lblTime.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblTime.setText("Tiempo:");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblMarquez)
                        .addComponent(lblQuartararo)
                        .addComponent(lblBagnaia)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnPausa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnReinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(proZarco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(proQuartararo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(proBagnaia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(proMarquez, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblZarco))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPodium)
                        .addGap(92, 92, 92))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(lblTime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTiempo))
                            .addComponent(lblPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(27, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarquez)
                    .addComponent(lblPodium))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(proMarquez, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblQuartararo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proQuartararo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblBagnaia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proBagnaia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblZarco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proZarco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPausa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTime)
                    .addComponent(lblTiempo))
                .addGap(33, 33, 33))
        );

        lblPuesto.getAccessibleContext().setAccessibleName("");
        lblTime.getAccessibleContext().setAccessibleName("lblTime");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnInicio){
            inicioCarrera();
            btnPausa.setEnabled(true);
            btnInicio.setEnabled(false);
            btnReinicio.setEnabled(true);
        }else if(e.getSource() == btnReinicio){
            reinicioCarrera();
            btnPausa.setEnabled(false);
            btnInicio.setEnabled(true);
            btnReinicio.setEnabled(false);
        }else if(e.getSource() == btnPausa){
            pausaCarrera();
            btnPausa.setEnabled(false);
            btnInicio.setEnabled(true);
        }
    }
    
    private void inicioCarrera() {
        hcM = new HiloCarrera("Marquez", proMarquez, this);
        hcQ = new HiloCarrera("Quartararo", proQuartararo, this);
        hcB = new HiloCarrera("Bagnaia", proBagnaia, this);
        hcZ = new HiloCarrera("Zarco", proZarco, this);
        hcM.start();
        hcQ.start();
        hcB.start();
        hcZ.start();
        comprobarFinalizdoHilos().start();
        conometro = new Conometro(this);
        conometro.start();
    }
    
    private void pausaCarrera() {
        hcM.interrupt();
        hcQ.interrupt();
        hcB.interrupt();
        hcZ.interrupt();
        conometro.interrupt();
    }
    
    private void reinicioCarrera(){
        pausaCarrera();
        conometro.interrupt();
        proMarquez.setValue(0);
        proQuartararo.setValue(0);
        proBagnaia.setValue(0);
        proZarco.setValue(0);
        podium.clear();
        lblPuesto.setText("");
        lblTiempo.setText("00:00");
        milisegundos = 0;
        segundos = 0;
    }
    
    private Thread comprobarFinalizdoHilos(){
        return new Thread(){
            @Override
            public void run() {
                
                while(hcM.isAlive() || hcQ.isAlive() || hcB.isAlive() || hcZ.isAlive()){}
                conometro.interrupt();
                for (int i = 0; i < podium.size(); i++) {
                    String a = lblPuesto.getText();
                    lblPuesto.setText(a + "<html><p><strong>"+(i+1)+"º</strong> " + podium.get(i) + 
                                        "<br><strong>Tiempo:</strong> " +podiumTime.get(i) + "</p><br>");
                }
            }
        };
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnPausa;
    private javax.swing.JButton btnReinicio;
    private javax.swing.JLabel lblBagnaia;
    private javax.swing.JLabel lblMarquez;
    private javax.swing.JLabel lblPodium;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblQuartararo;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblZarco;
    private javax.swing.JPanel panel;
    private javax.swing.JProgressBar proBagnaia;
    private javax.swing.JProgressBar proMarquez;
    private javax.swing.JProgressBar proQuartararo;
    private javax.swing.JProgressBar proZarco;
    // End of variables declaration//GEN-END:variables

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCarrera(); 
            }
        });
    }

    public JButton getBtnPausa() {
        return btnPausa;
    }

    public ArrayList<String> getPodium() {
        return podium;
    }

    public ArrayList<String> getPodiumTime() {
        return podiumTime;
    }

    public JLabel getLblTiempo() {
        return lblTiempo;
    }
    
    
}
