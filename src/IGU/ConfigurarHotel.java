/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IGU;

import conexion.MetodosSQL;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author scben
 */
public class ConfigurarHotel extends javax.swing.JFrame {
    
    public ConfigurarHotel() {
        initComponents();
        NombreDireccion nDir=new NombreDireccion();
        mV.cambiarPanelConfig(nDir, contenedor);
    }
        
    //MetodosSQL sql = new MetodosSQL();
    metodosVentanas mV = new metodosVentanas();
    
    public void ShowPanelB(JPanel p, int x, int y){
    
    }
    
    int xMouse, yMouse;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JPanel();
        cerrarlb = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panNombreDireccion = new javax.swing.JPanel();
        textNombreDireccion = new javax.swing.JLabel();
        panCamas = new javax.swing.JPanel();
        textCamas = new javax.swing.JLabel();
        panServicios = new javax.swing.JPanel();
        textServicios = new javax.swing.JLabel();
        panCuentas = new javax.swing.JPanel();
        textCuentas = new javax.swing.JLabel();
        panPaq = new javax.swing.JPanel();
        textPaquetes = new javax.swing.JLabel();
        panHabitaciones = new javax.swing.JPanel();
        textHabitaciones = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        menu.setBackground(new java.awt.Color(253, 177, 11));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoApp.png"))); // NOI18N
        menu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 300, -1));

        panNombreDireccion.setBackground(new java.awt.Color(255, 255, 255));
        panNombreDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textNombreDireccion.setFont(new java.awt.Font("Heebo Medium", 0, 20)); // NOI18N
        textNombreDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textNombreDireccion.setText("Nombre & Direccion");

        javax.swing.GroupLayout panNombreDireccionLayout = new javax.swing.GroupLayout(panNombreDireccion);
        panNombreDireccion.setLayout(panNombreDireccionLayout);
        panNombreDireccionLayout.setHorizontalGroup(
            panNombreDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textNombreDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        panNombreDireccionLayout.setVerticalGroup(
            panNombreDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textNombreDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        menu.add(panNombreDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        panCamas.setBackground(new java.awt.Color(253, 177, 11));

        textCamas.setFont(new java.awt.Font("Heebo SemiBold", 0, 20)); // NOI18N
        textCamas.setForeground(new java.awt.Color(255, 255, 255));
        textCamas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textCamas.setText("Camas");

        javax.swing.GroupLayout panCamasLayout = new javax.swing.GroupLayout(panCamas);
        panCamas.setLayout(panCamasLayout);
        panCamasLayout.setHorizontalGroup(
            panCamasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textCamas, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        panCamasLayout.setVerticalGroup(
            panCamasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textCamas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        menu.add(panCamas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 300, 60));

        panServicios.setBackground(new java.awt.Color(253, 177, 11));

        textServicios.setFont(new java.awt.Font("Heebo SemiBold", 0, 20)); // NOI18N
        textServicios.setForeground(new java.awt.Color(255, 255, 255));
        textServicios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textServicios.setText("Servicios");

        javax.swing.GroupLayout panServiciosLayout = new javax.swing.GroupLayout(panServicios);
        panServicios.setLayout(panServiciosLayout);
        panServiciosLayout.setHorizontalGroup(
            panServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textServicios, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        panServiciosLayout.setVerticalGroup(
            panServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textServicios, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        menu.add(panServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 300, 60));

        panCuentas.setBackground(new java.awt.Color(253, 177, 11));

        textCuentas.setFont(new java.awt.Font("Heebo SemiBold", 0, 20)); // NOI18N
        textCuentas.setForeground(new java.awt.Color(255, 255, 255));
        textCuentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textCuentas.setText("Cuentas");

        javax.swing.GroupLayout panCuentasLayout = new javax.swing.GroupLayout(panCuentas);
        panCuentas.setLayout(panCuentasLayout);
        panCuentasLayout.setHorizontalGroup(
            panCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textCuentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        panCuentasLayout.setVerticalGroup(
            panCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textCuentas, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        menu.add(panCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 300, 60));

        panPaq.setBackground(new java.awt.Color(253, 177, 11));

        textPaquetes.setFont(new java.awt.Font("Heebo SemiBold", 0, 20)); // NOI18N
        textPaquetes.setForeground(new java.awt.Color(255, 255, 255));
        textPaquetes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPaquetes.setText("Paquetes");

        javax.swing.GroupLayout panPaqLayout = new javax.swing.GroupLayout(panPaq);
        panPaq.setLayout(panPaqLayout);
        panPaqLayout.setHorizontalGroup(
            panPaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textPaquetes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        panPaqLayout.setVerticalGroup(
            panPaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textPaquetes, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        menu.add(panPaq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 300, 60));

        panHabitaciones.setBackground(new java.awt.Color(253, 177, 11));
        panHabitaciones.setPreferredSize(new java.awt.Dimension(300, 60));

        textHabitaciones.setFont(new java.awt.Font("Heebo SemiBold", 0, 20)); // NOI18N
        textHabitaciones.setForeground(new java.awt.Color(255, 255, 255));
        textHabitaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textHabitaciones.setText("Habitaciones");
        textHabitaciones.setPreferredSize(new java.awt.Dimension(299, 59));

        javax.swing.GroupLayout panHabitacionesLayout = new javax.swing.GroupLayout(panHabitaciones);
        panHabitaciones.setLayout(panHabitacionesLayout);
        panHabitacionesLayout.setHorizontalGroup(
            panHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textHabitaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        panHabitacionesLayout.setVerticalGroup(
            panHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textHabitaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        menu.add(panHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 300, 670));

        contenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        jPanel1.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 700, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarlbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarlbMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarlbMouseClicked

    private void cerrarlbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarlbMouseEntered
        btnCerrar.setBackground(Color.red);
    }//GEN-LAST:event_cerrarlbMouseEntered

    private void cerrarlbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarlbMouseExited
        btnCerrar.setBackground(new Color(254,133,53));
    }//GEN-LAST:event_cerrarlbMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

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
            java.util.logging.Logger.getLogger(ConfigurarHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigurarHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigurarHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigurarHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigurarHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JLabel cerrarlb;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel panCamas;
    private javax.swing.JPanel panCuentas;
    private javax.swing.JPanel panHabitaciones;
    private javax.swing.JPanel panNombreDireccion;
    private javax.swing.JPanel panPaq;
    private javax.swing.JPanel panServicios;
    private javax.swing.JLabel textCamas;
    private javax.swing.JLabel textCuentas;
    private javax.swing.JLabel textHabitaciones;
    private javax.swing.JLabel textNombreDireccion;
    private javax.swing.JLabel textPaquetes;
    private javax.swing.JLabel textServicios;
    // End of variables declaration//GEN-END:variables
}
