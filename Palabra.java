public class Palabra {

    //Atributos
    private char[] letras;
    private static final int MAX = 5;

    //Constructor
    public Palabra() {
        letras = new char[MAX];
    }

    //Getter
    public char[] getLetras() {
        return letras;
    }

    //Método
    @Override
    public String toString() {
        return String.valueOf(letras);
    }
}
