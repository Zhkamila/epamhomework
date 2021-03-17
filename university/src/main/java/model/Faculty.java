package model;

import exception.NoGroupsInFacultyException;
import exception.NoStudentsInGroupException;
import exception.NoSubjectGradesForStudentException;
import exception.SubjectGradeOutOfRangeException;

import java.util.List;

public class Faculty {
    private final String name;
    private List<Group> groups;

    public Faculty(String name) {
        this.name = name;
    }

    public Faculty(String name, List<Group> groups) {
        this.name = name;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public void addGroup(Group group) {
        this.groups.add(group);
    }

    public int getAverageGradeByGroupAndSubject(Group group, Subject subject) throws NoGroupsInFacultyException, NoStudentsInGroupException, SubjectGradeOutOfRangeException, NoSubjectGradesForStudentException {
        if (this.groups == null) {
            throw new NoGroupsInFacultyException("Faculty should have at least one group");
        }
        return group.getAverageGradeBySubject(subject);
    }

    public int getAverageGradeBySubject(Subject subject) throws SubjectGradeOutOfRangeException, NoSubjectGradesForStudentException, NoStudentsInGroupException {
        int sum = 0;
        for (Group group : groups) {
            sum += group.getAverageGradeBySubject(subject);
        }
        return sum / groups.size();
    }

    @Override
    public String toString() {
        return "\n" + name + " faculty : " + groups;
    }
}
