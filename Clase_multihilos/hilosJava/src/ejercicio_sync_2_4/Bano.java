package ejercicio_sync_2_4;

public class Bano {
    private int hombreDentro = 0;
    private int mujerDentro = 0;
    private final int CAPACIDAD_MAXIMA = 3;

    public synchronized void entrarHombre(String nombre){
        while(mujerDentro > 0 || hombreDentro == CAPACIDAD_MAXIMA){
            System.out.println(nombre + " está esperando para entrar al baño.");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(nombre + " ha sido interrumpido mientras esperaba.");
            }
        }
        hombreDentro ++;
        System.out.println(nombre + " entra al baño. Hombres dentro: " + hombreDentro);
    }

    public synchronized void salirHombre(String nombre){
        hombreDentro --;
        System.out.println(nombre + " sale del baño. Hombres dentro: " + hombreDentro);
        notifyAll();
    }

    public synchronized void entrarMujer(String nombre){
        while(hombreDentro > 0 || mujerDentro == CAPACIDAD_MAXIMA){
            System.out.println(nombre + " está esperando para entrar al baño.");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(nombre + " ha sido interrumpido mientras esperaba.");
            }
        }
        mujerDentro ++;
        System.out.println(nombre + " entra al baño. Mujeres dentro: " + mujerDentro);
    }

    public synchronized void salirMujer(String nombre){
        mujerDentro --;
        System.out.println(nombre + " sale del baño. Mujeres dentro: " + mujerDentro);
        notifyAll();
    }
}
