package curso_programacao;

public class ContaBancaria {

    private double saldo;
    private double limiteTotal;      // O teto máximo que o cliente conquistou
    private double chequeEspecial;   // O quanto resta desse teto para usar agora
    private double limiteUsado;
    private boolean usandoChequeEspecial = false;

    public void depositar(double valor) {
        // 1. Antes de somar, verificamos se o limite deve aumentar
        // (Regra: se o depósito novo daria um limite maior que o atual, aumentamos)
        double potencialNovoLimite = (valor <= 500) ? 50.0 : valor / 2;
        
        if (potencialNovoLimite > this.limiteTotal) {
            this.limiteTotal = potencialNovoLimite;
        }

        // 2. Soma o valor ao saldo
        this.saldo += valor;

        // 3. Se a dívida foi paga (saldo >= 0)
        if (this.saldo >= 0) {
            // O disponível volta a ser o teto máximo que ele tinha conquistado
            this.chequeEspecial = this.limiteTotal;
            this.limiteUsado = 0;
            this.usandoChequeEspecial = false;
            
            System.out.println("Dívida quitada! Seu limite de R$ " + this.limiteTotal + " foi restaurado.");
        } else {
            // Se ainda está negativo, o limite disponível aumenta o tanto que foi depositado
            this.chequeEspecial += valor;
            // E a dívida real (com juros) diminui o tanto que foi depositado
            this.limiteUsado -= valor;
        }
    }

    public void sacar(double valor) {
        double totalDisponivel = this.saldo + this.chequeEspecial;

        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque do saldo: " + this.saldo);
        } 
        else if (valor <= totalDisponivel) {
            double diferenca = valor - this.saldo;
            
            this.saldo -= valor; 
            this.limiteUsado += diferenca;
            this.chequeEspecial -= diferenca; 
            this.usandoChequeEspecial = true;
            
            aplicarTaxaChequeEspecial();
            System.out.println("Saque usando limite.");
        } 
        else {
            System.out.println("Operação inválida!");
        }
    }

    public void PagarBoleto(double valor) {
        double totalDisponivel = this.saldo + this.chequeEspecial;

        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Boleto pago do saldo: " + this.saldo);
        } 
        else if (valor <= totalDisponivel) {
            double diferenca = valor - this.saldo;
            
            this.saldo -= valor; 
            this.limiteUsado += diferenca;
            this.chequeEspecial -= diferenca; 
            this.usandoChequeEspecial = true;
            
            aplicarTaxaChequeEspecial();
            System.out.println("Boleto pago usando limite.");
        } 
        else {
            System.out.println("Operação inválida!");
        }
    }
    
    private void aplicarTaxaChequeEspecial() {
        if (usandoChequeEspecial) {
            double taxa = this.limiteUsado * 0.2;
            this.saldo -= taxa;
            this.limiteUsado += taxa;
            // Nota: a taxa não mexe no 'chequeEspecial' (disponível), 
            // ela apenas aumenta o quanto você deve no saldo negativo.
        }
    }

    public void verStatus() {
        System.out.println("\n===== STATUS DA CONTA =====");
        System.out.printf("Saldo Atual:           R$ %.2f%n", this.saldo);
        System.out.printf("Limite de Direito:     R$ %.2f%n", this.limiteTotal);
        System.out.printf("Disponível p/ Saque:   R$ %.2f%n", (this.saldo + this.chequeEspecial));
        System.out.printf("Dívida Real (c/ Juros): R$ %.2f%n", this.limiteUsado);
        System.out.println("===========================\n");
    }
}