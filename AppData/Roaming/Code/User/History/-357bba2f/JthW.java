import java.util.Scanner;

/*
 * Problem Statement: Given a radius of the circlr
 * write a program to calculate and display the area
 * diameter and of the circle.
 * Your code should ask for the radius
 * Author: TY
 * Date: 1/23/2023
 */
public class circle {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //Step 1: Declare Variables
        float diameter;
        float radius;
        float area;
        //Step 2: Prompt the user and get input
        System.out.println("Enter the radius value: ");
        radius = input.nextFloat();
        

        //Step:3 Get the Calculation
        diameter = 2 * radius;
       // area = pi_value * radius * radius;
        area = (float) Math.PI * radius *radius;

        //Step 4: Printing the results 
        System.out.println("\nThe diameter is: " + diameter);
        System.out.println("\nThe Area is: " + area); 
    }
}