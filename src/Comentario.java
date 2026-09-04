public class Comentario {

    private String autor;
    private String texto;

    // Constructor
    public Comentario(String autor, String texto) {
        this.autor = autor;
        this.texto = texto;
    }

    // get and set
    public String getAutor() {
        return autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}
