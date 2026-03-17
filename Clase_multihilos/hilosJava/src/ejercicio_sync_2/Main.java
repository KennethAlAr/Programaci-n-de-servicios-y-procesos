package ejercicio_sync_2;

/*
Ejercicio — Baño compartido
Objetivo
Simular un baño compartido al que quieren entrar varios hilos,
pero solo puede haber una persona dentro a la vez.
Enunciado
Crea un programa en Java con estas condiciones:
Hay un recurso compartido llamado Bano.
Cinco personas intentan usar el baño.
Cada persona será un hilo.
Cuando una persona entra al baño, ninguna otra puede entrar hasta que salga.
Cada persona permanece en el baño entre 1 y 3 segundos.
Debe mostrarse por pantalla:
cuándo una persona entra
cuándo una persona sale
Requisitos
Usa Runnable
Usa synchronized
No uses lambdas
El acceso al baño debe estar correctamente sincronizado
Posible salida esperada
Persona 1 entra al baño
Persona 1 sale del baño
Persona 3 entra al baño
Persona 3 sale del baño
Persona 2 entra al baño
Persona 2 sale del baño
...
Nunca debe ocurrir algo como esto:
Persona 1 entra al baño
Persona 2 entra al baño
porque solo puede entrar una a la vez.
*/

public class Main {
    static void main(String[] args) {
        Bano bano = new Bano();
        Thread t1 = new Thread(new Persona(bano, "Persona 1"));
        Thread t2 = new Thread(new Persona(bano, "Persona 2"));
        Thread t3 = new Thread(new Persona(bano, "Persona 3"));
        Thread t4 = new Thread(new Persona(bano, "Persona 4"));
        Thread t5 = new Thread(new Persona(bano, "Persona 5"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
