
import Clases.Libros;
import java.awt.Color;
import java.awt.event.MouseEvent;

public class Cargamasiva extends javax.swing.JFrame {
   
     private static Cargaindividual p1 = new Cargaindividual();
    public Cargamasiva() {
        initComponents();
        initComponents2();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        labelcrearb = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cargatxt = new javax.swing.JTextArea();
        ingresar1 = new javax.swing.JPanel();
        txtingresar = new javax.swing.JLabel();
        cancel1 = new javax.swing.JPanel();
        cancelartxt = new javax.swing.JLabel();
        Retur = new javax.swing.JPanel();
        regresartxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelcrearb.setBackground(new java.awt.Color(2, 104, 111));
        labelcrearb.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelcrearb.setForeground(new java.awt.Color(255, 255, 255));
        labelcrearb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelcrearb.setText("CARGA MASIVA");
        labelcrearb.setOpaque(true);
        fondo.add(labelcrearb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 1070, 40));

        cargatxt.setColumns(20);
        cargatxt.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        cargatxt.setRows(5);
        cargatxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(cargatxt);

        fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 950, 310));

        ingresar1.setBackground(new java.awt.Color(2, 104, 111));

        txtingresar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtingresar.setForeground(new java.awt.Color(255, 249, 248));
        txtingresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pluss.png"))); // NOI18N
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

        fondo.add(ingresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 130, 40));

        cancel1.setBackground(new java.awt.Color(2, 104, 111));

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

        javax.swing.GroupLayout cancel1Layout = new javax.swing.GroupLayout(cancel1);
        cancel1.setLayout(cancel1Layout);
        cancel1Layout.setHorizontalGroup(
            cancel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cancel1Layout.setVerticalGroup(
            cancel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondo.add(cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 130, 40));

        Retur.setBackground(new java.awt.Color(2, 104, 111));

        regresartxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        regresartxt.setForeground(new java.awt.Color(255, 249, 248));
        regresartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regresartxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/return.png"))); // NOI18N
        regresartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresartxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ReturLayout = new javax.swing.GroupLayout(Retur);
        Retur.setLayout(ReturLayout);
        ReturLayout.setHorizontalGroup(
            ReturLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReturLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(regresartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ReturLayout.setVerticalGroup(
            ReturLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReturLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(regresartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondo.add(Retur, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, 130, 40));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 104, 111));
        jLabel1.setText("Tipo;Autor;Año_publicación;ISBN;Título;Edición;Palabras_clave;Descripción;Temas;Copias;Categoría;Ejemplares;Area;Disponibles;ID;");
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 950, 40));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("FORMATO DE ENTRADA (Para separar palabras clave y temas colocar una coma seguido de un espacio):");
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 580, 30));

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
        
 }
   private Boolean Espacio(Libros[] arreglo) {
        Boolean libre = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                libre = true;
                break;
            }
        }
        return libre;
    }
    private Libros[] dimensionarreglo(Libros[] arreglo){
        Libros[] tem = new Libros[arreglo.length + 1];
        for (int i = 0; i < arreglo.length; i++) {
            tem[i] = arreglo[i];
        }
        return tem;
      
    }
    private void txtingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtingresarMouseClicked
  try{
      int cont=0, cont1=0,fila=0;
      if(!cargatxt.getText().equals("")){
          String[] salto = cargatxt.getText().split("\\n");
           for (int i = 0; i < salto.length; i++) {
            if (salto[i] != null) {
                 System.out.println("saltos");
           System.out.println(salto[i]+" "+ i);
                    if (!Espacio(p1.getListalibros())) {
                        p1.setListalibros(dimensionarreglo(p1.getListalibros()));
                    }
                String[] atributo = salto[i].split("\\;");
                 for (int j = 0; j < atributo.length; j++) {
                    System.out.println("atributos");
                    System.out.println(atributo[j]+" "+ j);
                        for (int k = 0; k < p1.getListalibros().length; k++) {
                            if (p1.getListalibros()[k] != null) {
                                if (p1.getListalibros()[k].getID().equals(Integer.parseInt(atributo[14]))) {
                                    fila=i;
                                    cont=1;
                                }
                                if (!atributo[3].equals("")) {
                                    if(p1.getListalibros()[i].getIsbn().equals(Long.parseLong(atributo[3]))){
                                         fila=i;
                                        cont1=1;
                                    }
                                }
                            }
                        }
                      
                    }
                   if(cont==1){

                            javax.swing.JOptionPane.showMessageDialog(null,"EL ID ingresasdo en la fila "+ salto[fila] +" ya existe, porfavor revisar los datos","Cargar bibliografia",javax.swing.JOptionPane.ERROR_MESSAGE);
                        }else{
                            if(cont1==1 && atributo[0]=="0"){
                                javax.swing.JOptionPane.showMessageDialog(null,"EL ISBN ingresasdo "+salto[fila]+" ya existe, porfavor revisar los datos","Cargar bibliografia",javax.swing.JOptionPane.ERROR_MESSAGE);
                            }else{
                                for (int k = 0; k < p1.getListalibros().length; k++) {
                                    if (p1.getListalibros()[k] == null) {
                                        if(atributo[0]=="0"){
                                             p1.getListalibros()[k].setID(Integer.parseInt(atributo[14]));
                                            p1.getListalibros()[k].setTipo("Libro");p1.getListalibros()[k].setAutor(atributo[1]);p1.getListalibros()[k].setYearpublic(Integer.parseInt(atributo[2]));
                                                 p1.getListalibros()[k].setIsbn(Long.parseLong(atributo[3]));  p1.getListalibros()[k].setTitulo(atributo[4]);  p1.getListalibros()[k].setEdicion(Integer.parseInt(atributo[5]));
                                                 p1.getListalibros()[k].setPclaves(atributo[6].split("\\, "));  p1.getListalibros()[k].setDescripcion(atributo[7]);
                                                 p1.getListalibros()[k].setTema(atributo[8].split("\\, "));p1.getListalibros()[k].setCopias(Integer.parseInt(atributo[9]));p1.getListalibros()[k].setCategoria(String.valueOf(""));
                                                 p1.getListalibros()[k].setEjemplares(Integer.parseInt("0"));p1.getListalibros()[k].setArea(String.valueOf(""));p1.getListalibros()[k].setTam(Integer.parseInt("0"));p1.getListalibros()[k].setDisponible(Integer.parseInt(atributo[13]));
                                            
                                        }
                                        if(atributo[0]=="1"){

                                            p1.getListalibros()[k] = new Libros(Integer.parseInt(atributo[14]),"Revista",atributo[1],Integer.parseInt(atributo[2]),
                                                Long.parseLong("0"),atributo[4],Integer.parseInt(atributo[5]),atributo[6].split("\\, "),atributo[7],
                                               atributo[8].split("\\, "),Integer.parseInt(atributo[9]),atributo[10],Integer.parseInt(atributo[11]),String.valueOf(""),Integer.parseInt("0"),Integer.parseInt(atributo[13]));
                                            
                                        }
                                        if(atributo[0]=="2"){
                                             p1.getListalibros()[k+1] = new Libros(Integer.parseInt(atributo[14]),"Tesis",atributo[1],Integer.parseInt(atributo[2]),
                                                Long.parseLong("0"),atributo[4],Integer.parseInt(atributo[5]),atributo[6].split("\\, "),atributo[7],
                                               atributo[8].split("\\, "),Integer.parseInt(atributo[9]),String.valueOf(""),Integer.parseInt("0"),atributo[12],Integer.parseInt("0"),Integer.parseInt(atributo[13]));
                                          
                                        }
                                         System.out.println("datos de libros");
                                        System.out.println(p1.getListalibros()[k]);
                                    }

                                }
                                
                                javax.swing.JOptionPane.showMessageDialog(null,"Se ha agregado correctamente la bibliografia","Carga bibliografia",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                                this.cancelartxtMouseClicked(evt) ;

                            }
                        }
                 
               }
            }
           
           
        }
          
      
      
  } catch (Exception e) {
         
        } 
  
    }//GEN-LAST:event_txtingresarMouseClicked

    private void cancelartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelartxtMouseClicked
  
        cargatxt.setText("");
        
    }//GEN-LAST:event_cancelartxtMouseClicked

    private void regresartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresartxtMouseClicked
        Administrador obj = new Administrador();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresartxtMouseClicked

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
            java.util.logging.Logger.getLogger(Cargamasiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cargamasiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cargamasiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cargamasiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cargamasiva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Retur;
    private javax.swing.JPanel cancel1;
    private javax.swing.JLabel cancelartxt;
    private javax.swing.JTextArea cargatxt;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel ingresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelcrearb;
    private javax.swing.JLabel regresartxt;
    private javax.swing.JLabel txtingresar;
    // End of variables declaration//GEN-END:variables
}
