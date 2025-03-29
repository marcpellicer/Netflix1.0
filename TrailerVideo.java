public class TrailerVideo extends VideoTrack {

    public TrailerVideo(String titulo, double duracion) {
        super(titulo, duracion);
    }

    public String toString() {
        return "Trailer de Película: " + super.toString();
    }
}
