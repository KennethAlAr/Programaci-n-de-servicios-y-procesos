package sincronizacionHilos;

public class Main {
    static void main(String[] args) {
        Contador c = new Contador();
        MiHilo mihilo1 = new MiHilo(c);

        Thread h1 = new Thread(mihilo1);
        Thread h2 = new Thread(mihilo1);

        h1.start();
        h2.start();

        try {
            h1.join();
            h2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Resultado final: " + c.valor);
    }
}
