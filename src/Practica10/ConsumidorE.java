package Practica10;

class ConsumidorE implements Runnable {

    private BufferTransacciones_EJRM buffer;
    private CuentaBancaria_EJRM cuenta;

    public ConsumidorE(BufferTransacciones_EJRM buffer, CuentaBancaria_EJRM cuenta) {
        this.buffer = buffer;
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Transaccion_EJRM t = buffer.consumir();
                cuenta.depositar(t.monto);
                System.out.println("Consumidor procesó transacción: " + t.monto);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
