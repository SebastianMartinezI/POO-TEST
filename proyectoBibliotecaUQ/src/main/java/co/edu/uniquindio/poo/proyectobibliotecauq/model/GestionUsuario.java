package co.edu.uniquindio.poo.proyectobibliotecauq.model;

import java.util.ArrayList;
import java.util.List;

public interface GestionUsuario {

    void registrarEstudiante(String nombre, String apellido, String cedula, String correo, int limitePrestamos, String id);

    void registrarDocente(String nombre, String apellido, String cedula, String correo, int limitePrestamos, String id);

    void registrarVisitante(String nombre, String apellido, String cedula, String correo, int limitePrestamos, String id);

    Persona buscarUsuarioPorId(String id);

    void mostrarUsuarios();

    List<Persona> obtenerUsuarios();
}
