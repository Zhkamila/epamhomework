package model.enums;

public enum Genre {
    CLASSICAL("Classical"),
    HIPHOP("Hip-hop"),
    INDIEROCK("Indie rock"),
    KPOP("K-pop"),
    POP("Pop"),
    ROCK("Rock");

    private String genreName;

    Genre(String genreName) {
        this.genreName = genreName;
    }

    public String getGenreName() {
        return genreName;
    }

    @Override
    public String toString() {
        return genreName;
    }
}