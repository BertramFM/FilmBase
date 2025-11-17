package data;

public class Film {
    private String title;
    private int year;

    public Film(String title, int age) {
        this.title = title;
        this.year = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return year;
    }

    public void setAge(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return title + " ("  + year + ")";
    }
}
