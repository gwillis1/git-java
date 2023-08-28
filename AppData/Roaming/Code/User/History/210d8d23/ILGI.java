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

    public static void main(String[] args){
            input = new Scanner(System.in);
        
            Person[] persons = new Person[14];
            int numCollegeEmployees = 0;
            int numFaculty = 0;
            int numStudents = 0;
        
            while (true) {
                System.out.println("Enter C for College Employee, F for Faculty, S for Student, or Q to quit:");
                String choice = input.nextLine().toUpperCase();
        
                if (choice.equals("Q")) {
                    break;
                }
        
                if (choice.equals("C")) {
                    if (numCollegeEmployees >= 4) {
                        System.out.println("Error: maximum number of College Employees reached.");
                        continue;
                    }
        
                    CollegeEmployee collegeEmployee = new CollegeEmployee();
                    System.out.println("Enter first name:");
                    collegeEmployee.setFirstname(input.nextLine());
                    System.out.println("Enter last name:");
                    collegeEmployee.setLastname(input.nextLine());
                    System.out.println("Enter street address:");
                    collegeEmployee.setStreetadd(input.nextLine());
                    System.out.println("Enter zip code:");
                    collegeEmployee.setZipcode(input.nextLine());
                    System.out.println("Enter phone number:");
                    collegeEmployee.setPhonenum(input.nextLine());
                    System.out.println("Enter social security number:");
                    collegeEmployee.setSsn(input.nextLine());
                    System.out.println("Enter annual salary:");
                    collegeEmployee.setAnnualsalary(Double.parseDouble(input.nextLine()));
                    System.out.println("Enter department name:");
                    collegeEmployee.setDept(input.nextLine());
        
                    persons[numCollegeEmployees + numFaculty] = collegeEmployee;
                    numCollegeEmployees++;
                } else if (choice.equals("F")) {
                    if (numFaculty >= 3) {
                        System.out.println("Error: maximum number of Faculty members reached.");
                        continue;
                    }
        
                    Faculty faculty = new Faculty();
                    System.out.println("Enter first name:");
                    faculty.setFirstname(input.nextLine());
                    System.out.println("Enter last name:");
                    faculty.setLastname(input.nextLine());
                    System.out.println("Enter street address:");
                    faculty.setStreetadd(input.nextLine());
                    System.out.println("Enter zip code:");
                    faculty.setZipcode(input.nextLine());
                    System.out.println("Enter phone number:");
                    faculty.setPhonenum(input.nextLine());
                    System.out.println("Enter social security number:");
                    faculty.setSsn(input.nextLine());
                    System.out.println("Enter annual salary:");
                    faculty.setAnnualsalary(Double.parseDouble(input.nextLine()));
                    System.out.println("Enter department name:");
                    faculty.setDept(input.nextLine());
                    System.out.println("Is the Faculty member tenured? (Y/N):");
                    faculty.setTenured(input.nextLine().equalsIgnoreCase("Y"));
        
                    persons[numCollegeEmployees + numFaculty] = faculty;
                    numFaculty++;
                } else if (choice.equals("S")) {
                    if (numStudents >= 7) {
                        System.out.println("Error: maximum number of Students reached.");
                        continue;
                    }
        
                    Student student = new Student();
                    System.out.println("Enter first name:");
                    student.setFirstname(input.nextLine());
                    System.out.println("Enter last name:");
                    student.setLastname(input.nextLine());
                    System.out.println("Enter street address:");
                    student.setStreetadd(input.nextLine());
                    System.out.println("Enter zip code:");
                    student.setZipcode(input.nextLine());
                    System.out.println("Enter phone number:");
                    student.setPhonenum(input.nextLine());
                    System.out.println("Enter major:");
                    student.setMajor(input.nextLine());
                    System.out.println("Enter grade point average:");
                    student.setGpa(Double.parseDouble(input.nextLine()));
        
                    persons[numCollegeEmployees + numFaculty + numStudents] = student;
                    numStudents++;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        
    }
}
