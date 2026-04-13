package ejercicio1;

public class Encendedor extends Thread{
    private Monitor m;

    public Encendedor(Monitor m) {
        this.m = m;
    }

    public void run(){
        for(int i = 0; i<5; i++){
            m.encender();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
