package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class ControladorEmpleado {
    private List<Empleado> empleados;

    /**
     * Constructor que inicializa la lista de empleados.
     */
    public ControladorEmpleado() {
        empleados = new ArrayList<>();
    }

    /**
     * Registra un nuevo empleado en el sistema si el usuario no existe.
     */
    public void registrarEmpleado(String nombre, String usuario, String contrasena, TipoEmpleado tipo) {
        if (buscarEmpleado(usuario) != null) {
            System.out.println("Ya existe un empleado con ese usuario.");
            return;
        }

        Empleado nuevo;
        switch (tipo) {
            case ADMINISTRADOR:
                nuevo = new Administrador(nombre, usuario, contrasena);
                break;
            case BIBLIOTECARIO:
                nuevo = new Bibliotecario(nombre, usuario, contrasena, null, null, null);
                break;
            default:
                System.out.println("Tipo de empleado no válido.");
                return;
        }

        empleados.add(nuevo);
        System.out.println("Empleado registrado correctamente.");
    }

    /**
     * Elimina un empleado según su nombre de usuario.
     */
    public void eliminarEmpleado(String usuario) {
        Empleado e = buscarEmpleado(usuario);
        if (e != null) {
            empleados.remove(e);
            System.out.println("Empleado eliminado: " + usuario);
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    /**
     * Busca un empleado en la lista por su nombre de usuario.
     */
    public Empleado buscarEmpleado(String usuario) {
        for (Empleado e : empleados) {
            if (e.getUsuario().equals(usuario)) {
                return e;
            }
        }
        return null;
    }

    /**
     * Autentica un empleado mediante su usuario y contraseña.
     */
    public Empleado autenticar(String usuario, String contrasena) {
        Empleado e = buscarEmpleado(usuario);
        if (e != null && e.getContrasena().equals(contrasena)) {
            System.out.println("Bienvenido, " + e.getNombre());
            return e;
        }
        System.out.println("Usuario o contraseña incorrectos.");
        return null;
    }

    /**
     * Muestra todos los empleados registrados con su rol.
     */
    public void mostrarEmpleados() {
        for (Empleado e : empleados) {
            System.out.println("Usuario: " + e.getUsuario() + " | Nombre: " + e.getNombre());
            e.mostrarRol();
        }
    }

    /**
     * Devuelve la lista de empleados
     */
    public List<Empleado> obtenerEmpleados() {
        return empleados;
    }
}
