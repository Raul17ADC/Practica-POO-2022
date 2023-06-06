import java.util.ArrayList;
import java.util.List;

public class Administrador {
    private List<Jugador> jugadores;
    private int numPalabras;
    private boolean pistaLetra;
    private boolean pistaPalabra;
    private List<PartidaPalabra> partidas;

    public Administrador() {
        jugadores = new ArrayList<>();
        partidas = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void eliminarJugador(Jugador jugador) {
        jugadores.remove(jugador);
    }

    public void configurarJuego(int numPalabras, boolean pistaLetra, boolean pistaPalabra) {
        this.numPalabras = numPalabras;
        this.pistaLetra = pistaLetra;
        this.pistaPalabra = pistaPalabra;
    }

    public void iniciarPartida(Jugador jugador1, Jugador jugador2) {
        PartidaPalabra partida = new PartidaPalabra(numPalabras, jugador1, jugador2);
        partidas.add(partida);
       // partida.jugarPartida();
    }

    public void obtenerInformacionCompletaPartidas() {
        for (PartidaPalabra partida : partidas) {
            System.out.println("Partida:");
            System.out.println("Jugador 1: " + partida.getJugador1().getNombreUsuario());
            System.out.println("Jugador 2: " + partida.getJugador2().getNombreUsuario());
            System.out.println("Palabra oculta: " + partida.getPalabraOculta());
            System.out.println("Intentos jugador 1: " + partida.getIntentoj1().getNumIntento());
            System.out.println("Intentos jugador 2: " + partida.getIntentoj2().getNumIntento());
         //   System.out.println("Pistas utilizadas jugador 1: " + partida.getIntentoj1().getPistasUtilizadas());
         //   System.out.println("Pistas utilizadas jugador 2: " + partida.getIntentoj2().getPistasUtilizadas());
            System.out.println("--------------");
        }
    }

    public void obtenerRankingPuntuacion() {
        jugadores.sort((j1, j2) -> j2.getPuntos() - j1.getPuntos());
        System.out.println("Ranking por puntuación:");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombreUsuario() + " - Puntos: " + jugador.getPuntos());
        }
    }

    public void obtenerRankingAlfabetico() {
        jugadores.sort((j1, j2) -> j1.getNombreUsuario().compareToIgnoreCase(j2.getNombreUsuario()));
        System.out.println("Ranking alfabético:");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombreUsuario());
        }
    }
}

