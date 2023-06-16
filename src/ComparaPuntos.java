import java.util.Comparator;

public class ComparaPuntos implements Comparator<Jugador>{
    @Override
    public int compare(Jugador j1, Jugador j2) {
        if (j1.getPuntos() < j2.getPuntos()) {
            return -1;
        } else if (j1.getPuntos() > j2.getPuntos()) {
            return 1;
        }
        return 0;
    }
}