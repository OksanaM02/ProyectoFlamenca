
package Vistas;
import Controlador.Controlador;
public class Comentarios extends javax.swing.JFrame {

    public Comentarios() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        VerComentarios = new javax.swing.JButton();
        AñadirComentario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VerComentarios.setBackground(new java.awt.Color(0, 74, 173));
        VerComentarios.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        VerComentarios.setForeground(new java.awt.Color(255, 255, 255));
        VerComentarios.setText("Ver Comentarios");
        VerComentarios.setBorder(null);
        VerComentarios.setBorderPainted(false);
        VerComentarios.setContentAreaFilled(false);
        VerComentarios.setFocusPainted(false);
        VerComentarios.setFocusable(false);
        VerComentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerComentariosActionPerformed(evt);
            }
        });
        jPanel1.add(VerComentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 260, 50));

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
        jPanel1.add(AñadirComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 260, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/comentarios.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AñadirComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirComentarioActionPerformed
        this.dispose();
        AñadirComentario com = new AñadirComentario();
        com.setVisible(true);
    }//GEN-LAST:event_AñadirComentarioActionPerformed

    private void VerComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerComentariosActionPerformed
       this.dispose();
       VerComentarios vc = new VerComentarios();
       vc.setVisible(true);
       
    }//GEN-LAST:event_VerComentariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AñadirComentario;
    private javax.swing.JButton VerComentarios;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
