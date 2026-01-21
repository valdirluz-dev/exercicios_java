package relogio;

public abstract sealed class Clock permits UsClock, BrClock {

    protected int hora, minuto, segundo;

    public int getHora() {
        return hora;
    }

    // NÃO valida hora aqui
    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) this.minuto = 0;
        else this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59) this.segundo = 0;
        else this.segundo = segundo;
    }

    public String verHora() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public abstract void ajustarHorario(Clock clock);
}
