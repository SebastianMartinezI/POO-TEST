package co.edu.uniquindio.poo.model;

public class Docente extends Persona {
    public String id;

    public Docente(String nombre, String apellido, String cedula, String correo, String id) {
        super(nombre, apellido, cedula, correo);
        this.id = id;
    }
    @Override
    public int obtenerdiasprestamo() {
        int diasPrestamo = 10;
        return diasPrestamo;
    }
    @Override
    //Metodo abstracto para definir limites de prestamo por tipo de usuario
    public int getLimiteLibros(){
        int limiteLibros = 5;
        return limiteLibros;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
