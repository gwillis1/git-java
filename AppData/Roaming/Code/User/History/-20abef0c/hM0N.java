package TestWedding;

public class Couple {
    //declare variables
    private String fname;
    private String lname;
    
    //constructor
    public Couple(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }


    //Setters
    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }


    //Getters
    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
