package ejercicio8;

public class MiHilo implements Runnable{



    @Override
    public void run() {
        for(int i = 1; i<=5; i++){
            System.out.println(
                    Thread.currentThread().getName() +
                            " prioridad " +
                            Thread.currentThread().getPriority() +
                            " paso " +
                            i
            );

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
