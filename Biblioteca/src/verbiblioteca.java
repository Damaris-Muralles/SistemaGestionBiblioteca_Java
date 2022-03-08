


import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.netbeans.lib.awtextra.AbsoluteConstraints;


public class verbiblioteca extends javax.swing.JPanel {
     Cargaindividual p1 = new Cargaindividual(); 
    Login   userse = new Login();
    private int codigoid;
    bibliotecavirtual p2 = new bibliotecavirtual();
    private  String[] ma = new String[p2.getListaagregados().length];
    public verbiblioteca() {
         AgregadoLb = new javax.swing.JTable();
        initComponents();
      initComponents2();
       
    }
  private void initComponents2() {
        
      try {    
        int contf=-1;
        int fila=0;
          
        String[][] matriz = new String[p2.getListaagregados().length][2];
        
        for (int i = 0; i <p2.getListaagregados().length; i++) {
                
            if (p2.getListaagregados()[i] != null) {
                
                if(p2.getListaagregados()[i].getTipo()=="Libro digital" && p2.getListaagregados()[i].getID_user()== userse.getEn_sesion()[0].getID_user()){
                    
                    contf=contf+1;
                    if (contf==2){
                        fila=fila+1;
                        contf=0;
                    }
                    
                    if (matriz[fila][0]== null){
                    matriz[fila][0] = p2.getListaagregados()[i].getTitulo() + "\n " + p2.getListaagregados()[i].getAutor();
                    
                    } else{
                     matriz[fila][1] = p2.getListaagregados()[i].getTitulo() +"\n " + p2.getListaagregados()[i].getAutor();
                    }
                 
                }
            }
        }
        
        AgregadoLb.setModel(new DefaultTableModel(
                matriz,
                new String [] {
                "Title 1", "Title 2"
            }
                
        ){
           
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
          AgregadoLb.setRowHeight(50);
        AgregadoLb.setTableHeader(null);
     } catch (Exception e) {
        }     
        
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        listaatri = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        detalletxt = new javax.swing.JTextArea();
        Eliminarbt = new javax.swing.JLabel();
        listal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AgregadoLb = new javax.swing.JTable();
        labellibros = new javax.swing.JLabel();
        labelatri = new javax.swing.JLabel();
        labelimag = new javax.swing.JLabel();

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaatri.setBackground(new java.awt.Color(221, 232, 240));
        listaatri.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        detalletxt.setEditable(false);
        detalletxt.setBackground(new java.awt.Color(221, 232, 240));
        detalletxt.setColumns(20);
        detalletxt.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        detalletxt.setRows(5);
        detalletxt.setBorder(null);
        jScrollPane2.setViewportView(detalletxt);

        listaatri.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 190));

        Eliminarbt.setBackground(new java.awt.Color(0, 69, 129));
        Eliminarbt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Eliminarbt.setForeground(new java.awt.Color(255, 255, 255));
        Eliminarbt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Eliminarbt.setText("ELIMINAR");
        Eliminarbt.setOpaque(true);
        Eliminarbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarbtMouseClicked(evt);
            }
        });
        listaatri.add(Eliminarbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 160, 30));

        fondo.add(listaatri, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 580, 240));

        listal.setBackground(new java.awt.Color(221, 232, 240));
        listal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgregadoLb.setBackground(new java.awt.Color(221, 232, 240));
        AgregadoLb.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        AgregadoLb.setForeground(new java.awt.Color(0, 12, 23));
        AgregadoLb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AgregadoLb.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AgregadoLb.setGridColor(new java.awt.Color(151, 203, 220));
        AgregadoLb.setRowHeight(50);
        AgregadoLb.setShowGrid(true);
        AgregadoLb.setTableHeader(null);
        AgregadoLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregadoLbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AgregadoLb);
        if (AgregadoLb.getColumnModel().getColumnCount() > 0) {
            AgregadoLb.getColumnModel().getColumn(0).setResizable(false);
            AgregadoLb.getColumnModel().getColumn(0).setPreferredWidth(290);
            AgregadoLb.getColumnModel().getColumn(1).setResizable(false);
            AgregadoLb.getColumnModel().getColumn(1).setPreferredWidth(290);
        }

        listal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 230));

        fondo.add(listal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 580, 230));

        labellibros.setBackground(new java.awt.Color(151, 203, 220));
        labellibros.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        labellibros.setForeground(new java.awt.Color(255, 255, 255));
        labellibros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labellibros.setText("LIBROS");
        labellibros.setOpaque(true);
        fondo.add(labellibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 580, 40));

        labelatri.setBackground(new java.awt.Color(1, 138, 189));
        labelatri.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        labelatri.setForeground(new java.awt.Color(255, 255, 255));
        labelatri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelatri.setText("ATRIBUTOS");
        labelatri.setOpaque(true);
        fondo.add(labelatri, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 580, 40));

        labelimag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros5.jpg"))); // NOI18N
        fondo.add(labelimag, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 320, 560));

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

    private void AgregadoLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregadoLbMouseClicked
      detalletxt.setText("");
      try {  
      int fila=AgregadoLb.rowAtPoint(evt.getPoint());
      int columna=AgregadoLb.columnAtPoint(evt.getPoint());
       if(AgregadoLb.getValueAt(fila,columna).toString()!=null){
           
           String[] lis = (AgregadoLb.getValueAt(fila,columna).toString()).split("\\n ");
          
               for (int i = 0; i < p2.getListaagregados().length; i++) {
               
                if (p2.getListaagregados()[i] != null) {
                     if( p2.getListaagregados()[i].getID_user().equals(userse.getEn_sesion()[0].getID_user())){
                       if (p2.getListaagregados()[i].getTipo().equals("Libro digital") &&p2.getListaagregados()[i].getTitulo().equals(lis[0])&& p2.getListaagregados()[i].getAutor().equals(lis[1])) {
                         
                                 for (int j = 0; j < p1.getListalibros().length; j++) {
                                       if (p1.getListalibros()[j] != null) {
                                           if( p2.getListaagregados()[i].getID().equals(p1.getListalibros()[j].getID())){
                                                codigoid = p2.getListaagregados()[i].getID();
                                                String mensaje="                  "+ p1.getListalibros()[j].getTitulo()+"\n";
                                                mensaje+="                  Autor: "+p1.getListalibros()[j].getAutor()+"\n\n";
                                                mensaje+="                  Año de publicación: "+p1.getListalibros()[j].getYearpublic()+"\n";
                                                mensaje+="                  Edición: "+p1.getListalibros()[j].getEdicion()+"\n";
                                                mensaje+="                  Descripción: "+p1.getListalibros()[j].getDescripcion()+"\n";
                                                mensaje+="                  Temas: "+String.join(", ",(p1.getListalibros()[j].getTema()))+"\n";
                                                mensaje+="                  Palabras clave : "+String.join(", ",(p1.getListalibros()[j].getPclaves()))+"\n\n";
                                                mensaje+="                  ID: "+p1.getListalibros()[j].getID()+"\n";
                                                mensaje+="                  Tipo: "+p1.getListalibros()[j].getTipo()+"\n";
                                                mensaje+="                  Tamaño: "+p1.getListalibros()[j].getTam()+"\n";
                                               detalletxt.setText(mensaje);
                                           }    
                                     }
                              }
                        }
                    }
                }
            }
          
         } else{
           System.out.println("invalido");
       }
       
       } catch (Exception e) {
        }  
    
    }//GEN-LAST:event_AgregadoLbMouseClicked

    private void EliminarbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarbtMouseClicked
         if(!detalletxt.getText().equals("")){
              for (int i = 0; i < p2.getListaagregados().length; i++) {
                    if (p2.getListaagregados()[i] != null) {
                    if (p2.getListaagregados()[i].getID().equals(codigoid)) {
                        p2.getListaagregados()[i] = null;
                        break;
                    }
                }
                 }  
                javax.swing.JOptionPane.showMessageDialog(null,"Se ha eliminado correctamente el libro","Biblioteca virtual",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                detalletxt.setText("");
                initComponents2();
               
         }
    }//GEN-LAST:event_EliminarbtMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AgregadoLb;
    private javax.swing.JLabel Eliminarbt;
    private javax.swing.JTextArea detalletxt;
    private javax.swing.JPanel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelatri;
    private javax.swing.JLabel labelimag;
    private javax.swing.JLabel labellibros;
    private javax.swing.JPanel listaatri;
    private javax.swing.JPanel listal;
    // End of variables declaration//GEN-END:variables
}
