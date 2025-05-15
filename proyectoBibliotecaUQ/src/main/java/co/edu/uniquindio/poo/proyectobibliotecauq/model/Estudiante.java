package co.edu.uniquindio.poo.proyectobibliotecauq.model;

public class Estudiante extends Persona {
    private String id;

    public Estudiante(String nombre, String apellido, String cedula, String correo, int limitePrestamos ,String id) {
        super(nombre, apellido, cedula, correo, limitePrestamos);
        this.id = id;
    }


    @Override
    public int obtenerDiasPrestamo() {
        int diasPrestamo = 5;
        return diasPrestamo;
    }

    @Override
    public void mostrarInformacion() {

    }

    @Override
    public int getLimitePrestamos() {
        int prestamos = 2;
        return prestamos;
    }
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
