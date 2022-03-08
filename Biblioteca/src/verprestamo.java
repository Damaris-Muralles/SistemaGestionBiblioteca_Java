
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;


public class verprestamo extends javax.swing.JPanel {
    Cargaindividual p1 = new Cargaindividual(); 
    Login   userse = new Login();
    private int codigoid;

    bibliotecavirtual p2 = new bibliotecavirtual();
     private  String[] ma = new String[p2.getListaagregados().length];
    public verprestamo() {
       
        initComponents();
        initComponents2();
       
    }
  private void initComponents2() {
        
        try { 
        int numlibro=0;
        int fila=-1;
          
        String[][] matriz = new String[p2.getListaagregados().length][4];
        
        for (int i = 0; i <p2.getListaagregados().length; i++) {
        
            if (p2.getListaagregados()[i] != null) {
                if(p2.getListaagregados()[i].getTipo()!="Libro digital" && p2.getListaagregados()[i].getID_user()== userse.getEn_sesion()[0].getID_user()){
                      numlibro=numlibro+1;
                      fila=fila+1;
                      matriz[fila][0] = String.valueOf(numlibro);
                      matriz[fila][1] = p2.getListaagregados()[i].getTitulo();
                      matriz[fila][2] = p2.getListaagregados()[i].getTipo();
                      ma[fila]=String.valueOf(p2.getListaagregados()[i].getID());
                }
            }
            
        }
        String[] encabezado = {"No.","Titulo","Tipo","Devolver"};
       
        
        tablaprestamo.setModel(new DefaultTableModel(
                matriz,
                encabezado
        ){
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false,true
            };
           
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
    });  
     } catch (Exception e) {
        }       
   }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        labelimag = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaprestamo = new javax.swing.JTable();
        encabezado = new javax.swing.JLabel();

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelimag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelimag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros.jpg"))); // NOI18N
        fondo.add(labelimag, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 270, 200));

        tablaprestamo.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        tablaprestamo.setForeground(new java.awt.Color(0, 12, 23));
        tablaprestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaprestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaprestamo.setFocusable(false);
        tablaprestamo.setGridColor(new java.awt.Color(178, 192, 203));
        tablaprestamo.setRowHeight(20);
        tablaprestamo.setSelectionBackground(new java.awt.Color(2, 104, 111));
        tablaprestamo.setShowGrid(false);
        tablaprestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaprestamoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaprestamo);

        fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 850, 220));

        encabezado.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        encabezado.setForeground(new java.awt.Color(0, 12, 23));
        encabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encabezado.setText("LISTA DE PRESTAMOS");
        fondo.add(encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 850, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tablaprestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaprestamoMouseClicked
      try { 
        int fila=tablaprestamo.rowAtPoint(evt.getPoint());
      int columna=tablaprestamo.columnAtPoint(evt.getPoint());
  
      if(columna==3){
          Boolean checked = false; 
          if(!tablaprestamo.getValueAt(fila,2).equals(null)){
          checked = Boolean.valueOf(tablaprestamo.getValueAt(fila,columna).toString());
           if(checked){
               for (int i = 0; i < p2.getListaagregados().length; i++) {
                   
                if (p2.getListaagregados()[i] != null) {
                     if(p2.getListaagregados()[i].getID_user()== userse.getEn_sesion()[0].getID_user()){
                        for (int k = 0; k < ma.length; k++) {
                            if (ma[k] != null) { 
                                if (p2.getListaagregados()[i] != null) {
                                   if (p2.getListaagregados()[i].getID().equals(Integer.parseInt(ma[k]))&&p2.getListaagregados()[i].getTitulo().equals(tablaprestamo.getValueAt(fila,1).toString())) {
                             
                                        for (int j = 0; j < p1.getListalibros().length; j++) {
                                           if (p1.getListalibros()[j] != null) {
                                               if (p2.getListaagregados()[i] != null) { 
                                                    if( p2.getListaagregados()[i].getID().equals(p1.getListalibros()[j].getID())){
                                                       p1.getListalibros()[j].setDisponible((p1.getListalibros()[j].getDisponible())+1);
                                                       p2.getListaagregados()[i] = null;
                                                       ma[k]=null;                   
                                                   }        
                                               }           
                                            }         
                                        }      
                                    }
                               }
                            }
                        }
                    }
                }
            }
         } 
           javax.swing.JOptionPane.showMessageDialog(null,"Se ha devuelto el libro","Biblioteca",javax.swing.JOptionPane.INFORMATION_MESSAGE);  
           initComponents2();
          }else{
              System.out.println("no valido");
          }
      }
      } catch (Exception e) {
          initComponents2();
        }    
    }//GEN-LAST:event_tablaprestamoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel encabezado;
    private javax.swing.JPanel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelimag;
    private javax.swing.JTable tablaprestamo;
    // End of variables declaration//GEN-END:variables
}
