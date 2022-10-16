public class Synchronized_1 {

    static int i = 0;
    static double saldo = 2000.00;

    public static void main(String[] args) {
        MeuRunnable runnable = new MeuRunnable();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(runnable);
        Thread t5 = new Thread(runnable);
        Thread t6 = new Thread(runnable);
        Thread t7 = new Thread(runnable);
        Thread t8 = new Thread(runnable);
        Thread t9 = new Thread(runnable);
        Thread t10 = new Thread(runnable);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
    public static class MeuRunnable implements Runnable{

        @Override
        public synchronized void run() {
            i++;
            saldo = saldo - 100.00;
            System.out.printf("Saque nº: %d - Saldo restante: R$ %.2f%n", i, saldo);
        }
    }
}
