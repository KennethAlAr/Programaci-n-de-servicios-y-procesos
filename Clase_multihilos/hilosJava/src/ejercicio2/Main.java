package ejercicio2;

public class Main {
    static void main(String[] args) {
        // Dos relojes
        // Crear dos hilos reloj:
        // Reloj 1
        // Reloj 2
        // Cada uno imprime su mensaje cada segundo.
        // Ejemplo:
        // Reloj 1
        // Reloj 2
        // Reloj 1
        // Reloj 2

        Reloj reloj1 = new Reloj("Reloj 1");
        Reloj reloj2 = new Reloj("Reloj 2");

        Thread t1 = new Thread(reloj1);
        Thread t2 = new Thread(reloj2);

        t1.start();
        t2.start();
    }
}
