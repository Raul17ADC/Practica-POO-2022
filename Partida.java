import java.util.ArrayList;
import java.util.List;;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Partida {

    // Atributos
    private Jugador ganador, jugador1, jugador2;
    private List<Palabra> palabras;
    private int turno;
    private String palabraAdivinar;
    private String palabraMostrada;
    private boolean entrenamiento;

    private List<Intento> intentosJ1, intentosJ2; //Lista de intentos para cada jugador

    // Constructor
    public Partida(List<String> palabras, Jugador jugador1, Jugador jugador2,String palabraAdivinar) {
        this.palabras = palabras.stream()
                .map(Palabra::new)
                .collect(Collectors.toList());
        this.jugador1 = jugador1;
        this.jugador2 = jugador2 != null ? jugador2 : null;
        this.palabraAdivinar = palabraAdivinar.toLowerCase();
        this.palabraMostrada = new String(new char[palabraAdivinar.length()]).replace('\0', '_');

        ganador = null;
        turno = 1;
        entrenamiento = jugador2 == null;

        intentosJ1 = new ArrayList<>();
        for (int i = 0; i < palabras.size(); i++) {
            intentosJ1.add(new Intento());
        }
        if(!entrenamiento) {
            intentosJ2 = new ArrayList<>();
            for (int i = 0; i < palabras.size(); i++) {
                intentosJ2.add(new Intento());
            }
        }
    }

    // Métodos
    public void acertarPalabra(int index, Jugador j) {
        if (turno == 1) {
            int intentos = intentosJ1.get(index).getNumIntento();
            jugador1.setPuntos(jugador1.getPuntos() + (6 - intentos));
        } else {
            int intentos = intentosJ2.get(index).getNumIntento();
            jugador2.setPuntos(jugador2.getPuntos() + (6 - intentos));
        }
        cambiarTurno();
    }

    public boolean esPalabraCorrecta(String palabraIntroducida) {
        return this.palabraAdivinar.equals(palabraIntroducida.toLowerCase());}

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
    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        while (partidaSigueJugandose()) {
            System.out.println("Palabra a adivinar: " + palabraMostrada);
            Jugador jugadorActual = turno == 1 ? jugador1 : jugador2;
            System.out.println("Turno del jugador: " + jugadorActual.getNombreUsuario());
            String entradaUsuario = obtenerEntradaDelUsuario();

            // ...
            // Tu lógica para manejar las adivinanzas de los jugadores.
            // ...

            // Si la entrada del usuario es una palabra, comprueba si es la palabra correcta.
        else if (entradaUsuario.length() > 1) {
                if (esPalabraCorrecta(entradaUsuario)) {
                    System.out.println("¡Felicidades, " + jugadorActual.getNombreUsuario() + ", has adivinado la palabra!");

                    // Incrementa los puntos del jugador actual según las reglas del juego.
                    jugadorActual.incrementarPuntos();
                } else {
                    System.out.println("Lo siento, " + entradaUsuario + " no es la palabra correcta.");
                }
            }

            cambiarTurno();
        }

        determinarGanador(); // Llama a determinarGanador al final del juego para determinar quién ganó basado en los puntos.
    }

    public void determinarGanador() {
        // El ganador es el jugador con más puntos.
        if (!entrenamiento) {
            if (jugador1.getPuntos() > jugador2.getPuntos()) {
                this.ganador = jugador1;
                System.out.println("El ganador es " + jugador1.getNombreUsuario());
            } else if (jugador2.getPuntos() > jugador1.getPuntos()) {
                this.ganador = jugador2;
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

    public List<Palabra> getPalabras() {
        return palabras;
    }

    public void setPalabras(List<Palabra> palabras) {
        this.palabras = palabras;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public List<Intento> getIntentosJ1() {
        return intentosJ1;
    }

    public void setIntentosJ1(List<Intento> intentosJ1) {
        this.intentosJ1 = intentosJ1;
    }

    public List<Intento> getIntentosJ2() {
        return intentosJ2;
    }

    public void setIntentosJ2(List<Intento> intentosJ2) {
        this.intentosJ2 = intentosJ2;
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