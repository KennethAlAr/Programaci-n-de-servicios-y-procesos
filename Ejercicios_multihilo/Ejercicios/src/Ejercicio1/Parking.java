package Ejercicio1;

public class Parking {

    private int p;

    public Parking() {
        super();
        this.p = 0;
    }

    public synchronized void incrementar(String nombre) {
        p++;
        System.out.println("Ha entrado un coche por la entrada "
                + nombre + ". Ahora hay " + p + " coches en el parking.");
    }

    public int obtenerCoches(){
        return p;
    }

}
