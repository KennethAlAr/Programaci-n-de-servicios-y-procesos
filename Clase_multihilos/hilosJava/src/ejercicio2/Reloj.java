package ejercicio2;

public class Reloj implements Runnable{
    private String nombre;

    public Reloj(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run(){
        while(true){
            System.out.println(nombre);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
