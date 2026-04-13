package ejercicio1;

public class Monitor {

    private boolean encendida = false;

    public synchronized void encender() {

        // Antes de que comience su tarea (encender la luz) hay que controlar si puede hacerlo
        while(encendida){ // Cuando la condición es cierta me paro
            try {
                System.out.println("Me quedo parado, la luz está encendida.");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        encendida = true;
        System.out.println("Luz encendida.");
        notify();
    }

    public synchronized void apagar() {
        while(!encendida){
            try {
                System.out.println("Me quedo parado, la luz está apagada.");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        encendida = false;
        System.out.println("Luz apagada.");
        notify();
    }

}
