import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // Método para agregar libros a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("El libro '" + libro.getTitulo() + "' ha sido agregado.");
    }

    // Buscar libros por título o autor
    public List<Libro> buscarLibroPorTituloOAutor(String criterio) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(criterio.toLowerCase()) ||
                libro.getAutor().toLowerCase().contains(criterio.toLowerCase())) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    // Prestar un libro si está disponible
    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (libro.isDisponible()) {
                    libro.setDisponible(false);
                    System.out.println("El libro '" + titulo + "' ha sido prestado.");
                } else {
                    System.out.println("El libro '" + titulo + "' no está disponible.");
                }
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no fue encontrado en la biblioteca.");
    }

    // Devolver un libro
    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (!libro.isDisponible()) {
                    libro.setDisponible(true);
                    System.out.println("El libro '" + titulo + "' ha sido devuelto.");
                } else {
                    System.out.println("El libro '" + titulo + "' ya estaba disponible.");
                }
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no fue encontrado en la biblioteca.");
    }

    // Mostrar todos los libros disponibles
    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles:");
        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                libro.mostrarInformacion();
            }
        }
    }
}