
import Clases.Replibros;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.table.DefaultTableModel;


public class prestamo extends javax.swing.JPanel {
    int tipo;
    int atributo;
    private static Login users = new Login();
    private static Cargaindividual p2 = new Cargaindividual();
    private static bibliotecavirtual p1 = new bibliotecavirtual();
    public prestamo() {
        initComponents();
        initComponents2();
    }
   private void initComponents2() {
        int numlibros=0;
        int fila=-1;
          
        String[][] matriz = new String[p2.getListalibros().length][16];
        
        for (int i = 0; i <p2.getListalibros().length; i++) {
                
            if (p2.getListalibros()[i] != null) {
                
                if(p2.getListalibros()[i].getTipo()=="Libro"|| p2.getListalibros()[i].getTipo()=="Revista"||p2.getListalibros()[i].getTipo()=="Tesis"){
                    numlibros=numlibros+1;
                    fila=fila+1;
                    llenartabla(matriz, numlibros, fila, i);
                }
            }
        }

        String[] encabezado = {"No.","Tipo", "Autor","Año","Titulo","Edición","Descripción","Temas","Palabras clave","ISBN","Categoria","Ejemplares","Area","ID","Disponible","Agregar"};
        Tablalibros.setModel(new DefaultTableModel(
                matriz,
                encabezado
        ){ Class[] types = new Class [] {
                            java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, 
                              java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,java.lang.Object.class, 
                              java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,java.lang.Boolean.class
                        };
                        boolean[] canEdit = new boolean [] {
                            false, false, false, false, false, false, false, false,false, false,false,false,false,false, false, true
                        };

                        public Class getColumnClass(int columnIndex) {
                            return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return canEdit [columnIndex];
                        }
                    } );
    }
   
   
    private Boolean Espacio(Replibros[] arreglo) {
        Boolean libre = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                libre = true;
                break;
            }
        }
        return libre;
    }
    private Replibros[] dimensionarreglo(Replibros[] arreglo){
        Replibros[] tem = new Replibros[arreglo.length + 1];
        for (int i = 0; i < arreglo.length; i++) {
            tem[i] = arreglo[i];
        }
        return tem;
      
    }
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablalibros = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        reportxt = new javax.swing.JLabel();
        busqueda = new javax.swing.JPanel();
        filtrar = new javax.swing.JLabel();
        boxtipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        boxatributo = new javax.swing.JComboBox<>();
        busqueda2 = new javax.swing.JPanel();
        Buscartxt = new javax.swing.JLabel();
        atri = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prestamo.jpg"))); // NOI18N
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 280, 290));

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
        Tablalibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablalibrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tablalibros);

        fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 850, 220));

        jPanel1.setBackground(new java.awt.Color(0, 69, 129));

        reportxt.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        reportxt.setForeground(new java.awt.Color(255, 249, 248));
        reportxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportxt.setText("REPORTE DE EXISTENCIAS");
        reportxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(reportxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(reportxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 270, 40));

        busqueda.setBackground(new java.awt.Color(0, 69, 129));

        filtrar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        filtrar.setForeground(new java.awt.Color(255, 249, 248));
        filtrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filtrar.setText("FILTRAR");
        filtrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filtrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filtrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout busquedaLayout = new javax.swing.GroupLayout(busqueda);
        busqueda.setLayout(busquedaLayout);
        busquedaLayout.setHorizontalGroup(
            busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, busquedaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        busquedaLayout.setVerticalGroup(
            busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, busquedaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondo.add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 130, 40));

        boxtipo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        boxtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Tipo-", "Libros", "Revistas", "Tesis", "Todos" }));
        boxtipo.setBorder(null);
        boxtipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxtipoItemStateChanged(evt);
            }
        });
        fondo.add(boxtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 270, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 12, 23));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PRESTAMOS");
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 610, 50));

        boxatributo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        boxatributo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Atributo-", "Autor", "Año publicación", "Titulo", "Edición", "Palabra clave", "Descripción", "Temas", "Categoria", "Ejemplares", "Area", "Todos" }));
        boxatributo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxatributoItemStateChanged(evt);
            }
        });
        fondo.add(boxatributo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 270, 30));

        busqueda2.setBackground(new java.awt.Color(0, 69, 129));

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

        javax.swing.GroupLayout busqueda2Layout = new javax.swing.GroupLayout(busqueda2);
        busqueda2.setLayout(busqueda2Layout);
        busqueda2Layout.setHorizontalGroup(
            busqueda2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, busqueda2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Buscartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        busqueda2Layout.setVerticalGroup(
            busqueda2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, busqueda2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Buscartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondo.add(busqueda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 130, 40));

        atri.setBackground(new java.awt.Color(240, 240, 240));
        atri.setBorder(null);
        fondo.add(atri, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 270, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Filtrar por:");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 270, 30));

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

    private void BuscartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscartxtMouseClicked
 String[][] matriz = new String[p2.getListalibros().length][16];
        int numlibros=0;
        int cont=0;
        int fila=-1;
        if(atributo==0){

            javax.swing.JOptionPane.showMessageDialog(null,"Por favor seleccionar el atributo por el que desea buscar","Biblioteca",javax.swing.JOptionPane.WARNING_MESSAGE);
            
        }else{
            if(atri.getText().equals("")&& atributo!=11 ){
                javax.swing.JOptionPane.showMessageDialog(null,"Por favor escribir el parametro por el que desea buscar","Biblioteca",javax.swing.JOptionPane.WARNING_MESSAGE);
            }else{
                if(atributo==1){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {

                        if (p2.getListalibros()[i] != null) {
                            
                                    
                            if(p2.getListalibros()[i].getTipo()!="Libro digital" ){
                                if (p2.getListalibros()[i].getAutor().equals(atri.getText())) {
                                    numlibros=numlibros+1;
                                    fila=fila+1;
                                    cont=cont+1;
                                    llenartabla(matriz, numlibros, fila, i);

                                }
                            }
                        }
                    }
                }
                if(atributo==2){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {

                        if (p2.getListalibros()[i] != null) {
                            if(p2.getListalibros()[i].getTipo()!="Libro digital" ){
                                if (p2.getListalibros()[i].getYearpublic().equals(Integer.parseInt(atri.getText()))) {
                                    numlibros=numlibros+1;
                                    fila=fila+1;
                                    cont=cont+1;
                                    llenartabla(matriz, numlibros, fila, i);
                                }

                            }

                        }
                    }
                }
                if(atributo==3){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {

                        if (p2.getListalibros()[i] != null) {
                            if(p2.getListalibros()[i].getTipo()!="Libro digital" ){
                                if (p2.getListalibros()[i].getTitulo().equals(atri.getText())) {
                                    numlibros=numlibros+1;
                                    fila=fila+1;
                                    cont=cont+1;
                                    llenartabla(matriz, numlibros, fila, i);   
                                }

                            }

                        }
                    }
                }
                if(atributo==4){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {
                        if (p2.getListalibros()[i] != null) {
                            if(p2.getListalibros()[i].getTipo()!="Libro digital" ){
                                if (p2.getListalibros()[i].getEdicion().equals(Integer.parseInt(atri.getText()))) {
                                    numlibros=numlibros+1;
                                    fila=fila+1;
                                    cont=cont+1;
                                    llenartabla(matriz, numlibros, fila, i);
                                }

                            }

                        }
                    }
                }
                if(atributo==5){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {

                        if (p2.getListalibros()[i] != null) {
                            if(p2.getListalibros()[i].getTipo()!="Libro digital" ){
                                for (int j = 0; j < p2.getListalibros()[i].getPclaves().length; j++) {
                                      if (p2.getListalibros()[i].getPclaves()[j].equals(atri.getText())) {
                                    numlibros=numlibros+1;
                                    fila=fila+1;
                                    cont=cont+1;
                                    llenartabla(matriz, numlibros, fila, i);
                                }
                              }

                            }

                        }
                    }
                }
                if(atributo==6){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {

                        if (p2.getListalibros()[i] != null) {
                            if(p2.getListalibros()[i].getTipo()!="Libro digital" ){
                                if (p2.getListalibros()[i].getDescripcion().equals(atri.getText())) {
                                    numlibros=numlibros+1;
                                    fila=fila+1;
                                    cont=cont+1;
                                    llenartabla(matriz, numlibros, fila, i);
                                }

                            }

                        }
                    }
                }
                if(atributo==7){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {
                        if (p2.getListalibros()[i] != null) {
                            if(p2.getListalibros()[i].getTipo()!="Libro digital" ){
                                 for (int j = 0; j < p2.getListalibros()[i].getTema().length; j++) {
                                      if (p2.getListalibros()[i].getTema()[j].equals(atri.getText())) {
                                        numlibros=numlibros+1;
                                        fila=fila+1;
                                        cont=cont+1;
                                        llenartabla(matriz, numlibros, fila, i);
                                    }

                                 }
                               
                            }

                        }
                    }
                }
                  if(atributo==8){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {
                        if (p2.getListalibros()[i] != null) {
                            if(p2.getListalibros()[i].getTipo()!="Libro digital" ){
                                if (p2.getListalibros()[i].getCategoria().equals(atri.getText())) {
                                    numlibros=numlibros+1;
                                    fila=fila+1;
                                    cont=cont+1;
                                    llenartabla(matriz, numlibros, fila, i);
                                }

                            }
                        }
                    }
                }
                 if(atributo==9){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {
                        if (p2.getListalibros()[i] != null) {
                            if(p2.getListalibros()[i].getTipo()!="Libro digital" ){
                                if (p2.getListalibros()[i].getEjemplares().equals(Integer.parseInt(atri.getText()))) {
                                    numlibros=numlibros+1;
                                    fila=fila+1;
                                    cont=cont+1;
                                    llenartabla(matriz, numlibros, fila, i);
                                }

                            }
                        }
                    }
                }

                if(atributo==10){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {
                        if (p2.getListalibros()[i] != null) {
                            if(p2.getListalibros()[i].getTipo()!="Libro digital" ){
                                if (p2.getListalibros()[i].getArea().equals(atri.getText())) {
                                    numlibros=numlibros+1;
                                    fila=fila+1;
                                    cont=cont+1;
                                    llenartabla(matriz, numlibros, fila, i);
                                }

                            }
                        }
                    }
                }
               
            }
             if(atributo==11){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {
                        if (p2.getListalibros()[i] != null) {
                            if(p2.getListalibros()[i].getTipo()!="Libro digital" ){
                                numlibros=numlibros+1;
                                fila=fila+1;
                                cont=cont+1;
                                llenartabla(matriz, numlibros, fila, i);
                                
                            }
                        }
                    }
                } 
           if(cont!=0){
                    String[] encabezado = {"No.","Tipo", "Autor","Año","Titulo","Edición","Descripción","Temas","Palabras clave","ISBN","Categoria","Ejemplares","Area","ID","Disponible","Agregar"};
                    Tablalibros.setModel(new DefaultTableModel(
                        matriz,
                        encabezado
                    ) { Class[] types = new Class [] {
                            java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, 
                              java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,java.lang.Object.class, 
                              java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,java.lang.Object.class,java.lang.Boolean.class
                        };
                        boolean[] canEdit = new boolean [] {
                            false, false, false, false, false, false, false, false,false, false,false,false,false,false,false, true
                        };

                        public Class getColumnClass(int columnIndex) {
                            return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return canEdit [columnIndex];
                        }
                    } );
                    boxatributo.setSelectedIndex(0);
                    atributo=0;
                }else{
                    javax.swing.JOptionPane.showMessageDialog(null,"No se encontraron coincidencias, por favor buscar por otro parametro","Biblioteca",javax.swing.JOptionPane.ERROR_MESSAGE);
                    boxatributo.setSelectedIndex(0);
                    atributo=0;
                }
        }
    }//GEN-LAST:event_BuscartxtMouseClicked

    private void boxatributoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxatributoItemStateChanged
        atributo= boxatributo.getSelectedIndex();
    }//GEN-LAST:event_boxatributoItemStateChanged

    private void reportxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportxtMouseClicked
    String codigoHTML ="<!doctype html>\n" +
        "<html lang=\"es\">\n" +
        "\n" +
        "<head>\n" +
        "\n" +
        "  <meta charset=\"UTF-8\">\n" +
        "  <title> Reporte de Existencias </title>\n" +
        "  <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"src/imagen/icono1.jpg\" >\n" +
        "  <style>\n" +
        "    * {\n" +
        "      margin: 0;\n" +
        "      padding: 0;\n" +
        "      box-sizing: border-box;\n" +
        "      }\n" +
        "\n" +
        "      body{\n" +
        "      font-family: Arial;\n" +
        "      background: #f2f2f2;\n" +
        "      }\n" +
        "\n" +
        "      .contenedor{\n" +
        "      padding: 60px 0;\n" +
        "      width: 95%\n" +
        "      max-width: 1000px\n" +
        "      margin: auto;\n" +
        "      overflow: hidden;\n" +
        "      }    \n" +
        "\n" +
        "      .titulo{\n" +
        "      color: #001b48;\n" +
        "      font-size: 35px;\n" +
        "      text-align: center;\n" +
        "      margin-bottom: 50px;\n" +
        "      } \n" +
        "  \n" +
        "      header{\n" +
        "      width:100%;\n" +
        "      height: 250px;\n" +
        "      background: hsla(168,53%,51%,0.45);  /* fallback for old browsers */\n" +
        "      background: -webkit-linear-gradient(to right, hsla(242,58%,20%,0.45), hsla(168,53%,51%,0.45));  /* Chrome 10      -25, Safari 5.1-6 */\n" +
        "      background: linear-gradient(to right, hsla(242,58%,20%,0.45),hsla(168,53%,51%,0.45)), url(src/imagen/1694.jpg); /* W3C, IE 10+/ Edge,Firefox 16+, Chrome 26+,            Opera 12+, Safari 7+ */\n" +
        "      background-size: cover;\n" +
        "      background-attachment: fixed;\n" +
        "      position: relative;\n" +
        "      }  \n" +
        "     \n" +
        "      header .textos-header{\n" +
        "      display: flex;\n" +
        "      height: 430px;\n" +
        "      width: 100%;\n" +
        "      align-items: center;\n" +
        "      flex-direction: column;\n" +
        "      text-align: center;\n" +
        "      }\n" +
        "      \n" +
        "      .textos-header h1 {\n" +
        "         font-size: 50px;\n" +
        "         color: white;\n" +
        "      }\n" +
        "\n" +
        "      .textos-header h2 {\n" +
        "         font-size: 30px;\n" +
        "         font-weight:300;\n" +
        "         color: white;\n" +
        "      }\n" +
        "\n" +
        "      .wave{\n" +
        "      position: absolute;\n" +
        "      bottom: 0;\n" +
        "      width: 100%;\n" +
        "      }\n" +
        "\n" +
        "      #main-container{\n" +
        "      margin:60px auto;\n" +
        "      width:900px;\n" +
        "      } \n" +
        "  \n" +
        "      table{\n" +
        "      background-color: white;\n" +
        "      border-collapse: collapse;\n" +
        "      width: 100%;\n" +
        "      }\n" +
        "      \n" +
        "      th, td{\n" +
        "      padding: 15px;\n" +
        "      }\n" +
        "\n" +
        "      thead{\n" +
        "      background-color: #001b48;\n" +
        "      border-bottom: solid 5px #f2f2f2;\n" +
        "      color: white;\n" +
        "      }\n" +
        "     \n" +
        "     tr:nth-child(even){\n" +
        "     background-color: #dde8f0;\n" +
        "     }\n" +
        " \n" +
        "     tr:hover td{\n" +
        "     background-color: #004581;\n" +
        "     color: white;\n" +
        "     }  \n" +
        "\n" +
        "      footer{\n" +
        "      background: hsla(168,53%,51%); \n" +
        "      background: -webkit-linear-gradient(to right, hsla(242,58%,20%), hsla(168,53%,51%));  /* Chrome 10      -25, Safari 5.1-6 */\n" +
        "      background: linear-gradient(to right, hsla(242,58%,20%),hsla(168,53%,51%)), url(src/imagen/1694.jpg); /* W3C, IE 10+/ Edge,Firefox 16+, Chrome 26+,                  Opera 12+, Safari 7+ */\n" +
        "      margin: auto;\n" +
        "      overflow: hidden;\n" +
        "      }\n" +
        "  </style>\n" +
        "\n" +
        "</head>\n" +
        "\n" +
        "<body> \n" +
        "\n" +
        " <header>\n" +
        "    <section class=\"textos-header\">\n" +
        "       <br>\n" +
        "       <br>\n" +
        "       <h1> REPORTE DE LIBROS DISPONIBLES</h1>\n" +
        "       <h2> Biblioteca </h2>\n" +
        "       <div class=\"wave\" style=\"height: 150px; overflow: hidden;\" ><svg viewBox=\"0 0 500 150\" preserveAspectRatio=\"none\" style=\"height: 100%; width: 100%;\"><path            d=\"M-11.00,130.77 C207.38,132.73 264.95,80.44 499.15,126.81 L500.00,150.00 L0.00,150.00 Z\" style=\"stroke: none; fill: #f2f2f2;\"></path></svg></div>\n" +
        "    </section>\n" +
        "  </header>\n" +
        "<br>\n" +
        "  <main>\n" +
        "    <section>\n" +
        "      <div class=\"contenedor tipos\">" +
        "\n"+
        "        <div class=\"libro\" id=\"main-container\">\n" +
        "          <table>\n" +
        "            <thead>\n" +
        "               <tr>\n" +
        "                  <th>ID libro en biblioteca</th><th>Titulo</th><th>Autor</th><th>Edicion</th><th>Disponibles</th>\n" +
        "               </tr>\n" +
        "            </thead>\n" +
        "\n" ;
    
    int cont=0;
         for (int i = 0; i < p2.getListalibros().length; i++) {
            if (p2.getListalibros()[i] != null) {
                if (!p2.getListalibros()[i].getTipo().equals("Libro digital")){
                        if( !p2.getListalibros()[i].getDisponible().equals(0)){
                               cont=1;
                       }           
                if(cont==1){       
                codigoHTML += "<tr>";
                codigoHTML += "  <td>" + p2.getListalibros()[i].getID() + "</td>";
                codigoHTML += "  <td>" + p2.getListalibros()[i].getTitulo()+ "</td>";
                codigoHTML += "  <td>" + p2.getListalibros()[i].getAutor()+ "</td>";
                codigoHTML += "  <td>" + p2.getListalibros()[i].getEdicion()+ "</td>";
                codigoHTML += "  <td>" +p2.getListalibros()[i].getDisponible() + "</td>";  
                codigoHTML += "</tr>";
                }
                }
            }
            cont=0;
        }
        codigoHTML += "  </table>\n" +
        "        </div>\n" +
        "      </div>\n" +
        "    </section>\n" +
        "  </main>\n" +
        "\n" +
        "  <footer>\n" +
        "    <div style=\"height: 150px; overflow: hidden;\" ><svg viewBox=\"0 0 500 150\" preserveAspectRatio=\"none\" style=\"height: 100%; width: 100%;\"><path d=\"M0.28,47.88     C263.82,3.48 270.03,81.42 500.00,49.98 L499.72,-0.47 L-1.41,-3.44 Z\" style=\"stroke: none; fill: #f2f2f2;\"></path></svg></div>\n" +
        "  </footer>  \n" +
        "\n" +
        "</body>\n" +
        "\n" +
        "</html>";
        File archivo = new File("Reporte_libros_disponibles.html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(codigoHTML);
            bw.close();
             javax.swing.JOptionPane.showMessageDialog(null,"Se  ha realizado el reporte","Biblioteca",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
        }    
    }//GEN-LAST:event_reportxtMouseClicked

    private void boxtipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxtipoItemStateChanged
         tipo= boxtipo.getSelectedIndex();
    }//GEN-LAST:event_boxtipoItemStateChanged

    private void filtrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtrarMouseClicked

        String[][] matriz = new String[p2.getListalibros().length][16];
        int numlibros=0;
        int cont=0;
        int fila=-1;
        if(tipo==0){

            javax.swing.JOptionPane.showMessageDialog(null,"Por favor seleccionar el tipo por el que se desea filtrar","Biblioteca ",javax.swing.JOptionPane.WARNING_MESSAGE);
            cont=2;
        }else{
            
                if(tipo==1){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {

                        if (p2.getListalibros()[i] != null) {
                            if(p2.getListalibros()[i].getTipo()=="Libro" ){
                                    numlibros=numlibros+1;
                                    fila=fila+1;
                                    cont=cont+1;
                                    llenartabla(matriz, numlibros, fila, i);
                            }
                        }
                    }
                }
                if(tipo==2){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {

                        if (p2.getListalibros()[i] != null) {
                            if(p2.getListalibros()[i].getTipo()=="Revista" ){
                                    numlibros=numlibros+1;
                                    fila=fila+1;
                                    cont=cont+1;
                                   llenartabla(matriz, numlibros, fila, i);
                            }

                        }
                    }
                }
                if(tipo==3){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {

                        if (p2.getListalibros()[i] != null) {
                            if(p2.getListalibros()[i].getTipo()=="Tesis" ){
                               
                                    numlibros=numlibros+1;
                                    fila=fila+1;
                                    cont=cont+1;
                                   llenartabla(matriz, numlibros, fila, i);
                            }

                        }
                    }
                }
                if(tipo==4){
                    fila=-1;
                    for (int i = 0; i <p2.getListalibros().length; i++) {
                            if (p2.getListalibros()[i] != null) {
                                if(p2.getListalibros()[i].getTipo()!="Libro digital"){
                                    numlibros=numlibros+1;
                                    fila=fila+1;
                                    cont=cont+1;
                                    llenartabla(matriz, numlibros, fila, i);
                                }
                            }
                        }
                    }
                }
                

                if(cont!=0){
                    String[] encabezado = {"No.","Tipo", "Autor","Año","Titulo","Edición","Descripción","Temas","Palabras clave","ISBN","Categoria","Ejemplares","Area","ID","Disponible","Agregar"};
                    Tablalibros.setModel(new DefaultTableModel(
                        matriz,
                        encabezado
                    ){ Class[] types = new Class [] {
                            java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, 
                              java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,java.lang.Object.class, 
                              java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,java.lang.Boolean.class
                        };
                        boolean[] canEdit = new boolean [] {
                            false, false, false, false, false, false, false, false,false, false,false,false,false,false,false, true
                        };

                        public Class getColumnClass(int columnIndex) {
                            return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return canEdit [columnIndex];
                        }
                    });
                    boxtipo.setSelectedIndex(0);
                    tipo=0;
                }else{
                    javax.swing.JOptionPane.showMessageDialog(null,"No se encontraron coincidencias"+"\n "+"por favor buscar por otro parametro","Biblioteca",javax.swing.JOptionPane.ERROR_MESSAGE);
                    boxtipo.setSelectedIndex(0);
                    cont=0;
                    tipo=0;
         
        }
    }//GEN-LAST:event_filtrarMouseClicked

    private void TablalibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablalibrosMouseClicked
    try{  
      int fila=Tablalibros.rowAtPoint(evt.getPoint());
      int columna=Tablalibros.columnAtPoint(evt.getPoint());
      int cont=0;
      if(columna==15){
          
          Boolean checked = false; 
          checked = Boolean.valueOf(Tablalibros.getValueAt(fila,columna).toString());
           if(checked){
               if(!Tablalibros.getValueAt(fila,14).toString().equals("0")){ 
              
               for (int i = 0; i < p1.getListaagregados().length; i++) {
                if (p1.getListaagregados()[i] != null) {
                     if(p1.getListaagregados()[i].getID_user()== users.getEn_sesion()[0].getID_user()){
                        if (p1.getListaagregados()[i].getID().equals(Integer.parseInt(Tablalibros.getValueAt(fila,13).toString()))) {
                              cont=1;
                        }
                    }
                }
            }
            if(cont==1){
                javax.swing.JOptionPane.showMessageDialog(null,"El libro ya se encuentra agregado a su usuario, porfavor revisar los datos","Prestamo de libros",javax.swing.JOptionPane.ERROR_MESSAGE);
                 initComponents2();
            }else{
                 if(cont==0){
                      if (!Espacio(p1.getListaagregados())) {
                         p1.setListaagregados( dimensionarreglo(p1.getListaagregados())); 
                      }
                    //asignacion de valores
                    for (int i = 0; i < p1.getListaagregados().length; i++) {
                        if (p1.getListaagregados()[i] == null) {
                            for (int j = 0; j < p2.getListalibros().length; j++) {
                                       if (p2.getListalibros()[j] != null) {
                                           System.out.println(Integer.parseInt(Tablalibros.getValueAt(fila,13).toString()));
                                           if( Integer.parseInt(Tablalibros.getValueAt(fila,13).toString())==p2.getListalibros()[j].getID()){
                                                p2.getListalibros()[j].setDisponible((p2.getListalibros()[j].getDisponible())-1);
                                                p1.getListaagregados()[i] = new Replibros(Tablalibros.getValueAt(fila,1).toString(),Integer.parseInt(Tablalibros.getValueAt(fila,13).toString()),Tablalibros.getValueAt(fila,2).toString(),p2.getListalibros()[j].getIsbn(),Tablalibros.getValueAt(fila,4).toString(),
                                                        Integer.parseInt(Tablalibros.getValueAt(fila,5).toString()),Tablalibros.getValueAt(fila,10).toString(),Tablalibros.getValueAt(fila,12).toString(),p2.getListalibros()[j].getDisponible(),users.getEn_sesion()[0].getUser_sesion(),users.getEn_sesion()[0].getNombre_user(),
                                                        users.getEn_sesion()[0].getID_user(),users.getEn_sesion()[0].getRol_user());  
                                           }
                                       }
                                  }
                               break; 
                          //String Titulo,Integer Edicion,String Categoria,String Area, Integer Disponible,String user_sesion,String nombre_user,Long ID_user, String rol_user
                      //"No.","Tipo1", "Autor2","Año3","Titulo4","Edición5","Descripción6","Temas7","Palabras clave8","ISBN9","Categoria10","Ejemplares11","Area12","ID13","Disponible14""Agregar15"
                        }

                    }
                    javax.swing.JOptionPane.showMessageDialog(null,"Se ha realizado el prestamo correctamente","Prestamo de libros",javax.swing.JOptionPane.INFORMATION_MESSAGE);  
                    initComponents2();
            }
               
           }
           }else{
                 javax.swing.JOptionPane.showMessageDialog(null,"No hay exixtencias de este texto","Prestamo de libros",javax.swing.JOptionPane.ERROR_MESSAGE);  
                 initComponents2();
               }
          
         } 
         cont=0;
      }
     
    } catch (Exception e) {
        initComponents2();
        }  
                                          

    }//GEN-LAST:event_TablalibrosMouseClicked
private void llenartabla(String[][] matriz,int numlibros, int fila,int i){
                   matriz[fila][0] = String.valueOf(numlibros);
                    matriz[fila][1] = p2.getListalibros()[i].getTipo();
                    matriz[fila][2] = p2.getListalibros()[i].getAutor();
                    matriz[fila][3] = String.valueOf(p2.getListalibros()[i].getYearpublic());
                    matriz[fila][4] = p2.getListalibros()[i].getTitulo();
                    matriz[fila][5] = String.valueOf(p2.getListalibros()[i].getEdicion());
                    matriz[fila][6] = String.valueOf(p2.getListalibros()[i].getDescripcion());
                    matriz[fila][7] = String.join(",",(p2.getListalibros()[i].getTema()));
                    matriz[fila][8] = String.join(",",(p2.getListalibros()[i].getPclaves()));
                    if(!p2.getListalibros()[i].getIsbn().equals(Long.parseLong("0"))){
                        matriz[fila][9] =String.valueOf( p2.getListalibros()[i].getIsbn());
                    }else{
                         matriz[fila][9] ="";
                    } 
                    matriz[fila][10] = p2.getListalibros()[i].getCategoria();
                    
                   if(!p2.getListalibros()[i].getEjemplares().equals(0)){
                    matriz[fila][11] = String.valueOf(p2.getListalibros()[i].getEjemplares());
                   }else{
                         matriz[fila][11] ="";
                    } 
                    matriz[fila][12] = p2.getListalibros()[i].getArea();
                    matriz[fila][13] = String.valueOf(p2.getListalibros()[i].getID());
                    matriz[fila][14] = String.valueOf(p2.getListalibros()[i].getDisponible());
                  
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buscartxt;
    private javax.swing.JTable Tablalibros;
    private javax.swing.JTextField atri;
    private javax.swing.JComboBox<String> boxatributo;
    private javax.swing.JComboBox<String> boxtipo;
    private javax.swing.JPanel busqueda;
    private javax.swing.JPanel busqueda2;
    private javax.swing.JLabel filtrar;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel reportxt;
    // End of variables declaration//GEN-END:variables
}
