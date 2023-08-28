/*
 * Problem Statement:
 * To complete the task, you need to do the following steps:
 * Define a Java class named "Cube" with the given attributes: length, width, height, color, and volume.
 * Create a constructor that initializes all the attributes except volume.
 * Implement getters for all the attributes.
 * write a function to calculate the volume of the cube and return the float value.
 * override the toString method to print the volume of the cube.
 * 
 * Next, create a java class named "Testercube" and Instantiate four cube objects. Prompt the user to input 
 * a volume value and then print information about all the cubes whose volume is greater
 * than the user-provided value/
 * 
 * author: TY WILLIS
 * date:3/3/2023
 */ 


package Cube;

public class cube {
    //attributes
    
    private double length;
    private double width;
    private double height;
    private String color;
    private double volume;


    
    //constructor
    public cube(double length, double width, double height, String color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.volume = calulateVolume();
    }
    
    //getter
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public double getVolume() {
        return volume;
    }


    public double calulateVolume() {
        return length * width * height;
    }

   @Override
   public String toString(){
    return "Cube { " +
            "length =  " + length +
            "width =  " + width +
            "height =  " + height +
            "color =  " + color +
            "volume =  " + volume +
            '}';
   }
    
}
