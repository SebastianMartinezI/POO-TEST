package co.edu.uniquindio.poo.proyectobibliotecauq.model;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Empleado implements GestionUsuario, GestionEmpleado {
    public List<Persona> listUsuarios;
    public List<Empleado>empleados;

    public Administrador(String nombre, String usuario, String contrasena, TipoEmpleado tipoEmpleado) {
        super(nombre, usuario, contrasena,tipoEmpleado);
        this.listUsuarios = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    @Override
    public void mostrarRol() {

    }

    @Override
    public void agregarBibliotecario(Bibliotecario bibliotecario) {

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
            nuevo = new Administrador(nombre, usuario, contrasena, getTipoEmpleado()) {
                @Override
                public void mostrarRol() {

                }

                @Override
                public void agregarBibliotecario(Bibliotecario bibliotecario) {

                }
            };
            empleados.add(nuevo);
        } else if (tipo == TipoEmpleado.BIBLIOTECARIO) {
            nuevo = new Bibliotecario(nombre, usuario, contrasena, null, null, null, null) {
                @Override
                public void registrarEstudiante(String nombre, String apellido, String cedula, String correo, int limitePrestamos, String id) {

                }

                @Override
                public Persona buscarUsuarioPorId(String id) {
                    return null;
                }

                @Override
                public void mostrarUsuarios() {

                }

                @Override
                public List<Persona> obtenerUsuarios() {
                    return List.of();
                }

                @Override
                public List<Prestamo> obtenerDevolucionesTardias() {
                    return List.of();
                }

                @Override
                public int contarPrestamosActivos(Persona usuario) {
                    return 0;
                }

                @Override
                public void mostrarPrestamosActivos() {

                }

                @Override
                public List<Prestamo> obtenerPrestamos() {
                    return List.of();
                }

                @Override
                public void registrarLibroFisico(LibroFisico libroFisico) {

                }

                @Override
                public void mostrarLibros() {

                }

                @Override
                public Libro buscarLibroPorTitulo(String titulo) {
                    return null;
                }

                @Override
                public List<Libro> obtenerLibros() {
                    return List.of();
                }

                @Override
                public void agregarBibliotecario(Bibliotecario bibliotecario) {

                }
            };
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

//implementacion de gestion usuario

/**
 * Registra un estudiante en el sistema.
 */
public void registrarEstudiante(String nombre, String apellido, String cedula, String correo, int limitePrestamos ,String id) {
    if (buscarUsuarioPorId(id) != null) {
        System.out.println("Ya existe un usuario con ese ID.");
        return;
    }
    Estudiante estudiante = new Estudiante(nombre, apellido, cedula, correo, limitePrestamos ,id);
    listUsuarios.add(estudiante);
    System.out.println("Estudiante registrado.");
}

/**
 * Registra un docente en el sistema.
 */
public void registrarDocente(String nombre, String apellido, String cedula, String correo,  int limitePrestamos, String id) {
    if (buscarUsuarioPorId(id) != null) {
        System.out.println("Ya existe un usuario con ese ID.");
        return;
    }
    Docente docente = new Docente(nombre, apellido, cedula, correo,  limitePrestamos, id);
    listUsuarios.add(docente);
    System.out.println("Docente registrado.");
}

/**
 * Registra un visitante en el sistema.
 */
public void registrarVisitante(String nombre, String apellido, String cedula, String correo,  int limitePrestamos,String id) {
    if (buscarUsuarioPorId(id) != null) {
        System.out.println("Ya existe un usuario con ese ID.");
        return;
    }
    Visitante visitante = new Visitante(nombre, apellido, cedula, correo, limitePrestamos, id);
    listUsuarios.add(visitante);
    System.out.println("Visitante registrado.");
}

/**
 * Busca un usuario por su ID.
 */
public Persona buscarUsuarioPorId(String id) {
    for (Persona usuario : listUsuarios) {
        if (usuario.getCedula().equalsIgnoreCase(id)) {
            return usuario;
        }
    }
    return null;
}

/**
 * Muestra en consola todos los usuarios registrados.
 */
public void mostrarUsuarios() {
    if (listUsuarios.isEmpty()) {
        System.out.println("No hay usuarios registrados.");
        return;
    }
    for (Persona usuario : listUsuarios) {
        usuario.mostrarInformacion();
    }
}

/**
 * Devuelve la lista completa de usuarios registrados.
 */
public List<Persona> obtenerUsuarios() {
    return listUsuarios;
}
}






