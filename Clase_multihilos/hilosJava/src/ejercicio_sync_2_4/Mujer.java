package ejercicio_sync_2_4;

public class Mujer implements Runnable{
    private Bano bano;
    private String nombre;

    public Mujer(Bano bano, String nombre){
        this.bano = bano;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        bano.entrarMujer(nombre);
        try {
            Thread.sleep((int)(Math.random()* 2000 + 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bano.salirMujer(nombre);
    }
}
