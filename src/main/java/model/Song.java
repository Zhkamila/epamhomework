package model;

import model.artist.Composer;
import model.artist.Performer;
import model.artist.Songwriter;
import model.enums.Genre;

public class Song {
    private String title;
    private Performer performer;
    private Songwriter songwriter;
    private Composer composer;
    private int length;
    private Genre genre;
    private int releaseYear;

    public Song(String title, Performer performer, Songwriter songwriter, Composer composer, int length, Genre genre, int releaseYear) {
        this.title = title;
        this.performer = performer;
        this.songwriter = songwriter;
        this.composer = composer;
        this.length = length;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public Song(String title, int length, Genre genre, int releaseYear) {
        this.title = title;
        this.length = length;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public Song(String title, Performer performer) {
        this.title = title;
        this.performer = performer;
    }

    public String getTitle() {
        return title;
    }

    public Performer getPerformer() {
        return performer;
    }

    public void setPerformer(Performer performer) {
        this.performer = performer;
    }

    public Songwriter getSongwriter() {
        return songwriter;
    }

    public void setSongwriter(Songwriter songwriter) {
        this.songwriter = songwriter;
    }

    public Composer getComposer() {
        return composer;
    }

    public void setComposer(Composer composer) {
        this.composer = composer;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", performer=" + performer +
                ", songwriter=" + songwriter +
                ", composer=" + composer +
                ", length=" + length +
                ", genre=" + genre +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
