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

public class Person {
    protected String firstname;
    protected String lastname;
    protected String streetadd;
    protected String zipcode;
    protected String phonenum;
    private Scanner input;

    public Person(){}

    public Person(String firstname, String lastname, String streetadd, String zipcode, String phonenum) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.streetadd = streetadd;
        this.zipcode = zipcode;
        this.phonenum = phonenum;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStreetadd() {
        return streetadd;
    }

    public void setStreetadd(String streetadd) {
        this.streetadd = streetadd;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public void setData() {
        input = new Scanner(System.in);
        System.out.println("Please enter first name:");
        firstname = input.nextLine();
        System.out.println("Please enter last name:");
        lastname = input.nextLine();
        System.out.println("Please enter street address:");
        streetadd = input.nextLine();
        System.out.println("Please enter zip code:");
        zipcode = input.nextLine();
        System.out.println("Please enter phone number:");
        phonenum = input.nextLine();
    }

}

