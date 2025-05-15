package co.edu.uniquindio.poo.proyectobibliotecauq.model;

public class LibroDigital extends Libro {
    private Formato formato;
    private String linkDescarga;

    public LibroDigital(String titulo, String autor, String genero, int anioPublicacion, Estado estado,
                        Formato formato, String linkDescarga) {
        super(titulo, autor, genero, anioPublicacion, estado);
        this.formato = formato;
        this.linkDescarga = linkDescarga;
    }
    public void mostrarInformacion() {
        System.out.println("Libro Digital:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Género: " + getGenero());
        System.out.println("Año: " + getAnioPublicacion());
        System.out.println("Formato: " + formato);
        System.out.println("Descargar: " + linkDescarga);
        System.out.println("Estado: " + getEstado());
        System.out.println();
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
