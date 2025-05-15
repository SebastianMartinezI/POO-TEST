package co.edu.uniquindio.poo.proyectobibliotecauq.model;

import java.util.ArrayList;
import java.util.List;

public class GestionLibro {
    private List<Libro> libros;

    /**
     * Constructor que inicializa la lista de libros.
     */
    public GestionLibro() {
        libros = new ArrayList<>();
    }

    /**
     * Registra un nuevo libro físico en el sistema.
     */
    public void registrarLibroFisico(String titulo, String autor, String genero, int anioPublicacion, Estado estado,
                                     int paginas, String ubicacion, String editorial) {

        LibroFisico libro = new LibroFisico(titulo,autor,genero,anioPublicacion, estado, paginas, ubicacion, editorial);
        libros.add(libro);
        System.out.println("Libro físico registrado.");
    }

    /**
     * Registra un libro digital.
     */
    public void registrarLibroDigital(String titulo, String autor, String genero, int anioPublicacion, Estado estado,
                                      Formato formato, String linkDescarga) {
        LibroDigital libro = new LibroDigital(titulo, autor, genero, anioPublicacion,estado, formato, linkDescarga);
        libros.add(libro);
        System.out.println("Libro digital registrado.");
    }

    /**
     * Registra un libro de referencia (solo consulta).
     */
    public void registrarLibroReferencia(String titulo, String autor, String genero, int anioPublicacion, Estado estado, String referencia) {
        LibroReferencia libro = new LibroReferencia(titulo, autor, genero, anioPublicacion, estado,referencia);
        libros.add(libro);
        System.out.println("Libro de referencia registrado.");
    }

    /**
     * Muestra en consola todos los libros registrados.
     */
    public void mostrarLibros() {
        for (Libro libro : libros) {
            libro.mostrarInformacion();
        }
    }

    /**
     * Busca un libro por título.
     */
    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Devuelve la lista de libros registrados.
     */
    public List<Libro> obtenerLibros() {
        return libros;
    }
}

