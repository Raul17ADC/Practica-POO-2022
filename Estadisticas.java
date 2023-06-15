public class Estadisticas {

    private int PartidasGanadas;
    private int PartidasEmpatadas;
    private int PartidasPerdidas;
    private int puntosTotales;


    public Estadisticas() {
        this.PartidasEmpatadas = 0;
        this.PartidasGanadas = 0;
        this.PartidasPerdidas = 0;
        this.puntosTotales=0;

    }

    public int getPartidasGanadas() {
        return PartidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        PartidasGanadas = partidasGanadas;
    }

    public int getPartidasEmpatadas() {
        return PartidasEmpatadas;
    }


    public int getPartidasPerdidas() {
        return PartidasPerdidas;
    }

    public int getPuntosTotales() {
        return puntosTotales;
    }

    public void setPuntosTotales(int puntosTotales) {
        this.puntosTotales = puntosTotales;
    }

    public void setPartidasEmpatadas(int partidasEmpatadas) {
        PartidasEmpatadas = partidasEmpatadas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        PartidasPerdidas = partidasPerdidas;
    }

    @Override
    public String toString() {
        return "Estadisticas{" +
                "PartidasGanadas=" + PartidasGanadas +
                ", PartidasEmpatadas=" + PartidasEmpatadas +
                ", PartidasPerdidas=" + PartidasPerdidas +
                '}';
    }


}


