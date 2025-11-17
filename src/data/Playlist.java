package data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Playlist implements Iterable<Film> {
    private List<Film> films = new ArrayList<>();

    public void addFilm(Film film) {
        if (!hasFilm(film)) {
            films.add(film);
        } else {
            System.out.println("movie " + film + " not added");
        }
    }

    public void removeFilm(Film film) {
        films.remove(film);
    }

    public Film playAndRemove() {
        return films.removeFirst();
    }

    public Film nextMovie(){
        try {
            return films.getFirst();
        } catch (Exception e) {
            return null;
        }
    }

    public boolean hasNext(){
        return !films.isEmpty();
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

    public boolean hasFilm(Film film){
        return films.contains(film);
    }

    @Override
    public Iterator<Film> iterator() {
        return films.iterator();
    }
}
