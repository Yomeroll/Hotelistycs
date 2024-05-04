package IGU;

import conexion.MetodosSQL;
import java.awt.Color;

/**
 *
 * @author scben
 */
public class inicio1 extends javax.swing.JFrame {
    
    public inicio1(){
        initComponents();
    }
    
    MetodosSQL sql = new MetodosSQL();
    
    
    int xMouse, yMouse;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoInicio1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JPanel();
        cerrarlb = new javax.swing.JLabel();
        panelInicio1 = new javax.swing.JPanel();
        iniciarSesionLbl = new javax.swing.JLabel();
        usuarioLbl = new javax.swing.JLabel();
        textfieldUsuario1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SeparadorUsuario1 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        passFiel = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        imNombreEmpresa = new javax.swing.JLabel();
        logoApp = new javax.swing.JLabel();
        fondoInicioder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        fondoInicio1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(254, 133, 53));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(254, 133, 53));

        cerrarlb.setFont(new java.awt.Font("Heebo Medium", 0, 18)); // NOI18N
        cerrarlb.setForeground(new java.awt.Color(255, 255, 255));
        cerrarlb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarlb.setText("X");
        cerrarlb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarlb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarlbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarlbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarlbMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCerrarLayout = new javax.swing.GroupLayout(btnCerrar);
        btnCerrar.setLayout(btnCerrarLayout);
        btnCerrarLayout.setHorizontalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrarlb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnCerrarLayout.setVerticalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrarlb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(970, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        fondoInicio1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelInicio1.setBackground(new java.awt.Color(255, 255, 255));
        panelInicio1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        iniciarSesionLbl.setFont(new java.awt.Font("Dosis ExtraBold", 0, 36)); // NOI18N
        iniciarSesionLbl.setText("INICIAR DE SESIÓN");

        usuarioLbl.setFont(new java.awt.Font("Dosis Medium", 0, 24)); // NOI18N
        usuarioLbl.setText("Usuario");

        textfieldUsuario1.setFont(new java.awt.Font("Dosis Medium", 0, 18)); // NOI18N
        textfieldUsuario1.setForeground(new java.awt.Color(204, 204, 204));
        textfieldUsuario1.setText("Ingrese su nombre de usuario");
        textfieldUsuario1.setBorder(null);
        textfieldUsuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textfieldUsuario1MousePressed(evt);
            }
        });
        textfieldUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldUsuario1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dosis Medium", 0, 24)); // NOI18N
        jLabel3.setText("Contraseña");

        SeparadorUsuario1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        passFiel.setFont(new java.awt.Font("Heebo ExtraBold", 0, 18)); // NOI18N
        passFiel.setForeground(new java.awt.Color(204, 204, 204));
        passFiel.setText("********");
        passFiel.setBorder(null);
        passFiel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passFielMousePressed(evt);
            }
        });
        passFiel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFielActionPerformed(evt);
            }
        });

        btnIniciar.setBackground(new java.awt.Color(254, 133, 53));

        jLabel1.setFont(new java.awt.Font("Dosis", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INICIAR");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnIniciarLayout = new javax.swing.GroupLayout(btnIniciar);
        btnIniciar.setLayout(btnIniciarLayout);
        btnIniciarLayout.setHorizontalGroup(
            btnIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        btnIniciarLayout.setVerticalGroup(
            btnIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel1.getAccessibleContext().setAccessibleName("botooonInicialLbl");

        javax.swing.GroupLayout panelInicio1Layout = new javax.swing.GroupLayout(panelInicio1);
        panelInicio1.setLayout(panelInicio1Layout);
        panelInicio1Layout.setHorizontalGroup(
            panelInicio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicio1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(panelInicio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textfieldUsuario1)
                    .addComponent(SeparadorUsuario1)
                    .addComponent(jSeparator1)
                    .addComponent(passFiel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(iniciarSesionLbl)
                    .addComponent(usuarioLbl))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        panelInicio1Layout.setVerticalGroup(
            panelInicio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicio1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(iniciarSesionLbl)
                .addGap(112, 112, 112)
                .addComponent(usuarioLbl)
                .addGap(18, 18, 18)
                .addComponent(textfieldUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparadorUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passFiel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        fondoInicio1.add(panelInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));

        imNombreEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empresanombre.png"))); // NOI18N
        fondoInicio1.add(imNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 300, 100));

        logoApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoApp.png"))); // NOI18N
        fondoInicio1.add(logoApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 300, 200));

        fondoInicioder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        fondoInicioder.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fondoInicioderMouseDragged(evt);
            }
        });
        fondoInicioder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fondoInicioderMousePressed(evt);
            }
        });
        fondoInicio1.add(fondoInicioder, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 300, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoInicio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoInicio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textfieldUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldUsuario1ActionPerformed
        
    }//GEN-LAST:event_textfieldUsuario1ActionPerformed

    private void passFielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFielActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFielActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void cerrarlbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarlbMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarlbMouseClicked

    private void cerrarlbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarlbMouseEntered
        btnCerrar.setBackground(Color.red);
        
    }//GEN-LAST:event_cerrarlbMouseEntered

    private void cerrarlbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarlbMouseExited
        btnCerrar.setBackground(new Color(254,133,53));
    }//GEN-LAST:event_cerrarlbMouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        btnIniciar.setBackground(new Color(254,163,51));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        btnIniciar.setBackground(new Color(254,133,53));
    }//GEN-LAST:event_jLabel1MouseExited

    private void textfieldUsuario1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfieldUsuario1MousePressed
        
        if (textfieldUsuario1.getText().equals("Ingrese su nombre de usuario")){
            textfieldUsuario1.setText("");
            textfieldUsuario1.setForeground(Color.black);
        }
        if (String.valueOf(passFiel.getPassword()).isEmpty()){
            passFiel.setText("********");
            passFiel.setForeground(new Color(204,204,204));
        }

    }//GEN-LAST:event_textfieldUsuario1MousePressed

    private void passFielMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passFielMousePressed
          
        if (String.valueOf(passFiel.getPassword()).equals("********")){
            passFiel.setText("");
            passFiel.setForeground(Color.black);
        }
        if (textfieldUsuario1.getText().isEmpty()){
            textfieldUsuario1.setText("Ingrese su nombre de usuario");
            textfieldUsuario1.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_passFielMousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        javax.swing.JOptionPane.showMessageDialog(this, "Registro Exitoso\nUsuario: " + textfieldUsuario1.getText() + "\nContraseña: "+ String.valueOf(passFiel.getPassword()));
    }//GEN-LAST:event_jLabel1MouseClicked

    private void fondoInicioderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoInicioderMouseDragged

    }//GEN-LAST:event_fondoInicioderMouseDragged

    private void fondoInicioderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoInicioderMousePressed

    }//GEN-LAST:event_fondoInicioderMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator SeparadorUsuario1;
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JPanel btnIniciar;
    private javax.swing.JLabel cerrarlb;
    private javax.swing.JPanel fondoInicio1;
    private javax.swing.JLabel fondoInicioder;
    private javax.swing.JPanel header;
    private javax.swing.JLabel imNombreEmpresa;
    private javax.swing.JLabel iniciarSesionLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logoApp;
    private javax.swing.JPanel panelInicio1;
    private javax.swing.JPasswordField passFiel;
    private javax.swing.JTextField textfieldUsuario1;
    private javax.swing.JLabel usuarioLbl;
    // End of variables declaration//GEN-END:variables
}
