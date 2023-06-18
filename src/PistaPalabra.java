
import javax.swing.JOptionPane;


public class PistaPalabra extends Pista {

    private static final int COSTE = 5;

    //Constructor
    public PistaPalabra(Palabra palabra) {
        super(COSTE, palabra);
    }

    //Métodos
    @Override
    public void comprarPista(Jugador j) {
        if (j.getPuntos() < this.getCoste()) {
            JOptionPane.showMessageDialog(null, "No tienes suficientes puntos","Error", JOptionPane.WARNING_MESSAGE);
        } else {
            j.setPuntos(j.getPuntos() - this.getCoste()); // Resta los puntos del coste de la pista
            JOptionPane.showMessageDialog(null, "La palabra es: " + this.getPalabra().toString());
        }
    }

}
