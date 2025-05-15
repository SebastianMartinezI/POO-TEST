package co.edu.uniquindio.poo.bibliotecaUQ.model;

public class Docente extends Persona {
    public String id;

    public Docente(String nombre, String apellido, String cedula, String correo,  int limitePrestamos, String id) {
        super(nombre, apellido, cedula, correo, limitePrestamos);
        this.id = id;
    }
    @Override
    public int obtenerDiasPrestamo() {
        int diasPrestamo = 10;
        return diasPrestamo;
    }

    @Override
    public void mostrarInformacion() {

    }

    @Override
    public int getLimitePrestamos() {
        int prestamos = 5;
        return prestamos;
    }

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
