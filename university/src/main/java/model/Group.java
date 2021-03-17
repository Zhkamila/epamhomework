package model;

import exception.NoStudentsInGroupException;
import exception.NoSubjectGradesForStudentException;
import exception.SubjectGradeOutOfRangeException;
import model.student.Student;

import java.util.List;

public class Group {
    private final String name;
    private int size;
    private List<? extends Student> students;

    public <T extends Student> Group(String name, int size, List<T> students) {
        this.name = name;
        this.size = size;
        this.students = students;
    }

    public Group(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public <T extends Student> List<T> getStudents() {
        return (List<T>) students;
    }

    public <T extends Student> void setStudents(List<T> students) {
        this.students = students;
    }

    public int getAverageGradeBySubject(Subject subject) throws NoStudentsInGroupException, SubjectGradeOutOfRangeException, NoSubjectGradesForStudentException {
        if (students == null) {
            throw new NoStudentsInGroupException("Group should have at least one student");
        }
        int sum = 0;
        for (Student student : students) {
            sum += student.getGradeBySubject(subject);
        }
        return sum / students.size();
    }

    @Override
    public String toString() {
        return name + " group : " + students;
    }
}
