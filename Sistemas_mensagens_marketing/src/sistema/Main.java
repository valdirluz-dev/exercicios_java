package sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

     
        List<Mensagens> canais = new ArrayList<>();
        canais.add(new Email());
        canais.add(new Sms());
        canais.add(new RedesSociais());
        canais.add(new WhatsApp());

        while (true) {
            System.out.print("Digite sua mensagem: ");
            var message = sc.nextLine();

            if (message.equalsIgnoreCase("Exit")) break;

      
            for (Mensagens canal : canais) {
                canal.enviarMensagem(message);
            }
        }

        sc.close();
    }
}
