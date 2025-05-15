package co.edu.uniquindio.poo.proyectobibliotecauq.model;

public class Visitante extends Persona {
    private String id;

    public Visitante(String nombre, String apellido, String cedula, String correo,  int limitePrestamos,String id) {
        super(nombre, apellido, cedula, correo, limitePrestamos);
        this.id = id;
    }
    @Override
    public int obtenerDiasPrestamo() {
        int diasPrestamos  = 0;
        return diasPrestamos;
    }

    @Override
    public void mostrarInformacion() {

    }

    @Override
    public int getLimitePrestamos() {
        int limitePrestamos  = 0;
        return limitePrestamos;
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
