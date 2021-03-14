package model.artist;

public abstract class Artist {
    private String firstname;
    private String lastname;
    private int birthYear;
    private String birthPlace;
    private String label;

    protected Artist(String firstname, String lastname, int birthYear, String birthPlace, String label) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthYear = birthYear;
        this.birthPlace = birthPlace;
        this.label = label;
    }

    protected Artist(String firstname, String lastname, int birthYear, String birthPlace) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthYear = birthYear;
        this.birthPlace = birthPlace;
    }

    protected Artist(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthYear=" + birthYear +
                ", birthPlace='" + birthPlace + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
