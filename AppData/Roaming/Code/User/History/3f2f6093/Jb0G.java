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

public class CollegeEmployee extends Person {

    private String ssn;
    private double annualSalary;
    private String dept;
    private Scanner input;

    //Getters
    public String getSsn() {
        return ssn;
    }
    public double getAnnualSalary() {
        return annualSalary;
    }
    public String getDept() {
        return dept;
    }

    //Setters
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public void setData() {
        super.setData();
        input = new Scanner(System.in);
        System.out.println("Please enter Social Security number");
        ssn = input.nextLine();
        System.out.println("Please enter annual salary");
        annualSalary = Double.parseDouble(input.nextLine());
        System.out.println("Please enter employee's department");
        dept = input.nextLine();
    }
    @Override
    public String toString() {
        return super.toString() + " SSN: " + ssn + " Salary $" + annualSalary + " Department: " + dept;
    }
}

