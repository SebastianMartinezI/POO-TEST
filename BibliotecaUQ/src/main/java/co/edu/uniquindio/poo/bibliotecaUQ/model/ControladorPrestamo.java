package co.edu.uniquindio.poo.bibliotecaUQ.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ControladorPrestamo {
        private List<Prestamo> listPrestamos;

        public boolean prestarLibro(Persona persona, Libro libro) {
            if (!libro.estaDisponible()) {
                System.out.println("El libro no está disponible.");
                return false;
            }

            int prestamosUsuario = contarPrestamosActivos(persona);
            if (prestamosUsuario >= persona.getLimitePrestamos()) {
                System.out.println("El usuario ha alcanzado su límite de préstamos.");
                return false;
            }

            Prestamo prestamo = new Prestamo(persona, libro);
            listPrestamos.add(prestamo);
            System.out.println("Préstamo registrado con éxito.");
            return true;
        }

        /**
         * Registra la devolución de un libro.
         */
        public boolean devolverLibro(Libro libro) {
            for (Prestamo prestamo : listPrestamos) {
                if (prestamo.getLibro().equals(libro)) {
                    libro.devolver();
                    listPrestamos.remove(prestamo);
                    System.out.println("Libro devuelto con éxito.");
                    return true;
                }
            }
            System.out.println("El libro no estaba prestado.");
            return false;
        }

    /**
     * Devuelve una lista de los préstamos que fueron devueltos después de la fecha límite.
     */
    public List<Prestamo> obtenerDevolucionesTardias() {
        List<Prestamo> devolucionesTardias = new ArrayList<>();


        for (Prestamo prestamo : listPrestamos) {
            LocalDate fechaPrestamo = prestamo.getFechaPrestamo();
            LocalDate fechaDevolucion = prestamo.getFechaDevolucion();

            int anioPrestamo = fechaPrestamo.getYear();
            int mesPrestamo = fechaPrestamo.getMonthValue();
            int diaPrestamo = fechaPrestamo.getDayOfMonth();

            int anioDevuelto = fechaDevolucion.getYear();
            int mesDevuelto = fechaDevolucion.getMonthValue();
            int diaDevuelto = fechaDevolucion.getDayOfMonth();
            if(diaPrestamo<diaDevuelto){
                devolucionesTardias.add(prestamo);
            }
        }
        return devolucionesTardias;
    }

        /**
         * Cuenta cuántos préstamos activos tiene un usuario.
         */
        public int contarPrestamosActivos(Persona usuario) {
            int contador = 0;
            for (Prestamo prestamo : listPrestamos) {
                if (prestamo.getUsuario().equals(usuario)) {
                    contador++;
                }
            }
            return contador;
        }

        /**
         * Muestra en consola todos los préstamos activos.
         */
        public void mostrarPrestamosActivos() {
            for (Prestamo prestamo : listPrestamos) {
                System.out.println("Libro: " + prestamo.getLibro().getTitulo() + " | Usuario: " + prestamo.getUsuario().getNombre() +
                        " | Fecha devolución: " + prestamo.getFechaDevolucion());
            }
        }

        /**
         * Devuelve la lista completa de préstamos activos.
         */
        public List<Prestamo> obtenerPrestamos() {
            return listPrestamos;
        }
}


