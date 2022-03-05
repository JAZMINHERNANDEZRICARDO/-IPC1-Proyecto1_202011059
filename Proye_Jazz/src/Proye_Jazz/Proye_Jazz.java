package Proye_Jazz;

public class Proye_Jazz {

    public static int contador=1;
    public static int contador1=0;
    
    public static void main(String[] args) {
        Usuarios[] usuarios = new Usuarios [50];
        Bibliografia[] biblio=new Bibliografia[50];
        TESIS_METO [] tesis_meto= new TESIS_METO [50];
        REVISTA_METO [] revista_meto=new REVISTA_METO [50];
        DIGITAL_METO [] digital_meto=new DIGITAL_METO [50];
        
        usuarios [0] = new Usuarios(1, "admin", "admin", "admin", 0, "admin");
        
        Login log = new Login(usuarios,biblio,tesis_meto,revista_meto,digital_meto);
        log.setVisible(true);
    }
    
}
