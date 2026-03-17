package ejercicio_sync_2;

public class Bano {
    public synchronized void usar(String nombre){
        System.out.println(nombre + " ha entrado al baño.");
        try {
            Thread.sleep((int) (Math.random() * 2000) + 1000);
        } catch (InterruptedException e) {
            System.out.println(nombre + " ha sido utilizado");
        }
        System.out.println(nombre + " ha salido del baño.");
    }
}
