
public class Jugador implements Comparable<Jugador>{

    //Atributos
    private String nombreUsuario;
    private int puntos;
    private Estadisticas estadisticas;

    //Constructores
    public Jugador(String nombreUsuario) {
        if ((nombreUsuario != null) && (!nombreUsuario.isEmpty())) {
            this.nombreUsuario = nombreUsuario;
        }
        puntos = 5;
        estadisticas = new Estadisticas();
    }
    
    public Jugador() {
        nombreUsuario = "Sin definir";
        puntos = 5;
        estadisticas = new Estadisticas();
    }

    //Getters y Setters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public boolean setNombreUsuario(String nombreUsuario) {
        if ((nombreUsuario != null) && (!nombreUsuario.isEmpty())) {
            this.nombreUsuario = nombreUsuario;
            return true;
        }
        return false;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(Estadisticas estadisticas) {
        this.estadisticas = estadisticas;
    }

    //Métodos
    @Override
    public String toString() {
        return "Nombre: " + nombreUsuario + ", Puntos: " + puntos + ", Estadísticas: " + estadisticas;
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
        Jugador other = (Jugador) obj;
        return nombreUsuario.equalsIgnoreCase(other.getNombreUsuario());
    }

    @Override
    public int compareTo(Jugador other) {
        return this.nombreUsuario.compareToIgnoreCase(other.nombreUsuario);
    }
}
