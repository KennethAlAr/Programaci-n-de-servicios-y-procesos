package ejercicio1;

public class Main {
    static void main(String[] args) {
        MiHilo tarea = new MiHilo();

        Thread t1 = new Thread(tarea, "Hilo-A");
        Thread t2 = new Thread(tarea, "Hilo-B");
        Thread t3 = new Thread(tarea, "Hilo-C");
        Thread t4 = new Thread(tarea, "Hilo-D");
        Thread t5 = new Thread(tarea, "Hilo-E");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
