package co.edu.uniquindio.poo.bibliotecaUQ.model;

import java.util.ArrayList;
import java.util.List;

public class ControladorUsuario {
    private List<Persona> listUsuarios;

    /**
     * Constructor que inicializa la lista de usuarios.
     */
    public ControladorUsuario() {
        listUsuarios = new ArrayList<>();
    }

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

