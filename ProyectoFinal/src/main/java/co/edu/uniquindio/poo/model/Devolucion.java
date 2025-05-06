package co.edu.uniquindio.poo.model;

public class Devolucion {
    private String fechaDevolucion;

    public Devolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void actualizarEstado() {

    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
