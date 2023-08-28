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

public class Student extends Person {
    private String major;
    private double gpa;
    private Scanner input;

    public Student() {
        super();
        major = "";
        gpa = 0.0;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void setData() {
        super.setData();
        input = new Scanner(System.in);
        System.out.println("Please enter major:");
        major = input.nextLine();
        System.out.println("Please enter GPA:");
        gpa = Double.parseDouble(input.nextLine());
    }

    @Override
    public String toString() {
        return "Name: " + getFirstname() + " " + getLastname() + "\n" +
                "Address: " + getStreetadd() + ", " + getZipcode() + "\n" +
                "Phone number: " + getPhonenum() + "\n" +
                "Major: " + major + "\n" +
                "GPA: " + gpa + "\n";
    }
}
