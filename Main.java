public class Main {
    public static void main(String[] args) {
        
        ActorNetflix actor = new ActorNetflix("Mario Casas Sierra");

        
        PeliculasNetflix pelicula1 = new PeliculasNetflix("Contratiempo", 106.5);
        PeliculasNetflix pelicula2 = new PeliculasNetflix("El fotógrafo de Mauthausen", 110.0);
        PeliculasNetflix pelicula3 = new PeliculasNetflix("Hogar", 103.0);
        TrailerVideo trailer1 = new TrailerVideo("Contratiempo", 1.31);
        TrailerVideo trailer2 = new TrailerVideo("El fotógrafo de Mauthausen", 1.21);

        
        Plataforma plataforma = new Plataforma("Netflix", actor);
        plataforma.agregarPista(pelicula1);
        plataforma.agregarPista(pelicula2);
        plataforma.agregarPista(pelicula3);

        
        Guardadas guardadas = new Guardadas("Para 'Ver Despues'");
        guardadas.agregarPista(pelicula1);
        guardadas.agregarPista(pelicula2);

        
        Trailer trailer = new Trailer("Recomendados");
        trailer.agregarPista(trailer1);
        trailer.agregarPista(trailer2);

        
        System.out.println(plataforma.toString());
        System.out.println(guardadas.toString());
        System.out.println(trailer.toString());
    }
}
