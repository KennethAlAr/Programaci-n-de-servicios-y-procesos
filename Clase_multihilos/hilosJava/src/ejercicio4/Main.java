package ejercicio4;

public class Main {
    static void main(String[] args) throws InterruptedException {
        //Hilos con pausa aleatoria
        //Crear un hilo que muestre números del 1 al 5.
        //Después de cada número debe esperar un tiempo aleatorio:
        //Thread.sleep(random);
        //Crear 3 hilos.
        //Verán cómo cada hilo avanza a ritmo distinto.

        Animal tortuga = new Animal("Tortuga");
        Animal conejo = new Animal("Conejo");
        Animal perro = new Animal("Perro");
        Animal gato = new Animal("Gato");

        Thread t1 = new Thread(tortuga);
        Thread t2 = new Thread(conejo);
        Thread t3 = new Thread(perro);
        Thread t4 = new Thread(gato);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("La carrera ha terminado");
    }
}
