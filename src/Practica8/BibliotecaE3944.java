package Practica8;

import java.util.*;
import java.util.stream.Collectors;

public class BibliotecaE3944 {

    private ArrayList<Libro2110> librosDisponibles;
    private LinkedList<Libro2110> colaReservas;
    private HashMap<String, String> usuarios;
    private HashSet<String> categorias;

    public BibliotecaE3944() {
        librosDisponibles = new ArrayList<>();
        colaReservas = new LinkedList<>();
        usuarios = new HashMap<>();
        categorias = new HashSet<>();
    }

// CRUD Libros
    public void agregarLibro(Libro2110 libro) {
        librosDisponibles.add(libro);
        categorias.add(libro.getCategoria());
    }

    public boolean eliminarLibro(String isbn) {
        return librosDisponibles.removeIf(l -> l.getIsbn().equals(isbn));
    }

    public Libro2110 buscarLibro(String isbn) {
        return librosDisponibles.stream()
                .filter(l -> l.getIsbn().equals(isbn))
                .findFirst().orElse(null);
    }

    public List<Libro2110> filtrarPorCategoria(String categoria) {
        return librosDisponibles.stream()
                .filter(l -> l.getCategoria().equalsIgnoreCase(categoria))
                .collect(Collectors.toList());
    }

    public void reservarLibro(Libro2110 libro) {
        colaReservas.add(libro);
    }

    public Libro2110 atenderReserva() {
        return colaReservas.poll();
    }

    public void registrarUsuario(String matricula, String u) {
        usuarios.put(matricula, u);
    }

    public String obtenerUsuario(String matricula) {
        return usuarios.get(matricula);
    }

    public void mostrarCategorias() {
        categorias.forEach((cat) -> {
            System.out.println(cat);
        });
    }

    public void mostrarLibros() {
        Iterator<Libro2110> it = librosDisponibles.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
