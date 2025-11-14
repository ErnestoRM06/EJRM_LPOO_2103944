package Practica8;

import java.util.Scanner;

public class Practica8_EJRM {

    public static void main(String[] args) {
        BibliotecaE3944 bib = new BibliotecaE3944();
        Scanner sc = new Scanner(System.in);

        Libro2110 lib = new Libro2110("111-AAA", "Programación Java", "Ernesto Reyna", "Tecnología", 20211);

        bib.agregarLibro(lib);

        int opcion;
        do {
            System.out.println("\n--- MENÚ BIBLIOTECA ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro");
            System.out.println("3. Mostrar libros");
            System.out.println("4. Reservar libro");
            System.out.println("5. Atender reserva");
            System.out.println("6. Mostrar categorias");
            System.out.println("7. Buscar libros por categorias");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Categoría: ");
                    String categoria = sc.nextLine();
                    System.out.print("Año: ");
                    int anio = sc.nextInt();
                    sc.nextLine();
                    bib.agregarLibro(new Libro2110(isbn, titulo, autor, categoria, anio));
                    break;
                case 2:
                    System.out.print("ISBN a buscar: ");
                    String buscar = sc.nextLine();
                    System.out.println(bib.buscarLibro(buscar));
                    break;
                case 3:
                    bib.mostrarLibros();
                    break;
                case 4:
                    System.out.print("ISBN del libro a reservar: ");
                    String res = sc.nextLine();
                    Libro2110 libro = bib.buscarLibro(res);
                    if (libro != null) {
                        bib.reservarLibro(libro);
                    }
                    break;
                case 5:
                    System.out.println("Reserva atendida: " + bib.atenderReserva());
                    break;
                case 6:
                    bib.mostrarCategorias();
                    break;
                case 7:
                    System.out.print("Categoria a buscar: ");
                    String cat = sc.nextLine();
                    System.out.println(bib.filtrarPorCategoria(cat));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ERROR: Opción no válida");
            }
        } while (opcion != 0);
    }
}
