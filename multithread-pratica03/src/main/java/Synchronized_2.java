
public class Synchronized_2 {

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
        static Object Lock1 = new Object();
        static Object Lock2 = new Object();

        @Override
        public synchronized void run() {
            String name = Thread.currentThread().getName();

            synchronized (Lock1) {
                double saque = Math.random()*10000;

                if(saque > saldo) {
                    System.out.printf("%s - Valor SAQUE: R$ %.2f - Saldo infuciente!%n", name, saque);
                } else {
                    saldo = saldo - saque;
                    System.out.printf("%s - Valor SAQUE: R$ %.2f - Saldo atual: R$ %.2f%n", name, saque, saldo);
                }
            }
            synchronized (Lock2) {
                double deposito = Math.random()*10000;

                saldo = saldo + deposito;
                System.out.printf("%s - Valor DEPOSITO: R$ %.2f - Saldo atual: R$ %.2f%n", name, deposito, saldo);
            }
        }
    }
}

