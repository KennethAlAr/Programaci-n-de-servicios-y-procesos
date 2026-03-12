package sincronizacionHilos;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Contador{

    int valor = 0;
    Lock lock = new ReentrantLock();

    public void incrementar() {
        lock.lock();
        try {
            valor++;
        } finally {
            lock.unlock();
        }


        // tryLock() -> intenta obtener el lock sin bloquear el hilo
        // lock.tryLock();
    }
}
