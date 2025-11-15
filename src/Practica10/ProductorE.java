package Practica10;

class ProductorE implements Runnable {

    private BufferTransacciones_EJRM buffer;

    public ProductorE(BufferTransacciones_EJRM buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                buffer.producir(new Transaccion_EJRM("DEP", 20));
                System.out.println("Productor agregó transacción.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
