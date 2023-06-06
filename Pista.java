public abstract class Pista {

    //Atributos
    private int coste;
    private Palabra palabra;

    //Constructor
    public Pista(int coste, Palabra palabra){
        this.coste = coste;
        this.palabra = palabra;
    }

    //Getters y setters
    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public Palabra getPalabra() {
        return palabra;
    }

    public void setPalabra(Palabra palabra) {
        this.palabra = palabra;
    }

    //Métodos
    public abstract void comprarPista(Jugador j);
}
