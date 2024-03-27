package main.java.pe.edu.upc.entities;

public class Movie {
    private String title;
    private String duration;
    private int minimum_age;
    private String director;

    public Movie(String title, String duration, int minimum_age, String director) {
        this.title = title;
        this.duration = duration;
        this.minimum_age = minimum_age;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getMinimum_age() {
        return minimum_age;
    }

    public void setMinimum_age(int minimum_age) {
        this.minimum_age = minimum_age;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                ", minimum_age=" + minimum_age +
                ", director='" + director + '\'' +
                '}';
    }
}
