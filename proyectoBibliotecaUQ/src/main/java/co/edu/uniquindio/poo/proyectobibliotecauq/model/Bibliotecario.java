package co.edu.uniquindio.poo.proyectobibliotecauq.model;

public class Bibliotecario extends Empleado {
    private GestionLibro gestionLibro;
    private GestionUsuario gestionUsuario;
    private GestionPrestamo gestionPrestamo;

    /**
     * Constructor de bibliotecario.
     */
    public Bibliotecario(String nombre, String usuario, String contrasena,
                         GestionLibro gestionLibro,
                         GestionUsuario cgestionUsuario,
                         GestionPrestamo gestionPrestamo) {
        super(nombre, usuario, contrasena);
        this.gestionLibro = gestionLibro;
        this.gestionUsuario = gestionUsuario;
        this.gestionPrestamo = gestionPrestamo;
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Bibliotecario");
    }

    public void registrarLibroFisico(String titulo, String autor, String genero, int anioPublicacion, Estado estado,
                                     int paginas, String ubicacion, String editorial) {
        gestionLibro.registrarLibroFisico(titulo, autor, genero, anioPublicacion, estado, paginas, ubicacion, editorial);
    }
    public void registrarLibroDigital(String titulo, String autor, String genero, int anioPublicacion, Estado estado,
                                      Formato formato, String linkDescarga) {
        gestionLibro.registrarLibroDigital(titulo, autor, genero, anioPublicacion, estado, formato, linkDescarga);
    }

    public void registrarLibroReferencia(String titulo, String autor, String genero, int anioPublicacion, Estado estado, String referencia) {
        gestionLibro.registrarLibroReferencia(titulo, autor, genero, anioPublicacion, estado, referencia);
    }

    public boolean prestarLibro(Persona usuario, Libro libro) {
        return gestionPrestamo.prestarLibro(usuario, libro);
    }

    public boolean devolverLibro(Libro libro) {
        return gestionPrestamo.devolverLibro(libro);
    }

    public void registrarUsuarioEstudiante(String nombre, String apellido, String cedula, String correo, int limitePrestamos ,String id) {
        gestionUsuario.registrarEstudiante(nombre, apellido, cedula, correo, limitePrestamos , id);
    }
    public void registrarDocente(String nombre, String apellido, String cedula, String correo,  int limitePrestamos, String id) {
        gestionUsuario.registrarDocente(nombre, apellido, cedula, correo, limitePrestamos, id);
    }
    public void registrarVisitante(String nombre, String apellido, String cedula, String correo,  int limitePrestamos,String id) {
        gestionUsuario.registrarVisitante(nombre, apellido, cedula, correo, limitePrestamos, id);
    }
    public void mostrarPrestamos() {
        gestionPrestamo.mostrarPrestamosActivos();
    }
}

