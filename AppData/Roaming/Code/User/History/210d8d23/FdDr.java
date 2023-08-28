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
public class CollegeList {

    public static void main(String[] args){
        CollegeEmployee[] collegeEmployees = new CollegeEmployee[4];
        Faculty[] facultyMembers = new Faculty[3];
        Student[] students = new Student[7];


        for (CollegeEmployee employee : collegeEmployees) {
            System.out.println("College Employee: " + employee.getFirstname() + " " + employee.getLastname());
            System.out.println("Address: " + employee.getStreetadd() + ", " + " " + employee.getZipcode());
            System.out.println("Phone: " + employee.getPhonenum());
            System.out.println("SSN: " + employee.getSsn());
            System.out.println("Salary: $" + employee.getAnnualSalary());
            System.out.println("Department: " + employee.getDept());
        }

        for (Faculty faculty : facultyMembers) {
            System.out.println("Faculty: " + faculty.getFirstname() + " " + faculty.getLastname());
            System.out.println("Address: " + faculty.getStreetadd() + ", " + " " + faculty.getZipcode());
            System.out.println("Phone: " + faculty.getPhonenum());
            System.out.println("SSN: " + faculty.getSsn());
            System.out.println("Salary: $" + faculty.getAnnualSalary());
            System.out.println("Department: " + faculty.getDept());
            System.out.println("Tenured: " + (faculty.isTenured() ? "Yes" : "No"));
        }

        for (Student student : students) {
            System.out.println("Student: " + student.getFirstname() + " " + student.getLastname());
            System.out.println("Address: " + student.getStreetadd() + ", " + " " + student.getZipcode());
            System.out.println("Phone: " + student.getPhonenum());
            System.out.println("Major: " + student.getMajor());
            System.out.println("GPA: " + student.getGpa());
        }
    }
}
