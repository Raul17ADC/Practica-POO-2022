/*
 @author Jorge Lozoya Astudillo (j.lozoya.2020@alumnos.urjc.es)
*/
public class Intento {

    // Atributos
    private int numIntento;
    private static final int MAXNUMINTENTOS = 5; // Constante para el número máximo de intentos

    // Constructor
    public Intento() {
        this.numIntento = 0; //Inicializamos el número de intentos a 0
    }

    // Getters y Setters
    public int getNumIntento() {
        return numIntento;
    }

    public void setNumIntento(int numIntento) {
        this.numIntento = numIntento;
    }

    public static int getMAXNUMINTENTOS() {
        return MAXNUMINTENTOS;
    }

    // Método para incrementar el número de intentos
    public void incrementarIntento() {
        if (this.numIntento < MAXNUMINTENTOS) { // Si no se ha alcanzado el máximo número de intentos...
            this.numIntento++;
        }
    }
}
