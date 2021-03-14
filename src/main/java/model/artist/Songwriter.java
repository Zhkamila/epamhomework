package model.artist;

import model.enums.Genre;

public class Songwriter extends Artist {
    private Genre genre;

    public Songwriter(String firstname, String lastname, int birthYear, String birthPlace, String label, Genre genre) {
        super(firstname, lastname, birthYear, birthPlace, label);
        this.genre = genre;
    }

    public Songwriter(String firstname, String lastname, int birthYear, String birthPlace) {
        super(firstname, lastname, birthYear, birthPlace);
    }

    public Songwriter(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
