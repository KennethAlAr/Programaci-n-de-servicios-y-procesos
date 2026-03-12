package ejercicio7;

public class Main {
    static void main(String[] args) {
//        Comprobar si un hilo sigue vivo
//
//        Enunciado
//
//        Crear un hilo que cuente hasta 5.
//        Mientras esté ejecutándose, el main debe mostrar:
//
//        El hilo sigue trabajando...

        Thread t1 = new Thread(new MiHilo());

        t1.start();

        while(t1.isAlive()){
            System.out.println("El hilo sigue trabajando");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("El hilo ha terminado");

    }
}
