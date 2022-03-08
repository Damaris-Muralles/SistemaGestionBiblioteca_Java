


import Clases.Usuario;
import java.awt.Color;
import java.awt.Frame;
import org.netbeans.lib.awtextra.AbsoluteConstraints;



public class Pantallainicio extends javax.swing.JFrame {
    
    int xmouse, ymouse;
    public Pantallainicio() {
        initComponents();
        initComponents2();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        P_opciones = new javax.swing.JPanel();
        P_m = new javax.swing.JPanel();
        T_minimizar = new javax.swing.JLabel();
        P_C = new javax.swing.JPanel();
        T_cerrar = new javax.swing.JLabel();
        P_menu = new javax.swing.JPanel();
        P_principal = new javax.swing.JPanel();
        label_principal = new javax.swing.JLabel();
        iconohome = new javax.swing.JLabel();
        P_login = new javax.swing.JPanel();
        label_login = new javax.swing.JLabel();
        iconologin = new javax.swing.JLabel();
        P_about = new javax.swing.JPanel();
        label_about = new javax.swing.JLabel();
        iconoabout = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        P_vista = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fondo.setPreferredSize(new java.awt.Dimension(1200, 600));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_opciones.setBackground(new java.awt.Color(255, 255, 255));
        P_opciones.setOpaque(false);
        P_opciones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                P_opcionesMouseDragged(evt);
            }
        });
        P_opciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                P_opcionesMousePressed(evt);
            }
        });
        P_opciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_m.setBackground(new java.awt.Color(255, 255, 255));

        T_minimizar.setBackground(new java.awt.Color(255, 255, 255));
        T_minimizar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        T_minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_oscuro.png"))); // NOI18N
        T_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        T_minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        T_minimizar.setOpaque(true);
        T_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_minimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                T_minimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                T_minimizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout P_mLayout = new javax.swing.GroupLayout(P_m);
        P_m.setLayout(P_mLayout);
        P_mLayout.setHorizontalGroup(
            P_mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_mLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(T_minimizar))
        );
        P_mLayout.setVerticalGroup(
            P_mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_mLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(T_minimizar))
        );

        P_opciones.add(P_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 40, 40));

        P_C.setBackground(new java.awt.Color(255, 255, 255));

        T_cerrar.setBackground(new java.awt.Color(255, 255, 255));
        T_cerrar.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        T_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T_cerrar.setText("X");
        T_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        T_cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        T_cerrar.setOpaque(true);
        T_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                T_cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                T_cerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout P_CLayout = new javax.swing.GroupLayout(P_C);
        P_C.setLayout(P_CLayout);
        P_CLayout.setHorizontalGroup(
            P_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_CLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(T_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P_CLayout.setVerticalGroup(
            P_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_CLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(T_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        P_opciones.add(P_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 40, 40));

        fondo.add(P_opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 40));

        P_menu.setBackground(new java.awt.Color(162, 210, 250));
        P_menu.setForeground(new java.awt.Color(255, 255, 255));
        P_menu.setFocusTraversalPolicyProvider(true);
        P_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_principal.setBackground(new java.awt.Color(162, 210, 250));
        P_principal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_principalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P_principalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P_principalMouseExited(evt);
            }
        });
        P_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_principal.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        label_principal.setForeground(new java.awt.Color(255, 255, 255));
        label_principal.setText("Principal");
        label_principal.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        label_principal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_principal.add(label_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 140, 40));

        iconohome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconohome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Hom.png"))); // NOI18N
        P_principal.add(iconohome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 40));

        P_menu.add(P_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 270, 40));

        P_login.setBackground(new java.awt.Color(162, 210, 250));
        P_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P_loginMouseExited(evt);
            }
        });
        P_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_login.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        label_login.setForeground(new java.awt.Color(255, 255, 255));
        label_login.setText("Login");
        label_login.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        label_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_login.add(label_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 140, 40));

        iconologin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Log.png"))); // NOI18N
        iconologin.setText("jLabel1");
        P_login.add(iconologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, -1));

        P_menu.add(P_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 270, 40));

        P_about.setBackground(new java.awt.Color(162, 210, 250));
        P_about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_aboutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P_aboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P_aboutMouseExited(evt);
            }
        });
        P_about.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_about.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        label_about.setForeground(new java.awt.Color(255, 255, 255));
        label_about.setText("About");
        label_about.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        label_about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_about.add(label_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 140, 40));

        iconoabout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconabout.png"))); // NOI18N
        iconoabout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_about.add(iconoabout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 40, 40));

        P_menu.add(P_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 270, 40));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        P_menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 230, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imag1.jpg"))); // NOI18N
        P_menu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 190, 130));

        fondo.add(P_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 600));

        P_vista.setBackground(new java.awt.Color(255, 255, 255));
        P_vista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        fondo.add(P_vista, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 930, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initComponents2(){
        setLocationRelativeTo(null);
        Pprincipal p1 = new Pprincipal ();
        p1.setSize (630,580);
        P_vista.removeAll();
        P_vista.add(p1, new AbsoluteConstraints(0,0,-1,-1));
        P_vista.revalidate();
        P_vista.repaint();
        Crearusuario p2 = new Crearusuario();
         
            if (p2.getListausuario()[0] == null) {
            p2.getListausuario()[0] = new Usuario(Long.parseLong("1"),"admin", "admin","admin","admin","admin");
            
            }
         
       
    }
 
    private void P_opcionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_opcionesMousePressed

        xmouse =evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_P_opcionesMousePressed

    private void P_opcionesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_opcionesMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x -xmouse, y - ymouse);
    }//GEN-LAST:event_P_opcionesMouseDragged

    private void T_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_minimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_T_minimizarMouseClicked

    private void T_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_T_cerrarMouseClicked

    private void T_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_cerrarMouseEntered
        T_cerrar.setBackground(Color.red);
        T_cerrar.setForeground(Color.white);
    }//GEN-LAST:event_T_cerrarMouseEntered

    private void T_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_cerrarMouseExited
        T_cerrar.setBackground(Color.white);
        T_cerrar.setForeground(Color.black);
    }//GEN-LAST:event_T_cerrarMouseExited

    private void T_minimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_minimizarMouseEntered
        T_minimizar.setBackground(Color.orange);
        T_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconminimizar.png"))); 
    }//GEN-LAST:event_T_minimizarMouseEntered

    private void T_minimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_minimizarMouseExited
        T_minimizar.setBackground(Color.white);
        T_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_oscuro.png"))); 
    }//GEN-LAST:event_T_minimizarMouseExited

    private void P_principalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_principalMouseClicked
        Pprincipal p1 = new Pprincipal ();
        p1.setSize (930,560);
       
        P_vista.removeAll();
        P_vista.add(p1, new AbsoluteConstraints(0,0,-1,-1));
        P_vista.revalidate();
        P_vista.repaint();
    }//GEN-LAST:event_P_principalMouseClicked

    private void P_aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_aboutMouseClicked
        Pabout p1 = new Pabout ();
        p1.setSize (930,560);
       
        P_vista.removeAll();
        P_vista.add(p1, new AbsoluteConstraints(0,0,-1,-1));
        P_vista.revalidate();
        P_vista.repaint();
    }//GEN-LAST:event_P_aboutMouseClicked

    private void P_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_loginMouseClicked
        Login obj = new Login();
        obj.setSize (1200,600);
        obj.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_P_loginMouseClicked

    private void P_principalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_principalMouseEntered
         P_principal.setBackground(new java.awt.Color(138,176,195));
    }//GEN-LAST:event_P_principalMouseEntered

    private void P_principalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_principalMouseExited
        P_principal.setBackground(new java.awt.Color(162,210,250));
    }//GEN-LAST:event_P_principalMouseExited

    private void P_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_loginMouseEntered
         P_login.setBackground(new java.awt.Color(138,176,195));
    }//GEN-LAST:event_P_loginMouseEntered

    private void P_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_loginMouseExited
        P_login.setBackground(new java.awt.Color(162,210,250));
    }//GEN-LAST:event_P_loginMouseExited

    private void P_aboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_aboutMouseEntered
         P_about.setBackground(new java.awt.Color(138,176,195));
    }//GEN-LAST:event_P_aboutMouseEntered

    private void P_aboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_aboutMouseExited
        P_about.setBackground(new java.awt.Color(162,210,250));
    }//GEN-LAST:event_P_aboutMouseExited

  
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
            java.util.logging.Logger.getLogger(Pantallainicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantallainicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantallainicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantallainicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantallainicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P_C;
    private javax.swing.JPanel P_about;
    private javax.swing.JPanel P_login;
    private javax.swing.JPanel P_m;
    private javax.swing.JPanel P_menu;
    private javax.swing.JPanel P_opciones;
    private javax.swing.JPanel P_principal;
    private javax.swing.JPanel P_vista;
    private javax.swing.JLabel T_cerrar;
    private javax.swing.JLabel T_minimizar;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel iconoabout;
    private javax.swing.JLabel iconohome;
    private javax.swing.JLabel iconologin;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_about;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_principal;
    // End of variables declaration//GEN-END:variables
}
