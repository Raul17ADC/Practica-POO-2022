public class Jugador {

    //Atributos
    private String nombreUsuario;
    private int puntos;
    private Estadisticas estadisticas;

    //Constructores
    public Jugador(String nombreUsuario) {
        if ((nombreUsuario != null) || (!nombreUsuario.equals(""))) {
            this.nombreUsuario = nombreUsuario;
        }
        this.estadisticas = new Estadisticas();
    }

    public Jugador() {
        nombreUsuario = "Sin definir";
    }

    //Getters y Setters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public boolean setNombreUsuario(String nombreUsuario) {
        if ((nombreUsuario != null) || (!nombreUsuario.equals(""))) {
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

    //MÃ©todos


    @Override
    public String toString() {
        return "Jugador{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", puntos=" + puntos +
                ", estadisticas=" + estadisticas +
                '}';
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

}