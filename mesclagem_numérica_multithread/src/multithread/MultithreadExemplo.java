/** Demonstra a mesclagem de dados usando execução multithread. */
package multithread;
import java.util.concurrent.LinkedBlockingQueue;

public class MultithreadExemplo {
    // Fila segura para threads com capacidade de 250.000
    private static LinkedBlockingQueue<Integer> numbers = new LinkedBlockingQueue<>(250_000);

    public static void main(String[] args) throws InterruptedException {
        
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

        // Thread para mostrar o tamanho da fila após as outras threads terminarem
        Runnable show = () -> System.out.println("Total de números mesclados: " + numbers.size());

        // Iniciando as threads
        Thread incThread = new Thread(inc);
        Thread dicThread = new Thread(dic);
        incThread.start();
        dicThread.start();

        incThread.join();
        dicThread.join();

        Thread showThread = new Thread(show);
        showThread.start();
        showThread.join();
    }
}
