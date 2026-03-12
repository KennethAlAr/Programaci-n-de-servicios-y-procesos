package ejercicio3;

public class Main {
    static void main(String[] args) {
        //Carrera de animales (Runnable)
        //Vamos a simular una carrera entre 4 animales:
        //Tortuga
        //Conejo
        //Perro
        //Gato
        //Cada animal es un hilo.
        //Cada uno avanzará 5 pasos.

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
    }
}
