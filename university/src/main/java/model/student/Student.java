package model.student;

import exception.NoSubjectGradesForStudentException;
import exception.SubjectGradeOutOfRangeException;
import model.Subject;
import model.SubjectGrade;

import java.util.List;

public abstract class Student {
    private final String fullName;
    private final int studentId;
    private List<SubjectGrade> subjectGrades;

    protected Student(String fullName, int studentId, List<SubjectGrade> subjectGrades) {
        this.fullName = fullName;
        this.studentId = studentId;
        this.subjectGrades = subjectGrades;
    }

    protected Student(String fullName, int studentId) {
        this.fullName = fullName;
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public int getStudentId() {
        return studentId;
    }

    public List<SubjectGrade> getSubjectGrades() {
        return subjectGrades;
    }

    public void setSubjectGrades(List<SubjectGrade> subjectGrades) {
        this.subjectGrades = subjectGrades;
    }

    public void addGrade(SubjectGrade grade) {
        this.subjectGrades.add(grade);
    }

    public int getAverageGrade() throws SubjectGradeOutOfRangeException, NoSubjectGradesForStudentException {
        if (subjectGrades == null) {
            throw new NoSubjectGradesForStudentException("Student should have at least one subject");
        }
        int sum = 0;
        for (SubjectGrade subjectGrade : subjectGrades) {
            int grade = subjectGrade.getGrade();
            sum += grade;
        }
        return sum / subjectGrades.size();
    }

    public int getGradeBySubject(Subject subject) throws SubjectGradeOutOfRangeException, NoSubjectGradesForStudentException {
        if (subjectGrades == null) {
            throw new NoSubjectGradesForStudentException("Student should have at least one subject");
        }
        for (SubjectGrade grade : subjectGrades) {
            if (grade.getSubject() == subject) {
                return grade.getGrade();
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "student : " + studentId + " " + fullName;
    }
}
