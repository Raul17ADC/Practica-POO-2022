
import java.util.List;

public class Juego {

    private Administrador administrador;
    private List<Jugador> jugadores;
    private List<Palabra> palabras;
    private boolean pistaLetra;
    private boolean pistaPalabra;

    public Juego(Administrador administrador, List<Jugador> jugadores, List<Palabra> palabras, boolean pistaLetra, boolean pistaPalabra) {
        this.administrador = administrador;
        this.jugadores = jugadores;
        this.palabras = palabras;
        this.pistaLetra = pistaLetra;
        this.pistaPalabra = pistaPalabra;
    }

    public void iniciarJuego() {
        this.administrador.configurarJuego(this.palabras, this.pistaLetra, this.pistaPalabra);
        for (Jugador jugador : jugadores) {
            this.administrador.agregarJugador(jugador);
        }
    }

    public void jugarPartida(Jugador jugador1, Jugador jugador2) {
        this.administrador.iniciarPartida(jugador1, jugador2);
    }

    public void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public void eliminarJugador(Jugador jugador) {
        this.jugadores.remove(jugador);
    }

    public void agregarPalabra(Palabra palabra) {
        this.palabras.add(palabra);
    }

    public void eliminarPalabra(Palabra palabra) {
        this.palabras.remove(palabra);
    }

    public void mostrarInformacionPartidas() {
        this.administrador.obtenerInformacionCompletaPartidas();
    }

    public void mostrarRankingPuntuacion() {
        this.administrador.obtenerRankingPuntuacion();
    }

    public void mostrarRankingAlfabetico() {
        this.administrador.obtenerRankingAlfabetico();
    }
}
