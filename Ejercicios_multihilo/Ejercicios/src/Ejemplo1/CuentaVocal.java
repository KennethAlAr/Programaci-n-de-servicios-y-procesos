package Ejemplo1;

public class CuentaVocal extends Thread {

    private Contador c;
    private String texto;
    private char letra;

    public CuentaVocal(Contador c, String texto, char letra) {
        super();
        this.c = c;
        this.texto = texto;
        this.letra = letra;
    }

    public void run(){
        for(int i=0; i<texto.length(); i++){
            if(texto.charAt(i) == letra){
                c.incrementar();
            }
        }
    }

}
