package co.edu.uniquindio.poo.model;

public class Visitante extends Usuario {
    private String id;

    public Visitante(String nombre, String apellido, String cedula, String correo,  int limitePrestamos,String id) {
        super(nombre, apellido, cedula, correo, limitePrestamos);
        this.id = id;
    }
    @Override
    public int obtenerdiasprestamo() {
        int diasPrestamos  = 0;
        return diasPrestamos;
    }
    public int getLimiteLibros(){
        int limiteLibros = 0;
        return limiteLibros;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
