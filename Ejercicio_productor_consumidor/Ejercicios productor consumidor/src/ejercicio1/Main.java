package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Monitor m = new Monitor();
        Apagador ap1 = new Apagador(m);
        Encendedor enc1 = new Encendedor(m);

        ap1.start(); //Invoca al método run();
        enc1.start();

        try {
            ap1.join();
            enc1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Fin del programa");

    }
}
