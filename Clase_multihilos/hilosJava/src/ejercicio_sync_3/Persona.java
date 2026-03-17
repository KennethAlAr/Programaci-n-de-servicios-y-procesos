package ejercicio_sync_3;

public class Persona implements Runnable{
    private Bano bano;
    private String nombre;

    public Persona(Bano bano, String nombre) {
        this.bano = bano;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        bano.entrar(nombre);
        try {
            Thread.sleep((int)(Math.random()* 2000 + 1000));
        } catch (InterruptedException e) {
            System.out.println(nombre + " ha sido interrumpido.");;
        }
        bano.salir(nombre);
    }
}