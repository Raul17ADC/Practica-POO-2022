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

    private List<Intento> intentosJ1, intentosJ2; //Lista de intentos para cada jugador

    // Constructor
    public Partida(List<String> palabras, Jugador jugador1, Jugador jugador2,String palabraAdivinar) {
        this.palabras = palabras.stream()
                .map(Palabra::new)
                .collect(Collectors.toList());
        this.jugador1 = new Jugador(jugador1.getNombreUsuario());
        this.jugador2 = new Jugador(jugador2.getNombreUsuario());
        this.palabraAdivinar = palabraAdivinar.toLowerCase();
        this.palabraMostrada = new String(new char[palabraAdivinar.length()]).replace('\0', '_');

        ganador = null;
        turno = 1;
        intentosJ1 = new ArrayList<>();
        intentosJ2 = new ArrayList<>();
        for (int i = 0; i < palabras.size(); i++) {
            intentosJ1.add(new Intento());
            intentosJ2.add(new Intento());
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
        if (this.palabraAdivinar.indexOf(letraIntroducida) >= 0) {
            revelarLetra(letraIntroducida);
            return "La letra " + letraIntroducida + " está en la palabra.";}
        else {
            return "La letra " + letraIntroducida + " no está en la palabra.";
        }
    }

    private void revelarLetra(char letra) {
        StringBuilder nuevaPalabraMostrada = new StringBuilder(palabraMostrada);
        for (int i = 0; i < palabraAdivinar.length(); i++) {
            if (palabraAdivinar.charAt(i) == letra) {
                nuevaPalabraMostrada.setCharAt(i, letra);
            }
        }
        palabraMostrada = nuevaPalabraMostrada.toString();
    }
    public boolean contieneLetra(char letraIntroducida) {
        letraIntroducida = Character.toLowerCase(letraIntroducida);
        return this.palabraAdivinar.indexOf(letraIntroducida) >= 0;
    }
    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        while (ganador == null)
            System.out.println("Palabra a adivinar: " + palabraMostrada);
        {
            Jugador jugadorActual = turno == 1 ? jugador1 : jugador2;
            System.out.println("Turno del jugador: " + jugadorActual.getNombreUsuario());

            // Aquí necesitarías una forma de obtener la entrada del usuario.
            // Como esto es solo un ejemplo, supondremos que ya tienes un método para eso,
            // llamado obtenerEntradaDelUsuario(), que devuelve un string.

            String entradaUsuario = obtenerEntradaDelUsuario();

            // Si la entrada del usuario es una sola letra, comprueba si está en la palabra.
            if (entradaUsuario.length() == 1) {
                char letra = entradaUsuario.charAt(0);
                if (contieneLetra(letra)) {
                    System.out.println("¡La letra " + letra + " está en la palabra!");
                    // Aquí necesitarías actualizar cualquier representación de la palabra que estés mostrando al jugador.
                } else {
                    System.out.println("Lo siento, la letra " + letra + " no está en la palabra.");
                }
            }

            // Si la entrada del usuario es una palabra, comprueba si es la palabra correcta.
            else if (entradaUsuario.length() > 1) {
                if (esPalabraCorrecta(entradaUsuario)) {
                    System.out.println("¡Felicidades, " + jugadorActual.getNombreUsuario() + ", has adivinado la palabra!");
                    ganador = jugadorActual;
                } else {
                    System.out.println("Lo siento, " + entradaUsuario + " no es la palabra correcta.");
                }
            }

            cambiarTurno();
        }

        System.out.println("¡El juego ha terminado! El ganador es " + ganador.getNombreUsuario());
    }

    public void determinarGanador() {
        // El ganador es el jugador con más partidas ganadas.
        // Si hay un empate, el ganador es el jugador con más puntos.
        if (jugador1.getGanadas() > jugador2.getGanadas() ||
                (jugador1.getGanadas() == jugador2.getGanadas() && jugador1.getPuntos() > jugador2.getPuntos())) {
            this.ganador = jugador1;
            System.out.println("El ganador es " + jugador1.getNombreUsuario());
        } else if (jugador2.getGanadas() > jugador1.getGanadas() ||
                (jugador2.getGanadas() == jugador1.getGanadas() && jugador2.getPuntos() > jugador1.getPuntos())) {
            this.ganador = jugador2;
            System.out.println("El ganador es " + jugador2.getNombreUsuario());
        } else {
            // En caso de empate en partidas ganadas y puntos
            System.out.println("La partida ha terminado en empate.");
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
        if (turno == 1) {
            setTurno(2);
        } else {
            setTurno(1);
        }
    }
}