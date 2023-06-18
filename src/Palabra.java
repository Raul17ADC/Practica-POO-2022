
import java.io.Serializable;
import java.util.Arrays;

public class Palabra implements Serializable{

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Palabra other = (Palabra) obj;
        return Arrays.equals(this.letras, other.letras);
    }
}
