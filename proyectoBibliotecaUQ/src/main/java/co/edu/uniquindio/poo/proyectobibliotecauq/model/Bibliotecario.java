package co.edu.uniquindio.poo.proyectobibliotecauq.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bibliotecario extends Empleado implements GestionLibro, GestionUsuario, GestionPrestamo {

    private GestionLibro gestionLibro;
    private GestionUsuario gestionUsuario;
    private GestionPrestamo gestionPrestamo;

    // Constructor
    public Bibliotecario(String nombre, String usuario, String contrasena, TipoEmpleado tipoEmpleado,
                         GestionLibro gestionLibro,
                         GestionUsuario gestionUsuario,
                         GestionPrestamo gestionPrestamo) {
        super(nombre, usuario, contrasena, tipoEmpleado);
        this.gestionLibro = gestionLibro;
        this.gestionUsuario = gestionUsuario;
        this.gestionPrestamo = gestionPrestamo;
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Bibliotecario");
    }

    @Override
    public void agregarBibliotecario(Bibliotecario bibliotecario) {

    }

    // Delegación a gestionLibro

    @Override
    public void registrarLibroFisico(String titulo, String autor, String genero, int anioPublicacion, Estado estado,
                                     int paginas, String ubicacion, String editorial) {
        gestionLibro.registrarLibroFisico(titulo, autor, genero, anioPublicacion, estado, paginas, ubicacion, editorial);
    }

    @Override
    public void registrarLibroDigital(String titulo, String autor, String genero, int anioPublicacion, Estado estado,
                                      Formato formato, String linkDescarga) {
        gestionLibro.registrarLibroDigital(titulo, autor, genero, anioPublicacion, estado, formato, linkDescarga);
    }

    @Override
    public void registrarLibroReferencia(String titulo, String autor, String genero, int anioPublicacion, Estado estado,
                                         String referencia) {
        gestionLibro.registrarLibroReferencia(titulo, autor, genero, anioPublicacion, estado, referencia);
    }

    //public abstract void registrarLibroFisico(LibroFisico libroFisico);

    @Override
    public void mostrarLibros() {
        gestionLibro.mostrarLibros();
    }

    @Override
    public Libro buscarLibroPorTitulo(String titulo) {
        return gestionLibro.buscarLibroPorTitulo(titulo);
    }

    @Override
    public List<Libro> obtenerLibros() {
        return gestionLibro.obtenerLibros();
    }

    // Delegación a gestionUsuario

    @Override
    public void registrarEstudiante(String nombre, String apellido, String cedula, String correo, int limitePrestamos, String id) {
        gestionUsuario.registrarEstudiante(nombre, apellido, cedula, correo, limitePrestamos, id);
    }

    @Override
    public void registrarDocente(String nombre, String apellido, String cedula, String correo, int limitePrestamos, String id) {
        gestionUsuario.registrarDocente(nombre, apellido, cedula, correo, limitePrestamos, id);
    }

    @Override
    public void registrarVisitante(String nombre, String apellido, String cedula, String correo, int limitePrestamos, String id) {
        gestionUsuario.registrarVisitante(nombre, apellido, cedula, correo, limitePrestamos, id);
    }

    @Override
    public Persona buscarUsuarioPorId(String id) {
        return gestionUsuario.buscarUsuarioPorId(id);
    }

    @Override
    public void mostrarUsuarios() {
        gestionUsuario.mostrarUsuarios();
    }

    @Override
    public List<Persona> obtenerUsuarios() {
        return gestionUsuario.obtenerUsuarios();
    }

    // Delegación a gestionPrestamo

    @Override
    public boolean prestarLibro(Persona usuario, Libro libro) {
        return gestionPrestamo.prestarLibro(usuario, libro);
    }

    @Override
    public boolean devolverLibro(Libro libro) {
        return gestionPrestamo.devolverLibro(libro);
    }

    @Override
    public void mostrarPrestamosActivos() {
        gestionPrestamo.mostrarPrestamosActivos();
    }

    @Override
    public List<Prestamo> obtenerDevolucionesTardias() {
        List<Prestamo> devolucionesTardias = new ArrayList<>();
        for (Prestamo prestamo : gestionPrestamo.obtenerPrestamos()) {
            LocalDate fechaPrestamo = prestamo.getFechaPrestamo();
            LocalDate fechaDevolucion = prestamo.getFechaDevolucion();

            if (fechaDevolucion != null && fechaDevolucion.isAfter(fechaPrestamo)) {
                devolucionesTardias.add(prestamo);
            }
        }
        return devolucionesTardias;
    }

    @Override
    public int contarPrestamosActivos(Persona usuario) {
        return gestionPrestamo.contarPrestamosActivos(usuario);
    }

    @Override
    public List<Prestamo> obtenerPrestamos() {
        return gestionPrestamo.obtenerPrestamos();
    }
}
