package data;

public class Film {
    private String title;
    private int year;
    private Genre genre;

    public Film(String title, int age) {
        this.title = title;
        this.year = age;
    }

    public Film(String title, int year, Genre genre) {
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public boolean hasGenre(Genre genre){
        return this.genre.equals(genre);
    }

    @Override
    public String toString() {
        return title + " ("  + year + ")";
    }
}
