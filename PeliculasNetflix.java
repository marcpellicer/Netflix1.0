public class PeliculasNetflix extends VideoTrack {

    public PeliculasNetflix(String titulo, double duracion) {
        super(titulo, duracion);
    }

    public String toString() {
        return "Película: " + super.toString();
    }
}
