package co.edu.uniquindio.poo.proyectobibliotecauq.model;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Empleado {
    public List<Persona> listPersonas;
    public List<Empleado>listEmpleados;

    public Administrador(String nombre, String usuario, String contrasena) {
        super(nombre, usuario, contrasena);
        this.listPersonas = new ArrayList<>();
        this.listEmpleados = new ArrayList<>();
    }
    @Override
    public void mostrarRol() {
        System.out.println("Rol: Administrador");
    }

    public int obtenerdiasprestamo() {
        return 0;
    }

    public void registrarEmpleado(Empleado empleado) {
        listEmpleados.add(empleado);
    }

    public void suspenderEmpleado(Empleado empleado) {
        // Lógica para suspender empleado
    }

    public void manejarExcepciones() {
        // Lógica para manejo de excepciones
    }

    public void generarReportesAvanzados() {
        // Lógica para generar reportes avanzados
    }

    public List<Empleado> getListEmpleado() {
        return listEmpleados;
    }

    public void setListEmpleado(List<Empleado> listEmpleado) {
        this.listEmpleados = listEmpleado;
    }
}

