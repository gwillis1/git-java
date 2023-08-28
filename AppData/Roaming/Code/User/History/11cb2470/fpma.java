import java.util.Scanner;
/*
 * Given the length and width of a rectangle, your java
 * program should compute and output the perimeter and 
 * area of the rectangle.
 * Your code should ask for length and width
 * at the very beginning.
 * Name: GASHOD WIlliS
 * DATE:1/18/2023
 */

public class Rectangle {
    public static void main (String [] args){
        //Delcaring variables
        float length;
        float width;
        float perimeter;
        float area;

        //Prompt user and get input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = input.nextFloat();
        System.out.print("Enter width: ");
        width = input.nextFloat();

        //Calculation
        perimeter = 2 * (length + width);
        area = length * width;

        //Output
        System.out.println("\nPerimeter = " + perimeter);
        System.out.println("\nArea = " + area);
        

    }
}
