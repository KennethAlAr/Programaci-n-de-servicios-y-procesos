package ejercicio_sync_2_3;

public class Bano {
    private int personasDentro = 0;
    private final int CAPACIDAD_MAXIMA = 2;

    public synchronized void entrar(String nombre){
        while(personasDentro == CAPACIDAD_MAXIMA){
            System.out.println(nombre + " está esperando. Baño lleno.");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(nombre + " ha sido interrumpido mientras esperaba");
            }
        }
        personasDentro ++;
        System.out.println(nombre + " entra al baño. Personas dentro: " + personasDentro);
    }

    public synchronized void salir(String nombre){
        personasDentro --;
        System.out.println(nombre + " sale del baño. Personas dentro: " + personasDentro);
        notifyAll();
    }
}
