
import Clases.Libros;


public class Modificarbibliog extends javax.swing.JPanel {
    private int cont=-1,b=0;
    String opcion="";
   private static Cargaindividual p2 = new Cargaindividual();
    public Modificarbibliog() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pfondo = new javax.swing.JPanel();
        labelcrearusuario = new javax.swing.JLabel();
        labertitulo = new javax.swing.JLabel();
        txtdescrip = new javax.swing.JTextField();
        labeltema = new javax.swing.JLabel();
        labeledicion = new javax.swing.JLabel();
        labeltipo = new javax.swing.JLabel();
        labelyear = new javax.swing.JLabel();
        labeldescrip = new javax.swing.JLabel();
        laberpclave = new javax.swing.JLabel();
        Separator2 = new javax.swing.JSeparator();
        Separator3 = new javax.swing.JSeparator();
        Separator4 = new javax.swing.JSeparator();
        Separator5 = new javax.swing.JSeparator();
        Separator7 = new javax.swing.JSeparator();
        txtyear = new javax.swing.JTextField();
        txttema = new javax.swing.JTextField();
        cancel = new javax.swing.JPanel();
        cancelartxt = new javax.swing.JLabel();
        txttitulo = new javax.swing.JTextField();
        eliminar = new javax.swing.JPanel();
        txtmodificar = new javax.swing.JLabel();
        Separator6 = new javax.swing.JSeparator();
        txtclave = new javax.swing.JTextField();
        txtedicion = new javax.swing.JTextField();
        ID = new javax.swing.JLabel();
        labelcopia = new javax.swing.JLabel();
        labelarea = new javax.swing.JLabel();
        labelcategoria = new javax.swing.JLabel();
        labelejemplar = new javax.swing.JLabel();
        labelisbn = new javax.swing.JLabel();
        labeltam = new javax.swing.JLabel();
        txtautor = new javax.swing.JTextField();
        txtcopias = new javax.swing.JTextField();
        txtarea = new javax.swing.JTextField();
        txtcategoria = new javax.swing.JTextField();
        txtejemplar = new javax.swing.JTextField();
        txtisbn = new javax.swing.JTextField();
        txttam = new javax.swing.JTextField();
        Separator8 = new javax.swing.JSeparator();
        Separator9 = new javax.swing.JSeparator();
        Separator10 = new javax.swing.JSeparator();
        Separator11 = new javax.swing.JSeparator();
        Separator12 = new javax.swing.JSeparator();
        Separator13 = new javax.swing.JSeparator();
        Separator14 = new javax.swing.JSeparator();
        boxtipo = new javax.swing.JComboBox<>();
        labelautor1 = new javax.swing.JLabel();
        Separator15 = new javax.swing.JSeparator();
        txtID = new javax.swing.JTextField();
        busqueda = new javax.swing.JPanel();
        Buscartxt = new javax.swing.JLabel();

        Pfondo.setBackground(new java.awt.Color(255, 255, 255));
        Pfondo.setForeground(new java.awt.Color(0, 12, 23));
        Pfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelcrearusuario.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelcrearusuario.setForeground(new java.awt.Color(0, 12, 23));
        labelcrearusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelcrearusuario.setText("MODIFICAR BIBLIOGRAFIA");
        Pfondo.add(labelcrearusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 23, 930, 40));

        labertitulo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labertitulo.setForeground(new java.awt.Color(0, 12, 23));
        labertitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labertitulo.setText("TITULO:");
        Pfondo.add(labertitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 130, 30));

        txtdescrip.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtdescrip.setForeground(new java.awt.Color(0, 12, 23));
        txtdescrip.setBorder(null);
        Pfondo.add(txtdescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 270, 30));

        labeltema.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labeltema.setForeground(new java.awt.Color(0, 12, 23));
        labeltema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltema.setText("TEMAS:");
        Pfondo.add(labeltema, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 130, 30));

        labeledicion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labeledicion.setForeground(new java.awt.Color(0, 12, 23));
        labeledicion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeledicion.setText("EDICIÓN:");
        Pfondo.add(labeledicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 130, 30));

        labeltipo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labeltipo.setForeground(new java.awt.Color(0, 12, 23));
        labeltipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltipo.setText("TIPO:");
        Pfondo.add(labeltipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 130, 30));

        labelyear.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelyear.setForeground(new java.awt.Color(0, 12, 23));
        labelyear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelyear.setText("AÑO:");
        Pfondo.add(labelyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 130, 30));

        labeldescrip.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labeldescrip.setForeground(new java.awt.Color(0, 12, 23));
        labeldescrip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeldescrip.setText("DESCRIPCIÓN:");
        Pfondo.add(labeldescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 140, 30));

        laberpclave.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        laberpclave.setForeground(new java.awt.Color(0, 12, 23));
        laberpclave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laberpclave.setText(" PALABRAS CLAVES:");
        Pfondo.add(laberpclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 140, 30));

        Separator2.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 270, 20));

        Separator3.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 270, 20));

        Separator4.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 270, 20));

        Separator5.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 270, 20));

        Separator7.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 270, 10));

        txtyear.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtyear.setForeground(new java.awt.Color(0, 12, 23));
        txtyear.setBorder(null);
        Pfondo.add(txtyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 270, 30));

        txttema.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txttema.setForeground(new java.awt.Color(0, 12, 23));
        txttema.setBorder(null);
        Pfondo.add(txttema, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 270, 30));

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
            .addGroup(cancelLayout.createSequentialGroup()
                .addComponent(cancelartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cancelLayout.setVerticalGroup(
            cancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Pfondo.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 130, 40));

        txttitulo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txttitulo.setForeground(new java.awt.Color(0, 12, 23));
        txttitulo.setBorder(null);
        Pfondo.add(txttitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 270, 30));

        eliminar.setBackground(new java.awt.Color(2, 104, 111));

        txtmodificar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtmodificar.setForeground(new java.awt.Color(255, 249, 248));
        txtmodificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit1.png"))); // NOI18N
        txtmodificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtmodificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtmodificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout eliminarLayout = new javax.swing.GroupLayout(eliminar);
        eliminar.setLayout(eliminarLayout);
        eliminarLayout.setHorizontalGroup(
            eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        eliminarLayout.setVerticalGroup(
            eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Pfondo.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 130, 40));

        Separator6.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 270, 20));

        txtclave.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtclave.setForeground(new java.awt.Color(0, 12, 23));
        txtclave.setBorder(null);
        Pfondo.add(txtclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 270, 30));

        txtedicion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtedicion.setForeground(new java.awt.Color(0, 12, 23));
        txtedicion.setBorder(null);
        Pfondo.add(txtedicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 270, 30));

        ID.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        ID.setForeground(new java.awt.Color(0, 12, 23));
        ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID.setText("ID:");
        Pfondo.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 130, 30));

        labelcopia.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelcopia.setForeground(new java.awt.Color(0, 12, 23));
        labelcopia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelcopia.setText("COPIAS:");
        Pfondo.add(labelcopia, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 130, 30));

        labelarea.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelarea.setForeground(new java.awt.Color(0, 12, 23));
        labelarea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelarea.setText("AREA:");
        Pfondo.add(labelarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 130, 30));

        labelcategoria.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelcategoria.setForeground(new java.awt.Color(0, 12, 23));
        labelcategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelcategoria.setText("CATEGORIA:");
        Pfondo.add(labelcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 130, 30));

        labelejemplar.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelejemplar.setForeground(new java.awt.Color(0, 12, 23));
        labelejemplar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelejemplar.setText("EJEMPLARES:");
        Pfondo.add(labelejemplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 130, 30));

        labelisbn.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelisbn.setForeground(new java.awt.Color(0, 12, 23));
        labelisbn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelisbn.setText("ISBN:");
        Pfondo.add(labelisbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 130, 30));

        labeltam.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labeltam.setForeground(new java.awt.Color(0, 12, 23));
        labeltam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltam.setText("TAMAÑO:");
        Pfondo.add(labeltam, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 130, 30));

        txtautor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtautor.setForeground(new java.awt.Color(0, 12, 23));
        txtautor.setBorder(null);
        Pfondo.add(txtautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 270, 30));

        txtcopias.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtcopias.setForeground(new java.awt.Color(153, 153, 153));
        txtcopias.setBorder(null);
        Pfondo.add(txtcopias, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 270, 30));

        txtarea.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtarea.setForeground(new java.awt.Color(153, 153, 153));
        txtarea.setBorder(null);
        Pfondo.add(txtarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 270, 30));

        txtcategoria.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtcategoria.setForeground(new java.awt.Color(153, 153, 153));
        txtcategoria.setBorder(null);
        Pfondo.add(txtcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 270, 30));

        txtejemplar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtejemplar.setForeground(new java.awt.Color(153, 153, 153));
        txtejemplar.setBorder(null);
        Pfondo.add(txtejemplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 270, 30));

        txtisbn.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtisbn.setForeground(new java.awt.Color(0, 12, 23));
        txtisbn.setBorder(null);
        Pfondo.add(txtisbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 270, 30));

        txttam.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txttam.setForeground(new java.awt.Color(153, 153, 153));
        txttam.setBorder(null);
        Pfondo.add(txttam, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 270, 30));

        Separator8.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 270, 10));

        Separator9.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 270, 20));

        Separator10.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 270, 20));

        Separator11.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 270, 20));

        Separator12.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 270, 20));

        Separator13.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 270, 20));

        Separator14.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 270, 20));

        boxtipo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        boxtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Revista", "Tesis", "Libro digital", "Seleccione opción" }));
        boxtipo.setSelectedIndex(4);
        boxtipo.setToolTipText("");
        boxtipo.setBorder(null);
        boxtipo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        boxtipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxtipoItemStateChanged(evt);
            }
        });
        Pfondo.add(boxtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 270, 30));

        labelautor1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelautor1.setForeground(new java.awt.Color(0, 12, 23));
        labelautor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelautor1.setText("AUTOR:");
        Pfondo.add(labelautor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 130, 30));

        Separator15.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 270, 20));

        txtID.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtID.setForeground(new java.awt.Color(0, 12, 23));
        txtID.setBorder(null);
        Pfondo.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 270, 30));

        busqueda.setBackground(new java.awt.Color(2, 104, 111));

        Buscartxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Buscartxt.setForeground(new java.awt.Color(255, 249, 248));
        Buscartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Buscartxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
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

        Pfondo.add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 130, 40));

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

    private void cancelartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelartxtMouseClicked
        //vaciando parametros
        txtID.setText("");
        txtedicion.setText("");
        txtclave.setText("");
        txtautor.setText("");
        txtyear.setText("");
        txttitulo.setText("");
        txttema.setText("");
        txtdescrip.setText("");
        txtisbn.setText("");
        txtejemplar.setText("");
        txtcategoria.setText("");
        txtarea.setText("");
        txtcopias.setText("");
        txttam.setText("");
        boxtipo.setSelectedIndex(4);
        cont=-1; b=0;

    }//GEN-LAST:event_cancelartxtMouseClicked

    private void txtmodificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmodificarMouseClicked
       
            if( b==1){
                    for (int i = 0; i < p2.getListalibros().length; i++) {
                        if (p2.getListalibros()[i] != null) {
                        if (p2.getListalibros()[i].getID().equals(Integer.parseInt(txtID.getText()))) {
                            if(opcion=="Libro"){
                               p2.getListalibros()[i] = new Libros(Integer.parseInt(txtID.getText()),String.valueOf(boxtipo.getSelectedItem()),txtautor.getText(),Integer.parseInt(txtyear.getText()),
                                       Long.parseLong(txtisbn.getText()),txttitulo.getText(),Integer.parseInt(txtedicion.getText()),txtclave.getText().split("\\, "),txtdescrip.getText(),
                                       txttema.getText().split("\\, "),Integer.parseInt(txtcopias.getText()),String.valueOf(""),Integer.parseInt("0"),String.valueOf(""),Integer.parseInt("0"),Integer.parseInt(txtcopias.getText()));  
                           break; 
                            }
                            if(opcion=="Revista"){
                                    p2.getListalibros()[i] = new Libros(Integer.parseInt(txtID.getText()),String.valueOf(boxtipo.getSelectedItem()),txtautor.getText(),Integer.parseInt(txtyear.getText()),
                                       Long.parseLong("0"),txttitulo.getText(),Integer.parseInt(txtedicion.getText()),txtclave.getText().split("\\, "),txtdescrip.getText(),
                                       txttema.getText().split("\\, "), Integer.parseInt(txtcopias.getText()),txtcategoria.getText(),Integer.parseInt(txtejemplar.getText()),String.valueOf(""),Integer.parseInt("0"),Integer.parseInt(txtcopias.getText()));  
                               break; 
                            }
                                    if(opcion=="Tesis"){
                                      p2.getListalibros()[i] = new Libros(Integer.parseInt(txtID.getText()),String.valueOf(boxtipo.getSelectedItem()),txtautor.getText(),Integer.parseInt(txtyear.getText()),
                                       Long.parseLong("0"),txttitulo.getText(),Integer.parseInt(txtedicion.getText()),txtclave.getText().split("\\, "),txtdescrip.getText(),
                                       txttema.getText().split("\\, "), Integer.parseInt(txtcopias.getText()),String.valueOf(""),Integer.parseInt("0"),txtarea.getText(),Integer.parseInt("0"),Integer.parseInt(txtcopias.getText()));    
                                   break;  
                                }
                                        if(opcion=="Libro digital"){
                                          p2.getListalibros()[i]= new Libros(Integer.parseInt(txtID.getText()),String.valueOf(boxtipo.getSelectedItem()),txtautor.getText(),Integer.parseInt(txtyear.getText()),
                                           Long.parseLong("0"),txttitulo.getText(),Integer.parseInt(txtedicion.getText()),txtclave.getText().split("\\, "),txtdescrip.getText(),
                                           txttema.getText().split("\\, "), Integer.parseInt("0"),String.valueOf(""),Integer.parseInt("0"),String.valueOf(""),Integer.parseInt(txttam.getText()),Integer.parseInt(txtcopias.getText()));   
                                        break; 
                                        }     
                        }

                    }
                   }  
                    //vaciando parametros
                    javax.swing.JOptionPane.showMessageDialog(null,"Se ha modificado correctamente la bibliografia","Modificar bibliografia",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    this.cancelartxtMouseClicked(evt) ;

            }
    
                
        

    }//GEN-LAST:event_txtmodificarMouseClicked

    private void BuscartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscartxtMouseClicked
      
        if(txtisbn.getText().equals("")&&txtID.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null,"La casilla para el ID y el ISBN esta vacia, porfavor ingrese el ID o ISBN a buscar","Modificar bibliografia",javax.swing.JOptionPane.WARNING_MESSAGE);
             b=0;
        }else{
            b=1;
            if(!txtisbn.getText().equals("")&&txtID.getText().equals("")){

                for (int i = 0; i < p2.getListalibros().length; i++) {
                    if (p2.getListalibros()[i] != null) {
                         if (p2.getListalibros()[i].getIsbn().equals(Long.parseLong(txtisbn.getText()))) {
                        cont=i;
                        break;
                       }
                       break;
                      }
                }
                if(cont!=-1){
                 
                    txtID.setText(String.valueOf(p2.getListalibros()[cont].getID()));
                    txtautor.setText(p2.getListalibros()[cont].getAutor());
                    txtyear.setText(String.valueOf(p2.getListalibros()[cont].getYearpublic()));
                    txttitulo.setText(p2.getListalibros()[cont].getTitulo());
                    txtdescrip.setText(p2.getListalibros()[cont].getDescripcion());
                    txtclave.setText(String.join(",",(p2.getListalibros()[cont].getPclaves())));
                    txtedicion.setText(String.valueOf(p2.getListalibros()[cont].getEdicion()));
                    txttema.setText(String.join(",",(p2.getListalibros()[cont].getTema())));
                    txtcopias.setText(String.valueOf(p2.getListalibros()[cont].getCopias()));
                    txtcategoria.setText("");
                    txtarea.setText("");
                    txtejemplar.setText("");
                    txttam.setText("");
                    boxtipo.setSelectedItem(p2.getListalibros()[cont].getTipo());
                     b=1;
                }else{
                    javax.swing.JOptionPane.showMessageDialog(null,"EL ISBN ingresasdo no existe, porfavor revisar los datos","Modificar bibliografia",javax.swing.JOptionPane.ERROR_MESSAGE);
                    b=0;
                }
            }
            if((txtisbn.getText().equals("")&&!txtID.getText().equals(""))||(!txtisbn.getText().equals("")&&!txtID.getText().equals(""))){

                for (int i = 0; i < p2.getListalibros().length; i++) {
                    if (p2.getListalibros()[i] != null) {
                    if (p2.getListalibros()[i].getID().equals(Integer.parseInt(txtID.getText()))) {
                        cont=i;
                        break;
                    }
                }
                }
                if(cont!=-1){
                    txtautor.setText(p2.getListalibros()[cont].getAutor());
                    txtyear.setText(String.valueOf(p2.getListalibros()[cont].getYearpublic()));
                    txttitulo.setText(p2.getListalibros()[cont].getTitulo());
                    txtdescrip.setText(p2.getListalibros()[cont].getDescripcion());
                    txtclave.setText(String.join(",",(p2.getListalibros()[cont].getPclaves())));
                    txtedicion.setText(String.valueOf(p2.getListalibros()[cont].getEdicion()));
                    txttema.setText(String.join(",",(p2.getListalibros()[cont].getTema())));
                    if(!p2.getListalibros()[cont].getTipo().equals("Libro digital")){
                         txtcopias.setText(String.valueOf(p2.getListalibros()[cont].getCopias()));
                    }else{
                         txtcopias.setText("");
                    }
                     if(p2.getListalibros()[cont].getTipo().equals("Libro")){
                         txtisbn.setText(String.valueOf(p2.getListalibros()[cont].getIsbn()));
                    }else{
                         txtisbn.setText("");
                    }
                    txtcategoria.setText(p2.getListalibros()[cont].getCategoria());
                    txtarea.setText(p2.getListalibros()[cont].getArea());
                    if(p2.getListalibros()[cont].getTipo().equals("Revista")){
                        txtejemplar.setText(String.valueOf(p2.getListalibros()[cont].getEjemplares()));
                    }else{
                         txtejemplar.setText("");
                    }
                   if(p2.getListalibros()[cont].getTipo().equals("Libro digital")){
                       txttam.setText(String.valueOf(p2.getListalibros()[cont].getTam()));
                    }else{
                         txttam.setText("");
                    }
                    boxtipo.setSelectedItem(p2.getListalibros()[cont].getTipo());
                     b=1;

                }else{
                    javax.swing.JOptionPane.showMessageDialog(null,"EL ID ingresasdo no existe, porfavor revisar los datos","Modificar bibliografia",javax.swing.JOptionPane.ERROR_MESSAGE);
                       b=0;
                }
            }
        }
    }//GEN-LAST:event_BuscartxtMouseClicked

    private void boxtipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxtipoItemStateChanged
                opcion=(String) boxtipo.getSelectedItem();
    }//GEN-LAST:event_boxtipoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buscartxt;
    private javax.swing.JLabel ID;
    private javax.swing.JPanel Pfondo;
    private javax.swing.JSeparator Separator10;
    private javax.swing.JSeparator Separator11;
    private javax.swing.JSeparator Separator12;
    private javax.swing.JSeparator Separator13;
    private javax.swing.JSeparator Separator14;
    private javax.swing.JSeparator Separator15;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JSeparator Separator3;
    private javax.swing.JSeparator Separator4;
    private javax.swing.JSeparator Separator5;
    private javax.swing.JSeparator Separator6;
    private javax.swing.JSeparator Separator7;
    private javax.swing.JSeparator Separator8;
    private javax.swing.JSeparator Separator9;
    private javax.swing.JComboBox<String> boxtipo;
    private javax.swing.JPanel busqueda;
    private javax.swing.JPanel cancel;
    private javax.swing.JLabel cancelartxt;
    private javax.swing.JPanel eliminar;
    private javax.swing.JLabel labelarea;
    private javax.swing.JLabel labelautor1;
    private javax.swing.JLabel labelcategoria;
    private javax.swing.JLabel labelcopia;
    private javax.swing.JLabel labelcrearusuario;
    private javax.swing.JLabel labeldescrip;
    private javax.swing.JLabel labeledicion;
    private javax.swing.JLabel labelejemplar;
    private javax.swing.JLabel labelisbn;
    private javax.swing.JLabel labeltam;
    private javax.swing.JLabel labeltema;
    private javax.swing.JLabel labeltipo;
    private javax.swing.JLabel labelyear;
    private javax.swing.JLabel laberpclave;
    private javax.swing.JLabel labertitulo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtarea;
    private javax.swing.JTextField txtautor;
    private javax.swing.JTextField txtcategoria;
    private javax.swing.JTextField txtclave;
    private javax.swing.JTextField txtcopias;
    private javax.swing.JTextField txtdescrip;
    private javax.swing.JTextField txtedicion;
    private javax.swing.JTextField txtejemplar;
    private javax.swing.JTextField txtisbn;
    private javax.swing.JLabel txtmodificar;
    private javax.swing.JTextField txttam;
    private javax.swing.JTextField txttema;
    private javax.swing.JTextField txttitulo;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables
}
