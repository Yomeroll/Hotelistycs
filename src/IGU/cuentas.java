/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package IGU;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author scben
 */
public class cuentas extends javax.swing.JPanel {

    /**
     * Creates new form cuentas
     */
    public cuentas() {
        initComponents();
    }

    public void resetTxtUsuario(){
        if (txt_Usuario.getText().isEmpty()){
            txt_Usuario.setText("Máximo 15 caractéres");
            txt_Usuario.setForeground(new Color(204,204,204));
            
        }else if((txt_Usuario.getText()).equals("admin")){
            JOptionPane.showMessageDialog(this, "Nombre de usuario invalido");
            txt_Usuario.setText("");
            txt_Usuario.requestFocus();
            
        }
    }
                
    public void resetTxtNombreU(){
        if (txt_nombre_U.getText().isEmpty()){
            txt_nombre_U.setText("Escribe tú nombre (s)");
            txt_nombre_U.setForeground(new Color(204,204,204));
        }
    }
    
    public void resetTxtPat(){
        if(txt_apellido_PU.getText().isEmpty()){
            txt_apellido_PU.setText("Escribe tú apellido paterno");
            txt_apellido_PU.setForeground(new Color(204,204,204));
        }
    }
    
    public void resetTxtMat(){
        if(txt_apellido_MU.getText().isEmpty()){
            txt_apellido_MU.setText("Escribe tú apellido materno");
            txt_apellido_MU.setForeground(new Color(204,204,204));
        }
    }
    
    public void resetContra(){
        if(String.valueOf(txt_Password.getPassword()).isEmpty()){
            txt_Password.setText("********");
            txt_Password.setForeground(new Color(204,204,204));
        }
    }
    
    public void resetConfirm(){
        if(String.valueOf(txt_PasswordConfirm.getPassword()).isEmpty()){
            txt_PasswordConfirm.setText("********");
            txt_PasswordConfirm.setForeground(new Color(204,204,204));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_nombre_U = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txt_apellido_PU = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        textoNU = new javax.swing.JLabel();
        txt_apellido_MU = new javax.swing.JTextField();
        textoN = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        textoPat = new javax.swing.JLabel();
        textoMat = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        txt_PasswordConfirm = new javax.swing.JPasswordField();
        jSeparator6 = new javax.swing.JSeparator();
        txt_Password = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        textoCN = new javax.swing.JLabel();
        textoCC = new javax.swing.JLabel();
        textoNU1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        labelHabitaciones = new javax.swing.JLabel();
        panelAgregar = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JLabel();
        panelSiguiente2 = new javax.swing.JPanel();
        btnSiguiente2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 670));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        txt_nombre_U.setFont(new java.awt.Font("Heebo Light", 0, 14)); // NOI18N
        txt_nombre_U.setForeground(new java.awt.Color(204, 204, 204));
        txt_nombre_U.setText("Escribe tú nombre (s)");
        txt_nombre_U.setBorder(null);
        txt_nombre_U.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_nombre_UMousePressed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        txt_apellido_PU.setFont(new java.awt.Font("Heebo Light", 0, 14)); // NOI18N
        txt_apellido_PU.setForeground(new java.awt.Color(204, 204, 204));
        txt_apellido_PU.setText("Escribe tú apellido paterno");
        txt_apellido_PU.setBorder(null);
        txt_apellido_PU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_apellido_PUMousePressed(evt);
            }
        });
        txt_apellido_PU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellido_PUActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        textoNU.setFont(new java.awt.Font("Dosis Medium", 0, 18)); // NOI18N
        textoNU.setText("Nombre de Usuario:");

        txt_apellido_MU.setFont(new java.awt.Font("Heebo Light", 0, 14)); // NOI18N
        txt_apellido_MU.setForeground(new java.awt.Color(204, 204, 204));
        txt_apellido_MU.setText("Escribe tú apellido materno");
        txt_apellido_MU.setBorder(null);
        txt_apellido_MU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_apellido_MUMousePressed(evt);
            }
        });

        textoN.setFont(new java.awt.Font("Dosis Medium", 0, 18)); // NOI18N
        textoN.setText("Nombre:");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        textoPat.setFont(new java.awt.Font("Dosis Medium", 0, 18)); // NOI18N
        textoPat.setText("Apellido Paterno:");

        textoMat.setFont(new java.awt.Font("Dosis Medium", 0, 18)); // NOI18N
        textoMat.setText("Apellido Materno:");

        txt_Usuario.setFont(new java.awt.Font("Heebo Light", 0, 14)); // NOI18N
        txt_Usuario.setForeground(new java.awt.Color(204, 204, 204));
        txt_Usuario.setText("Máximo 15 caractéres");
        txt_Usuario.setBorder(null);
        txt_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_UsuarioMousePressed(evt);
            }
        });
        txt_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsuarioActionPerformed(evt);
            }
        });

        txt_PasswordConfirm.setFont(new java.awt.Font("Dosis ExtraBold", 0, 18)); // NOI18N
        txt_PasswordConfirm.setForeground(new java.awt.Color(204, 204, 204));
        txt_PasswordConfirm.setText("********");
        txt_PasswordConfirm.setBorder(null);
        txt_PasswordConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_PasswordConfirmMousePressed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        txt_Password.setFont(new java.awt.Font("Dosis ExtraBold", 0, 18)); // NOI18N
        txt_Password.setForeground(new java.awt.Color(204, 204, 204));
        txt_Password.setText("********");
        txt_Password.setBorder(null);
        txt_Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_PasswordMousePressed(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        textoCN.setFont(new java.awt.Font("Dosis Medium", 0, 18)); // NOI18N
        textoCN.setText("Contraseña nueva (8 caractéres):");

        textoCC.setFont(new java.awt.Font("Dosis Medium", 0, 18)); // NOI18N
        textoCC.setText("Confirma tú contraseña");

        textoNU1.setFont(new java.awt.Font("Dosis Medium", 0, 18)); // NOI18N
        textoNU1.setText("Tipo de cuenta:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelHabitaciones.setFont(new java.awt.Font("Dosis Medium", 0, 24)); // NOI18N
        labelHabitaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHabitaciones.setText("Agrega cuentas para administradores y recepcionistas");

        panelAgregar.setBackground(new java.awt.Color(254, 133, 53));
        panelAgregar.setPreferredSize(new java.awt.Dimension(150, 50));

        btnAgregar.setFont(new java.awt.Font("Dosis Medium", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgregar.setText("AGREGAR");

        javax.swing.GroupLayout panelAgregarLayout = new javax.swing.GroupLayout(panelAgregar);
        panelAgregar.setLayout(panelAgregarLayout);
        panelAgregarLayout.setHorizontalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        panelAgregarLayout.setVerticalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelSiguiente2.setBackground(new java.awt.Color(254, 133, 53));

        btnSiguiente2.setFont(new java.awt.Font("Dosis Medium", 1, 18)); // NOI18N
        btnSiguiente2.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSiguiente2.setText("FINALIZAR");

        javax.swing.GroupLayout panelSiguiente2Layout = new javax.swing.GroupLayout(panelSiguiente2);
        panelSiguiente2.setLayout(panelSiguiente2Layout);
        panelSiguiente2Layout.setHorizontalGroup(
            panelSiguiente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSiguiente2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        panelSiguiente2Layout.setVerticalGroup(
            panelSiguiente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSiguiente2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoPat)
                            .addComponent(jSeparator3)
                            .addComponent(txt_apellido_PU, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoN)
                            .addComponent(textoNU)
                            .addComponent(jSeparator1)
                            .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2)
                            .addComponent(txt_nombre_U, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoMat)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_apellido_MU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator5)
                                    .addComponent(jSeparator6)
                                    .addComponent(textoCN)
                                    .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoCC)
                                    .addComponent(txt_PasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelSiguiente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(textoNU1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelHabitaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textoNU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textoMat)
                        .addGap(18, 18, 18)
                        .addComponent(txt_apellido_MU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textoN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nombre_U, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(textoPat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_apellido_PU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textoCN)
                                .addGap(42, 42, 42))
                            .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textoCC)
                                .addGap(42, 42, 42))
                            .addComponent(txt_PasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNU1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSiguiente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombre_UMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombre_UMousePressed
        if (txt_nombre_U.getText().equals("Escribe tú nombre (s)")){
            txt_nombre_U.setText("");
            txt_nombre_U.setForeground(Color.black);
        }

        resetTxtUsuario();
        resetTxtPat();
        resetTxtMat();
        resetContra();
        resetConfirm();
    }//GEN-LAST:event_txt_nombre_UMousePressed

    private void txt_apellido_PUMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_apellido_PUMousePressed
        if (txt_apellido_PU.getText().equals("Escribe tú apellido paterno")){
            txt_apellido_PU.setText("");
            txt_apellido_PU.setForeground(Color.black);
        }

        resetTxtUsuario();
        resetTxtNombreU();
        resetTxtMat();
        resetContra();
        resetConfirm();
    }//GEN-LAST:event_txt_apellido_PUMousePressed

    private void txt_apellido_PUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellido_PUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellido_PUActionPerformed

    private void txt_apellido_MUMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_apellido_MUMousePressed
        if (txt_apellido_MU.getText().equals("Escribe tú apellido materno")){
            txt_apellido_MU.setText("");
            txt_apellido_MU.setForeground(Color.black);
        }

        resetTxtUsuario();
        resetTxtNombreU();
        resetTxtPat();
        resetContra();
        resetConfirm();
    }//GEN-LAST:event_txt_apellido_MUMousePressed

    private void txt_UsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_UsuarioMousePressed

        if (txt_Usuario.getText().equals("Máximo 15 caractéres")){
            txt_Usuario.setText("");
            txt_Usuario.setForeground(Color.black);
        }

        resetTxtNombreU();
        resetTxtPat();
        resetTxtMat();
        resetContra();
        resetConfirm();
    }//GEN-LAST:event_txt_UsuarioMousePressed

    private void txt_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UsuarioActionPerformed

    private void txt_PasswordConfirmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_PasswordConfirmMousePressed
        if(String.valueOf(txt_PasswordConfirm.getPassword()).equals("********")){
            txt_PasswordConfirm.setText("");
            txt_PasswordConfirm.setForeground(Color.black);
        }

        resetTxtUsuario();
        resetTxtNombreU();
        resetTxtPat();
        resetTxtMat();
        resetContra();
    }//GEN-LAST:event_txt_PasswordConfirmMousePressed

    private void txt_PasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_PasswordMousePressed
        if(String.valueOf(txt_Password.getPassword()).equals("********")){
            txt_Password.setText("");
            txt_Password.setForeground(Color.black);
        }

        resetTxtUsuario();
        resetTxtNombreU();
        resetTxtPat();
        resetTxtMat();
        resetConfirm();
    }//GEN-LAST:event_txt_PasswordMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JLabel btnSiguiente;
    private javax.swing.JLabel btnSiguiente1;
    private javax.swing.JLabel btnSiguiente2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel labelHabitaciones;
    private javax.swing.JPanel panelAgregar;
    private javax.swing.JPanel panelSiguiente;
    private javax.swing.JPanel panelSiguiente1;
    private javax.swing.JPanel panelSiguiente2;
    private javax.swing.JLabel textoCC;
    private javax.swing.JLabel textoCN;
    private javax.swing.JLabel textoMat;
    private javax.swing.JLabel textoN;
    private javax.swing.JLabel textoNU;
    private javax.swing.JLabel textoNU1;
    private javax.swing.JLabel textoPat;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JPasswordField txt_PasswordConfirm;
    private javax.swing.JTextField txt_Usuario;
    private javax.swing.JTextField txt_apellido_MU;
    private javax.swing.JTextField txt_apellido_PU;
    private javax.swing.JTextField txt_nombre_U;
    // End of variables declaration//GEN-END:variables
}
