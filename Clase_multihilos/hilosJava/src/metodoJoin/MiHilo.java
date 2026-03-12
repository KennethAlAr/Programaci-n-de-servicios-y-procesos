package metodoJoin;

public class MiHilo implements Runnable{
    private String nombre;
    public MiHilo(String nombre){
        this.nombre = nombre;
    }
    @Override
    public void run() {
        for(int i =0; i<=5; i++){
            System.out.println(nombre + " paso "+ i);
        }
    }
}
