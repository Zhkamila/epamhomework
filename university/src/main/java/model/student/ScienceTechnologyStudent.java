package model.student;

import model.SubjectGrade;

import java.util.List;

public class ScienceTechnologyStudent extends Student {
    private String scienceProject;

    public ScienceTechnologyStudent(String fullName, int studentId) {
        super(fullName, studentId);
    }

    public ScienceTechnologyStudent(String fullName, int studentId, List<SubjectGrade> subjectGrades, String scienceProject) {
        super(fullName, studentId, subjectGrades);
        this.scienceProject = scienceProject;
    }

    public String getScienceProject() {
        return scienceProject;
    }

    public void setScienceProject(String scienceProject) {
        this.scienceProject = scienceProject;
    }
}
