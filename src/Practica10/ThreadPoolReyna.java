package Practica10;

import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPoolReyna {

    private final Worker[] workers;
    private final LinkedBlockingQueue<Runnable> cola = new LinkedBlockingQueue<>();

    public ThreadPoolReyna(int nHilos) {
        workers = new Worker[nHilos];
        for (int i = 0; i < nHilos; i++) {
            workers[i] = new Worker();
            workers[i].start();
        }
    }

    public void ejecutar(Runnable tarea) {
        cola.offer(tarea);
    }

    private class Worker extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    Runnable tarea = cola.take();
                    tarea.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
