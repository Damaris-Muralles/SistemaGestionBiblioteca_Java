
public class infogeneral extends javax.swing.JPanel {

    public infogeneral() {
        initComponents();
        initComponents2();
    }
private void initComponents2() {
    Login p2 = new Login();
   
    ID_usuario.setText(String.valueOf(p2.getEn_sesion()[0].getID_user()));
    Txt_usuario.setText(p2.getEn_sesion()[0].getNombre_user());
    apellido_usuario.setText(p2.getEn_sesion()[0].getApellido_user());
    rol_usuario.setText(p2.getEn_sesion()[0].getRol_user());
    Nickname.setText(p2.getEn_sesion()[0].getUser_sesion());
    Txt_Password.setText(p2.getEn_sesion()[0].getPassword_user());  
    ID_usuario.setEditable(false);
    Txt_usuario.setEditable(false);
    apellido_usuario.setEditable(false);
    rol_usuario.setEditable(false);
    Nickname.setEditable(false);
    Txt_Password.setEditable(false);
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FONDO = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelid = new javax.swing.JLabel();
        labelnombre1 = new javax.swing.JLabel();
        labelapellido1 = new javax.swing.JLabel();
        labeluser = new javax.swing.JLabel();
        labelrol = new javax.swing.JLabel();
        contrasenatxt1 = new javax.swing.JLabel();
        ID_usuario = new javax.swing.JTextField();
        Txt_usuario = new javax.swing.JTextField();
        apellido_usuario = new javax.swing.JTextField();
        Nickname = new javax.swing.JTextField();
        rol_usuario = new javax.swing.JTextField();
        Txt_Password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        FONDO.setBackground(new java.awt.Color(255, 255, 255));
        FONDO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(109, 163, 199));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORMACIÓN GENERAL DEL USUARIO");
        jLabel1.setOpaque(true);
        FONDO.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 830, 50));

        labelid.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelid.setForeground(new java.awt.Color(0, 12, 23));
        labelid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelid.setText("ID:");
        FONDO.add(labelid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 140, 30));

        labelnombre1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelnombre1.setForeground(new java.awt.Color(0, 12, 23));
        labelnombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelnombre1.setText("NOMBRE:");
        FONDO.add(labelnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 140, 30));

        labelapellido1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelapellido1.setForeground(new java.awt.Color(0, 12, 23));
        labelapellido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelapellido1.setText("APELLIDO:");
        FONDO.add(labelapellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 140, 30));

        labeluser.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labeluser.setForeground(new java.awt.Color(0, 12, 23));
        labeluser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeluser.setText("USER:");
        FONDO.add(labeluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 140, 30));

        labelrol.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelrol.setForeground(new java.awt.Color(0, 12, 23));
        labelrol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelrol.setText("ROL:");
        FONDO.add(labelrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 140, 30));

        contrasenatxt1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        contrasenatxt1.setForeground(new java.awt.Color(0, 12, 23));
        contrasenatxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contrasenatxt1.setText("CONTRASEÑA:");
        FONDO.add(contrasenatxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 140, 30));

        ID_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ID_usuario.setForeground(new java.awt.Color(0, 12, 23));
        ID_usuario.setBorder(null);
        ID_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FONDO.add(ID_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 290, 30));

        Txt_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_usuario.setForeground(new java.awt.Color(0, 12, 23));
        Txt_usuario.setBorder(null);
        Txt_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FONDO.add(Txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 290, 30));

        apellido_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        apellido_usuario.setForeground(new java.awt.Color(0, 12, 23));
        apellido_usuario.setBorder(null);
        apellido_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FONDO.add(apellido_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 290, 30));

        Nickname.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Nickname.setForeground(new java.awt.Color(0, 12, 23));
        Nickname.setBorder(null);
        Nickname.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FONDO.add(Nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 290, 30));

        rol_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rol_usuario.setForeground(new java.awt.Color(0, 12, 23));
        rol_usuario.setBorder(null);
        rol_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FONDO.add(rol_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 290, 30));

        Txt_Password.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        Txt_Password.setForeground(new java.awt.Color(0, 12, 23));
        Txt_Password.setBorder(null);
        Txt_Password.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FONDO.add(Txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 290, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Usac_logo.png"))); // NOI18N
        FONDO.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 280, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FONDO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FONDO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FONDO;
    private javax.swing.JTextField ID_usuario;
    private javax.swing.JTextField Nickname;
    private javax.swing.JPasswordField Txt_Password;
    private javax.swing.JTextField Txt_usuario;
    private javax.swing.JTextField apellido_usuario;
    private javax.swing.JLabel contrasenatxt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelapellido1;
    private javax.swing.JLabel labelid;
    private javax.swing.JLabel labelnombre1;
    private javax.swing.JLabel labelrol;
    private javax.swing.JLabel labeluser;
    private javax.swing.JTextField rol_usuario;
    // End of variables declaration//GEN-END:variables
}
