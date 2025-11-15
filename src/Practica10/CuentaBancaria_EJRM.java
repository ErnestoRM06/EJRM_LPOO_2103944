package Practica10;

public class CuentaBancaria_EJRM {

    private int saldo;

    public CuentaBancaria_EJRM(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    public synchronized void depositar(int monto) {
        saldo += monto;
    }

    public synchronized void retirar(int monto) throws InsufficientFundsException {
        if (monto > saldo) {
            throw new InsufficientFundsException("Saldo insuficiente.");
        }
        saldo -= monto;
    }

    public synchronized int getSaldo() {
        return saldo;
    }
}
