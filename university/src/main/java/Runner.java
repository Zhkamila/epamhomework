import exception.*;
import model.*;
import model.student.EngineeringStudent;
import model.student.ScienceTechnologyStudent;
import model.student.SocialHumanitarianStudent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Subject engineering = new Subject("Mechanical Engineering");
        Subject coding = new Subject("Programming Fundamentals");
        Subject history = new Subject("General history");

        SubjectGrade goodHistory = new SubjectGrade(history, 4);
        SubjectGrade badHistory = new SubjectGrade(history, 2);
        SubjectGrade excellentCoding = new SubjectGrade(coding, 5);
        SubjectGrade poorCoding = new SubjectGrade(coding, 3);
        SubjectGrade goodEngineering = new SubjectGrade(engineering, 4);
        SubjectGrade noEnginnering = new SubjectGrade(engineering, 0);
        SubjectGrade invalidGradeMinusTen = new SubjectGrade(history, -10);
        List<SubjectGrade> denisGrades = new ArrayList<>(Arrays.asList(excellentCoding, goodHistory, goodEngineering));
        List<SubjectGrade> indiraGrades = new ArrayList<>(Arrays.asList(goodHistory, poorCoding, noEnginnering));
        List<SubjectGrade> dianaGrades = new ArrayList<>(Arrays.asList(badHistory, goodEngineering, poorCoding));
        List<SubjectGrade> tomGrades = new ArrayList<>(Arrays.asList(poorCoding, goodHistory, goodEngineering));
        List<SubjectGrade> marshallGrades = new ArrayList<>(Arrays.asList(invalidGradeMinusTen, excellentCoding, goodEngineering));

        ScienceTechnologyStudent denis = new ScienceTechnologyStudent("Denis Kim", 1, denisGrades, "awesome project");
        SocialHumanitarianStudent indira = new SocialHumanitarianStudent("Indira Brown", 2, indiraGrades, "Europe history");
        EngineeringStudent diana = new EngineeringStudent("Diana Cool", 3, dianaGrades, "good job");
        ScienceTechnologyStudent tom = new ScienceTechnologyStudent("Tom Smith", 4, tomGrades, "what a project");
        SocialHumanitarianStudent marshall = new SocialHumanitarianStudent("Marshall Swift", 5, marshallGrades, "Something smart");
        EngineeringStudent richard = new EngineeringStudent("Richard Jobs", 6);

        List<EngineeringStudent> engineers = new ArrayList<>(Arrays.asList(diana));
        List<SocialHumanitarianStudent> humanitarians = new ArrayList<>(Arrays.asList(indira, marshall));
        List<ScienceTechnologyStudent> technologists = new ArrayList<>(Arrays.asList(denis, tom));

        Group engineerGroup = new Group("Engineering", 20, engineers);
        Group technologyGroup = new Group("Science and Technology", 50, technologists);
        Group humanitarianGroup = new Group("Social science and humanitarian", 100, humanitarians);
        Group illegalGroup = new Group("Empty group nobody needs", 100);
        List<Group> scienceGroups = new ArrayList<>(Arrays.asList(technologyGroup, humanitarianGroup));
        List<Group> engineeringGroups = new ArrayList<>(Arrays.asList(engineerGroup));

        Faculty scienceFaculty = new Faculty("School of social and digital sciences", scienceGroups);
        Faculty engineeringFaculty = new Faculty("School of Engineering", engineeringGroups);
        Faculty illegalFaculty = new Faculty("Empty faculty nobody wants");

        List<Faculty> faculties = new ArrayList<>(Arrays.asList(scienceFaculty, engineeringFaculty));
        University university = new University("Nazarbayev University", 2010, "Shigeo Katsu", "Nur-sultan", faculties);
        University illegalUniversity = new University("Hogwarts", "Neverland");


        //no exceptions
        try {
            university.checkFaculties();
            System.out.println(university);
            System.out.println("Average grade of Indira is " + indira.getAverageGrade());
            System.out.println("Average grade in science faculty for technology group for programming subject is "
                    + scienceFaculty.getAverageGradeByGroupAndSubject(technologyGroup, coding));
            System.out.println("Average grade for engineering subject in university " + university.getAverageGradeBySubject(engineering));
        } catch (NoFacultiesInUniversityException | SubjectGradeOutOfRangeException | NoSubjectGradesForStudentException | NoGroupsInFacultyException | NoStudentsInGroupException e) {
            e.printStackTrace();
        }

        //all exceptions
        try {
            illegalUniversity.checkFaculties();
        } catch (NoFacultiesInUniversityException e) {
            e.printStackTrace();
        }

        try {
            illegalFaculty.getAverageGradeByGroupAndSubject(illegalGroup, history);
        } catch (NoGroupsInFacultyException | NoStudentsInGroupException | SubjectGradeOutOfRangeException | NoSubjectGradesForStudentException e) {
            e.printStackTrace();
        }

        try {
            illegalGroup.getAverageGradeBySubject(history);
        } catch (NoStudentsInGroupException | SubjectGradeOutOfRangeException | NoSubjectGradesForStudentException e) {
            e.printStackTrace();
        }

        try {
            richard.getAverageGrade();
        } catch (SubjectGradeOutOfRangeException | NoSubjectGradesForStudentException e) {
            e.printStackTrace();
        }

        try {
            marshall.getAverageGrade();
        } catch (SubjectGradeOutOfRangeException | NoSubjectGradesForStudentException e) {
            e.printStackTrace();
        }
    }
}
