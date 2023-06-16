
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class Administrador {

    private List<Palabra> palabras;
    private boolean pistaLetra;
    private boolean pistaPalabra;
    private List<Partida> partidas;

    public Administrador() {
        palabras = new ArrayList<>();
        partidas = new ArrayList<>();
    }

    public void agregarPalabra(Palabra palabra) {
        palabras.add(palabra);
    }

    public void eliminarPalabra(Palabra palabra) {
        palabras.remove(palabra);
    }

    public boolean existeJugador(String nombre) {
        Path archivoJugadores = Path.of("ficheros/jugadores.txt");
        if (Files.exists(archivoJugadores)) {
            try ( BufferedReader reader = Files.newBufferedReader(archivoJugadores)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Comparar el nombre con cada línea del archivo
                    if (line.trim().equalsIgnoreCase(nombre)) {
                        return true; // El nombre coincide
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException("Error al leer el archivo de jugadores: " + e.getMessage());
            }
        }
        return false; // El nombre no se encontró en el archivo
    }

    public void agregarNuevoJugador(String nombre) {
        // Verificar si el archivo de jugadores existe, de lo contrario, crearlo
        Path archivoJugadores = Paths.get("ficheros/jugadores.txt");
        if (!Files.exists(archivoJugadores)) {
            try {
                Files.createFile(archivoJugadores);
            } catch (IOException e) {
                throw new RuntimeException("Error al crear el archivo de jugadores: " + e.getMessage());
            }
        }

        // Verificar si el jugador ya existe en el archivo
        if (existeJugador(nombre)) {
            JOptionPane.showMessageDialog(null, "Ya existe un jugador con el nombre: " + nombre, "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Crear el objeto Jugador con valores predeterminados
        Jugador jugador = new Jugador(nombre);

        // Agregar el jugador al final del archivo
        try ( BufferedWriter writer = Files.newBufferedWriter(archivoJugadores, StandardOpenOption.APPEND)) {
            writer.write(jugador.toString());
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException("Error al escribir en el archivo de jugadores: " + e.getMessage());
        }
    }

    public void eliminarJugador(String nombre) {
        // Verificar si el archivo de jugadores existe
        Path archivoJugadores = Paths.get("ficheros/jugadores.txt");
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

    public void crearRankingAlfabetico() {
        // Obtener la ruta del archivo de jugadores
        Path archivoJugadores = Paths.get("ficheros/jugadores.txt");

        // Verificar si el archivo existe
        if (!Files.exists(archivoJugadores)) {
            JOptionPane.showMessageDialog(null, "El archivo de jugadores no existe.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear una lista para almacenar los jugadores leídos del archivo
        List<Jugador> jugadores = new ArrayList<>();

        // Leer los jugadores del archivo
        try ( BufferedReader reader = Files.newBufferedReader(archivoJugadores)) {
            String line;
            while ((line = reader.readLine()) != null) {
                Scanner scanner = new Scanner(line);
                scanner.useDelimiter(",");
                if (scanner.hasNext()) {
                    String nombre = scanner.next().trim();
                    if (scanner.hasNext()) {
                        String puntosStr = scanner.next().trim();
                        int puntos = Integer.parseInt(puntosStr.substring(puntosStr.indexOf(":") + 1).trim());
                        Jugador jugador = new Jugador(nombre);
                        jugador.setPuntos(puntos);
                        jugador.setEstadisticas(new Estadisticas());
                        jugadores.add(jugador);
                    }
                }
                scanner.close();
            }
        } catch (IOException e) {
            throw new RuntimeException("Error al leer el archivo de jugadores: " + e.getMessage());
        }

        // Ordenar los jugadores alfabéticamente
        Collections.sort(jugadores);

        // Obtener la fecha y hora actual para formatear el nombre del archivo
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy-HH.mm");
        String fechaHoraActual = sdf.format(new Date());

        // Crear el nombre del archivo
        String nombreArchivo = "Listado." + fechaHoraActual + ".txt";

        // Crear el archivo de jugadores
        Path archivoRanking = Paths.get(nombreArchivo);
        try ( BufferedWriter writer = Files.newBufferedWriter(archivoRanking)) {
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

    /*
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
        try ( BufferedWriter writer = new BufferedWriter(new FileWriter(archivoRanking.toFile()))) {
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
     */
}
