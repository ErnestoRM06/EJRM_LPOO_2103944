package Practica10;

import java.util.Random;

class ClienteRunnable10 implements Runnable {

    private CuentaBancaria_EJRM cuenta;

    public ClienteRunnable10(CuentaBancaria_EJRM cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        cuenta.depositar(30);
        System.out.println(Thread.currentThread().getName() + " depositó 30. Saldo: " + cuenta.getSaldo());
    }
}
