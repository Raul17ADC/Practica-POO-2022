import java.util.Comparator;

/*
 @author Jorge Lozoya Astudillo (j.lozoya.2020@alumnos.urjc.es)
*/

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