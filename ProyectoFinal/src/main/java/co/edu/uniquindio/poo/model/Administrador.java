package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Empleado {
    public List<Usuario>listUsuarios;
    public List<Empleado>listEmpleados;

    public Administrador(String nombre, String apellido, String cedula, String correo, int limitePrestamos, String id) {
        super(nombre, apellido, cedula, correo, limitePrestamos ,id);
        this.listUsuarios = new ArrayList<>();
        this.listEmpleados = new ArrayList<>();
    }
    @Override
    public void mostrarRol() {
        System.out.println("Rol: Administrador");
    }

    @Override
    public int obtenerdiasprestamo() {
        return 0;
    }

    public void registrarEmpleado(Empleado empleado) {
        listEmpleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        for (int i = 0; i <= listEmpleados.size(); i++) {
            if (listEmpleados.get(i).getId().equals(empleado.getId())) {
                listEmpleados.remove(i);
            }
        }
    }

    public void modificarEmpleado(Empleado empleado) {
        for (int i = 0; i <= listEmpleados.size(); i++) {
            if (listEmpleados.get(i).getId().equals(empleado.getId())) {
                listEmpleados.set(i, empleado);
            }
        }
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
