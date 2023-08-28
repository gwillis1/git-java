package ShapesTester;

import java.text.DecimalFormat;

public class Rectangle {
    //declare variables
    private double length;
    private double height;
    private String name;
    private double area;

    //constructor
    public Rectangle(double length, double height, String name){
        this.length = length;
        this.height = height;
        this.name = name;

        calculateArea();
    }
    
    public void calculateArea(){
        area = length * height;
    }
    
    //printing the area of rectangle
    public void printArea(){
        DecimalFormat df = new DecimalFormat("##.00");
        System.out.println("The Area of the Rectangle is " + df.format(area));

    }

    //printing the name 
    public void printName(){
        System.out.println("The name of the Rectangle is: " + name);
    }
}
