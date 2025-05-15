package co.edu.uniquindio.poo.proyectobibliotecauq.model;

//La clase Persona hace referencia a la clase base para Persona
public  abstract class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;
    private int limitePrestamos;


    public Persona(String nombre, String apellido, String cedula, String correo, int limitePrestamos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.limitePrestamos = limitePrestamos;
    }

    //Metodo abstracto para definir duración máxima de préstamos
    public  abstract int obtenerDiasPrestamo();

    public abstract void mostrarInformacion();

    //Metodo abstracto para definir limites de prestamo por tipo de usuario
    public  abstract int getLimitePrestamos();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
