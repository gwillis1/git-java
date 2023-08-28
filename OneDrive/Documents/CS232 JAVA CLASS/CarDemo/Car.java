package CarDemo;

public class Car {
    //attributes
    private String name;
   

    //operations

    
    //contructor
    public Car(String name){
        this.name = name;
    }
    public void printName(){
        System.out.println("The car is: " + this.name);
    }
}
