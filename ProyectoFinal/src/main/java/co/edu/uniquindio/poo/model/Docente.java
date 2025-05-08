package co.edu.uniquindio.poo.model;

public class Docente extends Usuario {
    public String id;

    public Docente(String nombre, String apellido, String cedula, String correo,  int limitePrestamos, String id) {
        super(nombre, apellido, cedula, correo, limitePrestamos);
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
