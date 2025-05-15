package co.edu.uniquindio.poo.proyectobibliotecauq.model;
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
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Género: " +getTitulo());
        System.out.println("Año: " + getAnioPublicacion());
        System.out.println("Estado: " + getTitulo());
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
