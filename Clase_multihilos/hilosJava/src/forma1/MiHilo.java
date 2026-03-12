package forma1;

public class MiHilo extends Thread{
    @Override
    public void run(){
        for(int i = 1; i <=5; i++){
            System.out.println("Contando: " + i);
        }
    }
}
