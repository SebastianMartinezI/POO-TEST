package co.edu.uniquindio.poo.bibliotecaUQ.model;

public class Bibliotecario extends Empleado {
    private ControladorLibro controladorLibro;
    private ControladorUsuario controladorUsuario;
    private ControladorPrestamo controladorPrestamo;

    /**
     * Constructor de bibliotecario.
     */
    public Bibliotecario(String nombre, String usuario, String contrasena,
                         ControladorLibro controladorLibro,
                         ControladorUsuario controladorUsuario,
                         ControladorPrestamo controladorPrestamo) {
        super(nombre, usuario, contrasena);
        this.controladorLibro = controladorLibro;
        this.controladorUsuario = controladorUsuario;
        this.controladorPrestamo = controladorPrestamo;
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Bibliotecario");
    }

    public void registrarLibroFisico(String titulo, String autor, String genero, int anioPublicacion, Estado estado,
                                     int paginas, String ubicacion, String editorial) {
        controladorLibro.registrarLibroFisico(titulo, autor, genero, anioPublicacion, estado, paginas, ubicacion, editorial);
    }
    public void registrarLibroDigital(String titulo, String autor, String genero, int anioPublicacion, Estado estado,
                                      Formato formato, String linkDescarga) {
        controladorLibro.registrarLibroDigital(titulo, autor, genero, anioPublicacion, estado, formato, linkDescarga);
    }

    public void registrarLibroReferencia(String titulo, String autor, String genero, int anioPublicacion, Estado estado, String referencia) {
        controladorLibro.registrarLibroReferencia(titulo, autor, genero, anioPublicacion, estado, referencia);
    }

    public boolean prestarLibro(Persona usuario, Libro libro) {
        return controladorPrestamo.prestarLibro(usuario, libro);
    }

    public boolean devolverLibro(Libro libro) {
        return controladorPrestamo.devolverLibro(libro);
    }

    public void registrarUsuarioEstudiante(String nombre, String apellido, String cedula, String correo, int limitePrestamos ,String id) {
        controladorUsuario.registrarEstudiante(nombre, apellido, cedula, correo, limitePrestamos , id);
    }
    public void registrarDocente(String nombre, String apellido, String cedula, String correo,  int limitePrestamos, String id) {
        controladorUsuario.registrarDocente(nombre, apellido, cedula, correo, limitePrestamos, id);
    }
    public void registrarVisitante(String nombre, String apellido, String cedula, String correo,  int limitePrestamos,String id) {
        controladorUsuario.registrarVisitante(nombre, apellido, cedula, correo, limitePrestamos, id);
    }
    public void mostrarPrestamos() {
        controladorPrestamo.mostrarPrestamosActivos();
    }
}

