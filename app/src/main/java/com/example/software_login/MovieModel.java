package com.example.software_login;


public class MovieModel {
    private String movieName;
    private int releaseDate;
    private int poster;

    public MovieModel(String movieName, int releaseDate, int poster) {
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.poster = poster;
    }

    public MovieModel(String movieName, int releaseDate) {
        this.movieName = movieName;
        this.releaseDate = releaseDate;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getPoster() {
        return poster;
    }

    MovieModel() {

    }
}
