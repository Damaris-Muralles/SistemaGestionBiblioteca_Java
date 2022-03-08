
import Clases.Libros;
import java.awt.Color;
import java.awt.event.MouseEvent;


public class Cargaindividual extends javax.swing.JFrame {
    int opcion;
    private static Libros[] listalibros = new Libros[2];
    public Cargaindividual() {
        initComponents();
         initComponents2();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pfondo = new javax.swing.JPanel();
        labelcrearb = new javax.swing.JLabel();
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
        Retur = new javax.swing.JPanel();
        regresartxt = new javax.swing.JLabel();
        txttitulo = new javax.swing.JTextField();
        ingresar1 = new javax.swing.JPanel();
        txtingresar = new javax.swing.JLabel();
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
        cancel1 = new javax.swing.JPanel();
        cancelartxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 600));

        Pfondo.setBackground(new java.awt.Color(255, 255, 255));
        Pfondo.setForeground(new java.awt.Color(0, 12, 23));
        Pfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelcrearb.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelcrearb.setForeground(new java.awt.Color(0, 12, 23));
        labelcrearb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelcrearb.setText("CARGA INDIVIDUAL");
        Pfondo.add(labelcrearb, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 23, 1200, 40));

        labertitulo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labertitulo.setForeground(new java.awt.Color(0, 12, 23));
        labertitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labertitulo.setText("TITULO:");
        Pfondo.add(labertitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 130, 30));

        txtdescrip.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtdescrip.setForeground(new java.awt.Color(0, 12, 23));
        txtdescrip.setBorder(null);
        Pfondo.add(txtdescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 270, 30));

        labeltema.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labeltema.setForeground(new java.awt.Color(0, 12, 23));
        labeltema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltema.setText("TEMAS:");
        Pfondo.add(labeltema, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 130, 30));

        labeledicion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labeledicion.setForeground(new java.awt.Color(0, 12, 23));
        labeledicion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeledicion.setText("EDICIÓN:");
        Pfondo.add(labeledicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 130, 30));

        labeltipo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labeltipo.setForeground(new java.awt.Color(0, 12, 23));
        labeltipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltipo.setText("TIPO:");
        Pfondo.add(labeltipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 130, 30));

        labelyear.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelyear.setForeground(new java.awt.Color(0, 12, 23));
        labelyear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelyear.setText("AÑO:");
        Pfondo.add(labelyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 130, 30));

        labeldescrip.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labeldescrip.setForeground(new java.awt.Color(0, 12, 23));
        labeldescrip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeldescrip.setText("DESCRIPCIÓN:");
        Pfondo.add(labeldescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 140, 30));

        laberpclave.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        laberpclave.setForeground(new java.awt.Color(0, 12, 23));
        laberpclave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laberpclave.setText(" PALABRAS CLAVES:");
        Pfondo.add(laberpclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 140, 30));

        Separator2.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 270, 20));

        Separator3.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 270, 20));

        Separator4.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 270, 20));

        Separator5.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 270, 20));

        Separator7.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 270, 20));

        txtyear.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtyear.setForeground(new java.awt.Color(0, 12, 23));
        txtyear.setBorder(null);
        Pfondo.add(txtyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 270, 30));

        txttema.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txttema.setForeground(new java.awt.Color(0, 12, 23));
        txttema.setBorder(null);
        Pfondo.add(txttema, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 270, 30));

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

        Pfondo.add(Retur, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, 130, 40));

        txttitulo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txttitulo.setForeground(new java.awt.Color(0, 12, 23));
        txttitulo.setBorder(null);
        Pfondo.add(txttitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 270, 30));

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

        Pfondo.add(ingresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 130, 40));

        Separator6.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 270, 20));

        txtclave.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtclave.setForeground(new java.awt.Color(0, 12, 23));
        txtclave.setBorder(null);
        Pfondo.add(txtclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 270, 30));

        txtedicion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtedicion.setForeground(new java.awt.Color(0, 12, 23));
        txtedicion.setBorder(null);
        Pfondo.add(txtedicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 270, 30));

        ID.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        ID.setForeground(new java.awt.Color(0, 12, 23));
        ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID.setText("ID:");
        Pfondo.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 130, 30));

        labelcopia.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelcopia.setForeground(new java.awt.Color(0, 12, 23));
        labelcopia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelcopia.setText("COPIAS:");
        Pfondo.add(labelcopia, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 130, 30));

        labelarea.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelarea.setForeground(new java.awt.Color(0, 12, 23));
        labelarea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelarea.setText("AREA:");
        Pfondo.add(labelarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 130, 30));

        labelcategoria.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelcategoria.setForeground(new java.awt.Color(0, 12, 23));
        labelcategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelcategoria.setText("CATEGORIA:");
        Pfondo.add(labelcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 130, 30));

        labelejemplar.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelejemplar.setForeground(new java.awt.Color(0, 12, 23));
        labelejemplar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelejemplar.setText("EJEMPLARES:");
        Pfondo.add(labelejemplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 130, 30));

        labelisbn.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelisbn.setForeground(new java.awt.Color(0, 12, 23));
        labelisbn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelisbn.setText("ISBN:");
        Pfondo.add(labelisbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 130, 30));

        labeltam.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labeltam.setForeground(new java.awt.Color(0, 12, 23));
        labeltam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltam.setText("TAMAÑO:");
        Pfondo.add(labeltam, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 130, 30));

        txtautor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtautor.setForeground(new java.awt.Color(0, 12, 23));
        txtautor.setBorder(null);
        Pfondo.add(txtautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 270, 30));

        txtcopias.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtcopias.setForeground(new java.awt.Color(153, 153, 153));
        txtcopias.setBorder(null);
        Pfondo.add(txtcopias, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 270, 30));

        txtarea.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtarea.setForeground(new java.awt.Color(153, 153, 153));
        txtarea.setBorder(null);
        Pfondo.add(txtarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 270, 30));

        txtcategoria.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtcategoria.setForeground(new java.awt.Color(153, 153, 153));
        txtcategoria.setBorder(null);
        Pfondo.add(txtcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 270, 30));

        txtejemplar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtejemplar.setForeground(new java.awt.Color(153, 153, 153));
        txtejemplar.setBorder(null);
        Pfondo.add(txtejemplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 270, 30));

        txtisbn.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtisbn.setForeground(new java.awt.Color(153, 153, 153));
        txtisbn.setBorder(null);
        Pfondo.add(txtisbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 270, 30));

        txttam.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txttam.setForeground(new java.awt.Color(153, 153, 153));
        txttam.setBorder(null);
        Pfondo.add(txttam, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 270, 30));

        Separator8.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 270, 10));

        Separator9.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 270, 20));

        Separator10.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 270, 20));

        Separator11.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 270, 20));

        Separator12.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 270, 20));

        Separator13.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, 270, 20));

        Separator14.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 270, 20));

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
        Pfondo.add(boxtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 270, 30));

        labelautor1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelautor1.setForeground(new java.awt.Color(0, 12, 23));
        labelautor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelautor1.setText("AUTOR:");
        Pfondo.add(labelautor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 130, 30));

        Separator15.setForeground(new java.awt.Color(0, 39, 78));
        Pfondo.add(Separator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 270, 20));

        txtID.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtID.setForeground(new java.awt.Color(0, 12, 23));
        txtID.setBorder(null);
        Pfondo.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 270, 30));

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

        Pfondo.add(cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void initComponents2(){

        setLocationRelativeTo(null);
        
             txtcategoria.setEnabled(false);
              txtejemplar.setEnabled(false);
              txtcopias.setEnabled(false);
               txtarea.setEnabled(false);
              txttam.setEnabled(false);
              txtisbn.setEnabled(false);
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
    private void regresartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresartxtMouseClicked
          Administrador obj = new Administrador();
         obj.setVisible(true);
         dispose();
    }//GEN-LAST:event_regresartxtMouseClicked

    private void txtingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtingresarMouseClicked

        int cont=0, cont1=0;
        if (!Espacio(listalibros)) {
            setListalibros(dimensionarreglo(getListalibros()));
        }

        //confirmacion de seleccion de tipo de bibliografia
        if(boxtipo.getSelectedItem().equals("Seleccione opción")||txtID.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null,"No ha ingresado el ID o no ha seleccionado el tipo de bibliografia a cargar","Cargar bibliografia",javax.swing.JOptionPane.WARNING_MESSAGE);
        }else{
            //Validacion de ID y user, existe o no
            for (int i = 0; i < getListalibros().length; i++) {
                if (getListalibros()[i] != null) {
                    if (getListalibros()[i].getID().equals(Integer.parseInt(txtID.getText()))) {
                        cont=1;
                    }
                    if (!txtisbn.getText().equals("")) {
                        if(getListalibros()[i].getIsbn().equals(Long.parseLong(txtisbn.getText()))){
                            cont1=1;
                        }
                    }
                }
            }
            if(cont==1){

                javax.swing.JOptionPane.showMessageDialog(null,"EL ID ingresasdo ya existe, porfavor revisar los datos","Cargar bibliografia",javax.swing.JOptionPane.ERROR_MESSAGE);
            }else{
                if(cont1==1&& opcion==0){
                    javax.swing.JOptionPane.showMessageDialog(null,"EL ISBN ingresasdo ya existe, porfavor revisar los datos","Cargar bibliografia",javax.swing.JOptionPane.ERROR_MESSAGE);
                }else{
                    //asignacion de valores
                    for (int i = 0; i < getListalibros().length; i++) {
                        if (getListalibros()[i] == null) {
                            if(opcion==0){
                                listalibros[i] = new Libros(Integer.parseInt(txtID.getText()),String.valueOf(boxtipo.getSelectedItem()),txtautor.getText(),Integer.parseInt(txtyear.getText()),
                                    Long.parseLong(txtisbn.getText()),txttitulo.getText(),Integer.parseInt(txtedicion.getText()),txtclave.getText().split("\\, "),txtdescrip.getText(),
                                    txttema.getText().split("\\, "),Integer.parseInt(txtcopias.getText()),String.valueOf(""),Integer.parseInt("0"),String.valueOf(""),Integer.parseInt("0"),Integer.parseInt(txtcopias.getText()));
                                break;
                            }
                            if(opcion==1){

                                listalibros[i] = new Libros(Integer.parseInt(txtID.getText()),String.valueOf(boxtipo.getSelectedItem()),txtautor.getText(),Integer.parseInt(txtyear.getText()),
                                    Long.parseLong("0"),txttitulo.getText(),Integer.parseInt(txtedicion.getText()),txtclave.getText().split("\\, "),txtdescrip.getText(),
                                    txttema.getText().split("\\, "), Integer.parseInt(txtcopias.getText()),txtcategoria.getText(),Integer.parseInt(txtejemplar.getText()),String.valueOf(""),Integer.parseInt("0"),Integer.parseInt(txtcopias.getText()));
                                break;
                            }
                            if(opcion==2){
                                listalibros[i] = new Libros(Integer.parseInt(txtID.getText()),String.valueOf(boxtipo.getSelectedItem()),txtautor.getText(),Integer.parseInt(txtyear.getText()),
                                    Long.parseLong("0"),txttitulo.getText(),Integer.parseInt(txtedicion.getText()),txtclave.getText().split("\\, "),txtdescrip.getText(),
                                    txttema.getText().split("\\, "), Integer.parseInt(txtcopias.getText()),String.valueOf(""),Integer.parseInt("0"),txtarea.getText(),Integer.parseInt("0"),Integer.parseInt(txtcopias.getText()));
                                break;
                            }
                            if(opcion==3){
                                listalibros[i] = new Libros(Integer.parseInt(txtID.getText()),String.valueOf(boxtipo.getSelectedItem()),txtautor.getText(),Integer.parseInt(txtyear.getText()),
                                    Long.parseLong("0"),txttitulo.getText(),Integer.parseInt(txtedicion.getText()),txtclave.getText().split("\\, "),txtdescrip.getText(),
                                    txttema.getText().split("\\, "), Integer.parseInt("0"),String.valueOf(""),Integer.parseInt("0"),String.valueOf(""),Integer.parseInt(txttam.getText()),Integer.parseInt("0"));
                                break;
                            }
                        }

                    }
                    //vaciando parametros
                    javax.swing.JOptionPane.showMessageDialog(null,"Se ha agregado correctamente la bibliografia","Carga bibliografia",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    this.cancelartxtMouseClicked(evt) ;

                }
            }
        }

    }//GEN-LAST:event_txtingresarMouseClicked

    private void boxtipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxtipoItemStateChanged

        opcion= boxtipo.getSelectedIndex();
        if(opcion==0){
               txtcategoria.setEnabled(false);
                txtejemplar.setEnabled(false);
                txtarea.setEnabled(false);
                txttam.setEnabled(false);
            txtisbn.setEnabled(true);
            txtcopias.setEnabled(true);
            txtcopias.setText("");
            txtisbn.setText("");
        }
        if(opcion==1){
             
               txtarea.setEnabled(false);
              txttam.setEnabled(false);
               txtisbn.setEnabled(false);
            txtcategoria.setEnabled(true);
            txtejemplar.setEnabled(true);
            txtcopias.setEnabled(true);
            txtcategoria.setText("");
            txtcopias.setText("");
            txtejemplar.setText("");
        }
        if(opcion==2){
              txtcategoria.setEnabled(false);
              txtejemplar.setEnabled(false);
              txttam.setEnabled(false);
              txtisbn.setEnabled(false);
            txtarea.setEnabled(true);
            txtcopias.setEnabled(true);
            txtarea.setText("");
            txtcopias.setText("");
        }
        if(opcion==3){
              txtcategoria.setEnabled(false);
        txtejemplar.setEnabled(false);
        txtcopias.setEnabled(false);
        txtarea.setEnabled(false);
        txtisbn.setEnabled(false);
            txttam.setEnabled(true);
            txttam.setText("");
        }
    }//GEN-LAST:event_boxtipoItemStateChanged

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
        txtcategoria.setEnabled(false);
        txtejemplar.setEnabled(false);
        txtcopias.setEnabled(false);
        txtarea.setEnabled(false);
        txttam.setEnabled(false);
        txtisbn.setEnabled(false);
        boxtipo.setSelectedIndex(4);
        opcion=4;
    }//GEN-LAST:event_cancelartxtMouseClicked

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
            java.util.logging.Logger.getLogger(Cargaindividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cargaindividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cargaindividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cargaindividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cargaindividual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JPanel Pfondo;
    private javax.swing.JPanel Retur;
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
    private javax.swing.JPanel cancel1;
    private javax.swing.JLabel cancelartxt;
    private javax.swing.JPanel ingresar1;
    private javax.swing.JLabel labelarea;
    private javax.swing.JLabel labelautor1;
    private javax.swing.JLabel labelcategoria;
    private javax.swing.JLabel labelcopia;
    private javax.swing.JLabel labelcrearb;
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
    private javax.swing.JLabel regresartxt;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtarea;
    private javax.swing.JTextField txtautor;
    private javax.swing.JTextField txtcategoria;
    private javax.swing.JTextField txtclave;
    private javax.swing.JTextField txtcopias;
    private javax.swing.JTextField txtdescrip;
    private javax.swing.JTextField txtedicion;
    private javax.swing.JTextField txtejemplar;
    private javax.swing.JLabel txtingresar;
    private javax.swing.JTextField txtisbn;
    private javax.swing.JTextField txttam;
    private javax.swing.JTextField txttema;
    private javax.swing.JTextField txttitulo;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables
 /**
     * @return the listalibros
     */
    public static Libros[] getListalibros() {
        return listalibros;
    }

    /**
     * @param aListalibros the listalibros to set
     */
    public static void setListalibros(Libros[] aListalibros) {
        listalibros = aListalibros;
    }


}
