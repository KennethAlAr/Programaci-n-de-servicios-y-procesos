package ejercicio_sync_2;

public class Persona implements Runnable{
    private Bano bano;
    private String nombre;

    public Persona(Bano bano, String nombre) {
        this.bano = bano;
        this.nombre = nombre;
    }

    @Override
    public void run(){
        bano.usar(nombre);
    }
}
