package Practica8;

import java.util.Comparator;

public class CompararCategoria_EJRM implements Comparator<Libro2110> {

    @Override
    public int compare(Libro2110 a, Libro2110 b) {
        return a.getCategoria().compareTo(b.getCategoria());
    }
}
