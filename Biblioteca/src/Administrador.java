

import java.awt.Color;
import java.awt.Frame;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import org.netbeans.lib.awtextra.AbsoluteConstraints;


public class Administrador extends javax.swing.JFrame {
   private static Crearusuario p2 = new Crearusuario();
   private static bibliotecavirtual p3 = new bibliotecavirtual();
   private static Cargaindividual p4 = new Cargaindividual();
    int xmouse, ymouse;
    public Administrador() {
        initComponents();
        initComponents2();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        P_opciones = new javax.swing.JPanel();
        P_m = new javax.swing.JPanel();
        T_minimizar = new javax.swing.JLabel();
        P_C = new javax.swing.JPanel();
        T_cerrar = new javax.swing.JLabel();
        P_menu = new javax.swing.JPanel();
        userimag = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Usuario = new javax.swing.JPanel();
        reportusuario = new javax.swing.JLabel();
        reportlibro = new javax.swing.JLabel();
        txtopcionreporte = new javax.swing.JLabel();
        Usuario1 = new javax.swing.JPanel();
        mostrartxt = new javax.swing.JLabel();
        txtopcionusuario = new javax.swing.JLabel();
        creartxt = new javax.swing.JLabel();
        modificartxt = new javax.swing.JLabel();
        eliminartxt = new javax.swing.JLabel();
        Usuario2 = new javax.swing.JPanel();
        txtopcionbiblio = new javax.swing.JLabel();
        creartxt1 = new javax.swing.JLabel();
        modificartxt1 = new javax.swing.JLabel();
        eliminartxt1 = new javax.swing.JLabel();
        mostrartxt1 = new javax.swing.JLabel();
        creartxt2 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        P_vista = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(P_opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 40));

        P_menu.setBackground(new java.awt.Color(2, 83, 119));
        P_menu.setForeground(new java.awt.Color(255, 255, 255));
        P_menu.setFocusTraversalPolicyProvider(true);
        P_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userimag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userimag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/admin_1.png"))); // NOI18N
        userimag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userimag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userimagMouseClicked(evt);
            }
        });
        P_menu.add(userimag, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 150));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        P_menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 230, 10));

        Usuario.setBackground(new java.awt.Color(255, 255, 255));
        Usuario.setOpaque(false);
        Usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reportusuario.setBackground(new java.awt.Color(2, 83, 119));
        reportusuario.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        reportusuario.setForeground(new java.awt.Color(255, 255, 255));
        reportusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/list.png"))); // NOI18N
        reportusuario.setText("Reporte de usuario");
        reportusuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportusuario.setOpaque(true);
        reportusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportusuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportusuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportusuarioMouseExited(evt);
            }
        });
        Usuario.add(reportusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, 30));

        reportlibro.setBackground(new java.awt.Color(2, 83, 119));
        reportlibro.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        reportlibro.setForeground(new java.awt.Color(255, 255, 255));
        reportlibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportlibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/report.png"))); // NOI18N
        reportlibro.setText("Reportes de libros");
        reportlibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportlibro.setOpaque(true);
        reportlibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportlibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportlibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportlibroMouseExited(evt);
            }
        });
        Usuario.add(reportlibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 270, 30));

        txtopcionreporte.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        txtopcionreporte.setForeground(new java.awt.Color(255, 255, 255));
        txtopcionreporte.setText("REPORTES");
        Usuario.add(txtopcionreporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 250, 30));

        P_menu.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 270, 110));

        Usuario1.setBackground(new java.awt.Color(255, 255, 255));
        Usuario1.setOpaque(false);
        Usuario1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostrartxt.setBackground(new java.awt.Color(2, 83, 119));
        mostrartxt.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        mostrartxt.setForeground(new java.awt.Color(255, 255, 255));
        mostrartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrartxt.setText("Mostrar");
        mostrartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrartxt.setOpaque(true);
        mostrartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrartxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mostrartxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mostrartxtMouseExited(evt);
            }
        });
        Usuario1.add(mostrartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 270, 30));

        txtopcionusuario.setBackground(new java.awt.Color(255, 255, 255));
        txtopcionusuario.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        txtopcionusuario.setForeground(new java.awt.Color(255, 255, 255));
        txtopcionusuario.setText("USUARIOS");
        Usuario1.add(txtopcionusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 250, 30));

        creartxt.setBackground(new java.awt.Color(2, 83, 119));
        creartxt.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        creartxt.setForeground(new java.awt.Color(255, 255, 255));
        creartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        creartxt.setText(" Crear");
        creartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        creartxt.setOpaque(true);
        creartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creartxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                creartxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                creartxtMouseExited(evt);
            }
        });
        Usuario1.add(creartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, 30));

        modificartxt.setBackground(new java.awt.Color(2, 83, 119));
        modificartxt.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        modificartxt.setForeground(new java.awt.Color(255, 255, 255));
        modificartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificartxt.setText("Modificar");
        modificartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificartxt.setOpaque(true);
        modificartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificartxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificartxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificartxtMouseExited(evt);
            }
        });
        Usuario1.add(modificartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 270, 30));

        eliminartxt.setBackground(new java.awt.Color(2, 83, 119));
        eliminartxt.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        eliminartxt.setForeground(new java.awt.Color(255, 255, 255));
        eliminartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminartxt.setText("Eliminar");
        eliminartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminartxt.setOpaque(true);
        eliminartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminartxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminartxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminartxtMouseExited(evt);
            }
        });
        Usuario1.add(eliminartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 270, 30));

        P_menu.add(Usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 270, 150));

        Usuario2.setBackground(new java.awt.Color(255, 255, 255));
        Usuario2.setOpaque(false);
        Usuario2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtopcionbiblio.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        txtopcionbiblio.setForeground(new java.awt.Color(255, 255, 255));
        txtopcionbiblio.setText("BIBLIOGRAFÍAS");
        Usuario2.add(txtopcionbiblio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 250, 30));

        creartxt1.setBackground(new java.awt.Color(2, 83, 119));
        creartxt1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        creartxt1.setForeground(new java.awt.Color(255, 255, 255));
        creartxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        creartxt1.setText("Carga masiva");
        creartxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        creartxt1.setOpaque(true);
        creartxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creartxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                creartxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                creartxt1MouseExited(evt);
            }
        });
        Usuario2.add(creartxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 130, 30));

        modificartxt1.setBackground(new java.awt.Color(2, 83, 119));
        modificartxt1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        modificartxt1.setForeground(new java.awt.Color(255, 255, 255));
        modificartxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificartxt1.setText("Modificar");
        modificartxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificartxt1.setOpaque(true);
        modificartxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificartxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificartxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificartxt1MouseExited(evt);
            }
        });
        Usuario2.add(modificartxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 270, 30));

        eliminartxt1.setBackground(new java.awt.Color(2, 83, 119));
        eliminartxt1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        eliminartxt1.setForeground(new java.awt.Color(255, 255, 255));
        eliminartxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminartxt1.setText("Eliminar");
        eliminartxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminartxt1.setOpaque(true);
        eliminartxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminartxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminartxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminartxt1MouseExited(evt);
            }
        });
        Usuario2.add(eliminartxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 270, 30));

        mostrartxt1.setBackground(new java.awt.Color(2, 83, 119));
        mostrartxt1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        mostrartxt1.setForeground(new java.awt.Color(255, 255, 255));
        mostrartxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrartxt1.setText("Mostrar");
        mostrartxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrartxt1.setOpaque(true);
        mostrartxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrartxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mostrartxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mostrartxt1MouseExited(evt);
            }
        });
        Usuario2.add(mostrartxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 270, 30));

        creartxt2.setBackground(new java.awt.Color(2, 83, 119));
        creartxt2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        creartxt2.setForeground(new java.awt.Color(255, 255, 255));
        creartxt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        creartxt2.setText("Carga individual");
        creartxt2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        creartxt2.setOpaque(true);
        creartxt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creartxt2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                creartxt2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                creartxt2MouseExited(evt);
            }
        });
        Usuario2.add(creartxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 140, 30));

        P_menu.add(Usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 270, 150));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sali.png"))); // NOI18N
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        P_menu.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 50, 50));

        jPanel1.add(P_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 600));

        P_vista.setBackground(new java.awt.Color(255, 255, 255));
        P_vista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        P_vista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(P_vista, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 930, 560));

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

    private void initComponents2(){
        setLocationRelativeTo(null);
        Pprincipal p1 = new Pprincipal ();
        p1.setSize (930,560);
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

    private void creartxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creartxtMouseEntered
        
        creartxt.setBackground(new java.awt.Color(109, 163, 199));
    }//GEN-LAST:event_creartxtMouseEntered

    private void creartxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creartxtMouseExited
        creartxt.setBackground(new java.awt.Color(2, 83, 119));
    }//GEN-LAST:event_creartxtMouseExited

    private void creartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creartxtMouseClicked
        
        Crearusuario p1 = new Crearusuario ();
        p1.setSize (930,560);
       
        P_vista.removeAll();
        P_vista.add(p1, new AbsoluteConstraints(0,0,-1,-1));
        P_vista.revalidate();
        P_vista.repaint();
    }//GEN-LAST:event_creartxtMouseClicked

    private void modificartxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificartxtMouseEntered
        modificartxt.setBackground(new java.awt.Color(109, 163, 199));
    }//GEN-LAST:event_modificartxtMouseEntered

    private void modificartxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificartxtMouseExited
        modificartxt.setBackground(new java.awt.Color(2, 83, 119));
    }//GEN-LAST:event_modificartxtMouseExited

    private void eliminartxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminartxtMouseEntered
         eliminartxt.setBackground(new java.awt.Color(109, 163, 199));
    }//GEN-LAST:event_eliminartxtMouseEntered

    private void eliminartxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminartxtMouseExited
         eliminartxt.setBackground(new java.awt.Color(2, 83, 119));
    }//GEN-LAST:event_eliminartxtMouseExited

    private void eliminartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminartxtMouseClicked
        
        Eliminarusuario p1 = new Eliminarusuario ();
        p1.setSize (930,560);
       
        P_vista.removeAll();
        P_vista.add(p1, new AbsoluteConstraints(0,0,-1,-1));
        P_vista.revalidate();
        P_vista.repaint();
    }//GEN-LAST:event_eliminartxtMouseClicked

    private void mostrartxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrartxtMouseEntered
        mostrartxt.setBackground(new java.awt.Color(109, 163, 199));
    }//GEN-LAST:event_mostrartxtMouseEntered

    private void mostrartxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrartxtMouseExited
        mostrartxt.setBackground(new java.awt.Color(2, 83, 119));
    }//GEN-LAST:event_mostrartxtMouseExited

    private void mostrartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrartxtMouseClicked
        
        Mostrarusuario p1 = new Mostrarusuario();
        p1.setSize (930,560);
       
        P_vista.removeAll();
        P_vista.add(p1, new AbsoluteConstraints(0,0,-1,-1));
        P_vista.revalidate();
        P_vista.repaint();
    }//GEN-LAST:event_mostrartxtMouseClicked

    private void creartxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creartxt1MouseClicked
      
        Cargamasiva p1 = new Cargamasiva ();
          p1.setSize (1200,600);
           p1.setVisible(true);
           dispose();
    }//GEN-LAST:event_creartxt1MouseClicked

    private void creartxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creartxt1MouseEntered
        creartxt1.setBackground(new java.awt.Color(109, 163, 199));
    }//GEN-LAST:event_creartxt1MouseEntered

    private void creartxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creartxt1MouseExited
        creartxt1.setBackground(new java.awt.Color(2, 83, 119));
    }//GEN-LAST:event_creartxt1MouseExited

    private void modificartxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificartxt1MouseClicked
        
      
        Modificarbibliog p1 = new Modificarbibliog ();
        p1.setSize (930,560);
       
        P_vista.removeAll();
        P_vista.add(p1, new AbsoluteConstraints(0,0,-1,-1));
        P_vista.revalidate();
        P_vista.repaint();
    }//GEN-LAST:event_modificartxt1MouseClicked

    private void modificartxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificartxt1MouseEntered
        modificartxt1.setBackground(new java.awt.Color(109, 163, 199));
    }//GEN-LAST:event_modificartxt1MouseEntered

    private void modificartxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificartxt1MouseExited
        modificartxt1.setBackground(new java.awt.Color(2, 83, 119));
    }//GEN-LAST:event_modificartxt1MouseExited

    private void eliminartxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminartxt1MouseClicked
       
        Eliminarbibliog p1 = new Eliminarbibliog ();
        p1.setSize (930,560);
       
        P_vista.removeAll();
        P_vista.add(p1, new AbsoluteConstraints(0,0,-1,-1));
        P_vista.revalidate();
        P_vista.repaint();
    }//GEN-LAST:event_eliminartxt1MouseClicked

    private void eliminartxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminartxt1MouseEntered
        eliminartxt1.setBackground(new java.awt.Color(109, 163, 199));
    }//GEN-LAST:event_eliminartxt1MouseEntered

    private void eliminartxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminartxt1MouseExited
        eliminartxt1.setBackground(new java.awt.Color(2, 83, 119));
    }//GEN-LAST:event_eliminartxt1MouseExited

    private void mostrartxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrartxt1MouseClicked
        
        Mostrarbibliog p1 = new Mostrarbibliog ();
        p1.setSize (930,560);
       
        P_vista.removeAll();
        P_vista.add(p1, new AbsoluteConstraints(0,0,-1,-1));
        P_vista.revalidate();
        P_vista.repaint();
    }//GEN-LAST:event_mostrartxt1MouseClicked

    private void mostrartxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrartxt1MouseEntered
        mostrartxt1.setBackground(new java.awt.Color(109, 163, 199));
    }//GEN-LAST:event_mostrartxt1MouseEntered

    private void mostrartxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrartxt1MouseExited
        mostrartxt1.setBackground(new java.awt.Color(2, 83, 119));
    }//GEN-LAST:event_mostrartxt1MouseExited

    private void reportusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportusuarioMouseClicked
        String codigoHTML ="<!doctype html>\n" +
        "<html lang=\"es\">\n" +
        "\n" +
        "<head>\n" +
        "\n" +
        "  <meta charset=\"UTF-8\">\n" +
        "  <title> Reporte de Usuarios</title>\n" +
        "  <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"src/imagenes/icono1.jpg\" >\n" +
        "  <style>\n" +
        "    * {\n" +
        "      margin: 0;\n" +
        "      padding: 0;\n" +
        "      box-sizing: border-box;\n" +
        "      }\n" +
        "\n" +
        "      body{\n" +
        "      font-family: Arial;\n" +
        "      background: #f2f2f2;\n" +
        "      }\n" +
        "\n" +
        "      .contenedor{\n" +
        "      padding: 60px 0;\n" +
        "      width: 95%\n" +
        "      max-width: 1000px\n" +
        "      margin: auto;\n" +
        "      overflow: hidden;\n" +
        "      }    \n" +
        "\n" +
        "      .titulo{\n" +
        "      color: #001b48;\n" +
        "      font-size: 40px;\n" +
        "      text-align: center;\n" +
        "      margin-bottom: 50px;\n" +
        "      } \n" +
            " .titulosub{\n" +
       "      color: #001b48;\n" +
       "      font-size: 25px;\n" +
       "      text-align: center;\n" +
       "      margin-bottom: 50px;\n" +
       "      } \n" +
        "  \n" +
        "      header{\n" +
        "      width:100%;\n" +
        "      height: 250px;\n" +
        "      background: hsla(168,53%,51%,0.45);  /* fallback for old browsers */\n" +
        "      background: -webkit-linear-gradient(to right, hsla(242,58%,20%,0.45), hsla(168,53%,51%,0.45));  /* Chrome 10      -25, Safari 5.1-6 */\n" +
        "      background: linear-gradient(to right, hsla(242,58%,20%,0.45),hsla(168,53%,51%,0.45)), url(src/imagenes/1694.jpg); /* W3C, IE 10+/ Edge,Firefox 16+, Chrome 26+,            Opera 12+, Safari 7+ */\n" +
        "      background-size: cover;\n" +
        "      background-attachment: fixed;\n" +
        "      position: relative;\n" +
        "      }  \n" +
        "     \n" +
        "      header .textos-header{\n" +
        "      display: flex;\n" +
        "      height: 430px;\n" +
        "      width: 100%;\n" +
        "      align-items: center;\n" +
        "      flex-direction: column;\n" +
        "      text-align: center;\n" +
        "      }\n" +
        "      \n" +
        "      .textos-header h1 {\n" +
        "         font-size: 50px;\n" +
        "         color: white;\n" +
        "      }\n" +
        "\n" +
        "      .textos-header h2 {\n" +
        "         font-size: 30px;\n" +
        "         font-weight:300;\n" +
        "         color: white;\n" +
        "      }\n" +
        "\n" +
        "      .wave{\n" +
        "      position: absolute;\n" +
        "      bottom: 0;\n" +
        "      width: 100%;\n" +
        "      }\n" +
        "\n" +
        "      #main-container{\n" +
        "      margin:60px auto;\n" +
        "      width:900px;\n" +
        "      } \n" +
        "  \n" +
        "      table{\n" +
        "      background-color: white;\n" +
        "      border-collapse: collapse;\n" +
        "      width: 100%;\n" +
        "      }\n" +
        "      \n" +
        "      th, td{\n" +
        "      padding: 15px;\n" +
        "      }\n" +
        "\n" +
        "      thead{\n" +
        "      background-color: #001b48;\n" +
        "      border-bottom: solid 5px #f2f2f2;\n" +
        "      color: white;\n" +
        "      }\n" +
        "     \n" +
        "     tr:nth-child(even){\n" +
        "     background-color: #dde8f0;\n" +
        "     }\n" +
        " \n" +
        "     tr:hover td{\n" +
        "     background-color: #004581;\n" +
        "     color: white;\n" +
        "     }  \n" +
        "\n" +
        "      footer{\n" +
        "      background: hsla(168,53%,51%); \n" +
        "      background: -webkit-linear-gradient(to right, hsla(242,58%,20%), hsla(168,53%,51%));  /* Chrome 10      -25, Safari 5.1-6 */\n" +
        "      background: linear-gradient(to right, hsla(242,58%,20%),hsla(168,53%,51%)), url(src/imagenes/1694.jpg); /* W3C, IE 10+/ Edge,Firefox 16+, Chrome 26+,                  Opera 12+, Safari 7+ */\n" +
        "      margin: auto;\n" +
        "      overflow: hidden;\n" +
        "      }\n" +
        "  </style>\n" +
        "\n" +
        "</head>\n" +
        "\n" +
        "<body> \n" +
        "\n" +
        " <header>\n" +
        "    <section class=\"textos-header\">\n" +
        "       <br>\n" +
        "       <br>\n" +
        "       <h1> REPORTE DE USUARIO </h1>\n" +
        "       <h2> Biblioteca </h2>\n" +
        "       <div class=\"wave\" style=\"height: 150px; overflow: hidden;\" ><svg viewBox=\"0 0 500 150\" preserveAspectRatio=\"none\" style=\"height: 100%; width: 100%;\"><path            d=\"M-11.00,130.77 C207.38,132.73 264.95,80.44 499.15,126.81 L500.00,150.00 L0.00,150.00 Z\" style=\"stroke: none; fill: #f2f2f2;\"></path></svg></div>\n" +
        "    </section>\n" +
        "  </header>\n" +
        "<br>\n" +
        "  <main>\n" +
        "    <section>\n" +
        "      <div class=\"contenedor usuario\">" +
        "\n" ;
        int cont=0;
        int veces=0;
        
        for (int j = 0; j < p2.getListausuario().length; j++) {
            if (p2.getListausuario()[j] != null) {
                for (int i = 0; i < p3.getListaagregados().length; i++) {
                    if (p3.getListaagregados()[i] != null) {
                     if(p2.getListausuario()[j].getID().equals(p3.getListaagregados()[i].getID_user())){
                         cont=cont+1;
                         if(cont==1){
                              for (int k = 0; k < p3.getListaagregados().length; k++) {
                            if (p3.getListaagregados()[k] != null) {
                             if(p2.getListausuario()[j].getID().equals(p3.getListaagregados()[k].getID_user())){
                                 veces=veces+1;
                             }
                            }
                           }
                           
                                              
                         codigoHTML += "    <h2 class=\"titulo\">"+p2.getListausuario()[j].getNombre()+"&nbsp;"+
                               p2.getListausuario()[j].getApellido()  + "</h2>\n" +
                        "<h3 class=\"titulosub\">ID usuario "+p2.getListausuario()[j].getID() +"&nbsp;&nbsp;&nbsp;&nbsp;"+"Rol"+"&nbsp;"+p2.getListausuario()[j].getRol()+"</h3>\n"+ 
                        "        <div class=\"libro\" id=\"main-container\">\n" +
                        "          <table>\n" +
                        "            <thead>\n" +
                        "               <tr>\n" +
                        "                  <th>ID Libro en Biblioteca</th><th>Titulo</th><th>Autor</th><th>Edicion</th><th>Tipo</th>\n" +
                        "               </tr>\n" +
                        "            </thead>" ;
                         codigoHTML += "<tr>";
                        codigoHTML += "  <td>" + p3.getListaagregados()[i].getID() + "</td>";
                        codigoHTML += "  <td>" + p3.getListaagregados()[i].getTitulo()+ "</td>";
                        codigoHTML += "  <td>" + p3.getListaagregados()[i].getAutor()+ "</td>";
                        codigoHTML += "  <td>" + p3.getListaagregados()[i].getEdicion()+ "</td>";
                        codigoHTML += "  <td>" + p3.getListaagregados()[i].getTipo()+ "</td>";
                        
                        codigoHTML += "</tr>";
                     
                         }else{
                             if(cont<veces){
                             codigoHTML += "<tr>";
                            codigoHTML += "  <td>" + p3.getListaagregados()[i].getID() + "</td>";
                            codigoHTML += "  <td>" + p3.getListaagregados()[i].getTitulo()+ "</td>";
                            codigoHTML += "  <td>" + p3.getListaagregados()[i].getAutor()+ "</td>";
                            codigoHTML += "  <td>" + p3.getListaagregados()[i].getEdicion()+ "</td>";
                            codigoHTML += "  <td>" + p3.getListaagregados()[i].getTipo()+ "</td>"; 
                           
                            codigoHTML += "</tr>";
                             }else{
                                 if(cont==veces){
                                     codigoHTML += "<tr>";
                                    codigoHTML += "  <td>" + p3.getListaagregados()[i].getID() + "</td>";
                                    codigoHTML += "  <td>" + p3.getListaagregados()[i].getTitulo()+ "</td>";
                                    codigoHTML += "  <td>" + p3.getListaagregados()[i].getAutor()+ "</td>";
                                    codigoHTML += "  <td>" + p3.getListaagregados()[i].getEdicion()+ "</td>";
                                    codigoHTML += "  <td>" + p3.getListaagregados()[i].getTipo()+ "</td>";
                                     
                                    codigoHTML += "</tr>\n"+"</table>\n" +
                                    "        </div>\n";
                                 }
                             }
                         }
         
                     }  
                      
                    }
                }
            }
            cont=0;
            veces=0;
            
        }
        codigoHTML += "      </div>\n" +
        "    </section>\n" +
        "  </main>\n" +
        "\n" +
        "  <footer>\n" +
        "    <div style=\"height: 150px; overflow: hidden;\" ><svg viewBox=\"0 0 500 150\" preserveAspectRatio=\"none\" style=\"height: 100%; width: 100%;\"><path d=\"M0.28,47.88     C263.82,3.48 270.03,81.42 500.00,49.98 L499.72,-0.47 L-1.41,-3.44 Z\" style=\"stroke: none; fill: #f2f2f2;\"></path></svg></div>\n" +
        "  </footer>  \n" +
        "\n" +
        "</body>\n" +
        "\n" +
        "</html>";
        File archivo = new File("Reporte_Usuarios.html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(codigoHTML);
            bw.close();
             javax.swing.JOptionPane.showMessageDialog(null,"Se ha realizado el reporte","Reportes",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
        }    
    }//GEN-LAST:event_reportusuarioMouseClicked

    private void reportusuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportusuarioMouseEntered
        reportusuario.setBackground(new java.awt.Color(109, 163, 199));
    }//GEN-LAST:event_reportusuarioMouseEntered

    private void reportusuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportusuarioMouseExited
        reportusuario.setBackground(new java.awt.Color(2, 83, 119));
    }//GEN-LAST:event_reportusuarioMouseExited

    private void reportlibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportlibroMouseClicked
       String codigoHTML ="<!doctype html>\n" +
        "<html lang=\"es\">\n" +
        "\n" +
        "<head>\n" +
        "\n" +
        "  <meta charset=\"UTF-8\">\n" +
        "  <title> Reporte de Libros</title>\n" +
        "  <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"src/imagenes/icono1.jpg\" >\n" +
        "  <style>\n" +
        "    * {\n" +
        "      margin: 0;\n" +
        "      padding: 0;\n" +
        "      box-sizing: border-box;\n" +
        "      }\n" +
        "\n" +
        "      body{\n" +
        "      font-family: Arial;\n" +
        "      background: #f2f2f2;\n" +
        "      }\n" +
        "\n" +
        "      .contenedor{\n" +
        "      padding: 60px 0;\n" +
        "      width: 95%\n" +
        "      max-width: 1000px\n" +
        "      margin: auto;\n" +
        "      overflow: hidden;\n" +
        "      }    \n" +
        "\n" +
        "      .titulo{\n" +
        "      color: #001b48;\n" +
        "      font-size: 35px;\n" +
        "      text-align: center;\n" +
        "      margin-bottom: 50px;\n" +
        "      } \n" +
        "  \n" +
        "      header{\n" +
        "      width:100%;\n" +
        "      height: 250px;\n" +
        "      background: hsla(168,53%,51%,0.45);  /* fallback for old browsers */\n" +
        "      background: -webkit-linear-gradient(to right, hsla(242,58%,20%,0.45), hsla(168,53%,51%,0.45));  /* Chrome 10      -25, Safari 5.1-6 */\n" +
        "      background: linear-gradient(to right, hsla(242,58%,20%,0.45),hsla(168,53%,51%,0.45)), url(src/imagenes/1694.jpg); /* W3C, IE 10+/ Edge,Firefox 16+, Chrome 26+,            Opera 12+, Safari 7+ */\n" +
        "      background-size: cover;\n" +
        "      background-attachment: fixed;\n" +
        "      position: relative;\n" +
        "      }  \n" +
        "     \n" +
        "      header .textos-header{\n" +
        "      display: flex;\n" +
        "      height: 430px;\n" +
        "      width: 100%;\n" +
        "      align-items: center;\n" +
        "      flex-direction: column;\n" +
        "      text-align: center;\n" +
        "      }\n" +
        "      \n" +
        "      .textos-header h1 {\n" +
        "         font-size: 50px;\n" +
        "         color: white;\n" +
        "      }\n" +
        "\n" +
        "      .textos-header h2 {\n" +
        "         font-size: 30px;\n" +
        "         font-weight:300;\n" +
        "         color: white;\n" +
        "      }\n" +
        "\n" +
        "      .wave{\n" +
        "      position: absolute;\n" +
        "      bottom: 0;\n" +
        "      width: 100%;\n" +
        "      }\n" +
        "\n" +
        "      #main-container{\n" +
        "      margin:60px auto;\n" +
        "      width:900px;\n" +
        "      } \n" +
        "  \n" +
        "      table{\n" +
        "      background-color: white;\n" +
        "      border-collapse: collapse;\n" +
        "      width: 100%;\n" +
        "      }\n" +
        "      \n" +
        "      th, td{\n" +
        "      padding: 15px;\n" +
        "      }\n" +
        "\n" +
        "      thead{\n" +
        "      background-color: #001b48;\n" +
        "      border-bottom: solid 5px #f2f2f2;\n" +
        "      color: white;\n" +
        "      }\n" +
        "     \n" +
        "     tr:nth-child(even){\n" +
        "     background-color: #dde8f0;\n" +
        "     }\n" +
        " \n" +
        "     tr:hover td{\n" +
        "     background-color: #004581;\n" +
        "     color: white;\n" +
        "     }  \n" +
        "\n" +
        "      footer{\n" +
        "      background: hsla(168,53%,51%); \n" +
        "      background: -webkit-linear-gradient(to right, hsla(242,58%,20%), hsla(168,53%,51%));  /* Chrome 10      -25, Safari 5.1-6 */\n" +
        "      background: linear-gradient(to right, hsla(242,58%,20%),hsla(168,53%,51%)), url(src/imagenes/1694.jpg); /* W3C, IE 10+/ Edge,Firefox 16+, Chrome 26+,                  Opera 12+, Safari 7+ */\n" +
        "      margin: auto;\n" +
        "      overflow: hidden;\n" +
        "      }\n" +
        "  </style>\n" +
        "\n" +
        "</head>\n" +
        "\n" +
        "<body> \n" +
        "\n" +
        " <header>\n" +
        "    <section class=\"textos-header\">\n" +
        "       <br>\n" +
        "       <br>\n" +
        "       <h1> REPORTE DE LIBROS PRESTADOS</h1>\n" +
        "       <h2> Biblioteca </h2>\n" +
        "       <div class=\"wave\" style=\"height: 150px; overflow: hidden;\" ><svg viewBox=\"0 0 500 150\" preserveAspectRatio=\"none\" style=\"height: 100%; width: 100%;\"><path            d=\"M-11.00,130.77 C207.38,132.73 264.95,80.44 499.15,126.81 L500.00,150.00 L0.00,150.00 Z\" style=\"stroke: none; fill: #f2f2f2;\"></path></svg></div>\n" +
        "    </section>\n" +
        "  </header>\n" +
        "<br>\n" +
        "  <main>\n" +
        "    <section>\n" +
        "      <div class=\"contenedor usuario\">" +
        "\n"+
        "        <div class=\"usuario\" id=\"main-container\">\n" +
        "          <table>\n" +
        "            <thead>\n" +
        "               <tr>\n" +
        "                  <th>ID Libro</th><th>Titulo</th><th>Autor</th><th>Tipo</th><th>Copias totales</th><th>Disponibles</th>\n" +
        "               </tr>\n" +
        "            </thead>\n" +
        "\n" ;
       int cont=0;
         for (int i = 0; i < p4.getListalibros().length; i++) {
            if (p4.getListalibros()[i] != null) {
                if (!p4.getListalibros()[i].getTipo().equals("Libro digital")){
                       for (int t = 0; t < p3.getListaagregados().length; t++) {
                            if (p3.getListaagregados()[t] != null) {
                             if(p3.getListaagregados()[t].getID().equals(p4.getListalibros()[i].getID())){
                                 cont=1;
                             }
                            }
                           }
                if(cont==1){       
                codigoHTML += "<tr>";
                codigoHTML += "  <td>" + p4.getListalibros()[i].getID() + "</td>";
                codigoHTML += "  <td>" + p4.getListalibros()[i].getTitulo()+ "</td>";
                codigoHTML += "  <td>" + p4.getListalibros()[i].getAutor()+ "</td>";
                codigoHTML += "  <td>" + p4.getListalibros()[i].getTipo()+ "</td>";
                codigoHTML += "  <td>" +p4.getListalibros()[i].getCopias() + "</td>";  
                  codigoHTML += "  <td>" +p4.getListalibros()[i].getDisponible() + "</td>";  
                codigoHTML += "</tr>";
                }
                }
            }
            cont=0;
        }
        codigoHTML += " </table>\n" +
"        </div>\n"+
        "</div>\n" +
        "    </section>\n" +
        "  </main>\n" +
        "\n" +
        "  <footer>\n" +
        "    <div style=\"height: 150px; overflow: hidden;\" ><svg viewBox=\"0 0 500 150\" preserveAspectRatio=\"none\" style=\"height: 100%; width: 100%;\"><path d=\"M0.28,47.88     C263.82,3.48 270.03,81.42 500.00,49.98 L499.72,-0.47 L-1.41,-3.44 Z\" style=\"stroke: none; fill: #f2f2f2;\"></path></svg></div>\n" +
        "  </footer>  \n" +
        "\n" +
        "</body>\n" +
        "\n" +
        "</html>";
        File archivo = new File("Reporte_libros_Prestados.html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(codigoHTML);
            bw.close();
             javax.swing.JOptionPane.showMessageDialog(null,"Se ha realizado el reporte","Reportes",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_reportlibroMouseClicked

    private void reportlibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportlibroMouseEntered
        reportlibro.setBackground(new java.awt.Color(109, 163, 199));
    }//GEN-LAST:event_reportlibroMouseEntered

    private void reportlibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportlibroMouseExited
        reportlibro.setBackground(new java.awt.Color(2, 83, 119));
    }//GEN-LAST:event_reportlibroMouseExited

    private void modificartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificartxtMouseClicked

        Modificarusuario p1 = new Modificarusuario ();
        p1.setSize (930,560);
       
        P_vista.removeAll();
        P_vista.add(p1, new AbsoluteConstraints(0,0,-1,-1));
        P_vista.revalidate();
        P_vista.repaint();
    }//GEN-LAST:event_modificartxtMouseClicked

    private void userimagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userimagMouseClicked
        infogeneral p1 = new infogeneral();
        p1.setSize (930,560);
       
        P_vista.removeAll();
        P_vista.add(p1, new AbsoluteConstraints(0,0,-1,-1));
        P_vista.revalidate();
        P_vista.repaint();
    }//GEN-LAST:event_userimagMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
         int dialogButton=javax.swing.JOptionPane.showConfirmDialog(null,"¿Esta seguro que desea salir?","Logout",javax.swing.JOptionPane.YES_NO_OPTION);
        if(dialogButton ==javax.swing.JOptionPane.YES_OPTION){
        Pantallainicio obj = new Pantallainicio();
        obj.setVisible(true);
         dispose();
        }
    }//GEN-LAST:event_logoutMouseClicked

    private void creartxt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creartxt2MouseClicked
        Cargaindividual p1 = new Cargaindividual ();
          p1.setSize (1200,600);
           p1.setVisible(true);
           dispose();
    }//GEN-LAST:event_creartxt2MouseClicked

    private void creartxt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creartxt2MouseEntered
         creartxt2.setBackground(new java.awt.Color(109, 163, 199));
    }//GEN-LAST:event_creartxt2MouseEntered

    private void creartxt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creartxt2MouseExited
       creartxt2.setBackground(new java.awt.Color(2, 83, 119));
    }//GEN-LAST:event_creartxt2MouseExited
  

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P_C;
    private javax.swing.JPanel P_m;
    private javax.swing.JPanel P_menu;
    private javax.swing.JPanel P_opciones;
    private javax.swing.JPanel P_vista;
    private javax.swing.JLabel T_cerrar;
    private javax.swing.JLabel T_minimizar;
    private javax.swing.JPanel Usuario;
    private javax.swing.JPanel Usuario1;
    private javax.swing.JPanel Usuario2;
    private javax.swing.JLabel creartxt;
    private javax.swing.JLabel creartxt1;
    private javax.swing.JLabel creartxt2;
    private javax.swing.JLabel eliminartxt;
    private javax.swing.JLabel eliminartxt1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel modificartxt;
    private javax.swing.JLabel modificartxt1;
    private javax.swing.JLabel mostrartxt;
    private javax.swing.JLabel mostrartxt1;
    private javax.swing.JLabel reportlibro;
    private javax.swing.JLabel reportusuario;
    private javax.swing.JLabel txtopcionbiblio;
    private javax.swing.JLabel txtopcionreporte;
    private javax.swing.JLabel txtopcionusuario;
    private javax.swing.JLabel userimag;
    // End of variables declaration//GEN-END:variables
}
