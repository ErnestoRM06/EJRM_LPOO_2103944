package Practica10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BancoConcurrenteER {

    public static void main(String[] args) {

        CuentaBancaria_EJRM cuenta = new CuentaBancaria_EJRM(200);
        BufferTransacciones_EJRM buffer = new BufferTransacciones_EJRM();
        LoggerSimple logger = new LoggerSimple();

        new CajeroThread21(cuenta).start();
        new Thread(new ClienteRunnable10(cuenta)).start();

        Thread productor = new Thread(new ProductorE(buffer));
        Thread consumidor = new Thread(new ConsumidorE(buffer, cuenta));
        productor.start();
        consumidor.start();

        ThreadPoolReyna pool = new ThreadPoolReyna(3);
        pool.ejecutar(() -> logger.log("Tarea ejecutada en pool personalizado"));

        ExecutorService exec = Executors.newFixedThreadPool(2);
        exec.submit(() -> logger.log("Ejecutor ejecutando tarea 1"));
        exec.submit(() -> logger.log("Ejecutor ejecutando tarea 2"));
        exec.shutdown();

        new DeadlockDemo().iniciar();

        logger.log("Simulación completada.");
    }
}
