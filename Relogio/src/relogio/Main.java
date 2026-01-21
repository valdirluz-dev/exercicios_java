package relogio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora: ");
        int hora = sc.nextInt();

        System.out.print("Digite o minuto: ");
        int minuto = sc.nextInt();

        System.out.print("Digite o segundo: ");
        int segundo = sc.nextInt();

        sc.nextLine();

        System.out.print("Tipo de relógio (Br/Us): ");
        String tipo = sc.nextLine();

        // Relógio base (sempre brasileiro, por exemplo)
        Clock base = new BrClock();
        base.setHora(hora);
        base.setMinuto(minuto);
        base.setSegundo(segundo);

        Clock clockFinal;

        if (tipo.equalsIgnoreCase("Br")) {
            clockFinal = new BrClock();
        } else if (tipo.equalsIgnoreCase("Us")) {
            clockFinal = new UsClock();
        } else {
            System.out.println("Opção inválida");
            sc.close();
            return;
        }

        // Aqui SIM faz sentido
        clockFinal.ajustarHorario(base);

        System.out.println(clockFinal.verHora());

        sc.close();
    }
}
