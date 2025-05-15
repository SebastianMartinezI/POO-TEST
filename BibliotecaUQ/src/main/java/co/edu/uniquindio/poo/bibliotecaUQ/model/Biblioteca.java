package co.edu.uniquindio.poo.bibliotecaUQ.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public String nombre;
    public String ubicacion;
    public List<Libro> listLibro;
    public List<LibroFisico> listLibroFisico;
    public List<LibroDigital> listLibroDigital;
    public List<Persona> listpersona;
    public List<Empleado> listEmpleado;
    public List<Estudiante> listEstudiante;
    public List<Docente> listDocente;
    public List<Visitante> listVisitante;
    public List<Administrador> listAdministrador;
    public List<Bibliotecario> listBibliotecario;

    public Biblioteca(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.listLibro = new ArrayList<>();
        this.listLibroFisico = new ArrayList<>();
        this.listLibroDigital = new ArrayList<>();
        this.listpersona = new ArrayList<>();
        this.listEmpleado = new ArrayList<>();
        this.listEstudiante = new ArrayList<>();
        this.listDocente = new ArrayList<>();
        this.listVisitante = new ArrayList<>();
        this.listAdministrador = new ArrayList<>();
        this.listBibliotecario = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {
        listLibro.add(libro);
    }
    public void registrarLibroFisico(LibroFisico libroFisico) {
        listLibroFisico.add(libroFisico);
    }
    public void registrarLibroDigital(LibroDigital libroDigital) {
        listLibroDigital.add(libroDigital);
    }

    public void registrarPersona(Persona persona) {
        listpersona.add(persona);
    }
    public void registrarEmpleado(Empleado empleado) {
        listEmpleado.add(empleado);
    }
    public void registrarEstudiante(Estudiante estudiante) {
        listEstudiante.add(estudiante);
    }
    public void registrarDocente(Docente docente) {
        listDocente.add(docente);
    }
    public void registrarVisitante(Visitante visitante) {
        listVisitante.add(visitante);
    }
    public void registrarAdministrador(Administrador administrador) {
        listAdministrador.add(administrador);
    }
    public void registrarBibliotecario(Bibliotecario bibliotecario) {
        listBibliotecario.add(bibliotecario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
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

    public List<Persona> getListpersona() {
        return listpersona;
    }

    public void setListpersona(List<Persona> listpersona) {
        this.listpersona = listpersona;
    }

    public List<Empleado> getListEmpleado() {
        return listEmpleado;
    }

    public void setListEmpleado(List<Empleado> listEmpleado) {
        this.listEmpleado = listEmpleado;
    }

    public List<Estudiante> getListEstudiante() {
        return listEstudiante;
    }

    public void setListEstudiante(List<Estudiante> listEstudiante) {
        this.listEstudiante = listEstudiante;
    }

    public List<Docente> getListDocente() {
        return listDocente;
    }

    public void setListDocente(List<Docente> listDocente) {
        this.listDocente = listDocente;
    }

    public List<Visitante> getListVisitante() {
        return listVisitante;
    }

    public void setListVisitante(List<Visitante> listVisitante) {
        this.listVisitante = listVisitante;
    }

    public List<Administrador> getListAdministrador() {
        return listAdministrador;
    }

    public void setListAdministrador(List<Administrador> listAdministrador) {
        this.listAdministrador = listAdministrador;
    }

    public List<Bibliotecario> getListBibliotecario() {
        return listBibliotecario;
    }

    public void setListBibliotecario(List<Bibliotecario> listBibliotecario) {
        this.listBibliotecario = listBibliotecario;
    }
}
