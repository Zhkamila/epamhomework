package model.student;

import model.SubjectGrade;

import java.util.List;

public class EngineeringStudent extends Student {
    private String engineeringWork;

    public EngineeringStudent(String fullName, int studentId, List<SubjectGrade> subjectGrades, String engineeringWork) {
        super(fullName, studentId, subjectGrades);
        this.engineeringWork = engineeringWork;
    }

    public EngineeringStudent(String fullName, int studentId) {
        super(fullName, studentId);
    }

    public String getEngineeringWork() {
        return engineeringWork;
    }

    public void setEngineeringWork(String engineeringWork) {
        this.engineeringWork = engineeringWork;
    }
}
