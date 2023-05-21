
package Vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import javax.swing.Timer;


public class vista1 extends javax.swing.JFrame {

    public vista1() {
        initComponents();
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        iniciarCambioVista();
        setVisible(true);
    }
    
    private void iniciarCambioVista() {
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false); // Ocultar la vista actual
                
                Login vista2 = new Login();
                vista2.setVisible(true); // Mostrar la vista 2
                vista2.setLocationRelativeTo(null); // Centrar la vista 2 en la pantalla
            }
        });
        timer.setRepeats(false); // Detener el temporizador después del primer disparo
        timer.start(); // Iniciar el temporizador
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/vista principal.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
