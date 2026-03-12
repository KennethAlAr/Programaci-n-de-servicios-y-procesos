package metodoJoin;

public class Main {
    static void main(String[] args) throws InterruptedException {

        /*
        Método sleep() -> *vip
        Método run() y start() -> *vip
        Método join() -> *vip
        Método isAlive()
        Método currentThread()
        Método getName() y setName()
        Método setPriority(Thread.MIN_PRIORITY / NORM_PRIOTRITY / MAX_PRIORITY)
        Método yield()
        Método interrupt()
         */

        MiHilo mihilo1 = new MiHilo("Hilo 1");
        MiHilo mihilo2 = new MiHilo("Hilo 2");

        Thread t1 = new Thread(mihilo1);
        Thread t2 = new Thread(mihilo2);

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Fin del programa");
    }
}
