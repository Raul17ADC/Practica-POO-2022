public class Intento {

    //Atributos
    private int numIntento;
    private static final int MAXNUMINTENTOS = 5;
    private Palabra palabra;
    private Jugador jugador;

    //Constructor
    public Intento() {
    }

    //Getters y Setters
    public int getNumIntento() {
        return numIntento;
    }

    public void setNumIntento(int numIntento) {
        this.numIntento = numIntento;
    }

    public Palabra getPalabra() {
        return palabra;
    }

    public void setPalabra(Palabra palabra) {
        this.palabra = palabra;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
}
