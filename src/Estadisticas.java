/*
 @author Jorge Lozoya Astudillo (j.lozoya.2020@alumnos.urjc.es)
*/
public class Estadisticas {

    private int partidasGanadas;
    private int partidasEmpatadas;
    private int partidasPerdidas;
    private int puntosTotales;

    public Estadisticas() {
        this.partidasEmpatadas = 0;
        this.partidasGanadas = 0;
        this.partidasPerdidas = 0;
        this.puntosTotales = 0;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public int getPartidasEmpatadas() {
        return partidasEmpatadas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public int getPuntosTotales() {
        return puntosTotales;
    }

    public void setPuntosTotales(int puntosTotales) {
        this.puntosTotales = puntosTotales;
    }

    public void setPartidasEmpatadas(int partidasEmpatadas) {
        this.partidasEmpatadas = partidasEmpatadas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }

    @Override
    public String toString() {
        return "Estadisticas{"
                + "PartidasGanadas=" + partidasGanadas
                + ", PartidasEmpatadas=" + partidasEmpatadas
                + ", PartidasPerdidas=" + partidasPerdidas
                + '}';
    }

}
