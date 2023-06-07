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
            throw new IllegalArgumentException("No tienes suficientes puntos para comprar esta pista.");
        } else {
            j.setPuntos(j.getPuntos() - this.getCoste()); // Resta los puntos del coste de la pista
            // Provee la mitad de la palabra como pista
            String palabraPista = this.getPalabra().toString().substring(0, this.getPalabra().toString().length() / 2); // Selecciona la primera mitad de la palabra
            System.out.println("Pista: La primera mitad de la palabra es " + palabraPista);
        }
    }

}