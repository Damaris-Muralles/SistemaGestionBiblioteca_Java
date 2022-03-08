


import Clases.Usuario;
import java.awt.Color;


public class Crearusuario extends javax.swing.JPanel {

    private static Usuario[] listausuario = new Usuario[2];
    
    public Crearusuario() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pfondo = new javax.swing.JPanel();
        labelcrearusuario = new javax.swing.JLabel();
        labelrol = new javax.swing.JLabel();
        Nickname = new javax.swing.JTextField();
        Separator1 = new javax.swing.JSeparator();
        contrasenatxt = new javax.swing.JLabel();
        password_confirm = new javax.swing.JPasswordField();
        contrasenatxt1 = new javax.swing.JLabel();
        labelid = new javax.swing.JLabel();
        labelnombre1 = new javax.swing.JLabel();
        labelapellido1 = new javax.swing.JLabel();
        labeluser = new javax.swing.JLabel();
        Separator2 = new javax.swing.JSeparator();
        Separator3 = new javax.swing.JSeparator();
        Separator4 = new javax.swing.JSeparator();
        Separator5 = new javax.swing.JSeparator();
        Separator7 = new javax.swing.JSeparator();
        Txt_Password = new javax.swing.JPasswordField();
        ID_usuario = new javax.swing.JTextField();
        Txt_usuario = new javax.swing.JTextField();
        rol_usuario = new javax.swing.JTextField();
        cancel = new javax.swing.JPanel();
        cancelartxt = new javax.swing.JLabel();
        apellido_usuario = new javax.swing.JTextField();
        ingresar1 = new javax.swing.JPanel();
        txtingresar = new javax.swing.JLabel();
        Separator6 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(930, 560));

        Pfondo.setBackground(new java.awt.Color(255, 255, 255));
        Pfondo.setForeground(new java.awt.Color(0, 12, 23));
        Pfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelcrearusuario.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelcrearusuario.setForeground(new java.awt.Color(0, 12, 23));
        labelcrearusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelcrearusuario.setText("CREAR USUARIO");
        Pfondo.add(labelcrearusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 23, 930, 40));

        labelrol.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelrol.setForeground(new java.awt.Color(0, 12, 23));
        labelrol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelrol.setText("ROL:");
        Pfondo.add(labelrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 190, 40));

        Nickname.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Nickname.setForeground(new java.awt.Color(153, 153, 153));
        Nickname.setText("Ingrese Nickname del usuario");
        Nickname.setBorder(null);
        Nickname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NicknameMousePressed(evt);
            }
        });
        Pfondo.add(Nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 460, 30));

        Separator1.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 460, 20));

        contrasenatxt.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        contrasenatxt.setForeground(new java.awt.Color(0, 12, 23));
        contrasenatxt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        contrasenatxt.setText("CONFIRMAR CONTRASEÑA:");
        Pfondo.add(contrasenatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 190, 40));

        password_confirm.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        password_confirm.setForeground(new java.awt.Color(153, 153, 153));
        password_confirm.setText("**********");
        password_confirm.setBorder(null);
        password_confirm.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        password_confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                password_confirmMousePressed(evt);
            }
        });
        Pfondo.add(password_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 460, 30));

        contrasenatxt1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        contrasenatxt1.setForeground(new java.awt.Color(0, 12, 23));
        contrasenatxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contrasenatxt1.setText("CONTRASEÑA:");
        Pfondo.add(contrasenatxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 190, 40));

        labelid.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelid.setForeground(new java.awt.Color(0, 12, 23));
        labelid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelid.setText("ID:");
        Pfondo.add(labelid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 190, 40));

        labelnombre1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelnombre1.setForeground(new java.awt.Color(0, 12, 23));
        labelnombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelnombre1.setText("NOMBRE:");
        Pfondo.add(labelnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 190, 40));

        labelapellido1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelapellido1.setForeground(new java.awt.Color(0, 12, 23));
        labelapellido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelapellido1.setText("APELLIDO:");
        Pfondo.add(labelapellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 190, 40));

        labeluser.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labeluser.setForeground(new java.awt.Color(0, 12, 23));
        labeluser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeluser.setText("USER:");
        Pfondo.add(labeluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 190, 40));

        Separator2.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 460, 20));

        Separator3.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 460, 20));

        Separator4.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 460, 20));

        Separator5.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 460, 20));

        Separator7.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 460, 20));

        Txt_Password.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        Txt_Password.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Password.setText("**********");
        Txt_Password.setBorder(null);
        Txt_Password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Txt_Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_PasswordMousePressed(evt);
            }
        });
        Pfondo.add(Txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 460, 30));

        ID_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ID_usuario.setForeground(new java.awt.Color(153, 153, 153));
        ID_usuario.setText("Ingrese DPI del usuario");
        ID_usuario.setBorder(null);
        ID_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ID_usuarioMousePressed(evt);
            }
        });
        Pfondo.add(ID_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 460, 30));

        Txt_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_usuario.setForeground(new java.awt.Color(153, 153, 153));
        Txt_usuario.setText("Ingrese nombre del usuario");
        Txt_usuario.setBorder(null);
        Txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_usuarioMousePressed(evt);
            }
        });
        Pfondo.add(Txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 460, 30));

        rol_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rol_usuario.setForeground(new java.awt.Color(153, 153, 153));
        rol_usuario.setText("Ingrese rol del usuario");
        rol_usuario.setBorder(null);
        rol_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rol_usuarioMousePressed(evt);
            }
        });
        Pfondo.add(rol_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 460, 30));

        cancel.setBackground(new java.awt.Color(2, 104, 111));

        cancelartxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        cancelartxt.setForeground(new java.awt.Color(255, 249, 248));
        cancelartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelartxt.setText("Cancelar");
        cancelartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelartxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cancelLayout = new javax.swing.GroupLayout(cancel);
        cancel.setLayout(cancelLayout);
        cancelLayout.setHorizontalGroup(
            cancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cancelLayout.setVerticalGroup(
            cancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Pfondo.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, 130, 40));

        apellido_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        apellido_usuario.setForeground(new java.awt.Color(153, 153, 153));
        apellido_usuario.setText("Ingrese apellido del usuario");
        apellido_usuario.setBorder(null);
        apellido_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                apellido_usuarioMousePressed(evt);
            }
        });
        Pfondo.add(apellido_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 460, 30));

        ingresar1.setBackground(new java.awt.Color(2, 104, 111));

        txtingresar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtingresar.setForeground(new java.awt.Color(255, 249, 248));
        txtingresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        txtingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtingresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ingresar1Layout = new javax.swing.GroupLayout(ingresar1);
        ingresar1.setLayout(ingresar1Layout);
        ingresar1Layout.setHorizontalGroup(
            ingresar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingresar1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ingresar1Layout.setVerticalGroup(
            ingresar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingresar1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Pfondo.add(ingresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 130, 40));

        Separator6.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 460, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

       
    private Boolean Espacio(Usuario[] arreglo) {
        Boolean libre = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                libre = true;
                break;
            }
        }
        return libre;
    }
    private Usuario[] dimensionarreglo(Usuario[] arreglo){
        Usuario[] tem = new Usuario[arreglo.length + 1];
        for (int i = 0; i < arreglo.length; i++) {
            tem[i] = arreglo[i];
        }
        return tem;
      
    }
    
    private void cancelartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelartxtMouseClicked
            //vaciando parametros
            Txt_usuario.setText("Ingrese nombre del usuario");
            Txt_usuario.setForeground(Color.gray);
            ID_usuario.setText("Ingrese DPI del usuario");
            ID_usuario.setForeground(Color.gray);
            apellido_usuario.setText("Ingrese apellido del usuario");
            apellido_usuario.setForeground(Color.gray);
            rol_usuario.setText("Ingrese rol del usuario");
            rol_usuario.setForeground(Color.gray);
            Nickname.setText("Ingrese Nickname del usuario");
            Nickname.setForeground(Color.gray);
            Txt_Password.setText("**********");
            Txt_Password.setForeground(Color.gray);
            password_confirm.setText("**********");
            password_confirm.setForeground(Color.gray);              
    }//GEN-LAST:event_cancelartxtMouseClicked

    private void txtingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtingresarMouseClicked
        
        int cont=0, cont1=0; 
        if (!Espacio(listausuario)) {  
            listausuario=dimensionarreglo(getListausuario());  
        }
       
        //confirmacion si hay parametros vacios
        if(ID_usuario.getText().equals("Ingrese DPI del usuario")||Txt_usuario.getText().equals("Ingrese nombre del usuario")
            ||apellido_usuario.getText().equals("Ingrese apellido del usuario")||Nickname.getText().equals("Ingrese Nickname del usuario")
                ||rol_usuario.getText().equals("Ingrese rol del usuario")|| String.valueOf(Txt_Password.getPassword()).equals("**********")
                ||String.valueOf(password_confirm.getPassword()).equals("**********")||ID_usuario.getText().equals("")||Txt_usuario.getText().equals("")
                ||apellido_usuario.getText().equals("")||Nickname.getText().equals("Ingrese Nickname del usuario")||rol_usuario.getText().equals("")
                || String.valueOf(Txt_Password.getPassword()).equals("")||String.valueOf(password_confirm.getPassword()).equals("")){
            javax.swing.JOptionPane.showMessageDialog(null,"Hay casillas que estan vacias, porfavor llene todos los datos solicitados","Crear usuario",javax.swing.JOptionPane.WARNING_MESSAGE);
            
        }else{
            //Validacion de ID y user, existe o no
            for (int i = 0; i < getListausuario().length; i++) {
                if (getListausuario()[i] != null) {
                    if (getListausuario()[i].getID().equals(Long.parseLong(ID_usuario.getText()))) {
                       cont=1;
                    }
                    if (getListausuario()[i].getUser().equals(Nickname.getText())) {
                       cont1=1;
                    }
                }
            }
            if(cont==1){
                javax.swing.JOptionPane.showMessageDialog(null,"EL ID ingresasdo ya existe, porfavor revisar los datos","Crear usuario",javax.swing.JOptionPane.ERROR_MESSAGE); 
            }else{
                if(cont1==1){
                     javax.swing.JOptionPane.showMessageDialog(null,"EL Nickname ingresasdo ya existe, porfavor revisar los datos","Crear usuario",javax.swing.JOptionPane.ERROR_MESSAGE); 
                }else{
                //validacion de contraseñas
                 if(!String.valueOf(Txt_Password.getPassword()).equals(String.valueOf(password_confirm.getPassword()))){
                     javax.swing.JOptionPane.showMessageDialog(null,"Las contraseñas no coiciden, porfavor verificar los datos","Crear usuario",javax.swing.JOptionPane.ERROR_MESSAGE);
                 }else{
                     //asignacion de valores
                       for (int i = 0; i < getListausuario().length; i++) {
                          if (getListausuario()[i] == null) {
                              listausuario[i] = new Usuario(Long.parseLong(ID_usuario.getText()),Txt_usuario.getText(), apellido_usuario.getText(),Nickname.getText(),rol_usuario.getText(),
                                      String.valueOf(Txt_Password.getPassword()));
                              break;
                                  }
                      }
                       //vaciando parametros
                      javax.swing.JOptionPane.showMessageDialog(null,"Se ha agregado correctamente al usuario","Crear usuario",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                      Txt_usuario.setText("Ingrese nombre del usuario");
                      Txt_usuario.setForeground(Color.gray);
                      ID_usuario.setText("Ingrese DPI del usuario");
                      ID_usuario.setForeground(Color.gray);
                      apellido_usuario.setText("Ingrese apellido del usuario");
                      apellido_usuario.setForeground(Color.gray);
                      rol_usuario.setText("Ingrese rol del usuario");
                      rol_usuario.setForeground(Color.gray);
                      Nickname.setText("Ingrese Nickname del usuario");
                      Nickname.setForeground(Color.gray);
                      Txt_Password.setText("**********");
                      Txt_Password.setForeground(Color.gray);
                      password_confirm.setText("**********");
                      password_confirm.setForeground(Color.gray);
                  }  
                }
            }
        
        }
       
        
    }//GEN-LAST:event_txtingresarMouseClicked

    private void ID_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ID_usuarioMousePressed
        // cambiar de color de los parametros de muestra establecidos
        if (ID_usuario.getText().equals("Ingrese DPI del usuario")){
            ID_usuario.setText("");   
            ID_usuario.setForeground(Color.black);
        }
        if (Txt_usuario.getText().isEmpty()){
            Txt_usuario.setText("Ingrese nombre del usuario");
            Txt_usuario.setForeground(Color.gray);
        }
        if (apellido_usuario.getText().isEmpty()){
            apellido_usuario.setText("Ingrese apellido del usuario");
            apellido_usuario.setForeground(Color.gray);
        }
        if (Nickname.getText().isEmpty()){
            Nickname.setText("Ingrese Nickname del usuario");
            Nickname.setForeground(Color.gray);
        }
        if (rol_usuario.getText().isEmpty()){
            rol_usuario.setText("Ingrese rol del usuario");
            rol_usuario.setForeground(Color.gray);
        }
        if(String.valueOf(password_confirm.getPassword()).isEmpty()){
          password_confirm.setText("**********");
          password_confirm.setForeground(Color.gray);
        }
        if(String.valueOf(Txt_Password.getPassword()).isEmpty()){
          Txt_Password.setText("**********");
          Txt_Password.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ID_usuarioMousePressed

    private void Txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_usuarioMousePressed
       // cambiar de color de los parametros de muestra establecidos
        if (Txt_usuario.getText().equals("Ingrese nombre del usuario")){
            Txt_usuario.setText("");   
            Txt_usuario.setForeground(Color.black);
        }
        if (ID_usuario.getText().isEmpty()){
            ID_usuario.setText("Ingrese DPI del usuario");
            ID_usuario.setForeground(Color.gray);
        }
        if (apellido_usuario.getText().isEmpty()){
            apellido_usuario.setText("Ingrese apellido del usuario");
            apellido_usuario.setForeground(Color.gray);
        }
        if (Nickname.getText().isEmpty()){
            Nickname.setText("Ingrese Nickname del usuario");
            Nickname.setForeground(Color.gray);
        }
        if (rol_usuario.getText().isEmpty()){
            rol_usuario.setText("Ingrese rol del usuario");
            rol_usuario.setForeground(Color.gray);
        }
        if(String.valueOf(password_confirm.getPassword()).isEmpty()){
          password_confirm.setText("**********");
          password_confirm.setForeground(Color.gray);
        }
        if(String.valueOf(Txt_Password.getPassword()).isEmpty()){
          Txt_Password.setText("**********");
          Txt_Password.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_usuarioMousePressed

    private void apellido_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellido_usuarioMousePressed
       // cambiar de color de los parametros de muestra establecidos
        if (apellido_usuario.getText().equals("Ingrese apellido del usuario")){
            apellido_usuario.setText("");   
            apellido_usuario.setForeground(Color.black);
        }
        if (ID_usuario.getText().isEmpty()){
            ID_usuario.setText("Ingrese DPI del usuario");
            ID_usuario.setForeground(Color.gray);
        }
        if (Txt_usuario.getText().isEmpty()){
            Txt_usuario.setText("Ingrese nombre del usuario");
            Txt_usuario.setForeground(Color.gray);
        }
        if (Nickname.getText().isEmpty()){
            Nickname.setText("Ingrese Nickname del usuario");
            Nickname.setForeground(Color.gray);
        }
        if (rol_usuario.getText().isEmpty()){
            rol_usuario.setText("Ingrese rol del usuario");
            rol_usuario.setForeground(Color.gray);
        }
        if(String.valueOf(password_confirm.getPassword()).isEmpty()){
          password_confirm.setText("**********");
          password_confirm.setForeground(Color.gray);
        }
        if(String.valueOf(Txt_Password.getPassword()).isEmpty()){
          Txt_Password.setText("**********");
          Txt_Password.setForeground(Color.gray);
        }
    }//GEN-LAST:event_apellido_usuarioMousePressed

    private void NicknameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NicknameMousePressed
        // cambiar de color de los parametros de muestra establecidos
        if (Nickname.getText().equals("Ingrese Nickname del usuario")){
            Nickname.setText("");   
            Nickname.setForeground(Color.black);
        }
        if (ID_usuario.getText().isEmpty()){
            ID_usuario.setText("Ingrese DPI del usuario");
            ID_usuario.setForeground(Color.gray);
        }
        if (Txt_usuario.getText().isEmpty()){
            Txt_usuario.setText("Ingrese nombre del usuario");
            Txt_usuario.setForeground(Color.gray);
        }
        if (apellido_usuario.getText().isEmpty()){
            apellido_usuario.setText("Ingrese apellido del usuario");
            apellido_usuario.setForeground(Color.gray);
        }
        if (rol_usuario.getText().isEmpty()){
            rol_usuario.setText("Ingrese rol del usuario");
            rol_usuario.setForeground(Color.gray);
        }
        if(String.valueOf(password_confirm.getPassword()).isEmpty()){
          password_confirm.setText("**********");
          password_confirm.setForeground(Color.gray);
        }
        if(String.valueOf(Txt_Password.getPassword()).isEmpty()){
          Txt_Password.setText("**********");
          Txt_Password.setForeground(Color.gray);
        }
    }//GEN-LAST:event_NicknameMousePressed

    private void rol_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rol_usuarioMousePressed
        // cambiar de color de los parametros de muestra establecidos
        if (rol_usuario.getText().equals("Ingrese rol del usuario")){
            rol_usuario.setText("");   
            rol_usuario.setForeground(Color.black);
        }
        if (ID_usuario.getText().isEmpty()){
            ID_usuario.setText("Ingrese DPI del usuario");
            ID_usuario.setForeground(Color.gray);
        }
        if (Txt_usuario.getText().isEmpty()){
            Txt_usuario.setText("Ingrese nombre del usuario");
            Txt_usuario.setForeground(Color.gray);
        }
        if (apellido_usuario.getText().isEmpty()){
            apellido_usuario.setText("Ingrese apellido del usuario");
            apellido_usuario.setForeground(Color.gray);
        }
        if (Nickname.getText().isEmpty()){
            Nickname.setText("Ingrese Nickname del usuario");
            Nickname.setForeground(Color.gray);
        }
        if(String.valueOf(password_confirm.getPassword()).isEmpty()){
          password_confirm.setText("**********");
          password_confirm.setForeground(Color.gray);
        }
        if(String.valueOf(Txt_Password.getPassword()).isEmpty()){
          Txt_Password.setText("**********");
          Txt_Password.setForeground(Color.gray);
        }
    }//GEN-LAST:event_rol_usuarioMousePressed

    private void Txt_PasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_PasswordMousePressed
        // cambiar de color de los parametros de muestra establecidos
        if(String.valueOf(Txt_Password.getPassword()).equals("**********")){
            Txt_Password.setText("");
            Txt_Password.setForeground(Color.black);
        }
        if (ID_usuario.getText().isEmpty()){
            ID_usuario.setText("Ingrese DPI del usuario");
            ID_usuario.setForeground(Color.gray);
        }
        if (Txt_usuario.getText().isEmpty()){
            Txt_usuario.setText("Ingrese nombre del usuario");
            Txt_usuario.setForeground(Color.gray);
        }
        if (apellido_usuario.getText().isEmpty()){
            apellido_usuario.setText("Ingrese apellido del usuario");
            apellido_usuario.setForeground(Color.gray);
        }
        if (Nickname.getText().isEmpty()){
            Nickname.setText("Ingrese Nickname del usuario");
            Nickname.setForeground(Color.gray);
        }
        if (rol_usuario.getText().isEmpty()){
            rol_usuario.setText("Ingrese rol del usuario");
            rol_usuario.setForeground(Color.gray);
        }
        if(String.valueOf(password_confirm.getPassword()).isEmpty()){
          password_confirm.setText("**********");
          password_confirm.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_PasswordMousePressed

    private void password_confirmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_confirmMousePressed
       // cambiar de color de los parametros de muestra establecidos
        if(String.valueOf( password_confirm.getPassword()).equals("**********")){
             password_confirm.setText("");
            password_confirm.setForeground(Color.black);
        }
        if (ID_usuario.getText().isEmpty()){
            ID_usuario.setText("Ingrese DPI del usuario");
            ID_usuario.setForeground(Color.gray);
        }
        if (Txt_usuario.getText().isEmpty()){
            Txt_usuario.setText("Ingrese nombre del usuario");
            Txt_usuario.setForeground(Color.gray);
        }
        if (apellido_usuario.getText().isEmpty()){
            apellido_usuario.setText("Ingrese apellido del usuario");
            apellido_usuario.setForeground(Color.gray);
        }
        if (Nickname.getText().isEmpty()){
            Nickname.setText("Ingrese Nickname del usuario");
            Nickname.setForeground(Color.gray);
        }
        if (rol_usuario.getText().isEmpty()){
            rol_usuario.setText("Ingrese rol del usuario");
            rol_usuario.setForeground(Color.gray);
        }
        if(String.valueOf( Txt_Password.getPassword()).isEmpty()){
           Txt_Password.setText("**********");
           Txt_Password.setForeground(Color.gray);
        }
    }//GEN-LAST:event_password_confirmMousePressed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID_usuario;
    private javax.swing.JTextField Nickname;
    private javax.swing.JPanel Pfondo;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JSeparator Separator3;
    private javax.swing.JSeparator Separator4;
    private javax.swing.JSeparator Separator5;
    private javax.swing.JSeparator Separator6;
    private javax.swing.JSeparator Separator7;
    private javax.swing.JPasswordField Txt_Password;
    private javax.swing.JTextField Txt_usuario;
    private javax.swing.JTextField apellido_usuario;
    private javax.swing.JPanel cancel;
    private javax.swing.JLabel cancelartxt;
    private javax.swing.JLabel contrasenatxt;
    private javax.swing.JLabel contrasenatxt1;
    private javax.swing.JPanel ingresar1;
    private javax.swing.JLabel labelapellido1;
    private javax.swing.JLabel labelcrearusuario;
    private javax.swing.JLabel labelid;
    private javax.swing.JLabel labelnombre1;
    private javax.swing.JLabel labelrol;
    private javax.swing.JLabel labeluser;
    private javax.swing.JPasswordField password_confirm;
    private javax.swing.JTextField rol_usuario;
    private javax.swing.JLabel txtingresar;
    // End of variables declaration//GEN-END:variables

    
    public static Usuario[] getListausuario() {
        return listausuario;
        }
    
}

