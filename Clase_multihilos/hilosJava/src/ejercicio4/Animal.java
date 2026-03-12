package ejercicio4;

import java.util.Random;

public class Animal implements Runnable{
    private String nombre;
    private Random random = new Random();

    public Animal(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 1; i<= 5; i++){
            System.out.println(nombre+" paso "+ i);
            try {
                int pausa = random.nextInt(1000);
                Thread.sleep(pausa);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(nombre + " ha terminado la carrera");
    }
}
