
import java.util.Random;
import javax.swing.JOptionPane;

/*
 @author Jorge Lozoya Astudillo (j.lozoya.2020@alumnos.urjc.es)
*/

public class PistaLetra extends Pista {

    //Atributos
    private char letra;
    private static final int COSTE = 2;

    //Constructor
    public PistaLetra(Palabra palabra) {
        super(COSTE, palabra);
    }

    //Métodos
    @Override
    public void comprarPista(Jugador j) {
        if (j.getPuntos() < this.getCoste()) {
            JOptionPane.showMessageDialog(null, "No tienes suficientes puntos","Error", JOptionPane.WARNING_MESSAGE);
        } else {
            Random random = new Random();
            j.setPuntos(j.getPuntos() - this.getCoste()); // Resta los puntos del coste de la pista
            // Muestra una letra de la palabra como pista
            char letraPista = this.getPalabra().toString().charAt(random.nextInt(5));
            JOptionPane.showMessageDialog(null, "La palabra oculta contiene la " + letraPista);
        }
    }

}
