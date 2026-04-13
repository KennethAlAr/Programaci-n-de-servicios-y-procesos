package ejercicio1;

public class Apagador extends Thread{

    private Monitor m;

    public Apagador(Monitor m) {
        this.m = m;
    }

    public void run(){
        for(int i = 0; i<5; i++){
            m.apagar();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
