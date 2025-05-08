package co.edu.uniquindio.poo.model;

public abstract class Empleado extends Usuario {
    private String id;

    public Empleado(String nombre, String apellido, String cedula, String correo, int limitePrestamos, String id) {
        super(nombre, apellido, cedula, correo,limitePrestamos);
        this.id = id;
    }

    public abstract void mostrarRol();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
