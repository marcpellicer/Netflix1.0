public class Trailer extends TrackCollection {

    public Trailer(String nombre) {
        super(nombre);
    }

    public String toString() {
        return "Trailers: " + nombre + "\n" + super.toString();
    }
}
