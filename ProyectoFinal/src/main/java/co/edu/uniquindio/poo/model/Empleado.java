package co.edu.uniquindio.poo.model;

public abstract class Empleado {
    protected String nombre;
    protected String usuario;
    protected String contrasena;

    public Empleado(String nombre, String usuario, String contrasena) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
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
}