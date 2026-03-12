package ejercicio6;

public class MiHilo implements Runnable{

    private String nombre;
    public MiHilo (String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 3; i++){
            System.out.println(nombre + " paso " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
