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
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        // Declare arrays for CollegeEmployees, Faculty, and Students
        CollegeEmployee[] collegeEmployees = new CollegeEmployee[4];
        Faculty[] faculty = new Faculty[3];
        Student[] students = new Student[7];
           // Keep track of number of each type of person entered
           int numCollegeEmployees = 0;
           int numFaculty = 0;
           int numStudents = 0;
   
           // Prompt user for input until they choose to quit
           String input = "";
           while (!input.equalsIgnoreCase("Q")) {
               System.out.print("Enter the type of person (C for College Employee, F for Faculty, S for Student, Q to quit): ");
   
               if (input.equalsIgnoreCase("C")) {
                   // Check if maximum number of College Employees already entered
                   if (numCollegeEmployees >= 4) {
                       System.out.println("Maximum number of College Employees already entered.");
                   } else {
                       // Create new CollegeEmployee object and set data
                       CollegeEmployee ce = new CollegeEmployee();
                       ce.setData();
                       collegeEmployees[numCollegeEmployees] = ce;
                       numCollegeEmployees++;
                   }
               } else if (input.equalsIgnoreCase("F")) {
                   // Check if maximum number of Faculty already entered
                   if (numFaculty >= 3) {
                       System.out.println("Maximum number of Faculty already entered.");
                   } else {
                       // Create new Faculty object and set data
                       Faculty f = new Faculty();
                       f.setData();
                       faculty[numFaculty] = f;
                       numFaculty++;
                   }
               } else if (input.equalsIgnoreCase("S")) {
                   // Check if maximum number of Students already entered
                   if (numStudents >= 7) {
                       System.out.println("Maximum number of Students already entered.");
                   } else {
                       // Create new Student object and set data
                       Student s = new Student();
                       s.setData();
                       students[numStudents] = s;
                       numStudents++;
                   }
               } else if (!input.equalsIgnoreCase("Q")) {
                   System.out.println("Invalid input. Please try again.");
               }
           }
   
           // Display report of each group of persons entered
           System.out.println("\nCollege Employees:");
           if (numCollegeEmployees == 0) {
               System.out.println("No College Employees entered.");
           } else {
               for (int i = 0; i < numCollegeEmployees; i++) {
                   System.out.println(collegeEmployees[i].toString());
               }
           }
   
           System.out.println("\nFaculty:");
           if (numFaculty == 0) {
               System.out.println("No Faculty entered.");
           } else {
               for (int i = 0; i < numFaculty; i++) {
                   System.out.println(faculty[i].toString());
               }
           }
   
           System.out.println("\nStudents:");
           if (numStudents == 0) {
               System.out.println("No Students entered.");
           } else {
               for (int i = 0; i < numStudents; i++) {
                   System.out.println(students[i].toString());
               }
           }
       }
    }

        
