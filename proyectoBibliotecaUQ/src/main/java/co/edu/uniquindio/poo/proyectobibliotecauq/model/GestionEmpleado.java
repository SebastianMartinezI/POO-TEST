package co.edu.uniquindio.poo.proyectobibliotecauq.model;

import java.util.List;

public interface GestionEmpleado {
    boolean registrarEmpleado(String nombre, String usuario, String contrasena, TipoEmpleado tipo);

    boolean eliminarEmpleado(String usuario);

    Empleado buscarEmpleado(String usuario);

    Empleado autenticar(String usuario, String contrasena);

    void mostrarEmpleados();

    void modificarEmpleado(Empleado empleado);

    List<Empleado> obtenerEmpleados();
}

