package lab7p2_víctorromero;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class administrarBarra extends Thread {

    private JProgressBar barra;
    private boolean avanzar;
    

    public administrarBarra(JProgressBar barra) {
        this.barra = barra;
        avanzar = true;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    
    
    @Override
     public void run() {
            int progress = 0;
            while (progress <= 100) {
                barra.setValue(progress);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                progress += 10;
            }
            JOptionPane.showMessageDialog(null, "Descarga Competada!");
                    
            System.out.println("Descarga Competada!");
        }
}
