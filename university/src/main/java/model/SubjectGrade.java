package model;

import exception.SubjectGradeOutOfRangeException;

public class SubjectGrade {
    private final Subject subject;
    private final int grade;

    public SubjectGrade(Subject subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getGrade() throws SubjectGradeOutOfRangeException {
        if (grade >= 0 && grade <= 5) {
            return grade;
        } else {
            throw new SubjectGradeOutOfRangeException(grade + " grade is out of range 0-5");
        }
    }
}
