package TestWedding;

import java.time.LocalDate;

public class Person {
    //declare variables
    private String fname;
    private String lname;
    private LocalDate birthdate;

    //Setters
    public Person(String fname, String lname, LocalDate birthdate) {
        this.fname = fname;
        this.lname = lname;
        this.birthdate = birthdate;
    }

    public Person(String fname2, int i) {
    }

    //Getters
    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public LocalDate getBirthDate() {
        return birthdate;
    }

    //Setters
    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }


    

    
}
