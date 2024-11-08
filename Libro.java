//Mirian Fabiola Guzman
//202410050105
public class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private String genero;
    private boolean disponible;

    // Constructor
    public Libro(String titulo, String autor, int anoPublicacion, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.genero = genero;
        this.disponible = true; // Inicialmente todos los libros están disponibles
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Método para mostrar información del libro
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anoPublicacion);
        System.out.println("Género: " + genero);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }
}