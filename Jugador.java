public class Jugador {

    //Atributos
    private String nombreUsuario;
    private int puntos, ganadas, perdidas, empatadas;

    //Constructores
    public Jugador(String nombreUsuario) {
        if ((nombreUsuario != null) || (!nombreUsuario.equals(""))) {
            this.nombreUsuario = nombreUsuario;
        }
    }

    public Jugador(){
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

    public int getGanadas() {
        return ganadas;
    }

    public void setGanadas(int ganadas) {
        this.ganadas = ganadas;
    }

    public int getPerdidas() {
        return perdidas;
    }

    public void setPerdidas(int perdidas) {
        this.perdidas = perdidas;
    }

    public int getEmpatadas() {
        return empatadas;
    }

    public void setEmpatadas(int empatadas) {
        this.empatadas = empatadas;
    }

    //MÃ©todos
    @Override
    public String toString() {
        return "Nombre de usuario: " + nombreUsuario + "\n" + "Puntos: " + puntos + "\n"
                + "Partidas ganadas: " + ganadas + "\n" + "Partidas perdidas: " + perdidas + "\n"
                + "Partidas empatadas: " + empatadas + "\n";
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

    public void incrementarPuntos() {
        //Hacer clase
    }
}