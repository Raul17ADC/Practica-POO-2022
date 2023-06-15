
public class Palabra {

    //Atributos
    private char[] letras;
    public static final int MAX = 5;

    //Constructor
    public Palabra(String p) {
        this.letras = p.toLowerCase().toCharArray();
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
