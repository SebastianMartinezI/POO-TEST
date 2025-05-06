package co.edu.uniquindio.poo.model;

public class Estudiante extends Persona {
    private String id;

    public Estudiante(String nombre, String apellido, String cedula, String correo, String id) {
        super(nombre, apellido, cedula, correo);
        this.id = id;
    }


    @Override
    public int obtenerdiasprestamo() {
        int diasPrestamo = 5;
        return diasPrestamo;
    }

    @Override
    //Metodo abstracto para definir limites de prestamo por tipo de usuario
    public int getLimiteLibros(){
        int limiteLibros = 3;
        return limiteLibros;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
