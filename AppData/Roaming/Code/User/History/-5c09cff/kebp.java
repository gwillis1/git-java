import java.util.Scanner;

/*
 * Write a program that takes the radius of a sphere 
 * (a floating point number) as input and outputs 
 * the sphere's diameter, circumference, 
 * surface area, and volume. 
 * 
 * Author:TY Willis
 * Date:1/25/2023
 */

public class ProjectProgramming {
    public static void main (String [] args){
        //declare variables
        float radius;
        float diameter;
        float circumference;
        float surfacearea;
        float volume;
        final float pi_value = 3.14159f;  
        Scanner input = new Scanner(System.in);
        
        //Step 2: Prompt the user and get input
        System.out.println("The Sphere Radius Value is : ");
        radius = input.nextFloat(); 

         //Step:3 Get the Calculation
         diameter = 2 * radius;
         circumference = (float) ( 2 *Math.PI * diameter);
         surfacearea =  (float) (4 *Math.PI * radius *radius);
         volume =  (float) (4/3 * Math.PI *radius *radius *radius);

        //Step 4: Printing the results 
         System.out.println("\nThe Diameter is: " + diameter);
         System.out.println("\nThe Circumference is: " + circumference);
         System.out.println("\nThe SurfaceArea is: " + surfacearea);
         System.out.println("\nThe Volume is: " + volume);










    }
}