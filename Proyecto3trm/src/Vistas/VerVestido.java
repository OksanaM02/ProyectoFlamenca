
package Vistas;

import Controlador.Controlador;
import Modelo.Vestido;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VerVestido extends javax.swing.JFrame {

    private Vestido vestido = new Vestido(0, "", "", 0,0);
    public VerVestido() {
        try {
            initComponents();
            setLocationRelativeTo(null);
            
            vestido = Controlador.verVestido1();
            
            descripcion.setText(vestido.getDescripcion());
            Precio.setText(String.valueOf(vestido.getPrecio()));
            Cantidad.setText(String.valueOf(vestido.getCantidad()));
            BufferedImage img;
            //método para procesar la imagen
            img = ImageIO.read(new File("src/fotos/"+vestido.getFoto()));
            // Create a ByteArrayOutputStream to write the image bytes to
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            // Write the image bytes to the ByteArrayOutputStream
            ImageIO.write(img, "jpg", baos);
            // Get the byte array from the ByteArrayOutputStream
            byte[] imageBytes = baos.toByteArray();
            ImageIcon imageIcon = new ImageIcon(imageBytes);
            Icon icon = new ImageIcon(imageIcon.getImage().getScaledInstance(campoFoto.getWidth(), campoFoto.getHeight(), Image.SCALE_DEFAULT));
            campoFoto.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(VerVestido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Precio = new javax.swing.JLabel();
        Cantidad = new javax.swing.JLabel();
        campoFoto = new javax.swing.JLabel();
        comentarios = new javax.swing.JButton();
        Izq = new javax.swing.JButton();
        comprar = new javax.swing.JButton();
        der1 = new javax.swing.JButton();
        descripcion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Precio.setBackground(new java.awt.Color(0, 74, 173));
        Precio.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        Precio.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 920, 140, 40));

        Cantidad.setBackground(new java.awt.Color(0, 74, 173));
        Cantidad.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        Cantidad.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 920, 140, 40));
        jPanel1.add(campoFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 420, 540));

        comentarios.setBackground(new java.awt.Color(0, 74, 173));
        comentarios.setFont(new java.awt.Font("Cambria", 3, 19)); // NOI18N
        comentarios.setForeground(new java.awt.Color(255, 255, 255));
        comentarios.setText("Comentarios");
        comentarios.setBorder(null);
        comentarios.setBorderPainted(false);
        comentarios.setContentAreaFilled(false);
        comentarios.setFocusPainted(false);
        comentarios.setFocusable(false);
        comentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comentariosActionPerformed(evt);
            }
        });
        jPanel1.add(comentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 880, 110, 50));

        Izq.setBackground(new java.awt.Color(0, 74, 173));
        Izq.setFont(new java.awt.Font("Rockwell", 3, 48)); // NOI18N
        Izq.setForeground(new java.awt.Color(102, 102, 102));
        Izq.setText("<");
        Izq.setBorder(null);
        Izq.setBorderPainted(false);
        Izq.setContentAreaFilled(false);
        Izq.setFocusPainted(false);
        Izq.setFocusable(false);
        Izq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IzqActionPerformed(evt);
            }
        });
        jPanel1.add(Izq, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 110, 50));

        comprar.setBackground(new java.awt.Color(0, 74, 173));
        comprar.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        comprar.setForeground(new java.awt.Color(255, 255, 255));
        comprar.setText("Comprar");
        comprar.setBorder(null);
        comprar.setBorderPainted(false);
        comprar.setContentAreaFilled(false);
        comprar.setFocusPainted(false);
        comprar.setFocusable(false);
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });
        jPanel1.add(comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 870, 110, 50));

        der1.setBackground(new java.awt.Color(0, 74, 173));
        der1.setFont(new java.awt.Font("Rockwell", 3, 48)); // NOI18N
        der1.setForeground(new java.awt.Color(102, 102, 102));
        der1.setText(">");
        der1.setBorder(null);
        der1.setBorderPainted(false);
        der1.setContentAreaFilled(false);
        der1.setFocusPainted(false);
        der1.setFocusable(false);
        der1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                der1ActionPerformed(evt);
            }
        });
        jPanel1.add(der1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, 110, 50));

        descripcion.setBackground(new java.awt.Color(0, 74, 173));
        descripcion.setFont(new java.awt.Font("Cambria", 3, 20)); // NOI18N
        descripcion.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 780, 490, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/fondo principal 3 (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IzqActionPerformed
    try {
  
           if(vestido.getCodigpo()==1)
           {
               vestido.setCodigo(30);
           }
               vestido.setCodigo(vestido.getCodigpo()-1);

               Vestido vestido2 = Controlador.vestidoNext(vestido.getCodigpo());
               Cantidad.setText(String.valueOf(vestido2.getCantidad()));
               descripcion.setText(vestido2.getDescripcion());
               Precio.setText(String.valueOf(vestido2.getPrecio()));
               BufferedImage img;
               //método para procesar la imagen
               img = ImageIO.read(new File("src/fotos/"+vestido2.getFoto()));
               // Create a ByteArrayOutputStream to write the image bytes to
               ByteArrayOutputStream baos = new ByteArrayOutputStream();
               // Write the image bytes to the ByteArrayOutputStream
               ImageIO.write(img, "jpg", baos);
               // Get the byte array from the ByteArrayOutputStream
               byte[] imageBytes = baos.toByteArray();
               ImageIcon imageIcon = new ImageIcon(imageBytes);
               Icon icon = new ImageIcon(imageIcon.getImage().getScaledInstance(campoFoto.getWidth(), campoFoto.getHeight(), Image.SCALE_DEFAULT));
               campoFoto.setIcon(icon);
        } catch (IOException ex) {
               Logger.getLogger(VerVestido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_IzqActionPerformed

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
       Vestido vestido2 = Controlador.vestidoNext(vestido.getCodigpo());
       Controlador.Comprar(vestido2);
       Controlador.Actualizar(Cantidad,vestido2);
    }//GEN-LAST:event_comprarActionPerformed

    private void der1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_der1ActionPerformed
        try {
           if(vestido.getCodigpo()==29)
           {
               vestido.setCodigo(0);
           }
            vestido.setCodigo(vestido.getCodigpo()+1);
            Vestido vestido2 = Controlador.vestidoNext(vestido.getCodigpo());
            Cantidad.setText(String.valueOf(vestido2.getCantidad()));
            descripcion.setText(vestido2.getDescripcion());
            Precio.setText(String.valueOf(vestido2.getPrecio()));
            BufferedImage img;
            //método para procesar la imagen
            img = ImageIO.read(new File("src/fotos/"+vestido2.getFoto()));
            // Create a ByteArrayOutputStream to write the image bytes to
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            // Write the image bytes to the ByteArrayOutputStream
            ImageIO.write(img, "jpg", baos);
            // Get the byte array from the ByteArrayOutputStream
            byte[] imageBytes = baos.toByteArray();
            ImageIcon imageIcon = new ImageIcon(imageBytes);
            Icon icon = new ImageIcon(imageIcon.getImage().getScaledInstance(campoFoto.getWidth(), campoFoto.getHeight(), Image.SCALE_DEFAULT));
            campoFoto.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(VerVestido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_der1ActionPerformed

    private void comentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comentariosActionPerformed

            Comentarios com = new Comentarios();
            com.setVisible(true);
    }//GEN-LAST:event_comentariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cantidad;
    private javax.swing.JButton Izq;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel campoFoto;
    private javax.swing.JButton comentarios;
    private javax.swing.JButton comprar;
    private javax.swing.JButton der1;
    private javax.swing.JLabel descripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
