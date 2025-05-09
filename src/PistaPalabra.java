
import javax.swing.JOptionPane;

/*
 @author Jorge Lozoya Astudillo (j.lozoya.2020@alumnos.urjc.es)
*/

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
            j.setPuntos(j.getPuntos() - this.getCoste()); 
            JOptionPane.showMessageDialog(null, "La palabra es: " + this.getPalabra().toString());
        }
    }

}
