

import java.awt.Color;
import java.awt.Frame;
import org.netbeans.lib.awtextra.AbsoluteConstraints;


public class PantallaUsuario extends javax.swing.JFrame {
    int xmouse, ymouse;
    
    public PantallaUsuario() {
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
        p_salir = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        userinf = new javax.swing.JLabel();
        P_biblio = new javax.swing.JPanel();
        biblioteca = new javax.swing.JLabel();
        bibliotecav = new javax.swing.JPanel();
        biblioteca1 = new javax.swing.JLabel();
        prestamolib1 = new javax.swing.JPanel();
        prestamotxt1 = new javax.swing.JLabel();
        prestamolib2 = new javax.swing.JPanel();
        prestamotxt = new javax.swing.JLabel();
        P_vista = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        P_menu.setBackground(new java.awt.Color(0, 27, 72));
        P_menu.setForeground(new java.awt.Color(255, 255, 255));
        P_menu.setFocusTraversalPolicyProvider(true);
        P_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p_salir.setBackground(new java.awt.Color(0, 27, 72));
        p_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_salirMouseClicked(evt);
            }
        });
        p_salir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setBackground(new java.awt.Color(0, 27, 72));
        logout.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        logout.setText("  Logout");
        logout.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setOpaque(true);
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        p_salir.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 40));

        P_menu.add(p_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 270, 40));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        P_menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 230, 20));

        userinf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userinf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        userinf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userinf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userinfMouseClicked(evt);
            }
        });
        P_menu.add(userinf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 270, 170));

        P_biblio.setBackground(new java.awt.Color(0, 27, 72));
        P_biblio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_biblio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        biblioteca.setBackground(new java.awt.Color(0, 27, 72));
        biblioteca.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        biblioteca.setForeground(new java.awt.Color(255, 255, 255));
        biblioteca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        biblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bookp.png"))); // NOI18N
        biblioteca.setText("  Biblioteca virtual");
        biblioteca.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        biblioteca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        biblioteca.setOpaque(true);
        biblioteca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bibliotecaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bibliotecaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bibliotecaMouseExited(evt);
            }
        });
        P_biblio.add(biblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 40));

        P_menu.add(P_biblio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 270, 40));

        bibliotecav.setBackground(new java.awt.Color(0, 27, 72));
        bibliotecav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bibliotecav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        biblioteca1.setBackground(new java.awt.Color(0, 27, 72));
        biblioteca1.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        biblioteca1.setForeground(new java.awt.Color(255, 255, 255));
        biblioteca1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        biblioteca1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bookp.png"))); // NOI18N
        biblioteca1.setText("  Ver Biblioteca");
        biblioteca1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        biblioteca1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        biblioteca1.setOpaque(true);
        biblioteca1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                biblioteca1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                biblioteca1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                biblioteca1MouseExited(evt);
            }
        });
        bibliotecav.add(biblioteca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 40));

        P_menu.add(bibliotecav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 270, 40));

        prestamolib1.setBackground(new java.awt.Color(0, 27, 72));
        prestamolib1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prestamolib1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prestamotxt1.setBackground(new java.awt.Color(0, 27, 72));
        prestamotxt1.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        prestamotxt1.setForeground(new java.awt.Color(255, 255, 255));
        prestamotxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prestamotxt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/date.png"))); // NOI18N
        prestamotxt1.setText("Ver perstamos");
        prestamotxt1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        prestamotxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prestamotxt1.setOpaque(true);
        prestamotxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prestamotxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prestamotxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prestamotxt1MouseExited(evt);
            }
        });
        prestamolib1.add(prestamotxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 270, 40));

        P_menu.add(prestamolib1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 270, 40));

        prestamolib2.setBackground(new java.awt.Color(0, 27, 72));
        prestamolib2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prestamolib2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prestamotxt.setBackground(new java.awt.Color(0, 27, 72));
        prestamotxt.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        prestamotxt.setForeground(new java.awt.Color(255, 255, 255));
        prestamotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prestamotxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/date.png"))); // NOI18N
        prestamotxt.setText("  Prestamo de libro");
        prestamotxt.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        prestamotxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prestamotxt.setOpaque(true);
        prestamotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prestamotxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prestamotxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prestamotxtMouseExited(evt);
            }
        });
        prestamolib2.add(prestamotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 40));

        P_menu.add(prestamolib2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 270, 40));

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
    }

    private void T_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_minimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_T_minimizarMouseClicked

    private void T_minimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_minimizarMouseEntered
        T_minimizar.setBackground(Color.orange);
        T_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconminimizar.png")));
    }//GEN-LAST:event_T_minimizarMouseEntered

    private void T_minimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_minimizarMouseExited
        T_minimizar.setBackground(Color.white);
        T_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_oscuro.png")));
    }//GEN-LAST:event_T_minimizarMouseExited

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

    private void P_opcionesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_opcionesMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x -xmouse, y - ymouse);
    }//GEN-LAST:event_P_opcionesMouseDragged

    private void P_opcionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_opcionesMousePressed

        xmouse =evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_P_opcionesMousePressed

    private void p_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_salirMouseClicked
        Pprincipal p1 = new Pprincipal ();
        p1.setSize (630,580);

        P_vista.removeAll();
        P_vista.add(p1, new AbsoluteConstraints(0,0,-1,-1));
        P_vista.revalidate();
        P_vista.repaint();
    }//GEN-LAST:event_p_salirMouseClicked

    private void bibliotecaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bibliotecaMouseEntered
        biblioteca.setBackground(new java.awt.Color(0, 69, 129));
    }//GEN-LAST:event_bibliotecaMouseEntered

    private void bibliotecaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bibliotecaMouseExited
        biblioteca.setBackground(new java.awt.Color(0, 27, 72));
    }//GEN-LAST:event_bibliotecaMouseExited

    private void bibliotecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bibliotecaMouseClicked
        bibliotecavirtual p1 = new bibliotecavirtual ();
        p1.setSize (930,560);
       
        P_vista.removeAll();
        P_vista.add(p1, new AbsoluteConstraints(0,0,-1,-1));
        P_vista.revalidate();
        P_vista.repaint();
    }//GEN-LAST:event_bibliotecaMouseClicked

    private void userinfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userinfMouseClicked
         infogeneral p1 = new infogeneral();
        p1.setSize (930,560);
       
        P_vista.removeAll();
        P_vista.add(p1, new AbsoluteConstraints(0,0,-1,-1));
        P_vista.revalidate();
        P_vista.repaint();
    }//GEN-LAST:event_userinfMouseClicked

    private void prestamotxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamotxtMouseEntered
        prestamotxt.setBackground(new java.awt.Color(0, 69, 129));
    }//GEN-LAST:event_prestamotxtMouseEntered

    private void prestamotxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamotxtMouseExited
        prestamotxt.setBackground(new java.awt.Color(0, 27, 72));
    }//GEN-LAST:event_prestamotxtMouseExited

    private void prestamotxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamotxtMouseClicked
        prestamo p1 = new prestamo ();
        p1.setSize (930,560);
       
        P_vista.removeAll();
        P_vista.add(p1, new AbsoluteConstraints(0,0,-1,-1));
        P_vista.revalidate();
        P_vista.repaint();
    }//GEN-LAST:event_prestamotxtMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
         logout.setBackground(new java.awt.Color(0, 69, 129));
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setBackground(new java.awt.Color(0, 27, 72));
    }//GEN-LAST:event_logoutMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        int dialogButton=javax.swing.JOptionPane.showConfirmDialog(null,"¿Esta seguro que desea salir?","Logout",javax.swing.JOptionPane.YES_NO_OPTION);
        if(dialogButton ==javax.swing.JOptionPane.YES_OPTION){
        Pantallainicio obj = new Pantallainicio();
        obj.setVisible(true);
         dispose();
        }
       
    }//GEN-LAST:event_logoutMouseClicked

    private void biblioteca1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_biblioteca1MouseClicked
        verbiblioteca p1 = new verbiblioteca ();
        p1.setSize (930,560);
       
        P_vista.removeAll();
        P_vista.add(p1, new AbsoluteConstraints(0,0,-1,-1));
        P_vista.revalidate();
        P_vista.repaint();
    }//GEN-LAST:event_biblioteca1MouseClicked

    private void biblioteca1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_biblioteca1MouseEntered
        biblioteca1.setBackground(new java.awt.Color(0, 69, 129));
    }//GEN-LAST:event_biblioteca1MouseEntered

    private void biblioteca1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_biblioteca1MouseExited
        biblioteca1.setBackground(new java.awt.Color(0, 27, 72));
    }//GEN-LAST:event_biblioteca1MouseExited

    private void prestamotxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamotxt1MouseClicked
        verprestamo p1 = new verprestamo ();
        p1.setSize (930,560);
       
        P_vista.removeAll();
        P_vista.add(p1, new AbsoluteConstraints(0,0,-1,-1));
        P_vista.revalidate();
        P_vista.repaint();
    }//GEN-LAST:event_prestamotxt1MouseClicked

    private void prestamotxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamotxt1MouseEntered
        prestamotxt1.setBackground(new java.awt.Color(0, 69, 129));
    }//GEN-LAST:event_prestamotxt1MouseEntered

    private void prestamotxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamotxt1MouseExited
        prestamotxt1.setBackground(new java.awt.Color(0, 27, 72));
    }//GEN-LAST:event_prestamotxt1MouseExited

   
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
            java.util.logging.Logger.getLogger(PantallaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P_C;
    private javax.swing.JPanel P_biblio;
    private javax.swing.JPanel P_m;
    private javax.swing.JPanel P_menu;
    private javax.swing.JPanel P_opciones;
    private javax.swing.JPanel P_vista;
    private javax.swing.JLabel T_cerrar;
    private javax.swing.JLabel T_minimizar;
    private javax.swing.JLabel biblioteca;
    private javax.swing.JLabel biblioteca1;
    private javax.swing.JPanel bibliotecav;
    private javax.swing.JPanel fondo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel p_salir;
    private javax.swing.JPanel prestamolib1;
    private javax.swing.JPanel prestamolib2;
    private javax.swing.JLabel prestamotxt;
    private javax.swing.JLabel prestamotxt1;
    private javax.swing.JLabel userinf;
    // End of variables declaration//GEN-END:variables
}
