package ejercicio9;

public class Main {
    static void main(String[] args) {
    //    Simular varios usuarios que quieren imprimir documentos,
    //    pero solo una impresora puede imprimir a la vez.
    //    Debemos usar synchronized para evitar que dos hilos impriman
    //    al mismo tiempo.
    //
    //    Tenemos una impresora compartida.
    //    Tres usuarios quieren imprimir:
    //    Usuario 1
    //    Usuario 2
    //    Usuario 3
    //    Cada usuario es un hilo.

        Impresora impresora = new Impresora();
        Thread t1 = new Thread(new MiHilo(impresora, "usuario 1"));
        Thread t2 = new Thread(new MiHilo(impresora, "usuario 2"));
        Thread t3 = new Thread(new MiHilo(impresora, "usuario 3"));

        t1.start();
        t2.start();
        t3.start();
    }
}
