
import Clases.Sesion;
import java.awt.Color;
import java.awt.Frame;



public class Login extends javax.swing.JFrame {
    private static Sesion[] En_sesion = new Sesion[1];   
    int xmouse, ymouse;
    public Login() {
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
        usaclogo = new javax.swing.JLabel();
        Barralateral = new javax.swing.JLabel();
        iconuser = new javax.swing.JLabel();
        iniciarstxt = new javax.swing.JLabel();
        usuriotxt = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        Separator1 = new javax.swing.JSeparator();
        contrasenatxt = new javax.swing.JLabel();
        Separator2 = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();
        Cancel = new javax.swing.JPanel();
        txtcancelar = new javax.swing.JLabel();
        ingresar = new javax.swing.JPanel();
        txtingresar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 251, 251));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));
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

        usaclogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usaclogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Usac_logopequeño.png"))); // NOI18N
        jPanel1.add(usaclogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 410, 180));

        Barralateral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Barralateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoazul.jpg"))); // NOI18N
        jPanel1.add(Barralateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 600));

        iconuser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login-user-mediano.png"))); // NOI18N
        jPanel1.add(iconuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 790, 200));

        iniciarstxt.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        iniciarstxt.setForeground(new java.awt.Color(0, 12, 23));
        iniciarstxt.setText("INICIAR SESIÓN");
        jPanel1.add(iniciarstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 210, 40));

        usuriotxt.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        usuriotxt.setForeground(new java.awt.Color(0, 12, 23));
        usuriotxt.setText("USUARIO");
        jPanel1.add(usuriotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 210, 40));

        username.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        username.setForeground(new java.awt.Color(153, 153, 153));
        username.setText("Ingrese su nombre de usuario");
        username.setBorder(null);
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usernameMousePressed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 460, 30));

        Separator1.setForeground(new java.awt.Color(0, 39, 78));
        jPanel1.add(Separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 460, 20));

        contrasenatxt.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        contrasenatxt.setForeground(new java.awt.Color(0, 12, 23));
        contrasenatxt.setText("CONTRASEÑA");
        jPanel1.add(contrasenatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 250, 40));

        Separator2.setForeground(new java.awt.Color(0, 39, 78));
        jPanel1.add(Separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 460, 20));

        password.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(153, 153, 153));
        password.setText("**********");
        password.setBorder(null);
        password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordMousePressed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 460, 30));

        Cancel.setBackground(new java.awt.Color(2, 104, 111));

        txtcancelar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtcancelar.setForeground(new java.awt.Color(255, 249, 248));
        txtcancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtcancelar.setText("CANCELAR");
        txtcancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtcancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CancelLayout = new javax.swing.GroupLayout(Cancel);
        Cancel.setLayout(CancelLayout);
        CancelLayout.setHorizontalGroup(
            CancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CancelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CancelLayout.setVerticalGroup(
            CancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CancelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, 130, 40));

        ingresar.setBackground(new java.awt.Color(2, 104, 111));

        txtingresar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtingresar.setForeground(new java.awt.Color(255, 249, 248));
        txtingresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtingresar.setText("INGRESAR");
        txtingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtingresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ingresarLayout = new javax.swing.GroupLayout(ingresar);
        ingresar.setLayout(ingresarLayout);
        ingresarLayout.setHorizontalGroup(
            ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ingresarLayout.setVerticalGroup(
            ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 130, 40));

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

    private void txtingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtingresarMouseClicked
        Crearusuario obj = new Crearusuario(); 
         Boolean existe = true;
         int valido=2;
        
        
        if(username.getText().equals("") ||username.getText().equals("Ingrese su nombre de usuario") 
                || String.valueOf(password.getPassword()).equals("")|| String.valueOf(password.getPassword()).equals("**********")){
            javax.swing.JOptionPane.showMessageDialog(null,"Las casillas para usuario o contraseña estan vacias",
                    "Login",javax.swing.JOptionPane.WARNING_MESSAGE);
             
        }else{
             for (int i = 0; i < obj.getListausuario().length; i++) {
            if(obj.getListausuario()[i] != null){
                if(obj.getListausuario()[i].getUser().equals(username.getText()) 
                        && obj.getListausuario()[i].getPassword().equals(String.valueOf(password.getPassword()))){
                    existe = true;
                    valido=1;
                     En_sesion[0]= new Sesion(obj.getListausuario()[i].getID(),obj.getListausuario()[i].getNombre(),obj.getListausuario()[i].getApellido(),
                     obj.getListausuario()[i].getUser(),obj.getListausuario()[i].getRol(),obj.getListausuario()[i].getPassword());
                    break;
                    //Long ID_user,String nombre_user,String apellido_user, String user_sesion, String rol_user,String password_user
                }
                 if(obj.getListausuario()[i].getUser().equals(username.getText()) 
                        && !obj.getListausuario()[i].getPassword().equals(String.valueOf(password.getPassword()))){
                    
                    existe = false;
                    valido=0;
                    break;
                }
            }
        }
        if(existe && valido==1) {
            if(username.getText().equals("admin")&&String.valueOf(password.getPassword()).equals("admin") ){
                Administrador obj1 = new Administrador();
                 obj1.setSize (1200,600);
                  obj1.setVisible(true);
                  this.setVisible(false);
            }else{
               PantallaUsuario obj1 = new PantallaUsuario();
                  obj1.setSize (1200,600);
                  obj1.setVisible(true);
                  this.setVisible(false);
            }
            
        } else {
            if(!existe && valido==0){
                javax.swing.JOptionPane.showMessageDialog(null, "El usuario y contraseña no coinciden, porfavor revise sus datos",
                        "Login",javax.swing.JOptionPane.ERROR_MESSAGE);
            }else{
                
                 javax.swing.JOptionPane.showMessageDialog(null, "El usuario no existe, ponerse en contacto con el administrador "
                         + "para solicitar un registro","Login",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
        }
          
        
           
       
    }//GEN-LAST:event_txtingresarMouseClicked

    private void txtcancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcancelarMouseClicked
        password.setForeground(Color.gray);
        password.setText("**********");
        username.setForeground(Color.gray);
        username.setText("Ingrese su nombre de usuario");
        Pantallainicio obj = new Pantallainicio();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_txtcancelarMouseClicked

    private void passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMousePressed
      if(String.valueOf(password.getPassword()).equals("**********")){
            password.setText("");
            password.setForeground(Color.black);
        }
        if (username.getText().isEmpty()){
            username.setText("Ingrese su nombre de usuario");
            username.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passwordMousePressed

    private void usernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMousePressed
       if (username.getText().equals("Ingrese su nombre de usuario")){
            username.setText("");   
            username.setForeground(Color.black);
        }
        if(String.valueOf(password.getPassword()).isEmpty()){
          password.setText("**********");
          password.setForeground(Color.gray);
        }
    }//GEN-LAST:event_usernameMousePressed

    
    public static void main(String args[]) {
     
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Barralateral;
    private javax.swing.JPanel Cancel;
    private javax.swing.JPanel P_C;
    private javax.swing.JPanel P_m;
    private javax.swing.JPanel P_opciones;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JLabel T_cerrar;
    private javax.swing.JLabel T_minimizar;
    private javax.swing.JLabel contrasenatxt;
    private javax.swing.JLabel iconuser;
    private javax.swing.JPanel ingresar;
    private javax.swing.JLabel iniciarstxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel txtcancelar;
    private javax.swing.JLabel txtingresar;
    private javax.swing.JLabel usaclogo;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usuriotxt;
    // End of variables declaration//GEN-END:variables

    
    public static Sesion[] getEn_sesion() {
        return En_sesion;
    }
}
