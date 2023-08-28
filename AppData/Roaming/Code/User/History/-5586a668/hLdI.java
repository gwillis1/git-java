package TestWedding;

import java.time.LocalDate;

public class Wedding {
    //declare variables
    private String married;
    private LocalDate weddingdateAdded;
    private String location;

    //constructor
    public Wedding(String married, LocalDate weddingdateAdded, String location) {
        this.married = married;
        this.weddingdateAdded = weddingdateAdded;
        this.location = location;
    }
    //Setters
    public void setMarried(String married) {
        this.married = married;
    }
    
    public void setWeddingdateAdded(LocalDate weddingdateAdded) {
        this.weddingdateAdded = weddingdateAdded;
    }
    public void setLocation(String location) {
        this.location = location;
    }
   
    //Getters
    public String getMarried() {
        return married;
    }
    
    public LocalDate getWeddingdateAdded() {
        return weddingdateAdded;
    }
    public String getLocation() {
        return location;
    }
}
