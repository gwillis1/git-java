package TestWedding;

public class Couple {
    //declare variables
    private Person firstPerson;
    private Person secondPerson;
    
    //constructor
    public Couple(Person firstPerson, Person secondPerson) {
        this.firstPerson = firstPerson;
        this.secondPerson = secondPerson;
    }



    //Setters
    public Person getFirstPerson() {
        return firstPerson;
    }

    public Person getSecondPerson() {
        return secondPerson;
    }


    //Getters
    public Person setFirstPerson(){
        return firstPerson;
    }
    public Person setSecondPerson(){
        return secondPerson;
    }
}
