public class Guardadas extends TrackCollection {

    public Guardadas(String nombre) {
        super(nombre);
    }

    public String toString() {
        return "Guardadas: " + nombre + "\n" + super.toString();
    }
}
