package model;

import exception.NoFacultiesInUniversityException;
import exception.NoStudentsInGroupException;
import exception.NoSubjectGradesForStudentException;
import exception.SubjectGradeOutOfRangeException;

import java.util.List;

public class University {
    private final String name;
    private final String location;
    private int yearEstablished;
    private String president;
    private List<Faculty> faculties;

    public University(String name, int yearEstablished, String president, String location, List<Faculty> faculties) {
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.president = president;
        this.location = location;
        this.faculties = faculties;
    }

    public University(String name, int yearEstablished, String president, String location) {
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.president = president;
        this.location = location;
    }

    public University(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getYearEstablished() {
        return yearEstablished;
    }

    public void setYearEstablished(int yearEstablished) {
        this.yearEstablished = yearEstablished;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getLocation() {
        return location;
    }

    public List<Faculty> getFaculties() {
        return this.faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public void addFaculty(Faculty faculty) {
        this.faculties.add(faculty);
    }

    public void checkFaculties() throws NoFacultiesInUniversityException {
        if (this.faculties == null) {
            throw new NoFacultiesInUniversityException("University should have at least one faculty");
        }
    }

    public int getAverageGradeBySubject(Subject subject) throws SubjectGradeOutOfRangeException, NoSubjectGradesForStudentException, NoStudentsInGroupException {
        int sum = 0;
        for (Faculty faculty : faculties) {
            sum += faculty.getAverageGradeBySubject(subject);
        }
        return sum / faculties.size();
    }

    @Override
    public String toString() {
        return name + faculties;
    }
}
