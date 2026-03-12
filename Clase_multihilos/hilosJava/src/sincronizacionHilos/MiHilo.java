package sincronizacionHilos;

public class MiHilo implements Runnable{

    private Contador contador;

    public MiHilo(Contador contador){
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i=0; i<1000; i++){
            contador.incrementar();
        }
    }
}
