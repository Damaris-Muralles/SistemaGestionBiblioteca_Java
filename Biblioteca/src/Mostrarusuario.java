
import javax.swing.table.DefaultTableModel;




public class Mostrarusuario extends javax.swing.JPanel {

    
    public Mostrarusuario() {
        initComponents();
        initComponents2();
    }
    private void initComponents2() {
        int numusuarios=0;
        int fila=-1;
         Crearusuario p2 = new Crearusuario();
          
        String[][] matriz = new String[p2.getListausuario().length][7];
        
        for (int i = 0; i <p2.getListausuario().length; i++) {
            
            if (p2.getListausuario()[i] != null) {
                numusuarios=numusuarios+1;
                fila=fila+1;
                matriz[fila][0] = String.valueOf(numusuarios);
                matriz[fila][1] = String.valueOf(p2.getListausuario()[i].getID());
                matriz[fila][2] = p2.getListausuario()[i].getNombre();
                matriz[fila][3] = p2.getListausuario()[i].getApellido();
                matriz[fila][4] = p2.getListausuario()[i].getUser();
                matriz[fila][5] = p2.getListausuario()[i].getRol();
                matriz[fila][6] = p2.getListausuario()[i].getPassword();
            }
            
        }

        String[] encabezado = {"No.", "ID", "Nombre","Apellido","User","Rol","Password"};
        Tablausuario.setModel(new DefaultTableModel(
                matriz,
                encabezado
        ));
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pfondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablausuario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        pfondo.setBackground(new java.awt.Color(255, 255, 255));
        pfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tablausuario.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        Tablausuario.setForeground(new java.awt.Color(0, 12, 23));
        Tablausuario.setModel(new javax.swing.table.DefaultTableModel(
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
        Tablausuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tablausuario.setFocusable(false);
        Tablausuario.setGridColor(new java.awt.Color(178, 192, 203));
        Tablausuario.setRowHeight(20);
        Tablausuario.setSelectionBackground(new java.awt.Color(2, 104, 111));
        Tablausuario.setShowGrid(false);
        jScrollPane1.setViewportView(Tablausuario);

        pfondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 840, 240));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 12, 23));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTA DE USUARIOS REGISTRADOS");
        pfondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 930, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/groupicono1.png"))); // NOI18N
        pfondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 930, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pfondo, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablausuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pfondo;
    // End of variables declaration//GEN-END:variables

    
}
