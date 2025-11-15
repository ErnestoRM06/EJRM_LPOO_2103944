package Practica10;

import java.util.LinkedList;

public class BufferTransacciones_EJRM {

    private final LinkedList<Transaccion_EJRM> buffer = new LinkedList<>();
    private final int capacidad = 44;

    public synchronized void producir(Transaccion_EJRM t) throws InterruptedException {
        while (buffer.size() == capacidad) {
            wait();
        }
        buffer.add(t);
        notifyAll();
    }

    public synchronized Transaccion_EJRM consumir() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait();
        }
        Transaccion_EJRM t = buffer.removeFirst();
        notifyAll();
        return t;
    }
}
