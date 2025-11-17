package app;

import data.Film;
import data.Genre;
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
        printList(allFilms);
        testFiltrering();
        // testPlaylist();
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

    public void testFiltrering(){
        System.out.println("========");
        Playlist play = new Playlist();
        play.addFilm(allFilms.get(0));
        play.addFilm(allFilms.get(1));
        play.addFilm(allFilms.get(2));
        play.addFilm(allFilms.get(9));

        printList(play);
        System.out.println("====");

        for (Film film : play){
            if (film.hasGenre(Genre.Crime)) {
                play.removeFilm(film);
                System.out.println("Removing " + film.getTitle());
            }
        }

        System.out.println("====");
        printList(play);
        System.out.println("====");
    }

    private void initFilms() {
        allFilms.add(new Film("The Godfather", 1972, Genre.Crime));
        allFilms.add(new Film("The Shawshank Redemption", 1994,  Genre.Drama));
        allFilms.add(new Film("Schindler's List", 1993,  Genre.Biography));
        allFilms.add(new Film("Raging Bull",  1980, Genre.Sports));
        allFilms.add(new Film("Casablanca",  1942,  Genre.Romance));
        allFilms.add(new Film("Citizen Kane",  1941, Genre.Mystery));
        allFilms.add(new Film("Gone With The Wind",  1939, Genre.History));
        allFilms.add(new Film("The Wizard Of Oz", 1939, Genre.Adventure));
        allFilms.add(new Film("One Flew Over The Cuckoo's Nest", 1975, Genre.Drama));
        allFilms.add(new Film("Yankee Doodle Dandy",  1942, Genre.Biography));
    }

    private void printList(Iterable<Film> films) {
        for (Film f : films) {
            System.out.println(f.getTitle() + " (" + f.getYear() + ") : " + f.getGenre());
        }
    }


}
