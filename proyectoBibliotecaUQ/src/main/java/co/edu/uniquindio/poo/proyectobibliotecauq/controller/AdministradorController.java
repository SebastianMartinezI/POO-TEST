package co.edu.uniquindio.poo.proyectobibliotecauq.controller;


import co.edu.uniquindio.poo.proyectobibliotecauq.App;
import co.edu.uniquindio.poo.proyectobibliotecauq.model.Empleado;
import co.edu.uniquindio.poo.proyectobibliotecauq.model.GestionEmpleado;
import co.edu.uniquindio.poo.proyectobibliotecauq.model.TipoEmpleado;

/**
 * Controlador para el rol de Administrador del sistema.
 * Permite gestionar empleados y autenticación.
 */
public class AdministradorController {

    public final GestionEmpleado gestionEmpleado;

    /**
     * Constructor que recibe el controlador de empleados.
     */
    public AdministradorController(GestionEmpleado gestionEmpleado) {
        this.gestionEmpleado = gestionEmpleado;
    }

    /**
     * Registra un nuevo empleado (administrador o bibliotecario).
     */
    public boolean registrarEmpleado(String nombre, String usuario, String contrasena, TipoEmpleado tipo) {
        return gestionEmpleado.registrarEmpleado(nombre, usuario, contrasena, tipo);
    }

    /**
     * Elimina un empleado por su nombre de usuario.
     */
    public boolean eliminarEmpleado(String usuario) {
        return gestionEmpleado.eliminarEmpleado(usuario);
    }

    /**
     * Muestra en consola todos los empleados registrados.
     */
    public void listarEmpleados() {
        gestionEmpleado.mostrarEmpleados();
    }

    /**
     * Autentica un empleado para iniciar sesión.
     */
    public Empleado autenticar(String usuario, String contrasena) {
        return gestionEmpleado.autenticar(usuario, contrasena);
    }

    public void setApp(App app) {
    }
}