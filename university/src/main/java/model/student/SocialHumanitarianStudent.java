package model.student;

import model.SubjectGrade;

import java.util.List;

public class SocialHumanitarianStudent extends Student {
    private String thesisPaper;

    public SocialHumanitarianStudent(String fullName, int studentId, List<SubjectGrade> subjectGrades, String thesisPaper) {
        super(fullName, studentId, subjectGrades);
        this.thesisPaper = thesisPaper;
    }

    public SocialHumanitarianStudent(String fullName, int studentId) {
        super(fullName, studentId);
    }

    public String getThesisPaper() {
        return thesisPaper;
    }

    public void setThesisPaper(String thesisPaper) {
        this.thesisPaper = thesisPaper;
    }
}
