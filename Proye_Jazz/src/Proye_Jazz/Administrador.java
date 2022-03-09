package Proye_Jazz;
import java.io.*;

public class Administrador extends javax.swing.JFrame {
    
    Usuarios usuarios[];
    Bibliografia biblio[];
       //USUARIOS
        File archivo = new File("Reportes\\usuarios.html");
        // aperturar un archivo
        FileWriter escribir;
        // crear nuevas lineas dentro un archivo
        PrintWriter nuevaLinea;
        // BIBLIOGRAFIAS
        File archivo2 = new File("Reportes\\bibliografias.html");
        // aperturar un archivo
        FileWriter escribir2;
        // crear nuevas lineas dentro un archivo
        PrintWriter nuevaLinea2;
    
    public Administrador(Usuarios usuarios[],Bibliografia biblio[]) {
        this.usuarios = usuarios;
        this.biblio=biblio;

        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        MostrarUsuarios = new javax.swing.JButton();
        ReporteUsuarios = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        MostrarBibliografia = new javax.swing.JButton();
        ReporteBibliografia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ADMINISTRADOR");

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        jLabel2.setText("USUARIOS");

        MostrarUsuarios.setText("Mostrar");
        MostrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarUsuariosActionPerformed(evt);
            }
        });

        ReporteUsuarios.setText("Reporte");
        ReporteUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteUsuariosActionPerformed(evt);
            }
        });

        jLabel3.setText("BIBLIOGRAFIA");

        MostrarBibliografia.setText("Mostrar");
        MostrarBibliografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarBibliografiaActionPerformed(evt);
            }
        });

        ReporteBibliografia.setText("Reporte");
        ReporteBibliografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteBibliografiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(136, 136, 136)
                .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MostrarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(MostrarBibliografia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ReporteUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(ReporteBibliografia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Volver))
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MostrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReporteUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ReporteBibliografia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MostrarBibliografia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Login log = new Login(usuarios,biblio);
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void MostrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarUsuariosActionPerformed
        Cre_Usuarios mos = new Cre_Usuarios(usuarios,biblio);
        mos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MostrarUsuariosActionPerformed

    private void MostrarBibliografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarBibliografiaActionPerformed
       LIBRO_1 mos = new LIBRO_1(usuarios,biblio);
        mos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MostrarBibliografiaActionPerformed

    private void ReporteUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteUsuariosActionPerformed
       carga ();
    }//GEN-LAST:event_ReporteUsuariosActionPerformed

    private void ReporteBibliografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteBibliografiaActionPerformed
      carga2 ();
    }//GEN-LAST:event_ReporteBibliografiaActionPerformed
    
    
    public void carga2 (){
        if(!archivo.exists()){
            
            try{
                //crear mi archivo
                archivo2.createNewFile();
                // le pasao el archivo donde quiero escribir, true 
                escribir2 = new FileWriter(archivo2,true);
                // escribiendo dentro de mi archivo
                nuevaLinea2 = new PrintWriter(escribir2);
                nuevaLinea2.println("<!DOCTYPE html>\n" +
                                    "<html lang=\"en\">\n" +
                                    "<head>\n" +
                                    "    <meta charset=\"UTF-8\">\n" +
                                    "    <title>Document</title>\n" +
                                    "</head>\n" +
                                    "<body>");
                
                
                nuevaLinea2.println("<h1><center>REPORTE BIBLIOGRAFIA</center></h1>");
                nuevaLinea2.println("<table width=\"60%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#000000\">");
                
                nuevaLinea2.println("<tr>");
                
                nuevaLinea2.println("<th>AUTOR</th>");
                nuevaLinea2.println("<th>AÑO</th>");
                nuevaLinea2.println("<th>TITULO</th>");
                nuevaLinea2.println("<th>DESCRIPCION</th>");
                nuevaLinea2.println("<th>PALABRAS</th>");
                nuevaLinea2.println("<th>EDICION</th>");
                
                nuevaLinea2.println("<th>AREA</th>");
                nuevaLinea2.println("<th>TEMAS</th>");
                nuevaLinea2.println("<th>COPIAS</th>");
                nuevaLinea2.println("<th>CATEGORIA</th>");
                nuevaLinea2.println("<th>ISBRI</th>");
                nuevaLinea2.println("<th>TIPO</th>");
                
                nuevaLinea2.println("</tr>");
                
              /*  <tr>
    <th>Company</th>
    <th>Contact</th>
    <th>Country</th>
  </tr>*/
                for(int i=0; i<biblio.length;i++){  ///aquiiiii
                    //solo cuando los datos existan
                    if(biblio[i]!=null){
                        nuevaLinea2.println("<tr>");
                        
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getAutor());   
                        nuevaLinea2.print("</td>");
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getAño());   
                        nuevaLinea2.print("</td>");
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getTitulo());   
                        nuevaLinea2.print("</td>");
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getDescripcion());   
                        nuevaLinea2.print("</td>");
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getPalabra());   
                        nuevaLinea2.print("</td>");
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getEdicion());   
                        nuevaLinea2.print("</td>");
                        
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getArea());   
                        nuevaLinea2.print("</td>");
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getTemas());   
                        nuevaLinea2.print("</td>");
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getCoplas());   
                        nuevaLinea2.print("</td>");
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getCategoria());   
                        nuevaLinea2.print("</td>");
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getIsbn());   
                        nuevaLinea2.print("</td>");
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getTipo());   
                        nuevaLinea2.print("</td>");
                        
                        nuevaLinea2.println("</tr>");
                    }
                }
                nuevaLinea2.println("</table>");
                
                
                
                
                // ---------------------------
                nuevaLinea2.println("</body>\n" +
                                   "</html>");
                // me cierra mi archivo
                escribir2.close();
                
            }catch (Exception e) {
                
            }
        }else{
            try {
                // le pasao el archivo donde quiero escribir, true 
                escribir2 = new FileWriter(archivo2,true);
                // escribiendo dentro de mi archivo
                nuevaLinea2 = new PrintWriter(escribir2);
                nuevaLinea2.println("<!DOCTYPE html>\n" +
                                    "<html lang=\"en\">\n" +
                                    "<head>\n" +
                                    "    <meta charset=\"UTF-8\">\n" +
                                    "    <title>Document</title>\n" +
                                    "</head>\n" +
                                    "<body>");
                
                 nuevaLinea2.println("<h1><center>REPORTE BIBLIOGRAFIA</center></h1>");
                nuevaLinea2.println("<table width=\"60%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#000000\">");
                
                nuevaLinea2.println("<tr>");
                nuevaLinea2.println("<th>AUTOR</th>");
                nuevaLinea2.println("<th>AÑO</th>");
                nuevaLinea2.println("<th>TITULO</th>");
                nuevaLinea2.println("<th>DESCRIPCION</th>");
                nuevaLinea2.println("<th>PALABRAS</th>");
                nuevaLinea2.println("<th>EDICION</th>");
                
                nuevaLinea2.println("<th>AREA</th>");
                nuevaLinea2.println("<th>TEMAS</th>");
                nuevaLinea2.println("<th>COPIAS</th>");
                nuevaLinea2.println("<th>CATEGORIA</th>");
                nuevaLinea2.println("<th>ISBRI</th>");
                nuevaLinea2.println("<th>TIPO</th>");
                nuevaLinea2.println("</tr>");
                
                for(int i=0; i<biblio.length;i++){
                    //solo cuando los datos existan
                    if(biblio[i]!=null){
                        nuevaLinea2.println("<tr>");
                        
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getAutor());   
                        nuevaLinea2.print("</td>");
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getAño());   
                        nuevaLinea2.print("</td>");
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getTitulo());   
                        nuevaLinea2.print("</td>");
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getDescripcion());   
                        nuevaLinea2.print("</td>");
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getPalabra());   
                        nuevaLinea2.print("</td>");
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getEdicion());   
                        nuevaLinea2.print("</td>");
                        
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getArea());   
                        nuevaLinea2.print("</td>");
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getTemas());   
                        nuevaLinea2.print("</td>");
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getCoplas());   
                        nuevaLinea2.print("</td>");
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getCategoria());   
                        nuevaLinea2.print("</td>");
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getIsbn());   
                        nuevaLinea2.print("</td>");
                        nuevaLinea2.print("<td>");
                        nuevaLinea2.print(biblio[i].getTipo());   
                        nuevaLinea2.print("</td>");
                        
                        nuevaLinea2.println("</tr>");
                    }
                }
                nuevaLinea2.println("</table>");
                
                // ---------------------------
                nuevaLinea2.println("</body>\n" +
                                   "</html>");
                // me cierra mi archivo
                escribir2.close();
            } catch (Exception e) {
            }
        
            
        }
        
    }
    
    public void carga (){
        if(!archivo.exists()){
            
            try{
                //crear mi archivo
                archivo.createNewFile();
                // le pasao el archivo donde quiero escribir, true 
                escribir = new FileWriter(archivo,true);
                // escribiendo dentro de mi archivo
                nuevaLinea = new PrintWriter(escribir);
                nuevaLinea.println("<!DOCTYPE html>\n" +
                                    "<html lang=\"en\">\n" +
                                    "<head>\n" +
                                    "    <meta charset=\"UTF-8\">\n" +
                                    "    <title>Document</title>\n" +
                                    "</head>\n" +
                                    "<body>");
                
                
                nuevaLinea.println("<h1>REPORTE USUARIOS</h1>");
                nuevaLinea.println("<table width=\"100%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#000000\">");
                nuevaLinea.println("<tr>");
                nuevaLinea.println("<th>ID</th>");
                nuevaLinea.println("<th>NOMBRE</th>");
                nuevaLinea.println("<th>APELLIDO</th>");
                nuevaLinea.println("<th>USER</th>");
                nuevaLinea.println("<th>ROL</th>");
                nuevaLinea.println("<th>CONTRASEÑA</th>");
                nuevaLinea.println("</tr>");
                
              /*  <tr>
    <th>Company</th>
    <th>Contact</th>
    <th>Country</th>
  </tr>*/
                for(int i=0; i<usuarios.length;i++){
                    //solo cuando los datos existan
                    if(usuarios[i]!=null){
                        nuevaLinea.println("<tr>");
                        
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(usuarios[i].getId());   
                        nuevaLinea.print("</td>");
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(usuarios[i].getNom());   
                        nuevaLinea.print("</td>");
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(usuarios[i].getApell());   
                        nuevaLinea.print("</td>");
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(usuarios[i].getUser());   
                        nuevaLinea.print("</td>");
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(usuarios[i].getRol());   
                        nuevaLinea.print("</td>");
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(usuarios[i].getPass());   
                        nuevaLinea.print("</td>");
                        
                        nuevaLinea.println("</tr>");
                    }
                }
                nuevaLinea.println("</table>");
                
                
                
                
                // ---------------------------
                nuevaLinea.println("</body>\n" +
                                   "</html>");
                // me cierra mi archivo
                escribir.close();
                
            }catch (Exception e) {
                
            }
        }else{
            try {
                // le pasao el archivo donde quiero escribir, true 
                escribir = new FileWriter(archivo,true);
                // escribiendo dentro de mi archivo
                nuevaLinea = new PrintWriter(escribir);
                nuevaLinea.println("<!DOCTYPE html>\n" +
                                    "<html lang=\"en\">\n" +
                                    "<head>\n" +
                                    "    <meta charset=\"UTF-8\">\n" +
                                    "    <title>Document</title>\n" +
                                    "</head>\n" +
                                    "<body>");
                
                nuevaLinea.println("<h1><center>REPORTE USUARIOS</center></h1>");
                nuevaLinea.println("<table width=\"100%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#000000\">");
                
                nuevaLinea.println("<tr>");
                nuevaLinea.println("<th>ID</th>");
                nuevaLinea.println("<th>NOMBRE</th>");
                nuevaLinea.println("<th>APELLIDO</th>");
                nuevaLinea.println("<th>USER</th>");
                nuevaLinea.println("<th>ROL</th>");
                nuevaLinea.println("<th>CONTRASEÑA</th>");
                nuevaLinea.println("</tr>");
                
                for(int i=0; i<usuarios.length;i++){
                    //solo cuando los datos existan
                    if(usuarios[i]!=null){
                        nuevaLinea.println("<tr>");
                        
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(usuarios[i].getId());   
                        nuevaLinea.print("</td>");
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(usuarios[i].getNom());   
                        nuevaLinea.print("</td>");
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(usuarios[i].getApell());   
                        nuevaLinea.print("</td>");
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(usuarios[i].getUser());   
                        nuevaLinea.print("</td>");
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(usuarios[i].getRol());   
                        nuevaLinea.print("</td>");
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(usuarios[i].getPass());   
                        nuevaLinea.print("</td>");
                        
                        nuevaLinea.println("</tr>");
                    }
                }
                nuevaLinea.println("</table>");
                
                // ---------------------------
                nuevaLinea.println("</body>\n" +
                                   "</html>");
                // me cierra mi archivo
                escribir.close();
            } catch (Exception e) {
            }
        
            
        }
        
    } 
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MostrarBibliografia;
    private javax.swing.JButton MostrarUsuarios;
    private javax.swing.JButton ReporteBibliografia;
    private javax.swing.JButton ReporteUsuarios;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
