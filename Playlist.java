import java.util.ArrayList;
import java.util.Iterator;

public class Playlist {
    private ArrayList<Musicas> lista = new ArrayList<>();

    public Playlist() {
       
        lista.add(new Musicas("Musica 1", true));
        lista.add(new Musicas("Musica 2", false));
        lista.add(new Musicas("Musica 3", false));
        lista.add(new Musicas("Musica 4", false));
        lista.add(new Musicas("Musica 5", false));
        lista.add(new Musicas("Musica 6", true));
        lista.add(new Musicas("Musica 72", true));
    }

    public Iterator<Musicas> getIterator() {
        return lista.iterator();
    }
}