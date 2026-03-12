package forma2;

public class Main {
    static void main(String[] args) {
        MiHilo tarea = new MiHilo();
        Thread hilo = new Thread(tarea);
        hilo.start();
    }
}
