package co.edu.uniquindio.poo.model;

public class LibroDigital extends Libro {
    private Formato formato;
    private String linkDescarga;

    public LibroDigital(String titulo, String autor, String genero, int anioPublicacion, Estado estado,
                        Formato formato, String linkDescarga) {
        super(titulo, autor, genero, anioPublicacion, estado);
        this.formato = formato;
        this.linkDescarga = linkDescarga;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public String getLinkDescarga() {
        return linkDescarga;
    }

    public void setLinkDescarga(String linkDescarga) {
        this.linkDescarga = linkDescarga;
    }
}
