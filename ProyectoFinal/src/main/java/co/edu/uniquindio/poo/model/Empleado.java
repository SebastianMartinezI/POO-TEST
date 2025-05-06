package co.edu.uniquindio.poo.model;

public class Empleado extends Persona {
    private String id;

    public Empleado(String nombre, String apellido, String cedula, String correo, String id) {
        super(nombre, apellido, cedula, correo);
        this.id = id;
    }

    @Override
    public int obtenerdiasprestamo() {
        int diasPrestamo =15;
        return diasPrestamo;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
