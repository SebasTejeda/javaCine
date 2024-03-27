package main.java.pe.edu.upc.entities;

public class Cine {
    private Movie movie;
    private double price;


    public Cine(Movie movie, double price) {
        this.movie = movie;
        this.price = price;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cine{" +
                "movie=" + movie +
                ", price=" + price +
                '}';
    }
}
