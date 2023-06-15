
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

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

    public void agregarNuevoJugador(String nombre) {
        // Verificar si el archivo de jugadores existe, de lo contrario, crearlo
        Path archivoJugadores = Path.of("jugadores.txt");
        if (!Files.exists(archivoJugadores)) {
            try {
                Files.createFile(archivoJugadores);
            } catch (IOException e) {
                throw new RuntimeException("Error al crear el archivo de jugadores: " + e.getMessage());
            }
        }

        // Crear el objeto Jugador con valores predeterminados
        Jugador jugador = new Jugador(nombre);

        // Agregar el jugador al final del archivo
        try ( BufferedWriter writer = new BufferedWriter(new FileWriter(archivoJugadores.toFile(), true))) {
            writer.write(jugador.toString());
            writer.newLine();
            // Lanzar una excepción en caso de error al escribir en el archivo
        } catch (IOException e) {
            throw new RuntimeException("Error al escribir en el archivo de jugadores: " + e.getMessage());
        }
    }

    public void eliminarJugador(String nombre) {
        // Verificar si el archivo de jugadores existe
        Path archivoJugadores = Path.of("jugadores.txt");
        if (Files.exists(archivoJugadores)) {
            try {
                List<String> lineas = Files.readAllLines(archivoJugadores);
                List<String> lineasActualizadas = lineas.stream()
                        .filter(linea -> !linea.contains(nombre))
                        .collect(Collectors.toList());
                Files.write(archivoJugadores, lineasActualizadas);
            } catch (IOException e) {
                throw new RuntimeException("Error al eliminar el jugador del archivo de jugadores: " + e.getMessage());
            }
        } else {
            throw new RuntimeException("El archivo de jugadores no existe");
        }
    }

    private Jugador convertirLineaAJugador(String linea) {
        String[] datos = linea.split(",");
        if (datos.length == 3) {
            String nombreUsuario = datos[0];
            int puntos = Integer.parseInt(datos[1]);
            Estadisticas estadisticas = convertirLineaAEstadisticas(datos[2]);
            Jugador jugador = new Jugador(nombreUsuario);
            jugador.setPuntos(puntos);
            jugador.setEstadisticas(estadisticas);
            return jugador;
        }
        return null;
    }

    private Estadisticas convertirLineaAEstadisticas(String linea) {
        String[] datos = linea.split(",");
        if (datos.length == 4) {
            int partidasGanadas = Integer.parseInt(datos[0]);
            int partidasEmpatadas = Integer.parseInt(datos[1]);
            int partidasPerdidas = Integer.parseInt(datos[2]);
            int puntosTotales = Integer.parseInt(datos[3]);
            Estadisticas estadisticas = new Estadisticas();
            estadisticas.setPartidasGanadas(partidasGanadas);
            estadisticas.setPartidasEmpatadas(partidasEmpatadas);
            estadisticas.setPartidasPerdidas(partidasPerdidas);
            estadisticas.setPuntosTotales(puntosTotales);
            return estadisticas;
        }
        return null;
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
    
    public void crearRankingAlfabetico() {
        // Ordenar los jugadores alfabéticamente
        Collections.sort(jugadores);

        // Obtener la fecha y hora actual para formatear el nombre del archivo
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy-HH.mm");
        String fechaHoraActual = sdf.format(new Date());

        // Crear el nombre del archivo
        String nombreArchivo = "Listado." + fechaHoraActual + ".txt";

        // Crear el archivo de jugadores
        Path archivoJugadores = Path.of(nombreArchivo);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoJugadores.toFile()))) {
            // Escribir los datos de los jugadores en el archivo
            for (Jugador jugador : jugadores) {
                writer.write(jugador.toString());
                writer.newLine();
            }
            JOptionPane.showMessageDialog(null, "Archivo de jugadores generado correctamente.");
        } catch (IOException e) {
            throw new RuntimeException("Error al generar el archivo de jugadores: " + e.getMessage());
        }
    }
    
    public void crearRankingPuntos() {
        // Ordenar los jugadores por sus puntos de mayor a menor
        Collections.sort(jugadores, (j1, j2) -> j2.getPuntos() - j1.getPuntos());

        // Obtener la fecha y hora actual para formatear el nombre del archivo
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy-HH.mm");
        String fechaHoraActual = sdf.format(new Date());

        // Crear el nombre del archivo
        String nombreArchivo = "Ranking." + fechaHoraActual + ".txt";

        // Crear el archivo de ranking
        Path archivoRanking = Path.of(nombreArchivo);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoRanking.toFile()))) {
            // Escribir los datos de los jugadores en el archivo
            for (Jugador jugador : jugadores) {
                writer.write(jugador.toString());
                writer.newLine();
            }
            JOptionPane.showMessageDialog(null, "Archivo de ranking generado correctamente.");
        } catch (IOException e) {
            throw new RuntimeException("Error al generar el archivo de ranking: " + e.getMessage());
        }
    }
}
