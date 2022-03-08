
import Clases.Replibros;
import java.awt.event.ItemEvent;

import javax.swing.table.DefaultTableModel;


public class bibliotecavirtual extends javax.swing.JPanel {
    private static Login users = new Login();
    private static Replibros[] listaagregados = new  Replibros[2];
    Cargaindividual p2 = new Cargaindividual();
    int atributo;
    
    public bibliotecavirtual() {
        initComponents();
        initComponents2();
       
    }
  private void initComponents2() {
     try {   
      int numlibros=0;
        int fila=-1;
          
        String[][] matriz = new String[p2.getListalibros().length][11];
        
        for (int i = 0; i <p2.getListalibros().length; i++) {
                
            if (p2.getListalibros()[i] != null) {
                
                if(p2.getListalibros()[i].getTipo()=="Libro digital" ){
                    numlibros=numlibros+1;
                    fila=fila+1;
                    matriz[fila][0] = String.valueOf(numlibros);
                    matriz[fila][1] = p2.getListalibros()[i].getAutor();
                    matriz[fila][2] = String.valueOf(p2.getListalibros()[i].getYearpublic());
                    matriz[fila][3] = p2.getListalibros()[i].getTitulo();
                    matriz[fila][4] = String.valueOf(p2.getListalibros()[i].getEdicion());
                    matriz[fila][5] = String.join(",",(p2.getListalibros()[i].getPclaves()));
                    matriz[fila][6] = String.valueOf(p2.getListalibros()[i].getDescripcion());
                    matriz[fila][7] = String.join(",",(p2.getListalibros()[i].getTema()));
                    matriz[fila][8] =String.valueOf( p2.getListalibros()[i].getTam());
                    matriz[fila][9] =String.valueOf( p2.getListalibros()[i].getID());
                   
                }
            }
        }
        
        String[] encabezado = {"No.", "Autor","Año","Titulo","Edición","Palabras clave","Descripción","Temas","Tamaño","ID","Agregar"};
       
        
        Tablalibros.setModel(new DefaultTableModel(
                matriz,
                encabezado
        ){
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,java.lang.Object.class,  java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false,false, true
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
        iconleer = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablalibros = new javax.swing.JTable();
        busqueda = new javax.swing.JPanel();
        Buscartxt = new javax.swing.JLabel();
        boxatributo = new javax.swing.JComboBox<>();
        ENCABEZADO = new javax.swing.JLabel();
        atri = new javax.swing.JTextField();

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconleer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/leer.jpg"))); // NOI18N
        fondo.add(iconleer, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 370, 270));

        Tablalibros.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        Tablalibros.setForeground(new java.awt.Color(0, 12, 23));
        Tablalibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 3", "Title 2", "Title 3", "Title 4", "Title 5", "title8", "tile 9", "title10", "totle 11", "Agregar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tablalibros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tablalibros.setFocusable(false);
        Tablalibros.setGridColor(new java.awt.Color(178, 192, 203));
        Tablalibros.setName(""); // NOI18N
        Tablalibros.setRowHeight(30);
        Tablalibros.setSelectionBackground(new java.awt.Color(2, 104, 111));
        Tablalibros.setShowGrid(false);
        Tablalibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablalibrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tablalibros);
        if (Tablalibros.getColumnModel().getColumnCount() > 0) {
            Tablalibros.getColumnModel().getColumn(9).setResizable(false);
            Tablalibros.getColumnModel().getColumn(9).setPreferredWidth(30);
        }

        fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 850, 220));

        busqueda.setBackground(new java.awt.Color(0, 69, 129));

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

        fondo.add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 130, 40));

        boxatributo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        boxatributo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Atributo-", "Autor", "Año publicación", "Titulo", "Edición", "Palabra clave", "Descripción", "Temas", "Tamaño", "Todos" }));
        boxatributo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxatributoItemStateChanged(evt);
            }
        });
        fondo.add(boxatributo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 310, 30));

        ENCABEZADO.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        ENCABEZADO.setForeground(new java.awt.Color(0, 12, 23));
        ENCABEZADO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ENCABEZADO.setText("BIBLIOTECA VIRTUAL");
        fondo.add(ENCABEZADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 510, 50));

        atri.setBackground(new java.awt.Color(240, 240, 240));
        atri.setBorder(null);
        fondo.add(atri, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 410, 30));

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
        
        String[][] matriz = new String[p2.getListalibros().length][11];
        int numlibro=0;
        int cont=0;
        int fila=-1;
        if(atributo==0){
           
            javax.swing.JOptionPane.showMessageDialog(null,"Por favor seleccionar el atributo por el que desea buscar","Biblioteca virtual",javax.swing.JOptionPane.WARNING_MESSAGE);

        }else{
            if(atri.getText().equals("") ){
                javax.swing.JOptionPane.showMessageDialog(null,"Por favor escribir el parametro por el que desea buscar","Biblioteca virtual",javax.swing.JOptionPane.WARNING_MESSAGE);
            }else{
                if(atributo==1){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {
                        
                     if (p2.getListalibros()[i] != null) {
                        if(p2.getListalibros()[i].getTipo()=="Libro digital" ){
                         if (p2.getListalibros()[i].getAutor().equals(atri.getText())) {
                                numlibro=numlibro+1;
                                fila=fila+1;
                                cont=cont+1;
                                 matriz[fila][0] = String.valueOf(numlibro);
                                matriz[fila][1] = p2.getListalibros()[i].getAutor();
                                matriz[fila][2] = String.valueOf(p2.getListalibros()[i].getYearpublic());
                                matriz[fila][3] = p2.getListalibros()[i].getTitulo();
                                matriz[fila][4] = String.valueOf(p2.getListalibros()[i].getEdicion());
                                matriz[fila][5] = String.join(",",(p2.getListalibros()[i].getPclaves()));
                                matriz[fila][6] = String.valueOf(p2.getListalibros()[i].getDescripcion());
                                matriz[fila][7] = String.join(",",(p2.getListalibros()[i].getTema()));
                                matriz[fila][8] =String.valueOf( p2.getListalibros()[i].getTam());
                                matriz[fila][9] =String.valueOf( p2.getListalibros()[i].getID());
                               
                          }
                        } 
                     }      
                   }
                }
                if(atributo==2){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {
                      
                     if (p2.getListalibros()[i] != null) {
                        if(p2.getListalibros()[i].getTipo()=="Libro digital" ){
                         if (p2.getListalibros()[i].getYearpublic().equals(Integer.parseInt(atri.getText()))) {
                                numlibro=numlibro+1;
                                 fila=fila+1;
                                  cont=cont+1;
                                 matriz[fila][0] = String.valueOf(numlibro);
                                matriz[fila][1] = p2.getListalibros()[i].getAutor();
                                matriz[fila][2] = String.valueOf(p2.getListalibros()[i].getYearpublic());
                                matriz[fila][3] = p2.getListalibros()[i].getTitulo();
                                matriz[fila][4] = String.valueOf(p2.getListalibros()[i].getEdicion());
                                matriz[fila][5] = String.join(",",(p2.getListalibros()[i].getPclaves()));
                                matriz[fila][6] = String.valueOf(p2.getListalibros()[i].getDescripcion());
                                matriz[fila][7] = String.join(",",(p2.getListalibros()[i].getTema()));
                                matriz[fila][8] =String.valueOf( p2.getListalibros()[i].getTam());
                                matriz[fila][9] =String.valueOf( p2.getListalibros()[i].getID());
                          }
                       
                         }
                      
                     }      
                   }
                }
                if(atributo==3){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {
                       
                     if (p2.getListalibros()[i] != null) {
                        if(p2.getListalibros()[i].getTipo()=="Libro digital" ){
                         if (p2.getListalibros()[i].getTitulo().equals(atri.getText())) {
                             numlibro=numlibro+1;
                             fila=fila+1;
                              cont=cont+1;
                                 matriz[fila][0] = String.valueOf(numlibro);
                                matriz[fila][1] = p2.getListalibros()[i].getAutor();
                                matriz[fila][2] = String.valueOf(p2.getListalibros()[i].getYearpublic());
                                matriz[fila][3] = p2.getListalibros()[i].getTitulo();
                                matriz[fila][4] = String.valueOf(p2.getListalibros()[i].getEdicion());
                                matriz[fila][5] = String.join(",",(p2.getListalibros()[i].getPclaves()));
                                matriz[fila][6] = String.valueOf(p2.getListalibros()[i].getDescripcion());
                                matriz[fila][7] = String.join(",",(p2.getListalibros()[i].getTema()));
                                matriz[fila][8] =String.valueOf( p2.getListalibros()[i].getTam());
                                matriz[fila][9] =String.valueOf( p2.getListalibros()[i].getID());
                          }
                       
                         }
                     
                     }      
                   }
                }
                if(atributo==4){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {
                     if (p2.getListalibros()[i] != null) {
                        if(p2.getListalibros()[i].getTipo()=="Libro digital" ){
                         if (p2.getListalibros()[i].getEdicion().equals(Integer.parseInt(atri.getText()))) {
                              numlibro=numlibro+1;
                              fila=fila+1;
                              cont=cont+1;
                                  matriz[fila][0] = String.valueOf(numlibro);
                                matriz[fila][1] = p2.getListalibros()[i].getAutor();
                                matriz[fila][2] = String.valueOf(p2.getListalibros()[i].getYearpublic());
                                matriz[fila][3] = p2.getListalibros()[i].getTitulo();
                                matriz[fila][4] = String.valueOf(p2.getListalibros()[i].getEdicion());
                                matriz[fila][5] = String.join(",",(p2.getListalibros()[i].getPclaves()));
                                matriz[fila][6] = String.valueOf(p2.getListalibros()[i].getDescripcion());
                                matriz[fila][7] = String.join(",",(p2.getListalibros()[i].getTema()));
                                matriz[fila][8] =String.valueOf( p2.getListalibros()[i].getTam());
                                matriz[fila][9] =String.valueOf( p2.getListalibros()[i].getID());
                          }
                       
                         }
                     
                     }      
                   }
                }
                if(atributo==5){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {
                        
                     if (p2.getListalibros()[i] != null) {
                        if(p2.getListalibros()[i].getTipo()=="Libro digital" ){
                         
                           if (p2.getListalibros()[i].getAutor().equals(atri.getText())) {
                               numlibro=numlibro+1;
                               fila=fila+1;
                               cont=cont+1;
                                  matriz[fila][0] = String.valueOf(numlibro);
                                matriz[fila][1] = p2.getListalibros()[i].getAutor();
                                matriz[fila][2] = String.valueOf(p2.getListalibros()[i].getYearpublic());
                                matriz[fila][3] = p2.getListalibros()[i].getTitulo();
                                matriz[fila][4] = String.valueOf(p2.getListalibros()[i].getEdicion());
                                matriz[fila][5] = String.join(",",(p2.getListalibros()[i].getPclaves()));
                                matriz[fila][6] = String.valueOf(p2.getListalibros()[i].getDescripcion());
                                matriz[fila][7] = String.join(",",(p2.getListalibros()[i].getTema()));
                                matriz[fila][8] =String.valueOf( p2.getListalibros()[i].getTam());
                                matriz[fila][9] =String.valueOf( p2.getListalibros()[i].getID());  
                          }
                       
                         }
                     
                     }      
                   }
                }
                if(atributo==6){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {
                        
                     if (p2.getListalibros()[i] != null) {
                        if(p2.getListalibros()[i].getTipo()=="Libro digital" ){
                         if (p2.getListalibros()[i].getDescripcion().equals(atri.getText())) {
                                 numlibro=numlibro+1;
                                 fila=fila+1;
                                 cont=cont+1;
                                 matriz[fila][0] = String.valueOf(numlibro);
                                matriz[fila][1] = p2.getListalibros()[i].getAutor();
                                matriz[fila][2] = String.valueOf(p2.getListalibros()[i].getYearpublic());
                                matriz[fila][3] = p2.getListalibros()[i].getTitulo();
                                matriz[fila][4] = String.valueOf(p2.getListalibros()[i].getEdicion());
                                matriz[fila][5] = String.join(",",(p2.getListalibros()[i].getPclaves()));
                                matriz[fila][6] = String.valueOf(p2.getListalibros()[i].getDescripcion());
                                matriz[fila][7] = String.join(",",(p2.getListalibros()[i].getTema()));
                                matriz[fila][8] =String.valueOf( p2.getListalibros()[i].getTam());
                                matriz[fila][9] =String.valueOf( p2.getListalibros()[i].getID());
                          }
                       
                         }
                     
                     }      
                   }
                }
                if(atributo==7){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {
                     if (p2.getListalibros()[i] != null) {
                        if(p2.getListalibros()[i].getTipo()=="Libro digital" ){
                         if (p2.getListalibros()[i].getAutor().equals(atri.getText())) {
                               numlibro=numlibro+1;
                               fila=fila+1;
                               cont=cont+1;
                                 matriz[fila][0] = String.valueOf(numlibro);
                                matriz[fila][1] = p2.getListalibros()[i].getAutor();
                                matriz[fila][2] = String.valueOf(p2.getListalibros()[i].getYearpublic());
                                matriz[fila][3] = p2.getListalibros()[i].getTitulo();
                                matriz[fila][4] = String.valueOf(p2.getListalibros()[i].getEdicion());
                                matriz[fila][5] = String.join(",",(p2.getListalibros()[i].getPclaves()));
                                matriz[fila][6] = String.valueOf(p2.getListalibros()[i].getDescripcion());
                                matriz[fila][7] = String.join(",",(p2.getListalibros()[i].getTema()));
                                matriz[fila][8] =String.valueOf( p2.getListalibros()[i].getTam());
                                 matriz[fila][9] =String.valueOf( p2.getListalibros()[i].getID());
                              
                          }
                       
                         }
                     
                     }      
                   }
                }
                if(atributo==8){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length; i++) {
                     if (p2.getListalibros()[i] != null) {
                        if(p2.getListalibros()[i].getTipo()=="Libro digital" ){
                         if (p2.getListalibros()[i].getTam().equals(Integer.parseInt(atri.getText()))) {
                                numlibro=numlibro+1;
                                fila=fila+1;
                                cont=cont+1;
                                matriz[fila][0] = String.valueOf(numlibro);
                                matriz[fila][1] = p2.getListalibros()[i].getAutor();
                                matriz[fila][2] = String.valueOf(p2.getListalibros()[i].getYearpublic());
                                matriz[fila][3] = p2.getListalibros()[i].getTitulo();
                                matriz[fila][4] = String.valueOf(p2.getListalibros()[i].getEdicion());
                                matriz[fila][5] = String.join(",",(p2.getListalibros()[i].getPclaves()));
                                matriz[fila][6] = String.valueOf(p2.getListalibros()[i].getDescripcion());
                                matriz[fila][7] = String.join(",",(p2.getListalibros()[i].getTema()));
                                matriz[fila][8] =String.valueOf( p2.getListalibros()[i].getTam());  
                                matriz[fila][9] =String.valueOf( p2.getListalibros()[i].getID());
                          }
                          
                         }
                     } 
                    
                   }
                }
                if(atributo==9){
                    fila=-1;
                    for (int i = 0; i < p2.getListalibros().length ; i++) {
                     if (p2.getListalibros()[i] != null) {
                        if(p2.getListalibros()[i].getTipo()=="Libro digital" ){
                                numlibro=numlibro+1;
                                fila=fila+1;
                                cont=cont+1;
                                matriz[fila][0] = String.valueOf(numlibro);
                                matriz[fila][1] = p2.getListalibros()[i].getAutor();
                                matriz[fila][2] = String.valueOf(p2.getListalibros()[i].getYearpublic());
                                matriz[fila][3] = p2.getListalibros()[i].getTitulo();
                                matriz[fila][4] = String.valueOf(p2.getListalibros()[i].getEdicion());
                                matriz[fila][5] = String.join(",",(p2.getListalibros()[i].getPclaves()));
                                matriz[fila][6] = String.valueOf(p2.getListalibros()[i].getDescripcion());
                                matriz[fila][7] = String.join(",",(p2.getListalibros()[i].getTema()));
                                matriz[fila][8] =String.valueOf( p2.getListalibros()[i].getTam());  
                                matriz[fila][9] =String.valueOf( p2.getListalibros()[i].getID());  
                         
                         }
                     }      
                   }
                }
                
                if(cont!=0){
                       
                    String[] encabezado = {"No.", "Autor","Año","Titulo","Edición","Palabras clave","Descripción","Temas","Tamaño","ID","Agregar"};
                    Tablalibros.setModel(new DefaultTableModel(
                            matriz,
                            encabezado
                    ){
                        Class[] types = new Class [] {
                            java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,java.lang.Object.class,  java.lang.Boolean.class
                        };
                        boolean[] canEdit = new boolean [] {
                            false, false, false, false, false, false, false, false, false,false, true
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
                    javax.swing.JOptionPane.showMessageDialog(null,"No se encontraron coincidencias, por favor buscar por otro parametro","Biblioteca virtual",javax.swing.JOptionPane.ERROR_MESSAGE);
                    boxatributo.setSelectedIndex(0);
                    atributo=0;
                }
            }
        
        }      
        
    }//GEN-LAST:event_BuscartxtMouseClicked

    private void boxatributoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxatributoItemStateChanged
        atributo= boxatributo.getSelectedIndex();
    }//GEN-LAST:event_boxatributoItemStateChanged

    private void TablalibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablalibrosMouseClicked
     try { 
      int fila=Tablalibros.rowAtPoint(evt.getPoint());
      int columna=Tablalibros.columnAtPoint(evt.getPoint());
      int cont=0;
      if(columna==10){
          
          Boolean checked = false; 
          checked = Boolean.valueOf(Tablalibros.getValueAt(fila,columna).toString());
           if(checked){
              
               for (int i = 0; i < getListaagregados().length; i++) {
                if (getListaagregados()[i] != null) {
                     if(getListaagregados()[i].getID_user()== users.getEn_sesion()[0].getID_user()){
                        if (getListaagregados()[i].getID().equals(Integer.parseInt(Tablalibros.getValueAt(fila,9).toString()))) {
                            cont=1;
                        }
                    }
                }
            }
            if(cont==1){
                javax.swing.JOptionPane.showMessageDialog(null,"El libro ya se encuentra agregado a su usuario, porfavor revisar los datos","Biblioteca virtual",javax.swing.JOptionPane.ERROR_MESSAGE);
                 initComponents2();
            }else{
                 if(cont==0){
                      if (!Espacio(listaagregados)) {
                            setListaagregados(dimensionarreglo(getListaagregados()));
                      }
                    //asignacion de valores
                    for (int i = 0; i < getListaagregados().length; i++) {
                        if (getListaagregados()[i] == null) {
                            
                               listaagregados[i] = new Replibros("Libro digital",Integer.parseInt(Tablalibros.getValueAt(fila,9).toString()),Tablalibros.getValueAt(fila,1).toString(),Long.parseLong("0"),Tablalibros.getValueAt(fila,3).toString(),
                                       Integer.parseInt(Tablalibros.getValueAt(fila,4).toString())," "," ",0,users.getEn_sesion()[0].getUser_sesion(),users.getEn_sesion()[0].getNombre_user(),users.getEn_sesion()[0].getID_user(),users.getEn_sesion()[0].getRol_user());  
                           break; 
                           //"No.", "Autor","Año","Titulo","Edición","Palabras clave","Descripción","Temas","Tamaño","ID","Agregar"
                        }

                    }
                  javax.swing.JOptionPane.showMessageDialog(null,"El libro se ha agregado a su usuario correctamente","Biblioteca virtual",javax.swing.JOptionPane.INFORMATION_MESSAGE);  
                  initComponents2();
                }
               
           }
          
         } 
         cont=0;
      }
       } catch (Exception e) {
           initComponents2();
        }  
    
    }//GEN-LAST:event_TablalibrosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buscartxt;
    private javax.swing.JLabel ENCABEZADO;
    private javax.swing.JTable Tablalibros;
    private javax.swing.JTextField atri;
    private javax.swing.JComboBox<String> boxatributo;
    private javax.swing.JPanel busqueda;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel iconleer;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the listaagregados
     */
    public static Replibros[] getListaagregados() {
        return listaagregados;
    }

    /**
     * @param aListaagregados the listaagregados to set
     */
    public static void setListaagregados(Replibros[] aListaagregados) {
        listaagregados = aListaagregados;
    }
}
