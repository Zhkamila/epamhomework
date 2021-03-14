package model.artist;

public class Composer extends Artist {
    private String instrument;

    public Composer(String firstname, String lastname, int birthYear, String birthPlace, String label, String instrument) {
        super(firstname, lastname, birthYear, birthPlace, label);
        this.instrument = instrument;
    }

    public Composer(String firstname, String lastname, int birthYear, String birthPlace) {
        super(firstname, lastname, birthYear, birthPlace);
    }

    public Composer(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Composer{" +
                "instrument='" + instrument + '\'' +
                '}';
    }
}
