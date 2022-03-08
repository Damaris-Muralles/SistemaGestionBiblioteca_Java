
import Clases.Usuario;
import java.awt.Color;


public class Modificarusuario extends javax.swing.JPanel {
    private int cont=-1;
    Crearusuario p2 = new Crearusuario();
    public Modificarusuario() {
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
        busqueda = new javax.swing.JPanel();
        Buscartxt = new javax.swing.JLabel();
        Separator6 = new javax.swing.JSeparator();
        ingresar = new javax.swing.JPanel();
        txtingresar = new javax.swing.JLabel();

        Pfondo.setBackground(new java.awt.Color(255, 255, 255));
        Pfondo.setForeground(new java.awt.Color(0, 12, 23));
        Pfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelcrearusuario.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelcrearusuario.setForeground(new java.awt.Color(0, 12, 23));
        labelcrearusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelcrearusuario.setText("MODIFICAR USUARIO");
        Pfondo.add(labelcrearusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 23, 930, 40));

        labelrol.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelrol.setForeground(new java.awt.Color(0, 12, 23));
        labelrol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelrol.setText("ROL:");
        Pfondo.add(labelrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 190, 40));

        Nickname.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Nickname.setForeground(new java.awt.Color(0, 12, 23));
        Nickname.setBorder(null);
        Nickname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NicknameMousePressed(evt);
            }
        });
        Pfondo.add(Nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 410, 30));

        Separator1.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 410, 20));

        contrasenatxt.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        contrasenatxt.setForeground(new java.awt.Color(0, 12, 23));
        contrasenatxt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        contrasenatxt.setText("CONFIRMAR CONTRASEÑA:");
        Pfondo.add(contrasenatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 190, 40));

        password_confirm.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        password_confirm.setForeground(new java.awt.Color(0, 12, 23));
        password_confirm.setBorder(null);
        password_confirm.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        password_confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                password_confirmMousePressed(evt);
            }
        });
        Pfondo.add(password_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 410, 30));

        contrasenatxt1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        contrasenatxt1.setForeground(new java.awt.Color(0, 12, 23));
        contrasenatxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contrasenatxt1.setText("CONTRASEÑA:");
        Pfondo.add(contrasenatxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 190, 40));

        labelid.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelid.setForeground(new java.awt.Color(0, 12, 23));
        labelid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelid.setText("ID:");
        Pfondo.add(labelid, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 190, 40));

        labelnombre1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelnombre1.setForeground(new java.awt.Color(0, 12, 23));
        labelnombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelnombre1.setText("NOMBRE:");
        Pfondo.add(labelnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 190, 40));

        labelapellido1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelapellido1.setForeground(new java.awt.Color(0, 12, 23));
        labelapellido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelapellido1.setText("APELLIDO:");
        Pfondo.add(labelapellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 190, 40));

        labeluser.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labeluser.setForeground(new java.awt.Color(0, 12, 23));
        labeluser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeluser.setText("USER:");
        Pfondo.add(labeluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 190, 40));

        Separator2.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 410, 20));

        Separator3.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 410, 20));

        Separator4.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 410, 20));

        Separator5.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 410, 20));

        Separator7.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 410, 20));

        Txt_Password.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        Txt_Password.setForeground(new java.awt.Color(0, 12, 23));
        Txt_Password.setBorder(null);
        Txt_Password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Txt_Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_PasswordMousePressed(evt);
            }
        });
        Pfondo.add(Txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 410, 30));

        ID_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ID_usuario.setForeground(new java.awt.Color(153, 153, 153));
        ID_usuario.setText("Ingrese DPI del usuario");
        ID_usuario.setBorder(null);
        ID_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ID_usuarioMousePressed(evt);
            }
        });
        Pfondo.add(ID_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 410, 30));

        Txt_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txt_usuario.setForeground(new java.awt.Color(0, 12, 23));
        Txt_usuario.setBorder(null);
        Txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_usuarioMousePressed(evt);
            }
        });
        Pfondo.add(Txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 410, 30));

        rol_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rol_usuario.setForeground(new java.awt.Color(0, 12, 23));
        rol_usuario.setBorder(null);
        rol_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rol_usuarioMousePressed(evt);
            }
        });
        Pfondo.add(rol_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 410, 30));

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

        Pfondo.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 130, 40));

        apellido_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        apellido_usuario.setForeground(new java.awt.Color(0, 12, 23));
        apellido_usuario.setBorder(null);
        apellido_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                apellido_usuarioMousePressed(evt);
            }
        });
        Pfondo.add(apellido_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 410, 30));

        busqueda.setBackground(new java.awt.Color(2, 104, 111));

        Buscartxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Buscartxt.setForeground(new java.awt.Color(255, 249, 248));
        Buscartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Buscartxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarp.png"))); // NOI18N
        Buscartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buscartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscartxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout busquedaLayout = new javax.swing.GroupLayout(busqueda);
        busqueda.setLayout(busquedaLayout);
        busquedaLayout.setHorizontalGroup(
            busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, busquedaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Buscartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        busquedaLayout.setVerticalGroup(
            busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, busquedaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Buscartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Pfondo.add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 130, 40));

        Separator6.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 410, 20));

        ingresar.setBackground(new java.awt.Color(2, 104, 111));

        txtingresar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtingresar.setForeground(new java.awt.Color(255, 249, 248));
        txtingresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modifi.png"))); // NOI18N
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

        Pfondo.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 130, 40));

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
//comenzar a ingresar el dato
    private void ID_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ID_usuarioMousePressed
        if (ID_usuario.getText().equals("Ingrese DPI del usuario")){
            ID_usuario.setText("");
            ID_usuario.setForeground(Color.black);
        }
    }//GEN-LAST:event_ID_usuarioMousePressed

    private void cancelartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelartxtMouseClicked
       //Borrar datos 
        ID_usuario.setEditable(true);
       ID_usuarioMousePressed(evt);  
        ID_usuario.setText("Ingrese DPI del usuario");
        ID_usuario.setForeground(Color.gray);
        Txt_usuario.setText("");
        apellido_usuario.setText("");
        rol_usuario.setText("");
        Nickname.setText("");
        Txt_Password.setText("");
        password_confirm.setText("");
        cont=-1;
    }//GEN-LAST:event_cancelartxtMouseClicked

    private void BuscartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscartxtMouseClicked
       
        if(ID_usuario.getText().equals("Ingrese DPI del usuario")||ID_usuario.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null,"La casilla para el ID esta vacia, porfavor ingrese el ID a buscar","Modificar usuario",javax.swing.JOptionPane.WARNING_MESSAGE);
            
        }else{
                       for (int i = 0; i < p2.getListausuario().length; i++) {
                           if (p2.getListausuario()[i] != null) {
                           if (p2.getListausuario()[i].getID().equals(Long.parseLong(ID_usuario.getText()))) {
                                cont=i;
                             
                          }
                       }
                      }
                if(cont!=-1){
                      ID_usuario.setEditable(false);
                      Txt_usuario.setText(p2.getListausuario()[cont].getNombre());
                      apellido_usuario.setText(p2.getListausuario()[cont].getApellido());
                      rol_usuario.setText(p2.getListausuario()[cont].getRol());
                      Nickname.setText(p2.getListausuario()[cont].getUser());
                      Txt_Password.setText(p2.getListausuario()[cont].getPassword());  
                      password_confirm.setText(p2.getListausuario()[cont].getPassword());  
               
            }else{
                  javax.swing.JOptionPane.showMessageDialog(null,"EL ID ingresasdo no existe, porfavor revisar los datos","Modificar usuario",javax.swing.JOptionPane.ERROR_MESSAGE); 
                  cont=-1;
                }
                
        }
    }//GEN-LAST:event_BuscartxtMouseClicked

    private void txtingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtingresarMouseClicked
        int cont1=0;
        try{
        if(ID_usuario.getText().equals("Ingrese DPI del usuario")||Txt_usuario.getText().equals("")
            ||apellido_usuario.getText().equals("")||Nickname.getText().equals("")
                ||rol_usuario.getText().equals("")|| String.valueOf(Txt_Password.getPassword()).equals("")
                ||String.valueOf(password_confirm.getPassword()).equals("")||ID_usuario.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null,"Hay casillas que estan vacias, porfavor llene todos los datos solicitados","Modificar usuario",javax.swing.JOptionPane.WARNING_MESSAGE);
            
        }else{
            //Validacion deuser, existe o no
            for (int i = 0; i < p2.getListausuario().length; i++) {
                if (p2.getListausuario()[i] != null) {
                   if (i!=cont&&p2.getListausuario()[i].getUser().equals(Nickname.getText())) {
                    if (i!=cont&&p2.getListausuario()[i].getUser().equals(Nickname.getText())) {
                       cont1=1;
                    }
                   }
                }
            }
            if(cont1==1){
                javax.swing.JOptionPane.showMessageDialog(null,"EL Nickname ingresasdo ya existe, porfavor revisar los datos","Modificar usuario",javax.swing.JOptionPane.ERROR_MESSAGE); 
            }else{
                //validacion de contraseñas
                
                 if(!String.valueOf(Txt_Password.getPassword()).equals(String.valueOf(password_confirm.getPassword()))){
                     javax.swing.JOptionPane.showMessageDialog(null,"Las contraseñas no coiciden, porfavor verificar los datos","Modificar usuario",javax.swing.JOptionPane.ERROR_MESSAGE);
                 }else{
                     //modificaciones de los datos
                       for (int i = 0; i < p2.getListausuario().length; i++) {
                           if (p2.getListausuario()[i] != null) {
                          if (p2.getListausuario()[i].getID().equals(Long.parseLong(ID_usuario.getText()))) {
                              p2.getListausuario()[i] = new Usuario(Long.parseLong(ID_usuario.getText()),Txt_usuario.getText(), apellido_usuario.getText(),Nickname.getText(),rol_usuario.getText(),
                                      String.valueOf(Txt_Password.getPassword()));
                              break;
                                  }
                      }
                       }
                      javax.swing.JOptionPane.showMessageDialog(null,"Se ha modificado correctamente al usuario","Modificar usuario",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                     
                      cancelartxtMouseClicked(evt);
                      
                  }  
                  cont=-1;
            }
            
        }
        } catch (Exception e) {
        } 
    }//GEN-LAST:event_txtingresarMouseClicked
      // efecto de cambio de color y parametro predeterminado
    private void Txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_usuarioMousePressed
        if(ID_usuario.getText().equals("")){
        ID_usuario.setText("Ingrese DPI del usuario");
        ID_usuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_usuarioMousePressed

    private void apellido_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellido_usuarioMousePressed
        if(ID_usuario.getText().equals("")){
        ID_usuario.setText("Ingrese DPI del usuario");
        ID_usuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_apellido_usuarioMousePressed

    private void NicknameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NicknameMousePressed
        if(ID_usuario.getText().equals("")){
        ID_usuario.setText("Ingrese DPI del usuario");
        ID_usuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_NicknameMousePressed

    private void rol_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rol_usuarioMousePressed
         if(ID_usuario.getText().equals("")){
        ID_usuario.setText("Ingrese DPI del usuario");
        ID_usuario.setForeground(Color.gray);
         }
    }//GEN-LAST:event_rol_usuarioMousePressed

    private void Txt_PasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_PasswordMousePressed
         if(ID_usuario.getText().equals("")){
        ID_usuario.setText("Ingrese DPI del usuario");
        ID_usuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_PasswordMousePressed

    private void password_confirmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_confirmMousePressed
        if(ID_usuario.getText().equals("")){
        ID_usuario.setText("Ingrese DPI del usuario");
        ID_usuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_password_confirmMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buscartxt;
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
    private javax.swing.JPanel busqueda;
    private javax.swing.JPanel cancel;
    private javax.swing.JLabel cancelartxt;
    private javax.swing.JLabel contrasenatxt;
    private javax.swing.JLabel contrasenatxt1;
    private javax.swing.JPanel ingresar;
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
}
