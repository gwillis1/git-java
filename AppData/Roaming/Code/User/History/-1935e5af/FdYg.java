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
 * 
 */

package Cube;

import java.util.Scanner;

public class Testercube {
    private static Scanner scanner;

    public static void main(String [] args) {
        cube cube1 = new cube( 10.0, 5.0 ,4.25, "red");
        cube cube2 = new cube( 100.0, 50.0,14.25,"green");
        cube cube3 = new cube( 1.0, 4.0, 42.5, "black");
        cube cube4 = new cube( 10.0,  5.0, 4.25, "pink");
        
        scanner = new Scanner(System.in);
        System.out.println("Enter a volume value:");
        double uservolume = scanner.nextDouble();

        display(cube1, uservolume);
        display(cube2, uservolume);
        display(cube3, uservolume);
        display(cube4, uservolume);



    }
    
        public static void display(cube cube, double uservolume) {
            if(cube.getVolume() > uservolume){
                System.out.println(cube);
            }
            
        }
}
