package ShapesTester;

import java.text.DecimalFormat;

public class Square {
    //declare variables
    private double width;
    private double height;
    private String name;
    private double area;
    

public Square (double width, double height, String name){
    this.height = height;
    this.width = width;
    this.name = name;
      
    calculateArea();
  
}
public void calculateArea(){
    area = width * height; 
}
 public void printArea(){
        DecimalFormat df = new DecimalFormat("##.00");
        System.out.println("The Area of the Square is " + df.format(area));

    }

   public void printName(){
        System.out.println("The name of the Square is: " + name);
    }
}
