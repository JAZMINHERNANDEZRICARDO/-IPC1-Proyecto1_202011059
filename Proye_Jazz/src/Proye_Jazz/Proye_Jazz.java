package Proye_Jazz;

public class Proye_Jazz {

    public static int contador=1;
    
    public static void main(String[] args) {
        Usuarios[] usuarios = new Usuarios [50];
        Bibliografia[] biblio=new Bibliografia[50];
        
        usuarios [0] = new Usuarios(1, "admin", "admin", "admin", 0, "admin");
        
        Login log = new Login(usuarios,biblio);
        log.setVisible(true);
    }
    
}
