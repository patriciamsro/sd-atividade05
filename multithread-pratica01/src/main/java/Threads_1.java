public class Threads_1 {

    public static void main(String[] args) {

        //cria objeto thread
        Thread t = Thread.currentThread();
        //exibe o nome da thread executada
        System.out.println(t.getName());
        //cria um novo objeto que representa uma thread
        Thread t0 = new Thread(new MeuRunnable());
        System.out.println(t0);

        Thread t1 = new Thread(new MeuRunnable());
        t1.start();

        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        t2.start();

        Thread t3 = new Thread(new MeuRunnable());
        t3.start();

        Thread t4 = new Thread(new MeuRunnable());
        t4.start();

        Thread t5 = new Thread(new MeuRunnable());
        t5.start();


    }
}
