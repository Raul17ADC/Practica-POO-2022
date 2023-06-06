public class Estadisticas {

    private int PartidasGanadas;
    private int PartidasEmpatadas;
    private int PartidasPerdidas;
    private int PuntosTotales;


    public Estadisticas() {
        this.PartidasEmpatadas = 0;
        this.PartidasGanadas = 0;
        this.PartidasPerdidas = 0;
        this.PuntosTotales = 0;

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
        return PuntosTotales;
    }

    @Override
    public String toString() {
        return "Estadisticas{" +
                "PartidasGanadas=" + PartidasGanadas +
                ", PartidasEmpatadas=" + PartidasEmpatadas +
                ", PartidasPerdidas=" + PartidasPerdidas +
                ", PuntosTotales=" + PuntosTotales +
                '}';
    }


}


