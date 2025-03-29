public class Plataforma extends TrackCollection {
    private ActorNetflix actor;

    public Plataforma(String nombre, ActorNetflix actor) {
        super(nombre);
        this.actor = actor;
    }

    public ActorNetflix getActor() {
        return actor;
    }

    public void setActor(ActorNetflix actor) {
        this.actor = actor;
    }

    public String toString() {
        return "\n" + "Plataforma: " + nombre + " --> Actor: " + actor.toString() + "\n" + super.toString();
    }
}
