package relogio;

public non-sealed class BrClock extends Clock {

    @Override
    public void setHora(int hora) {
        if (hora < 0 || hora > 23) this.hora = 0;
        else this.hora = hora;
    }

    @Override
    public void ajustarHorario(Clock clock) {
        setHora(clock.getHora());
        setMinuto(clock.getMinuto());
        setSegundo(clock.getSegundo());
    }
}

