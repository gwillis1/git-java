package TestWedding;

import java.time.LocalDate;

public class Wedding {
    //declare variables
    private String location;
    private Couple couple;
    private LocalDate weddingdate;

    //constructor
    
    public Wedding(String location, Couple couple, LocalDate weddingdate) {
        this.location = location;
        this.couple = couple;
        this.weddingdate = weddingdate;
    }
    //Getters
    public Couple getCouple() {
        return couple;
    }
    public String getLocation() {
        return location;
    }
    public LocalDate getWeddingDate() {
        return weddingdate;
    }

    //Setter
    public void setLocation(String location) {
        this.location = location;
    }

    public void setCouple(Couple couple) {
        this.couple = couple;
    }
    public void setWeddingdate(LocalDate weddingdate) {
        this.weddingdate = weddingdate;
    }
    public String getBirthDate() {
        return null;
    }

}
