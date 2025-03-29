public abstract class VideoTrack {
    protected String titulo;
    protected double duracion;

    public VideoTrack(String titulo, double duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String toString() {
        return titulo + " --> " + duracion + " min";
    }
}
