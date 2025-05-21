package co.edu.uniquindio.poo.proyectobibliotecauq.model;

import java.util.ArrayList;
import java.util.List;

public interface GestionLibro {

    void registrarLibroFisico(String titulo, String autor, String genero, int anioPublicacion, Estado estado,
                              int paginas, String ubicacion, String editorial);

    void registrarLibroDigital(String titulo, String autor, String genero, int anioPublicacion, Estado estado,
                               Formato formato, String linkDescarga);

    void registrarLibroReferencia(String titulo, String autor, String genero, int anioPublicacion, Estado estado,
                                  String referencia);

    void mostrarLibros();

    Libro buscarLibroPorTitulo(String titulo);

    List<Libro> obtenerLibros();
}

