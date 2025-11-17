package data;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Film> films = new ArrayList<>();

    public void addFilm(Film film) {
        films.add(film);
    }

    public Film playAndRemove() {
        return films.removeFirst();
    }

    public Film nextMovie(){
        return films.getFirst();
    }

    public int getMoviePlaylist() {
        return films.size();
    }

    public List<Film> getFilms() {
        return films;
    }

    public void emptyMovieList (){
        films.clear();
    }
}
