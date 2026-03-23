package Ejercicio1;

import Ejemplo1.Contador;

public class SensorEntrada extends Thread{
    private Parking p;
    private String nombre;

    public SensorEntrada(Parking p, String nombre) {
        super();
        this.p = p;
        this.nombre = nombre;
    }

    public void run(){
        while(true){
            try {
                Thread.sleep((int)(Math.random()* 10000 + 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            p.incrementar(nombre);
        }
    }
}
