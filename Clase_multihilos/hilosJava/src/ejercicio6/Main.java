package ejercicio6;

public class Main {
    static void main(String[] args) {
//        Esperar a otro hilo
//        Enunciado
//        Simular estas tareas:
//        Descargando archivo
//        Procesando archivo
//        Guardando archivo
//        Pero deben ejecutarse en orden.

        Thread h1 = new Thread(new MiHilo("Descargando"));
        Thread h2 = new Thread(new MiHilo("Procesando"));
        Thread h3 = new Thread(new MiHilo("Guardando"));

        h1.start();

        try {
            h1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        h2.start();

        try {
            h2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        h3.start();

    }
}
