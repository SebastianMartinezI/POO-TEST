package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Empleado {
    public List<Empleado>listEmpleado;

    public Administrador(String nombre, String apellido, String cedula, String correo, String id) {
        super(nombre, apellido, cedula, correo, id);
        this.listEmpleado = new ArrayList<>();
    }

    public void registrarEmpleado(Empleado empleado) {
        listEmpleado.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        for (int i = 0; i <= listEmpleado.size(); i++) {
            if (listEmpleado.get(i).getId().equals(empleado.getId())) {
                listEmpleado.remove(i);
            }
        }
    }

    public void modificarEmpleado(Empleado empleado) {
        for (int i = 0; i <= listEmpleado.size(); i++) {
            if (listEmpleado.get(i).getId().equals(empleado.getId())) {
                listEmpleado.set(i, empleado);
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
        return listEmpleado;
    }

    public void setListEmpleado(List<Empleado> listEmpleado) {
        this.listEmpleado = listEmpleado;
    }
}
