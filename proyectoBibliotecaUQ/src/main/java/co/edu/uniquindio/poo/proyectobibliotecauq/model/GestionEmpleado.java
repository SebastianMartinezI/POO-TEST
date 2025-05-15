package co.edu.uniquindio.poo.proyectobibliotecauq.model;

import java.util.ArrayList;
import java.util.List;

public class GestionEmpleado {
    private List<Empleado> empleados;

    /**
     * Constructor que inicializa la lista de empleados.
     */
    public GestionEmpleado() {
        this.empleados = empleados;
    }

    /**
     * Registra un nuevo empleado en el sistema si el usuario no existe.
     */
    public boolean registrarEmpleado(String nombre, String usuario, String contrasena, TipoEmpleado tipo) {
        if (buscarEmpleado(usuario) != null) {
            System.out.println("Ya existe un empleado con ese usuario.");
        }

        Empleado nuevo;

        if (tipo == TipoEmpleado.ADMINISTRADOR) {
            nuevo = new Administrador(nombre, usuario, contrasena);
            empleados.add(nuevo);
        } else if (tipo == TipoEmpleado.BIBLIOTECARIO) {
            nuevo = new Bibliotecario(nombre, usuario, contrasena, null, null, null);
            empleados.add(nuevo);
        } else {
            System.out.println("Tipo de empleado no válido.");
        }

        System.out.println("Empleado registrado correctamente.");
    return true;
    }


    /**
     * Elimina un empleado según su nombre de usuario.
     */
    public boolean eliminarEmpleado(String usuario) {
        Empleado empleado = buscarEmpleado(usuario);
        if (empleado != null) {
            empleados.remove(empleado);
            System.out.println("Empleado eliminado: " + usuario);
        } else {
            System.out.println("Empleado no encontrado.");
        }
        return true;
    }

    /**
     * Busca un empleado en la lista por su nombre de usuario.
     */
    public Empleado buscarEmpleado(String usuario) {
        for (Empleado empleado : empleados) {
            if (empleado.getUsuario().equals(usuario)) {
                return empleado;
            }
        }
        return null;
    }

    /**
     * Autentica un empleado mediante su usuario y contraseña.
     */
    public Empleado autenticar(String usuario, String contrasena) {
        Empleado empleado = buscarEmpleado(usuario);
        if (empleado != null && empleado.getContrasena().equals(contrasena)) {
            System.out.println("Bienvenido, " + empleado.getNombre());
            return empleado;
        }
        System.out.println("Usuario o contraseña incorrectos.");
        return null;
    }

    /**
     * Muestra todos los empleados registrados con su rol.
     */
    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println("Usuario: " + empleado.getUsuario() + " | Nombre: " + empleado.getNombre());
            empleado.mostrarRol();
        }
    }

    /**
     * Modifica la informacion de un empleado que ya este registrado.
     */
    public void modificarEmpleado(Empleado empleado) {
        for (int i = 0; i <= empleados.size(); i++) {
            if (empleados.get(i).getUsuario().equals(empleado.getUsuario())) {
                empleados.set(i, empleado);
            }
        }
    }

    /**
     * Devuelve la lista de empleados
     */
    public List<Empleado> obtenerEmpleados() {
        return empleados;
    }
}
