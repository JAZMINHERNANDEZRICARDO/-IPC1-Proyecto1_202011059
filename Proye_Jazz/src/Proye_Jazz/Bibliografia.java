
package Proye_Jazz;

public class Bibliografia {
    
    
    String Autor;
    String Año;
    String Titulo;
    String Descripcion;
    String Palabra;
    String Edicion;
    String Temas;
    String Coplas;
    String Area;
    String Categoria;
    String Isbn;
    String Tipo;// verificar 

    public Bibliografia(String Autor, String Año, String Titulo, String Descripcion, String Palabra, String Edicion, String Temas, String Coplas, String Area, String Categoria, String Isbn, String Tipo) {
        this.Autor = Autor;
        this.Año = Año;
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.Palabra = Palabra;
        this.Edicion = Edicion;
        this.Temas = Temas;
        this.Coplas = Coplas;
        this.Area = Area;
        this.Categoria = Categoria;
        this.Isbn = Isbn;
        this.Tipo = Tipo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getPalabra() {
        return Palabra;
    }

    public void setPalabra(String Palabra) {
        this.Palabra = Palabra;
    }

    public String getEdicion() {
        return Edicion;
    }

    public void setEdicion(String Edicion) {
        this.Edicion = Edicion;
    }

    public String getTemas() {
        return Temas;
    }

    public void setTemas(String Temas) {
        this.Temas = Temas;
    }

    public String getCoplas() {
        return Coplas;
    }

    public void setCoplas(String Coplas) {
        this.Coplas = Coplas;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String Isbn) {
        this.Isbn = Isbn;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }   
}
