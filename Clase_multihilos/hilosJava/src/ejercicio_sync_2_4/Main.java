package ejercicio_sync_2_4;

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

añadir una variable ocupado y hacer que se muestre:
"Persona X está esperando"
"Baño libre"
control de cola con wait() y notify()

añadir la opción de que entren al baño tres personas

añadir exclusividad por sexo (solo hombres o solo mujeres)
*/

public class Main {
    static void main(String[] args) {
        Bano bano = new Bano();
        Thread h1 = new Thread(new Hombre(bano, "Hombre 1"));
        Thread h2 = new Thread(new Hombre(bano, "Hombre 2"));
        Thread h3 = new Thread(new Hombre(bano, "Hombre 3"));
        Thread h4 = new Thread(new Hombre(bano, "Hombre 4"));
        Thread h5 = new Thread(new Hombre(bano, "Hombre 5"));
        Thread m1 = new Thread(new Mujer(bano, "Mujer 1"));
        Thread m2 = new Thread(new Mujer(bano, "Mujer 2"));
        Thread m3 = new Thread(new Mujer(bano, "Mujer 3"));
        Thread m4 = new Thread(new Mujer(bano, "Mujer 4"));
        Thread m5 = new Thread(new Mujer(bano, "Mujer 5"));

        h1.start();
        m1.start();
        h2.start();
        m2.start();
        h3.start();
        m3.start();
        h4.start();
        m4.start();
        h5.start();
        m5.start();
    }
}
