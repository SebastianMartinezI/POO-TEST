package co.edu.uniquindio.poo.bibliotecaUQ.controller;

import co.edu.uniquindio.poo.bibliotecaUQ.model.ControladorEmpleado;
import co.edu.uniquindio.poo.bibliotecaUQ.model.TipoEmpleado;
import co.edu.uniquindio.poo.bibliotecaUQ.model.Empleado;

/**
 * Controlador para el rol de Administrador del sistema.
 * Permite gestionar empleados y autenticación.
 */
public class AdministradorController {

    private final ControladorEmpleado controladorEmpleado;

    /**
     * Constructor que recibe el controlador de empleados.
     */
    public AdministradorController(ControladorEmpleado controladorEmpleado) {
        this.controladorEmpleado = controladorEmpleado;
    }

    /**
     * Registra un nuevo empleado (administrador o bibliotecario).
     */
    public boolean registrarEmpleado(String nombre, String usuario, String contrasena, TipoEmpleado tipo) {
        return controladorEmpleado.registrarEmpleado(nombre, usuario, contrasena, tipo);
    }

    /**
     * Elimina un empleado por su nombre de usuario.
     */
    public boolean eliminarEmpleado(String usuario) {
        return controladorEmpleado.eliminarEmpleado(usuario);
    }

    /**
     * Muestra en consola todos los empleados registrados.
     */
    public void listarEmpleados() {
        controladorEmpleado.mostrarEmpleados();
    }

    /**
     * Autentica un empleado para iniciar sesión.
     */
    public Empleado autenticar(String usuario, String contrasena) {
        return controladorEmpleado.autenticar(usuario, contrasena);
    }

}