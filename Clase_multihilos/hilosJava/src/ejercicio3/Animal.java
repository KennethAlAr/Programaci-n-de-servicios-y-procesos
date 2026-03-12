package ejercicio3;

public class Animal implements Runnable{
    private String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 1; i<= 5; i++){
            System.out.println(nombre+" paso "+ i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(nombre + "ha terminado la carrera");
    }
}
