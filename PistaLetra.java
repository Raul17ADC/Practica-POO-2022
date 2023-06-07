public class PistaLetra extends Pista {

    //Atributos
    private char letra;
    private static final int COSTE = 2;

    //Constructor
    public PistaLetra( Palabra palabra) {
        super(COSTE, palabra);
    }

    //Métodos
    @Override
    public void comprarPista(Jugador j) {
        if (j.getPuntos() < this.getCoste()) {
            throw new IllegalArgumentException("No tienes suficientes puntos para comprar esta pista.");
        } else {
            j.setPuntos(j.getPuntos() - this.getCoste()); // Resta los puntos del coste de la pista
            // Provee una letra de la palabra como pista
            char letraPista = this.getPalabra().toString().charAt(0); // Esto simplemente selecciona la primera letra, podrías querer hacer algo más sofisticado
            System.out.println("Pista: La palabra contiene la letra " + letraPista);
        }
    }

}
