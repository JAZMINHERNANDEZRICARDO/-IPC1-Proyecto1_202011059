/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proye_Jazz;

/**
 *
 * @author Usuario
 */
public class LIBRO_1 extends javax.swing.JFrame {

    Usuarios usuarios[];
    Bibliografia biblio[];

    
    String LI_Autor;
    String LI_Año;
    String LI_Titulo;
    String LI_Descripcion;
    String LI_Palabra;
    String LI_Edicion;
    String LI_Temas;
    String LI_Coplas;
    String LI_Area;
    String LI_Categoria;
    String LI_Isbn;
    String LI_Tipo;
        
    
    int sel;
    int fila;
    
    public LIBRO_1(Usuarios usuarios[],Bibliografia biblio[]) {
        
        this.usuarios = usuarios;
        this.biblio=biblio;

        
        initComponents();
        
        Cargar();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        L_descrip = new javax.swing.JTextField();
        L_titulo = new javax.swing.JTextField();
        L_año = new javax.swing.JTextField();
        L_autor = new javax.swing.JTextField();
        L_palabras = new javax.swing.JTextField();
        L_edicion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_li = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        L_isbri = new javax.swing.JTextField();
        L_categoria = new javax.swing.JTextField();
        L_copias = new javax.swing.JTextField();
        L_temas = new javax.swing.JTextField();
        L_area = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TIP = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        jTextField9.setText("jTextField9");

        jTextField7.setText("jTextField7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("AUTOR");

        jLabel2.setText("AÑO");

        jLabel3.setText("TITULO");

        jLabel4.setText("DESCRIPCION");

        jLabel5.setText("PALABRAS");

        jLabel6.setText("EDICION");

        L_descrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_descripActionPerformed(evt);
            }
        });

        L_año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_añoActionPerformed(evt);
            }
        });

        tabla_li.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AUTOR", "AÑO", "TITULO", "DESCRIPCION", "PALABRAS", "EDICION", "AREA", "TEMAS", "COPIAS", "CATEGORIA", "ISBRI", "TIPO"
            }
        ));
        tabla_li.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_liMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_li);

        jButton1.setText("GUARDAR Y SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ELIMINAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("MODIFICAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("INSERTAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        L_isbri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_isbriActionPerformed(evt);
            }
        });

        L_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_areaActionPerformed(evt);
            }
        });

        jLabel8.setText("AREA");

        jLabel9.setText("TEMAS");

        jLabel10.setText("COPIAS");

        jLabel11.setText("CATEGORIA");

        jLabel12.setText("ISBRI");

        jLabel13.setText("LIBROS");

        TIP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LIBRO", "REVISTA", "TESIS", "LIBRO_DIGITAL" }));

        jLabel14.setText("TIPO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(60, 60, 60)
                                .addComponent(L_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(L_descrip)
                                    .addComponent(L_palabras)
                                    .addComponent(L_edicion)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(61, 61, 61)
                                .addComponent(L_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(77, 77, 77)
                                .addComponent(L_año, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(L_isbri, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(L_categoria)
                            .addComponent(L_copias)
                            .addComponent(L_temas)
                            .addComponent(L_area)
                            .addComponent(TIP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(58, 58, 58)))
                .addGap(416, 416, 416))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(L_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(L_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(L_descrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(L_palabras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jButton4))
                            .addComponent(L_temas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(L_copias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L_isbri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(L_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void L_añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_añoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L_añoActionPerformed

    private void L_descripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_descripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L_descripActionPerformed

    private void L_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L_areaActionPerformed

    private void L_isbriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_isbriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L_isbriActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    LI_Autor=L_autor.getText();
    LI_Año=L_año.getText();
    LI_Titulo=L_titulo.getText();
    LI_Descripcion=L_descrip.getText();
    LI_Palabra=L_palabras.getText();
    LI_Edicion=L_edicion.getText();
    LI_Temas=L_temas.getText();
    LI_Coplas=L_copias.getText();
    LI_Area=L_area.getText();
    LI_Categoria=L_categoria.getText();
    LI_Isbn=L_isbri.getText();
    LI_Tipo = (String) TIP.getSelectedItem();
        
        biblio [sel] = new Bibliografia(LI_Autor, LI_Año, LI_Titulo, LI_Descripcion, LI_Palabra,LI_Edicion,LI_Temas,LI_Coplas,LI_Area,LI_Categoria,LI_Isbn,LI_Tipo);
   
        for (int i = 0; i < tabla_li.getColumnCount(); i++) {

        tabla_li.setValueAt(biblio[i], fila, i);

            }

        L_autor.setText("");
        L_año.setText("");
        L_titulo.setText("");
        L_descrip.setText("");
        L_palabras.setText("");
        L_edicion.setText("");
        L_temas.setText("");
        L_copias.setText("");
        L_area.setText("");
        L_categoria.setText("");
        L_isbri.setText("");
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    LI_Autor=L_autor.getText();
    LI_Año=L_año.getText();
    LI_Titulo=L_titulo.getText();
    LI_Descripcion=L_descrip.getText();
    LI_Palabra=L_palabras.getText();
    LI_Edicion=L_edicion.getText();
    LI_Temas=L_temas.getText();
    LI_Coplas=L_copias.getText();
    LI_Area=L_area.getText();
    LI_Categoria=L_categoria.getText();
    LI_Isbn=L_isbri.getText();
    LI_Tipo = (String) TIP.getSelectedItem();
        
    biblio[Proye_Jazz.contador1] = new Bibliografia(LI_Autor, LI_Año, LI_Titulo, LI_Descripcion, LI_Palabra,LI_Edicion,LI_Temas,LI_Coplas,LI_Area,LI_Categoria,LI_Isbn,LI_Tipo);
    Proye_Jazz.contador1 ++;    
    
    
        L_autor.setText("");
        L_año.setText("");
        L_titulo.setText("");
        L_descrip.setText("");
        L_palabras.setText("");
        L_edicion.setText("");
        L_temas.setText("");
        L_copias.setText("");
        L_area.setText("");
        L_categoria.setText("");
        L_isbri.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tabla_liMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_liMouseClicked
    
        sel=tabla_li.getSelectedRow();
        
        
        L_autor.setText(tabla_li.getValueAt(sel,0).toString());
        L_año.setText(tabla_li.getValueAt(sel,1).toString());
        L_titulo.setText(tabla_li.getValueAt(sel,2).toString());
        L_descrip.setText(tabla_li.getValueAt(sel,3).toString());
        L_palabras.setText(tabla_li.getValueAt(sel,4).toString());
        L_edicion.setText(tabla_li.getValueAt(sel,5).toString());
        L_temas.setText(tabla_li.getValueAt(sel,6).toString());
        L_copias.setText(tabla_li.getValueAt(sel,7).toString());
        L_area.setText(tabla_li.getValueAt(sel,8).toString());
        L_categoria.setText(tabla_li.getValueAt(sel,9).toString());
        L_isbri.setText(tabla_li.getValueAt(sel,10).toString());
        TIP.setActionCommand(tabla_li.getValueAt(sel,11).toString());
        
        fila=sel;
        
   
    }//GEN-LAST:event_tabla_liMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Administrador admin = new Administrador(usuarios,biblio);
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void Cargar(){
        
        String datos [][] = new String[biblio.length][12];
        
        for (int i = 0; i < biblio.length; i++) {
            if (biblio [i] != null) {
                
                datos [i][0] = biblio[i].getAutor();
                datos [i][1] = biblio[i].getAño();
                datos [i][2] = biblio[i].getTitulo();
                datos [i][3] = biblio[i].getDescripcion();
                datos [i][4] = biblio[i].getPalabra();
                datos [i][5] = biblio[i].getEdicion();
                datos [i][6] = biblio[i].getArea();
                datos [i][7] = biblio[i].getTemas();
                datos [i][8] = biblio[i].getCoplas();
                datos [i][9] = biblio[i].getCategoria();
                datos [i][10] = biblio[i].getIsbn();
                datos [i][11] = biblio[i].getTipo();
                
            }
        }
        
        tabla_li.setModel(new javax.swing.table.DefaultTableModel(
            datos,
            new String [] {
                "AUTOR","AÑO","TITULO","DESCRIPCION","PALABRAS","EDICION","AREA","TEMAS","COPIAS","CATEGORIA","ISBRI","TIPO"
            }
        ));
        
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField L_area;
    private javax.swing.JTextField L_autor;
    private javax.swing.JTextField L_año;
    private javax.swing.JTextField L_categoria;
    private javax.swing.JTextField L_copias;
    private javax.swing.JTextField L_descrip;
    private javax.swing.JTextField L_edicion;
    private javax.swing.JTextField L_isbri;
    private javax.swing.JTextField L_palabras;
    private javax.swing.JTextField L_temas;
    private javax.swing.JTextField L_titulo;
    private javax.swing.JComboBox<String> TIP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tabla_li;
    // End of variables declaration//GEN-END:variables
}
