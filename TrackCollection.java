import java.util.ArrayList;
import java.util.List;

public abstract class TrackCollection {
    protected String nombre;
    protected List<VideoTrack> pistas;

    public TrackCollection(String nombre) {
        this.nombre = nombre;
        this.pistas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<VideoTrack> getPistas() {
        return pistas;
    }

    public void agregarPista(VideoTrack pista) {
        pistas.add(pista);
    }

    public void eliminarPista(VideoTrack pista) {
        pistas.remove(pista);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append(":\n");
        for (VideoTrack pista : pistas) {
            sb.append("  ").append(pista.toString()).append("\n");
        }
        return sb.toString();
    }
}
