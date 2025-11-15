package Practica10;

class DeadlockDemo {

    private final Object lockA = new Object();
    private final Object lockB = new Object();

    public void iniciar() {
        Thread t1 = new Thread(() -> safeLock(true));
        Thread t2 = new Thread(() -> safeLock(false));

        t1.start();
        t2.start();
    }

    private void safeLock(boolean orden) {
        Object primero = orden ? lockA : lockB;
        Object segundo = orden ? lockB : lockA;

        synchronized (primero) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException ignored) {
            }
            synchronized (segundo) {
                System.out.println("Bloqueos adquiridos sin deadlock.");
            }
        }
    }
}
