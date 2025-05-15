package co.edu.uniquindio.poo.bibliotecaUQ.model;

public class LibroReferencia extends Libro {
    private String referencia;
    public LibroReferencia(String titulo, String autor, String genero, int anioPublicacion, Estado estado, String referencia) {
        super(titulo, autor, genero, anioPublicacion, estado);
        this.referencia = referencia;
    }

    /**
     * Muestra la información del libro de referencia.
     */
    public void mostrarInformacion() {
        System.out.println("Libro de Referencia (Solo consulta en sala):");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Género: " + genero);
        System.out.println("Año: " + anioPublicacion);
        System.out.println("Estado: " + estado);
        System.out.println();
    }

    /**
     * Sobrescribe el metodo prestar para evitar que este tipo de libro sea prestado.
     */
    @Override
    public void prestar() {
        System.out.println("Este libro de referencia no puede ser prestado.");
    }

    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
