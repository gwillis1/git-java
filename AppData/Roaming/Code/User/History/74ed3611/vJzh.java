package ShapesTester;

public class Circle {
    //declare variables
    private double radius;
    private String name;
    private double area;

    //constructors
    public Circle (double radius, String name){
        this.radius = radius;
        this.name = name;
    }

    public void calcArea(){
        area = Math.PI * Math.pow(radius, 2);
    }
    
    public void printArea(){
        System.out.println("The Area of the circle is  " + area);
    }

    public void printName(){
        System.out.println("The Name of the circle is  " + name);
    }
}
