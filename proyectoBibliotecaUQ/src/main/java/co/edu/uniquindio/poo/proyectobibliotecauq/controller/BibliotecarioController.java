package co.edu.uniquindio.poo.proyectobibliotecauq.controller;

import co.edu.uniquindio.poo.proyectobibliotecauq.model.*;

import java.util.List;

/**
 * Controlador para el rol de Bibliotecario.
 * Permite registrar libros, usuarios y gestionar préstamos y devoluciones.
 */
public class BibliotecarioController {

    private final GestionLibro gestionLibro;
    private final GestionUsuario gestionUsuario;
    private final GestionPrestamo gestionPrestamo;

    public BibliotecarioController(GestionLibro gestionLibro,
                                   GestionUsuario gestionUsuario,
                                   GestionPrestamo gestionPrestamo) {
        this.gestionLibro = gestionLibro;
        this.gestionUsuario = gestionUsuario;
        this.gestionPrestamo = gestionPrestamo;
    }

    // = LIBROS =

    public void registrarLibroFisico(String titulo, String autor, String genero, int anio, Estado estado,
                                     int paginas, String ubicacion, String editorial) {
        LibroFisico libro = new LibroFisico(titulo, autor, genero, anio, estado, paginas, ubicacion, editorial);
        gestionLibro.registrarLibroFisico(titulo, autor, genero, anio, estado, paginas, ubicacion, editorial);
    }

    public void registrarLibroDigital(String titulo, String autor, String genero, int anio, Estado estado,
                                      Formato formato, String link) {
        LibroDigital libro = new LibroDigital(titulo, autor, genero, anio, estado, formato, link);
        gestionLibro.registrarLibroDigital(titulo, autor, genero, anio, estado, formato, link);
    }

    public void registrarLibroReferencia(String titulo, String autor, String genero, int anio, Estado estado,
                                         String referencia) {
        LibroReferencia libro = new LibroReferencia(titulo, autor, genero, anio, estado, referencia);
        gestionLibro.registrarLibroReferencia(titulo, autor, genero, anio, estado, referencia);
    }

    public List<Libro> obtenerLibros() {
        return gestionLibro.obtenerLibros();
    }

    // = USUARIOS =

    public void registrarEstudiante(String nombre, String apellido, String cedula, String correo, int limite, String id) {
        gestionUsuario.registrarEstudiante(nombre, apellido, cedula, correo, limite, id);
    }

    public void registrarDocente(String nombre, String apellido, String cedula, String correo, int limite, String id) {
        gestionUsuario.registrarDocente(nombre, apellido, cedula, correo, limite, id);
    }

    public void registrarVisitante(String nombre, String apellido, String cedula, String correo, int limite, String id) {
        gestionUsuario.registrarVisitante(nombre, apellido, cedula, correo, limite, id);
    }

    public List<Persona> obtenerUsuarios() {
        return gestionUsuario.obtenerUsuarios();
    }

    // = PRÉSTAMOS =

    public boolean prestarLibro(Persona persona, Libro libro) {
        return gestionPrestamo.prestarLibro(persona, libro);
    }

    public boolean devolverLibro(Libro libro) {
        return gestionPrestamo.devolverLibro(libro);
    }

    public List<Prestamo> obtenerPrestamos() {
        return gestionPrestamo.obtenerPrestamos();
    }

    public List<Prestamo> obtenerDevolucionesTardias() {
        return gestionPrestamo.obtenerDevolucionesTardias();
    }

    public void mostrarPrestamosActivos() {
        gestionPrestamo.mostrarPrestamosActivos();
    }
}
