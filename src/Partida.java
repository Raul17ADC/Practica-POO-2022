
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Partida {

    // Atributos
    private Jugador perdedor, ganador, jugador1, jugador2;
    private ArrayList<Palabra> palabrasPartida;
    private int turno;
    private String palabraAdivinar;
    private String palabraMostrada;
    private boolean entrenamiento;
    private Intento intento;

    // Constructor
    public Partida(ArrayList<Palabra> palabrasPartida, String jugador1, String jugador2) {
        this.palabrasPartida = new ArrayList<>();
        this.jugador1 = new Jugador(jugador1);
        this.jugador2 = new Jugador(jugador2);
        ganador = null;
        perdedor = null;
        turno = 1;
        intento = new Intento();
        palabraMostrada = new String(new char[5]).replace('\0', '_');
    }

    public Partida(ArrayList<Palabra> palabrasPartida, String jugador1) {
        this.palabrasPartida = new ArrayList<>();
        this.jugador1 = new Jugador(jugador1);
        ganador = null;
        perdedor = null;
        turno = 1;
        entrenamiento = true;
        intento = new Intento();
        palabraMostrada = new String(new char[5]).replace('\0', '_');
    }

    // Métodos
    public void acertarPalabra(int intento, Jugador j) {
        if (intento < Intento.getMAXNUMINTENTOS()) {
            int puntos = 5 - intento;
            j.setPuntos(j.getPuntos() + puntos);
            cambiarTurno();
        }
    }

    public boolean esPalabraCorrecta(String palabraIntroducida) {
        return this.palabraAdivinar.equals(palabraIntroducida.toLowerCase());
    }

    public String comprobarLetra(char letraIntroducida) {
        letraIntroducida = Character.toLowerCase(letraIntroducida);
        boolean letraEncontrada = false;
        boolean posicionCorrecta = false;

        for (int i = 0; i < palabraAdivinar.length(); i++) {
            if (palabraAdivinar.charAt(i) == letraIntroducida) {
                letraEncontrada = true;
                if (palabraMostrada.charAt(i) == '_') {
                    revelarLetra(letraIntroducida, i);
                    posicionCorrecta = true;
                }
            }
        }

        if (letraEncontrada) {
            if (posicionCorrecta) {
                return "La letra " + letraIntroducida + " está en la posición correcta.";
            } else {
                return "La letra " + letraIntroducida + " está en la palabra, pero en la posición incorrecta.";
            }
        } else {
            return "La letra " + letraIntroducida + " no está en la palabra.";
        }
    }

    private void revelarLetra(char letra, int posicion) {
        StringBuilder nuevaPalabraMostrada = new StringBuilder(palabraMostrada);
        nuevaPalabraMostrada.setCharAt(posicion, letra);
        palabraMostrada = nuevaPalabraMostrada.toString();
    }

    public boolean contieneLetra(char letraIntroducida) {
        letraIntroducida = Character.toLowerCase(letraIntroducida);
        return this.palabraAdivinar.indexOf(letraIntroducida) >= 0;
    }

    public void jugar(Palabra palabra, String input) {
        if (intento.getNumIntento() < 5) {
            palabraAdivinar = palabra.toString();
            Jugador jugadorActual = this.getTurno() == 1 ? jugador1 : jugador2;

            if (intento.getNumIntento() < 5) {
                JOptionPane.showMessageDialog(null, "Intentos: " + (intento.getNumIntento() + 1));
            }

            if (esPalabraCorrecta(input)) {
                JOptionPane.showMessageDialog(null, "¡Correcto! La palabra es '" + palabraAdivinar + "'");
                acertarPalabra(intento.getNumIntento(), jugadorActual);
                intento.setNumIntento(0);
            } else {
                StringBuilder mensaje = new StringBuilder();
                for (int i = 0; i < 5; i++) {
                    mensaje.append(comprobarLetra(input.charAt(i))).append("\n");
                }
                JOptionPane.showMessageDialog(null, mensaje.toString());
                intento.incrementarIntento();
            }
        } else{
            JOptionPane.showMessageDialog(null, "Se han acabado los intentos");
            intento.setNumIntento(0);
            cambiarTurno();
        }
    }

    public void terminarPartida() {
        if ((ganador != null && perdedor != null) && !entrenamiento) { // En caso de que haya un empate
            ganador.getEstadisticas().setPartidasGanadas(ganador.getEstadisticas().getPartidasGanadas() + 1);
            perdedor.getEstadisticas().setPartidasPerdidas(perdedor.getEstadisticas().getPartidasPerdidas() + 1);

            // Si no es un entrenamiento, actualizamos los puntos totales del jugador
            if (!entrenamiento) {
                ganador.getEstadisticas().setPuntosTotales(ganador.getEstadisticas().getPuntosTotales() + ganador.getPuntos());
                perdedor.getEstadisticas().setPuntosTotales(perdedor.getEstadisticas().getPuntosTotales() + perdedor.getPuntos());
            }
        } else {
            // Actualiza estadísticas para un empate
            jugador1.getEstadisticas().setPartidasEmpatadas(jugador1.getEstadisticas().getPartidasEmpatadas() + 1);
            jugador2.getEstadisticas().setPartidasEmpatadas(jugador2.getEstadisticas().getPartidasEmpatadas() + 1);

            // Si no es un entrenamiento, actualizamos los puntos totales de cada jugador
            if (!entrenamiento) {
                jugador1.getEstadisticas().setPuntosTotales(jugador1.getEstadisticas().getPuntosTotales() + jugador1.getPuntos());
                jugador2.getEstadisticas().setPuntosTotales(jugador2.getEstadisticas().getPuntosTotales() + jugador2.getPuntos());
            }
        }
    }

    public void determinarGanador() {
        // El ganador es el jugador con más puntos.
        if (!entrenamiento) {
            if (jugador1.getPuntos() > jugador2.getPuntos()) {
                this.ganador = jugador1;
                this.perdedor = jugador2;
                System.out.println("El ganador es " + jugador1.getNombreUsuario());
            } else if (jugador2.getPuntos() > jugador1.getPuntos()) {
                this.ganador = jugador2;
                this.perdedor = jugador1;
                System.out.println("El ganador es " + jugador2.getNombreUsuario());
            } else {
                // En caso de empate en puntos
                System.out.println("La partida ha terminado en empate.");
            }
        } else {
            // Modo entrenamiento. No hay ganador.
            System.out.println("Modo de entrenamiento. No hay ganador.");
        }
    }

    public Jugador getGanador() {
        return ganador;
    }

    public void setGanador(Jugador ganador) {
        this.ganador = ganador;
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

    public Intento getIntento() {
        return intento;
    }

    public void setIntento(Intento intento) {
        this.intento = intento;
    }

//    public List<Palabra> getPalabras() {
//        return palabras;
//    }
//
//    public void setPalabras(ArrayList<Palabra> palabras) {
//        this.palabras = palabras;
//    }
    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    // Cambia el turno del jugador
    public void cambiarTurno() {
        if (!entrenamiento) {
            if (turno == 1) {
                setTurno(2);
            } else {
                setTurno(1);
            }
        }
    }
}
