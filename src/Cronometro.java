public class Cronometro {
    
    public static int contagem(int tempo) throws InterruptedException{
        while (tempo > 0){
            tempo--;
            Thread.sleep(1000);
            return tempo;
        }
        return tempo;
    }
}
