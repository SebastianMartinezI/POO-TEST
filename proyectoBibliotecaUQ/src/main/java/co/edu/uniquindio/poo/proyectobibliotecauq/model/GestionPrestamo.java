package co.edu.uniquindio.poo.proyectobibliotecauq.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public interface GestionPrestamo {

    boolean prestarLibro(Persona persona, Libro libro);

    boolean devolverLibro(Libro libro);

    List<Prestamo> obtenerDevolucionesTardias();

    int contarPrestamosActivos(Persona usuario);

    void mostrarPrestamosActivos();

    List<Prestamo> obtenerPrestamos();
}

