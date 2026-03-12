package ejercicio9;

public class Impresora {
    public synchronized void imprimir(String usuario){
        System.out.println(usuario + " empieza a imprimir");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(usuario + " termina de imprimir");
    }
}
