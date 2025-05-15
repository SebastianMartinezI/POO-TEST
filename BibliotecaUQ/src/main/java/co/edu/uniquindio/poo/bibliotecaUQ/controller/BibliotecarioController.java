package co.edu.uniquindio.poo.bibliotecaUQ.controller;

import co.edu.uniquindio.poo.bibliotecaUQ.model.ControladorLibro;
import co.edu.uniquindio.poo.bibliotecaUQ.model.ControladorUsuario;
import co.edu.uniquindio.poo.bibliotecaUQ.model.ControladorPrestamo;
import co.edu.uniquindio.poo.bibliotecaUQ.model.Libro;
import co.edu.uniquindio.poo.bibliotecaUQ.model.Persona;

/**
 * Controlador para el rol de Bibliotecario.
 * Permite registrar libros, usuarios y gestionar préstamos y devoluciones.
 */
public class BibliotecarioController {

    private final ControladorLibro controladorLibro;
    private final ControladorUsuario controladorUsuario;
    private final ControladorPrestamo controladorPrestamo;

    /**
     * Constructor que recibe los controladores correspondientes.
     */
    public BibliotecarioController(ControladorLibro controladorLibro,
                                   ControladorUsuario controladorUsuario,
                                   ControladorPrestamo controladorPrestamo) {
        this.controladorLibro = controladorLibro;
        this.controladorUsuario = controladorUsuario;
        this.controladorPrestamo = controladorPrestamo;
    }

    /**
     * Registra un libro físico, digital o de referencia.
     */
    public void registrarLibro(Libro libro) {
        controladorLibro.registrarLibroDigital(libro);
        controladorLibro.registrarLibroFisico(libro);
        controladorLibro.registrarLibroReferencia(libro);

    }

    /**
     * Registra un nuevo usuario en el sistema (estudiante, docente, visitante).
     */
    public void registrarUsuario(Persona persona) {
        controladorUsuario.registrarDocente(persona);
        controladorUsuario.registrarEstudiante(persona);
        controladorUsuario.registrarVisitante(persona);
    }

    /**
     * Realiza un préstamo de libro a un usuario.
     */
    public boolean prestarLibro(Persona persona, Libro libro) {
        return controladorPrestamo.prestarLibro(persona, libro);
    }

    /**
     * Registra la devolución de un libro.
     */
    public boolean devolverLibro(Libro libro) {
        return controladorPrestamo.devolverLibro(libro);
    }

    /**
     * Muestra en consola todos los préstamos activos en el sistema.
     */
    public void mostrarPrestamosActivos() {
        controladorPrestamo.mostrarPrestamosActivos();
    }
}