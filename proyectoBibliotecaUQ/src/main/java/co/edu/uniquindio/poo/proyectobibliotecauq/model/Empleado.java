package co.edu.uniquindio.poo.proyectobibliotecauq.model;

public abstract class Empleado {
    private String nombre;
    private String usuario;
    private String contrasena;
    private TipoEmpleado tipoEmpleado;

    public Empleado(String nombre, String usuario, String contrasena, TipoEmpleado tipoEmpleado) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.tipoEmpleado = tipoEmpleado;
    }
    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo abstracto para mostrar el rol del empleado.
     */
    public abstract void mostrarRol();

    public abstract void agregarBibliotecario(Bibliotecario bibliotecario);
}