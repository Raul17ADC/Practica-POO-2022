public class PartidaPalabra {

    //Atributos
    private Jugador ganador, jugador1, jugador2;
    private Palabra palabraOculta;
    private int turno;
    private Intento intentoj1, intentoj2;

    //Constructor
    public PartidaPalabra(Palabra palabraOculta, Jugador jugador1, Jugador jugador2) {
        this.palabraOculta = new Palabra();
        this.jugador1 = new Jugador(jugador1.getNombreUsuario());
        this.jugador2 = new Jugador(jugador2.getNombreUsuario());
        ganador = null;
        turno = 1;
        intentoj1.setNumIntento(1);
        intentoj2.setNumIntento(1);
    }

    //Getters y Setters
    public Jugador getGanador() {
        return ganador;
    }

    public void setGanador(Jugador j) {
        this.ganador = j;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public Palabra getPalabraOculta() {
        return palabraOculta;
    }

    public void setPalabraOculta(Palabra palabraOculta) {
        this.palabraOculta = palabraOculta;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public Intento getIntentoj1() {
        return intentoj1;
    }

    public void setIntentoj1(Intento intentoj1) {
        this.intentoj1 = intentoj1;
    }

    public Intento getIntentoj2() {
        return intentoj2;
    }

    public void setIntentoj2(Intento intentoj2) {
        this.intentoj2 = intentoj2;
    }

    //Métodos
    public void cambiarTurno() {
        if (turno == 1) {
            setTurno(2);
        } else {
            setTurno(1);
        }
    }
}
