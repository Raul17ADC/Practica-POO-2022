import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Administrador {
    private List<Jugador> jugadores;
    private List<Palabra> palabras;
    private boolean pistaLetra;
    private boolean pistaPalabra;
    private List<Partida> partidas;




    public Administrador() {
        jugadores = new ArrayList<>();
        palabras = new ArrayList<>();
        partidas = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void eliminarJugador(Jugador jugador) {
        jugadores.remove(jugador);
    }

    public void agregarPalabra(Palabra palabra) {
        palabras.add(palabra);
    }

    public void eliminarPalabra(Palabra palabra) {
        palabras.remove(palabra);
    }

    public void configurarJuego(List<Palabra> palabras, boolean pistaLetra, boolean pistaPalabra) {
        this.palabras = palabras;
        this.pistaLetra = pistaLetra;
        this.pistaPalabra = pistaPalabra;
    }

    public void iniciarPartida(Jugador jugador1, Jugador jugador2) {
        List<String> palabrasJuego = palabras.stream()
                .map(Palabra::toString)
                .collect(Collectors.toList());
        // Elegir una palabra al azar
        String palabraAdivinar = palabrasJuego.get(new Random().nextInt(palabrasJuego.size()));
        Partida partida = new Partida(palabrasJuego, jugador1, jugador2, palabraAdivinar);
        partidas.add(partida);
        partida.jugar();
    }

    public void obtenerInformacionCompletaPartidas() {
        for (Partida partida : partidas) {
            System.out.println("Partida:");
            System.out.println("Jugador 1: " + partida.getJugador1().getNombreUsuario());
            System.out.println("Jugador 2: " + partida.getJugador2().getNombreUsuario());
            System.out.println("Palabra oculta: " + partida.getPalabras());
            System.out.println("Intentos jugador 1: " + partida.getIntentosJ1());
            System.out.println("Intentos jugador 2: " + partida.getIntentosJ2());
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

