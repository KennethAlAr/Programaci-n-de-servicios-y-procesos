package ejercicio5;

import java.util.Random;

public class Descarga implements Runnable{
    private String archivo;
    private Random random = new Random();

    public Descarga(String archivo){
        this.archivo = archivo;
    }

    @Override
    public void run() {
        for(int i = 10; i<=100; i+= 10){
            System.out.println("Descargando " + archivo + ": " +i + "%");
            try{
                int pausa = random.nextInt(800);
                Thread.sleep(pausa);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Descarga completada: " + archivo);
    }
}
