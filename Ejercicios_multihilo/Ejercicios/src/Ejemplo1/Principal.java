package Ejemplo1;

import java.util.Scanner;

public class Principal {

    /*
    Tenemos que crear los hilos, para crear un hilo tengo que pasarle
    en su constructor: una instancia de la clase Contador, una cadena
    y una vocal.
     */

    public static void main(String[] args) {
        Contador c = new Contador(); //Instancio la clase Contador
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String texto = sc.nextLine();

        CuentaVocal hilo1 = new CuentaVocal(c, texto, 'a');
        CuentaVocal hilo2 = new CuentaVocal(c, texto, 'e');
        CuentaVocal hilo3 = new CuentaVocal(c, texto, 'i');
        CuentaVocal hilo4 = new CuentaVocal(c, texto, 'o');
        CuentaVocal hilo5 = new CuentaVocal(c, texto, 'u');

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();

        try {
            hilo1.join(); //el hilo que ejecuta esta sentencia (main) esperará
            // hasta que finalice la ejecución de hilo1
            hilo2.join();
            hilo3.join();
            hilo4.join();
            hilo5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("El número de vocales es:" + c.obtenerVocales());

    }

}
