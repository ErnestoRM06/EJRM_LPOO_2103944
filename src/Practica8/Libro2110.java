package Practica8;

public class Libro2110 implements Comparable<Libro2110> {
    
    private String isbn;
    private String titulo;
    private String autor;
    private String categoria;
    private int anio;

    public Libro2110(String isbn, String titulo, String autor, String categoria, int anio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.anio = anio;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public int compareTo(Libro2110 o) {
        return this.titulo.compareTo(o.titulo);
    }

    @Override
    public String toString() {
        return "(" + isbn + ") " + titulo + " (" + autor + ") - " + categoria + " - " + anio;
    }
}
