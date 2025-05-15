package co.edu.uniquindio.poo.bibliotecaUQ.model;

public class LibroFisico extends Libro {
    private int paginas;
    private String ubicacion;
    private String editorial;

    public LibroFisico(String titulo, String autor, String genero, int anioPublicacion, Estado estado,
                       int paginas, String ubicacion, String editorial) {
        super(titulo, autor, genero, anioPublicacion, estado);
        this.paginas = paginas;
        this.ubicacion = ubicacion;
        this.editorial = editorial;
    }
    /**
     * Muestra en consola la información del libro físico.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("Libro Físico:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Género: " + genero);
        System.out.println("Año: " + anioPublicacion);
        System.out.println("Páginas: " + paginas);
        System.out.println("Editorial: " + editorial);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Estado: " + estado);
        System.out.println();
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
