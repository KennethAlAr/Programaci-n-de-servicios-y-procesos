package Ejemplo1;

public class Contador {

    /*
    Un monitor es una clase definida para poder implementar la
    concurrencia.
    Debe contener como atributos las variables que van a compartir
    los hilos, en este caso un contador, los métodos que vamos a usar
    para modificar dicha variable. Dichos métodos deben ser
    declarados con el modificador synchronized. Este modificador hace
    que solo un hilo pueda estar ejecutando ese método en un instante
    de tiempo.
    */

    private int c;

    public Contador() {
        super();
        this.c = 0;
    }

    public synchronized void incrementar() {
        c++;
        System.out.println(c);
    }

    public int obtenerVocales(){
        return c;
    }

}
