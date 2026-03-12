package ejercicio5;

public class Main {
    static void main(String[] args) {
        //Descarga simulada
        //Simular descargas de archivos.
        //Cada hilo representa una descarga.
        //Salida ejemplo:
        //Descargando archivo 1: 10%
                //Descargando archivo 2: 10%
                //Descargando archivo 3: 10%
                //Hasta llegar a:
                    //100%
        //Crear 3 descargas simultáneas.

        Descarga d1 = new Descarga("Archivo1.zip");
        Descarga d2 = new Descarga("Video.mp4");
        Descarga d3 = new Descarga("Juego.exe");

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        Thread t3 = new Thread(d3);

        t1.start();
        t2.start();
        t3.start();
    }
}
