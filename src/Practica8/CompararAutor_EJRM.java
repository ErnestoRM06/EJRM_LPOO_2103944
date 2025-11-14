package Practica8;

import java.util.Comparator;

public class CompararAutor_EJRM implements Comparator<Libro2110> {
    @Override
    public int compare(Libro2110 a, Libro2110 b) {
        return a.getAutor().compareToIgnoreCase(b.getAutor());
    }
}
