
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Franklin Garcia
 */
public class Hilo2 extends Thread {

    private JLabel tiempo;
    private canciones canciones;

    public Hilo2() {
    }

    public Hilo2(JLabel tiempo, canciones canciones) {
        this.tiempo = tiempo;
        this.canciones = canciones;
    }

    public JLabel getTiempo() {
        return tiempo;
    }

    public void setTiempo(JLabel tiempo) {
        this.tiempo = tiempo;
    }

    public canciones getCanciones() {
        return canciones;
    }

    public void setCanciones(canciones canciones) {
        this.canciones = canciones;
    }

    @Override
    public void run() {
        Principal p = new Principal();
        while (canciones.getDuracion() > 0) {
            canciones.setDuracion(canciones.getDuracion() - 1);
            tiempo.setText(canciones.getDuracion() + "");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            
        }
        JOptionPane.showMessageDialog(null, "hecho");
        p.jd_hilo.dispose();
    }

}
