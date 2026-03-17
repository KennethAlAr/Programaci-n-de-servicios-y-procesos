package ejercicio_sync_3;

import java.util.LinkedList;
import java.util.Queue;

public class Bano {
    //Stack -> LIFO
    //Queue -> FIFO

    private int contadorPersonas = 0;
    private final int CAPACIDAD_MAXIMA = 2;

    private Queue<String> cola = new LinkedList<>();
    //add -> añade a la cola pero puede elevar una exception.
    //offer -> añade a la cola de forma mas segura.
    //peek -> devuelve el primer elemento pero no lo elimina.
    //poll -> devuelve el primer elemento y lo elimina.
    //size -> devuelve el número de elementos de la cola.

    public synchronized void entrar(String nombre){
        cola.add(nombre);
        while(contadorPersonas == CAPACIDAD_MAXIMA || !cola.peek().equals(nombre)){
            System.out.println(nombre + " está esperando en la cola.");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(nombre + " fue interrumpido.");
            }
        }
        cola.poll();
        contadorPersonas++;
        System.out.println(nombre + " entra al baño. Personas dentro: " + contadorPersonas);
    }

    public synchronized void salir(String nombre) {
        contadorPersonas --;
        System.out.println(nombre + " sale del baño. Personas dentro: " + contadorPersonas);
        notifyAll();
    }
}
