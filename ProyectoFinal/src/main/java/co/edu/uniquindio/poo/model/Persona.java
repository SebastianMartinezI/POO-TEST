package co.edu.uniquindio.poo.model;
// Clase base para todos los usuarios

public  abstract class  Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;

    public Persona(String nombre, String apellido, String cedula, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
    }

    //Metodo abstracto para definir duración máxima de préstamos
    public  abstract int obtenerdiasprestamo();

    //Metodo abstracto para definir limites de prestamo por tipo de usuario
    public  abstract int getLimiteLibros();

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
