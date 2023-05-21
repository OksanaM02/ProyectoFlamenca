
package Vistas;
import Controlador.Controlador;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        
        Registrar.setFocusPainted(false);
        Registrar.setBorderPainted(false);
        
        Entrar.setBorderPainted(false);
        Entrar.setFocusPainted(false);

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        campoUsuario = new javax.swing.JTextField();
        campoContrasena = new javax.swing.JPasswordField();
        Usuarios = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();
        Entrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setMinimumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(1000, 1000));

        jPanel2.setForeground(new java.awt.Color(102, 255, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel2.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoUsuario.setFont(new java.awt.Font("Palatino Linotype", 0, 36)); // NOI18N
        campoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 360, 60));

        campoContrasena.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        campoContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoContrasenaActionPerformed(evt);
            }
        });
        jPanel2.add(campoContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 360, 60));

        Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/Usuarios (1) (1).png"))); // NOI18N
        Usuarios.setText("jButton1");
        Usuarios.setBorder(null);
        Usuarios.setMaximumSize(new java.awt.Dimension(150, 140));
        Usuarios.setMinimumSize(new java.awt.Dimension(150, 150));
        Usuarios.setPreferredSize(new java.awt.Dimension(150, 150));
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });
        jPanel2.add(Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 140, -1));

        Registrar.setBackground(new java.awt.Color(0, 74, 173));
        Registrar.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setText("Registrar");
        Registrar.setBorder(null);
        Registrar.setBorderPainted(false);
        Registrar.setContentAreaFilled(false);
        Registrar.setFocusPainted(false);
        Registrar.setFocusable(false);
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 650, 110, 50));

        Entrar.setBackground(new java.awt.Color(0, 74, 173));
        Entrar.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        Entrar.setForeground(new java.awt.Color(255, 255, 255));
        Entrar.setText("Entrar");
        Entrar.setBorder(null);
        Entrar.setBorderPainted(false);
        Entrar.setContentAreaFilled(false);
        Entrar.setFocusPainted(false);
        Entrar.setFocusable(false);
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        jPanel2.add(Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 650, 110, 50));

        jLabel3.setBackground(new java.awt.Color(0, 74, 173));
        jLabel3.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTRASEÑA");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 210, 50));

        jLabel2.setBackground(new java.awt.Color(0, 74, 173));
        jLabel2.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 210, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/Fondo usuario 1 (1).png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(235, 235, 235))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsuarioActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        String nombreUsuario = campoUsuario.getText();
        String contrasena = String.valueOf(campoContrasena.getPassword());
        Controlador.Registrar(nombreUsuario, contrasena);
        campoUsuario.setText("");
        campoContrasena.setText("");
    }//GEN-LAST:event_RegistrarActionPerformed

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed

        String nombreUsuario = campoUsuario.getText();
        String contrasena = String.valueOf(campoContrasena.getPassword());
        if(Controlador.Login(nombreUsuario, contrasena)){
            this.dispose();
            VerVestido v3 = new VerVestido();
            v3.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
        }
        
      
    }//GEN-LAST:event_EntrarActionPerformed

    private void campoContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoContrasenaActionPerformed

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        EliminarUsuario user = new EliminarUsuario();
        user.setVisible(true);
    }//GEN-LAST:event_UsuariosActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entrar;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton Usuarios;
    private javax.swing.JPasswordField campoContrasena;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
