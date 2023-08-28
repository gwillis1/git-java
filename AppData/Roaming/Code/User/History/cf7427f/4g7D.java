package TestWedding;

import java.time.LocalDate;

public class Person {
    //declare variables
    private String fname;
    private String lname;
    private LocalDate bdayAdded;

    //Setters
    public Person(String fname, String lname, LocalDate bdayAdded) {
        this.fname = fname;
        this.lname = lname;
        this.bdayAdded = bdayAdded;
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
    public LocalDate getBdayAdded() {
        return bdayAdded;
    }

    //Setters
    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setBdayAdded(LocalDate bdayAdded) {
        this.bdayAdded = bdayAdded;
    }


    

    
}
