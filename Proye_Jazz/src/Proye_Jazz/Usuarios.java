package Proye_Jazz;

public class Usuarios {
    
    int id;
    int rol;
    String nom;
    String apell;
    String user;
    String pass;
    String libro1;
    String libro2;
    String libro3;
    String libro4;
    String libro5;
    int con_li;

    public Usuarios(int id, String nom, String apell, String user,  int rol, String pass,String libro1,String libro2,String libro3,String libro4,String libro5,int con_li) {
        this.id = id;
        this.rol = rol;
        this.nom = nom;
        this.apell = apell;
        this.user = user;
        this.pass = pass;
        this.libro1 = libro1;
        this.libro2 = libro2;
        this.libro3 = libro3;
        this.libro4 = libro4;
        this.libro5 = libro5;
        this.con_li = con_li;
    }

    public int getCon_li() {
        return con_li;
    }

    public void setCon_li(int con_li) {
        this.con_li = con_li;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApell() {
        return apell;
    }

    public void setApell(String apell) {
        this.apell = apell;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public String getLibro1() {
        return libro1;
    }

    public void setLibro1(String libro1) {
        this.libro1 = libro1;
    }

    public String getLibro2() {
        return libro2;
    }

    public void setLibro2(String libro2) {
        this.libro2 = libro2;
    }

    public String getLibro3() {
        return libro3;
    }

    public void setLibro3(String libro3) {
        this.libro3 = libro3;
    }

    public String getLibro4() {
        return libro4;
    }

    public void setLibro4(String libro4) {
        this.libro4 = libro4;
    }

    public String getLibro5() {
        return libro5;
    }

    public void setLibro5(String libro5) {
        this.libro5 = libro5;
    }
    
}