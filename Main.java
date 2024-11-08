import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Menú de Biblioteca Virtual ---");
            System.out.println("1. Agregar un libro");
            System.out.println("2. Buscar libros por título o autor");
            System.out.println("3. Prestar un libro");
            System.out.println("4. Devolver un libro");
            System.out.println("5. Mostrar libros disponibles");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Introduce el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Introduce el año de publicación: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer
                    System.out.print("Introduce el género del libro: ");
                    String genero = scanner.nextLine();
                    biblioteca.agregarLibro(new Libro(titulo, autor, ano, genero));
                    break;

                case 2:
                    System.out.print("Introduce el título o autor para buscar: ");
                    String criterio = scanner.nextLine();
                    List<Libro> resultados = biblioteca.buscarLibroPorTituloOAutor(criterio);
                    if (resultados.isEmpty()) {
                        System.out.println("No se encontraron libros con ese criterio.");
                    } else {
                        for (Libro libro : resultados) {
                            libro.mostrarInformacion();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Introduce el título del libro que deseas prestar: ");
                    String tituloPrestar = scanner.nextLine();
                    biblioteca.prestarLibro(tituloPrestar);
                    break;

                case 4:
                    System.out.print("Introduce el título del libro que deseas devolver: ");
                    String tituloDevolver = scanner.nextLine();
                    biblioteca.devolverLibro(tituloDevolver);
                    break;

                case 5:
                    biblioteca.mostrarLibrosDisponibles();
                    break;

                case 6:
                    continuar = false;
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}