package app;

import data.Film;
import data.Playlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FilmBase {
    private List<Film> allFilms = new ArrayList<>();

    public FilmBase() {
    }

    public void start() {
        System.out.println("FilmBasen er startet");
        initFilms();
        // printList(allFilms);
        testPlaylist();
    }

    public void testPlaylist(){
        System.out.println("========");
        Playlist play = new Playlist();
        play.addFilm(allFilms.get(1));
        play.addFilm(allFilms.get(4));
        play.addFilm(allFilms.get(7));

        while(play.hasNext()){
            System.out.println("Playing " + play.nextMovie());
            play.playAndRemove();
        }

    }

    private void initFilms() {
        allFilms.add(new Film("The Godfather", 1972));
        allFilms.add(new Film("The Shawshank Redemption", 1994));
        allFilms.add(new Film("Schindler's List", 1993));
        allFilms.add(new Film("Raging Bull",  1980));
        allFilms.add(new Film("Casablanca",  1942));
        allFilms.add(new Film("Citizen Kane",  1941));
        allFilms.add(new Film("Gone With The Wind",  1939));
        allFilms.add(new Film("The Wizard Of Oz",  1939));
        allFilms.add(new Film("One Flew Over The Cuckoo's Nest",  1975));
        allFilms.add(new Film("Yankee Doodle Dandy",  1942));
    }

    private void printList(Iterable<Film> films) {
        for (Film f : films) {
            System.out.println(f);
        }
    }
}
