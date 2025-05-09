package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Prestamo {
    private Persona usuario;
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;


    /**
     * Constructor que crea un nuevo préstamo con duración estándar (7 días).
     *
     * @param usuario Usuario que realiza el préstamo.
     * @param libro   Libro prestado.
     */
    public Prestamo(Persona usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucion = fechaPrestamo.plusDays(7); // Duración estándar de préstamo
    }

    /**
     * Obtiene el usuario asociado al préstamo.
     *
     * @return Usuario que tomó el préstamo.
     */
    public Persona getUsuario() {
        return usuario;
    }

    /**
     * Obtiene el libro prestado.
     *
     * @return Libro en préstamo.
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * Obtiene la fecha en que se realizó el préstamo.
     *
     * @return Fecha del préstamo.
     */
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * Obtiene la fecha límite para la devolución del libro.
     *
     * @return Fecha de devolución esperada.
     */
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * Muestra los detalles del préstamo en consola.
     */
    public void mostrarInformacion() {
        System.out.println("Préstamo:");
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Fecha de préstamo: " + fechaPrestamo);
        System.out.println("Fecha de devolución: " + fechaDevolucion);
        System.out.println();
    }
}
