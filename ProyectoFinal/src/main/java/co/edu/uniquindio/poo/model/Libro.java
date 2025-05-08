package co.edu.uniquindio.poo.model;

public abstract class Libro {
    protected String titulo;
    protected String autor;
    protected String genero;
    protected int anioPublicacion;
    protected Estado estado;

    public Libro(String titulo, String autor, String genero, int anioPublicacion, Estado estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
        this.estado = Estado.DISPONIBLE;
    }
    // Clase abstracta que permitira a los libros de diferente tipo mostrar que tipo de información tienen
    public abstract void mostrarInformacion();

    //Clase que permite establecer si el libro está disponible
    public boolean estaDisponible() { return estado == Estado.DISPONIBLE; }

    //Clase que permite prestar un libro teniendo en cuenta su estado
    public void prestar() {
        if (estado == Estado.DISPONIBLE) {
            estado = Estado.PRESTADO;
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    public void devolver() {
        if (estado == Estado.PRESTADO) {
            estado = Estado.DISPONIBLE;
        } else {
            System.out.println("El libro ya está disponible.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
