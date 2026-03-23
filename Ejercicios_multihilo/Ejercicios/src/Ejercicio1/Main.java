package Ejercicio1;

public class Main {

    /*
    Vamos a implementar con hilos la entrada de vehículos a un
    parking que tiene tres entradas. Cada entrada dispone de
    un sensor que cuenta los vehículos que acceden. Lo vamos a
    simular con un bucle infinito que cada X segundos (un tiempo
    aleatorio entre 1 y 10 segundos) contabiliza la entrada de
    un coche.
    Cada vez que entre un coche, se mostrará en pantalla un mensaje
    indicando el número de coches que hay actualmente en el parking.
     */

    public static void main(String[] args) {
        Parking p = new Parking();

        SensorEntrada hilo1 = new SensorEntrada(p, "sur");
        SensorEntrada hilo2 = new SensorEntrada(p, "norte");
        SensorEntrada hilo3 = new SensorEntrada(p, "este");

        hilo1.start();
        hilo2.start();
        hilo3.start();

    }
}
