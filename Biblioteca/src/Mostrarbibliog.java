
import javax.swing.table.DefaultTableModel;


public class Mostrarbibliog extends javax.swing.JPanel {

    
    public Mostrarbibliog() {
        initComponents();
        initComponents2();
    }
    private void initComponents2() {
        
         Cargaindividual p2 = new Cargaindividual();
          
        String[][] matriz = new String[p2.getListalibros().length][15];
        int fila=-1;
        for (int i = 0; i <p2.getListalibros().length; i++) {
               
            if (p2.getListalibros()[i] != null) {
                
                fila=fila+1;
                matriz[fila][0] = String.valueOf(p2.getListalibros()[i].getID());
                matriz[fila][1] = p2.getListalibros()[i].getTipo();
                matriz[fila][2] = p2.getListalibros()[i].getAutor();
                matriz[fila][3] = String.valueOf(p2.getListalibros()[i].getYearpublic());
                if(p2.getListalibros()[i].getTipo().equals("Libro")){
                          matriz[fila][4] = String.valueOf(p2.getListalibros()[i].getIsbn());
                    }else{
                          matriz[fila][4] = " ";
                    }
                matriz[fila][5] = p2.getListalibros()[i].getTitulo();
                matriz[fila][6] = String.valueOf(p2.getListalibros()[i].getEdicion());
                matriz[fila][7] = String.join(", ",(p2.getListalibros()[i].getPclaves()));
                matriz[fila][8] = String.valueOf(p2.getListalibros()[i].getDescripcion());
                matriz[fila][9] = String.join(", ",(p2.getListalibros()[i].getTema()));
                 if(!p2.getListalibros()[i].getTipo().equals("Libro digital")){
                       matriz[fila][10] = String.valueOf(p2.getListalibros()[i].getCopias());
                    }else{
                        matriz[fila][10] = " ";
                    }
                matriz[fila][11] = p2.getListalibros()[i].getCategoria();
                if(p2.getListalibros()[i].getTipo().equals("Revista")){
                        matriz[fila][12] = String.valueOf(p2.getListalibros()[i].getEjemplares());
                    }else{
                          matriz[fila][12] =" ";
                    }
               
                matriz[fila][13] = p2.getListalibros()[i].getArea();
                if(p2.getListalibros()[i].getTipo().equals("Libro digital")){
                        matriz[fila][14] =String.valueOf( p2.getListalibros()[i].getTam());
                    }else{
                           matriz[fila][14] =" ";
                    }
              
               
            }
        }

        String[] encabezado = {"ID", "Tipo", "Autor","Año","ISBN","Titulo","Edición","Palabras clave","Descripción","Temas","Copias",
            "Categoria","Ejemplares", "Area","Tamaño"};
        Tablalibros.setModel(new DefaultTableModel(
                matriz,
                encabezado
        ));
    }
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pfondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablalibros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        pfondo.setBackground(new java.awt.Color(255, 255, 255));
        pfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tablalibros.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        Tablalibros.setForeground(new java.awt.Color(0, 12, 23));
        Tablalibros.setModel(new javax.swing.table.DefaultTableModel(
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
        Tablalibros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tablalibros.setFocusable(false);
        Tablalibros.setGridColor(new java.awt.Color(178, 192, 203));
        Tablalibros.setRowHeight(20);
        Tablalibros.setSelectionBackground(new java.awt.Color(2, 104, 111));
        Tablalibros.setShowGrid(false);
        jScrollPane1.setViewportView(Tablalibros);

        pfondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 840, 220));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 12, 23));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTA DE LIBROS REGISTRADOS");
        pfondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 830, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros.jpg"))); // NOI18N
        pfondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pfondo, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablalibros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pfondo;
    // End of variables declaration//GEN-END:variables
}
