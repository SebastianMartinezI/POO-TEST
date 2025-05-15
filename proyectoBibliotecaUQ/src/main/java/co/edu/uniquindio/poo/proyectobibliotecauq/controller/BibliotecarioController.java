package co.edu.uniquindio.poo.proyectobibliotecauq.controller;

import co.edu.uniquindio.poo.proyectobibliotecauq.model.*;

/**
 * Controlador para el rol de Bibliotecario.
 * Permite registrar libros, usuarios y gestionar préstamos y devoluciones.
 */
public class BibliotecarioController {

    private final GestionLibro gestionLibro;
    private final GestionUsuario gestionUsuario;
    private final GestionPrestamo gestionPrestamo;

    /**
     * Constructor que recibe los controladores correspondientes.
     */
    public BibliotecarioController(GestionLibro gestionLibro,
                                   GestionUsuario gestionUsuario,
                                   GestionPrestamo gestionPrestamo) {
        this.gestionLibro = gestionLibro;
        this.gestionUsuario = gestionUsuario;
        this.gestionPrestamo = gestionPrestamo;
    }

    /**
     * Registra un libro físico, digital o de referencia.
     */
    public void registrarLibro(Libro libro) {
        gestionLibro.registrarLibroDigital(libro);
        gestionLibro.registrarLibroFisico(libro);
        gestionLibro.registrarLibroReferencia(libro);

    }

    /**
     * Registra un nuevo usuario en el sistema (estudiante, docente, visitante).
     */
    public void registrarUsuario(Persona persona) {
        gestionUsuario.registrarDocente(persona);
        gestionUsuario.registrarEstudiante(persona);
        gestionUsuario.registrarVisitante(persona);
    }

    /**
     * Realiza un préstamo de libro a un usuario.
     */
    public boolean prestarLibro(Persona persona, Libro libro) {
        return gestionPrestamo.prestarLibro(persona, libro);
    }

    /**
     * Registra la devolución de un libro.
     */
    public boolean devolverLibro(Libro libro) {
        return gestionPrestamo.devolverLibro(libro);
    }

    /**
     * Muestra en consola todos los préstamos activos en el sistema.
     */
    public void mostrarPrestamosActivos() {
        gestionPrestamo.mostrarPrestamosActivos();
    }
}