package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Prestamo {
    public String fechaPrestamo;
    public List<Libro>listLibro;
    public List<Persona>listPersona;
    public List<Devolucion> listDevolucion;


    public Prestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
        this.listLibro = new ArrayList<>();
        this.listPersona = new ArrayList<>();
        this.listDevolucion = new ArrayList<>();
    }

    public void listarDevoluciones(Devolucion devolucion) {
        listDevolucion.add(devolucion);
    }

    public void esLibrDigital() {
        // Lógica para validar si es libro en línea
    }

    public String cantidadMaximaDias() {
        for (Persona persona : listPersona) {
            String diasMaximos = persona.obtenerdiasprestamo();
            return (persona.getNombre() + " puede prestar libros por " + diasMaximos + " días.");
        }
        return "";
    }



    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public List<Devolucion> getListDevolucion() {
        return listDevolucion;
    }
    public void setListDevolucion(List<Devolucion> listDevolucion) {
        this.listDevolucion = listDevolucion;
    }

}
