package simulado.sala.ex1;

import simulado.sala.erro.ErroCritico;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Catalogo {

    private ArrayList<Video> videos;

    public Catalogo() {
        videos = new ArrayList<>();
    }

    public boolean adicionar(Video v) throws ErroCritico {
        if (videos.contains(v)) {
            throw new ErroCritico("Video " + v + "ja existente!");
        }
        return videos.add(v);
    }

    public boolean remover(Video v) {
        return videos.remove(v);
    }

    public Stream<Video> getStream() {
        return videos.stream();
    }

}
