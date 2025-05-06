package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Bibliotecario extends Empleado {
    public List<Libro>listLibro;
    public List<LibroFisico>listLibroFisico;
    public List<LibroDigital>listLibroDigital;
    public List<Prestamo>listPrestamo;

    public Bibliotecario(String nombre, String apellido, String cedula, String correo, String id) {
        super(nombre, apellido, cedula, correo, id);
        this.listLibro = new ArrayList<>();
        this.listLibroFisico = new ArrayList<>();
        this.listLibroDigital = new ArrayList<>();
        this.listPrestamo = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {
        listLibro.add(libro);
    }
    public void registrarLibroFisico(LibroFisico librofisico) {
        listLibroFisico.add(librofisico);
    }
    public void registrarLibroDigital(LibroDigital librodigital ) {
        listLibroDigital.add(librodigital);
    }

    public void registrarPrestamo(Prestamo prestamo) {
       listPrestamo.add(prestamo);
    }

    public List<Libro> getListLibro() {
        return listLibro;
    }

    public void setListLibro(List<Libro> listLibro) {
        this.listLibro = listLibro;
    }

    public List<LibroFisico> getListLibroFisico() {
        return listLibroFisico;
    }

    public void setListLibroFisico(List<LibroFisico> listLibroFisico) {
        this.listLibroFisico = listLibroFisico;
    }

    public List<LibroDigital> getListLibroDigital() {
        return listLibroDigital;
    }

    public void setListLibroDigital(List<LibroDigital> listLibroDigital) {
        this.listLibroDigital = listLibroDigital;
    }

    public List<Prestamo> getListPrestamo() {
        return listPrestamo;
    }

    public void setListPrestamo(List<Prestamo> listPrestamo) {
        this.listPrestamo = listPrestamo;
    }
}
