package day04_variables;

public class Class {
    public static void main(String[] args) {
        int numberOfStudentsInGrade1 = 44;
        int numberOfStudentsInGrade2 = 50;
        int numberOfStudentsInGrade3 = 20;
        int numberOfStudentsInGrade4 = 70;
        int numberOfStudentsInGrade5 = 150;

        //int totalNumberOfStudents = 40+50+20+70+150; // it is hard quoted (manually count)
        //System.out.println(totalNumberOfStudents);

        int totalNumberOfStudents = numberOfStudentsInGrade1 + numberOfStudentsInGrade2 + numberOfStudentsInGrade3 + numberOfStudentsInGrade4 + numberOfStudentsInGrade5;
        System.out.println(totalNumberOfStudents);

        double numberOfSchoolDaysInYear = 100.5;
        double numberOfSnowDaysInYear = 20.5;
        double averageGPA = 3.5;


    }
}
