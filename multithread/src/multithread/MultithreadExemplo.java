package multithread;
import java.util.concurrent.LinkedBlockingQueue;

public class MultithreadExemplo {
    // Fila segura para threads com capacidade de 250.000
    private static LinkedBlockingQueue<Integer> numbers = new LinkedBlockingQueue<>(250_000);

    public static void main(String[] args) {
        
        // Thread para adicionar números positivos
        Runnable inc = () -> {
            for (int i = 0; i < 100_000; i++) {
                numbers.offer(i); // offer não trava o programa se a fila estiver cheia
            }
            System.out.println("--- Thread INC finalizada ---");
        };

        // Thread para adicionar números negativos
        Runnable dic = () -> {
            for (int i = 0; i > -100_000; i--) {
                numbers.offer(i);
            }
            System.out.println("--- Thread DIC finalizada ---");
        };

        // Thread para mostrar o tamanho da fila (em vez de imprimir a fila toda)
        private synchronized static void show () { System.out.println(numbers);}

        // Iniciando as threads
        new Thread(inc).start();
        new Thread(dic).start();
        new Thread(show).start();
    }
}
