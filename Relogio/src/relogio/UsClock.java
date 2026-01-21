package relogio;

public non-sealed class UsClock extends Clock {

    private String ampm;

    @Override
    public void setHora(int hora) {
        if (hora < 0 || hora > 23) hora = 0;

        if (hora == 0) {
            this.hora = 12;
            ampm = " AM";
        } else if (hora == 12) {
            this.hora = 12;
            ampm = " PM";
        } else if (hora > 12) {
            this.hora = hora - 12;
            ampm = " PM";
        } else {
            this.hora = hora;
            ampm = " AM";
        }
    }

    @Override
    public String verHora() {
        return String.format("%02d:%02d:%02d%s", hora, minuto, segundo, ampm);
    }

    @Override
    public void ajustarHorario(Clock clock) {
        setHora(clock.getHora());
        setMinuto(clock.getMinuto());
        setSegundo(clock.getSegundo());
    }
}
