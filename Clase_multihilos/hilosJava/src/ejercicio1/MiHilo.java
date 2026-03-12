package ejercicio1;

public class MiHilo implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+ " ejecutándose");
    }
}
