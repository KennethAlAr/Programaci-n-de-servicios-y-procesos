package ejercicio8;

public class Main {
    static void main(String[] args) {
        Thread t1 = new Thread(new MiHilo());
        Thread t2 = new Thread(new MiHilo());
        Thread t3 = new Thread(new MiHilo());

        t1.setName("Trabajador 1");
        t2.setName("Trabajador 2");
        t3.setName("Trabajador 3");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
