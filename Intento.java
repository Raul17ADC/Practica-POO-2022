
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

    // Método para incrementar el número de intentos
    public void incrementarIntento() {
        if (this.numIntento < MAXNUMINTENTOS) { //Comprueba si se ha alcanzado el número máximo de intentos
            this.numIntento++;
        }
    }

    // Método para comprobar si se ha alcanzado el número máximo de intentos
    public boolean maxIntentosAlcanzados() {
        return this.numIntento >= MAXNUMINTENTOS;
    }
}
