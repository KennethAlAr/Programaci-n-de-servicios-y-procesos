package forma3;

public class Main {
    static void main(String[] args) {
        Thread hilo = new Thread(()->{
            System.out.println("Hola desde el hilo lambda");
        });
        // (parametros) -> {código}
        hilo.start();
    }
}
