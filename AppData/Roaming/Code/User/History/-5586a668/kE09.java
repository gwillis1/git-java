package TestWedding;

import java.time.LocalDate;

public class Wedding {
    //declare variables
    private String fname;
    private String lname;
    private LocalDate weddingdateAdded;
    private String location;

    //constructor
    public Wedding(String fname, String lname, LocalDate weddingdateAdded, String location) {
        this.fname = fname;
        this.lname = lname;
        this.weddingdateAdded = weddingdateAdded;
        this.location = location;
    }

    //Setters
    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public void setWeddingdateAdded(LocalDate weddingdateAdded) {
        this.weddingdateAdded = weddingdateAdded;
    }
    public void setLocation(String location) {
        this.location = location;
    }
   
    //Getters
    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public LocalDate getWeddingdateAdded() {
        return weddingdateAdded;
    }
    public String getLocation() {
        return location;
    }
}
