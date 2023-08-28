/* 
* Problem Statement: Write an application named CollegeList 
* that declares an array of four “regular” CollegeEmployees, three Faculty, 
* and seven Students. Prompt the user to specify which type of person’s data
* will be entered (C, F, or S), or allow the user to quit (Q). 
* While the user chooses to continue (that is, does not quit), 
* accept data entry for the appropriate type of Person. 
* If the user attempts to enter data for more than four CollegeEmployees, 
* three Faculty, or seven Students, display an error message. 
* When the user quits, display a report on the screen listing each group of Persons 
* under the appropriate heading of “College Employees,” “Faculty,” or “Students.” 
* If the user has not entered data for one or more types of Persons during a session, display an appropriate message under the appropriate heading.
* Author: TY
* Date: 3/29/2023
*/
package ProgrammingProject_7;
import java.util.Scanner;

public class CollegeList {
    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);

        // Declare arrays for each type of person
        CollegeEmployee[] collegeEmployees = new CollegeEmployee[4];
        Faculty[] faculty = new Faculty[3];
        Student[] students = new Student[7];

        int numCollegeEmployees = 0;
        int numFaculty = 0;
        int numStudents = 0;

        boolean quit = false;
        while (!quit) {
            System.out.println("Type C, F or S to enter data for\n(C)ollege employee\n(F)aculty\n(S)tudent\nor type Q to quit");
            String option = input.nextLine();

            switch (option) {
                case "C":
                    if (numCollegeEmployees >= 4) {
                        System.out.println("Error: You cannot enter data for more than four college employees.");
                    } else {
                        CollegeEmployee collegeEmployee = new CollegeEmployee();
                        collegeEmployee.setData();
                        collegeEmployees[numCollegeEmployees] = collegeEmployee;
                        numCollegeEmployees++;
                    }
                    break;
                case "F":
                    if (numFaculty >= 3) {
                        System.out.println("Error: You cannot enter data for more than three faculty members.");
                    } else {
                        Faculty newFaculty = new Faculty();
                        newFaculty.setData();
                        faculty[numFaculty] = newFaculty;
                        numFaculty++;
                    }
                    break;
                case "S":
                    if (numStudents >= 7) {
                        System.out.println("Error: You cannot enter data for more than seven students.");
                    } else {
                        Student student = new Student();
                        student.setData();
                        students[numStudents] = student;
                        numStudents++;
                    }
                    break;
                case "Q":
                    quit = true;
                    break;
                default:
                    System.out.println("Error: Invalid option. Please enter C, F, S, or Q.");
            }
        }

        boolean collegeEmployeesExist = false;
        boolean facultyExists = false;
        boolean studentsExist = false;

        System.out.println("\nCollege Employees:");
        for (int i = 0; i < numCollegeEmployees; i++) {
            CollegeEmployee collegeEmployee = collegeEmployees[i];
            System.out.println(collegeEmployee.toString());
            collegeEmployeesExist = true;
        }
        if (!collegeEmployeesExist) {
            System.out.println("No college employees entered.");
        }

        System.out.println("\nFaculty:");
        for (int i = 0; i < numFaculty; i++) {
            Faculty facultyMember = faculty[i];
            System.out.println(facultyMember.toString());
            facultyExists = true;
        }
        if (!facultyExists) {
            System.out.println("No faculty entered.");
        }

        System.out.println("\nStudents:");
        for (int i = 0; i < numStudents; i++) {
            Student student = students[i];
            System.out.println(student.toString());
            studentsExist = true;
        }
        if (!studentsExist) {
            System.out.println("No students entered.");
        }
    }
}
