package Proye_Jazz;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    Usuarios usuarios[];
    Bibliografia biblio[];
    public static int coordenada;

    
    public Login(Usuarios usuarios[],Bibliografia biblio[]) {
        this.usuarios = usuarios;
        this.biblio=biblio;

        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TXT_Usu = new javax.swing.JTextField();
        TXT_Contra = new javax.swing.JTextField();
        Iniciar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("LOGIN");

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña");

        Iniciar.setText("Iniciar");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Cancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(Iniciar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_Usu, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_Contra, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(131, 131, 131))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXT_Usu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(TXT_Contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Iniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cancelar)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        String Usu, Contra;
        
        Usu = TXT_Usu.getText();
        Contra = TXT_Contra.getText();
        
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] != null) {
                if (usuarios[i].getNom().equals(Usu) && usuarios[i].getPass().equals(Contra)) {
                    String ur;
                    coordenada=i;
                    
                    if (Usu.equals("admin")&& Contra.equals("admin")) {
                    Administrador admin = new Administrador(usuarios,biblio);
                    admin.setVisible(true);
                    this.dispose();
                    setVisible(false);
                    }else{
                    inicio_usu ad = new inicio_usu(usuarios,biblio);
                    ad.setVisible(true);
                    setVisible(false);
                    String texto;
                    String texto1;
                    String texto2;
                    texto=usuarios[i].getNom()+" "+usuarios[i].getApell();
                        if (usuarios[i].getRol()==1) {
                            
                            ur="ESTUDIANTE";
                            texto1="MI NOMBRE ES "+usuarios[i].getNom()+" "+usuarios[i].getApell()+" MI ROL ES DE "+ur;                   
                    texto2="MI NUMERO DE ID ES  "+usuarios[i].getId()+" MI USUARIO ES "+usuarios[i].getUser();
                    ad.VARIABLE_NOM.setText(texto);
                    ad.iddddd.setText(texto1);
                    ad.jLabel3.setText(texto2);
                    this.dispose();
                    
 
                        }else{
                            ur="CATEFRATICO";
                            texto1="MI NOMBRE ES "+usuarios[i].getNom()+" "+usuarios[i].getApell()+" MI ROL ES DE "+ur;                   
                    texto2="MI NUMERO DE ID ES  "+usuarios[i].getId()+" MI USUARIO ES "+usuarios[i].getUser();
                    ad.VARIABLE_NOM.setText(texto);
                    ad.iddddd.setText(texto1);
                    ad.jLabel3.setText(texto2);
                    this.dispose();

                        }


                    }
                    
                }else{
                    TXT_Usu.setText("");
                    TXT_Contra.setText("");
                  //  JOptionPane.showMessageDialog(null, "Usuario o contraseñas incorrectas o inexistentes");
                }
            }
        }
        
    }//GEN-LAST:event_IniciarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Iniciar;
    private javax.swing.JTextField TXT_Contra;
    private javax.swing.JTextField TXT_Usu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
