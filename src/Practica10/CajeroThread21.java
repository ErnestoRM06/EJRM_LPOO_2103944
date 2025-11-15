package Practica10;

class CajeroThread21 extends Thread {

    private CuentaBancaria_EJRM cuenta;

    public CajeroThread21(CuentaBancaria_EJRM cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        try {
            cuenta.retirar(50);
            System.out.println(getName() + " retiró 50. Saldo: " + cuenta.getSaldo());
        } catch (InsufficientFundsException e) {
            System.out.println("Error en cajero: " + e.getMessage());
        }
    }
}
