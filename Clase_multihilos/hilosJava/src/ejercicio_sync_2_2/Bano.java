package ejercicio_sync_2_2;

public class Bano {
    private boolean ocupado = false;

    public synchronized void entrar(String nombre){
        while(ocupado){
            System.out.println(nombre + " está esperando.");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(nombre + " ha sido interrumpido mientras esperaba");
            }
        }
        ocupado = true;
        System.out.println(nombre + " entra al baño.");
    }

    public synchronized void salir(String nombre){
        ocupado = false;
        System.out.println(nombre + " sale del baño.");
        notifyAll();
    }
}
