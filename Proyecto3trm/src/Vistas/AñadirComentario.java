
package Vistas;

import Controlador.Controlador;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AñadirComentario extends javax.swing.JFrame {

    public AñadirComentario() {
        initComponents();
        setLocationRelativeTo(null);
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MiTexto = new javax.swing.JTextField();
        AñadirComentario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MiTexto.setBackground(new java.awt.Color(230, 237, 255));
        MiTexto.setText("Escribe tu comentario...");
        jPanel1.add(MiTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 270, 220));

        AñadirComentario.setBackground(new java.awt.Color(0, 74, 173));
        AñadirComentario.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        AñadirComentario.setForeground(new java.awt.Color(255, 255, 255));
        AñadirComentario.setText("Añadir Comentario");
        AñadirComentario.setBorder(null);
        AñadirComentario.setBorderPainted(false);
        AñadirComentario.setContentAreaFilled(false);
        AñadirComentario.setFocusPainted(false);
        AñadirComentario.setFocusable(false);
        AñadirComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirComentarioActionPerformed(evt);
            }
        });
        jPanel1.add(AñadirComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 260, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/añadir comentario.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AñadirComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirComentarioActionPerformed

        String texto= MiTexto.getText();
              
        try {
            Controlador.AñadirCom(texto);
        } catch (IOException ex) {
            Logger.getLogger(AñadirComentario.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        this.dispose();
        
                    
       
    }//GEN-LAST:event_AñadirComentarioActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AñadirComentario;
    private javax.swing.JTextField MiTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
