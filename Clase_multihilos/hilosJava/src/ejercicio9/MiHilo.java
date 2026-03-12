package ejercicio9;

public class MiHilo implements Runnable{
    private Impresora impresora;
    private String nombre;

    public MiHilo(Impresora impresora, String nombre){
        this.impresora = impresora;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        impresora.imprimir(nombre);
    }



}
