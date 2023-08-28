import java.util.Scanner;
/*
 * Project Programming 1
 * Author: TY
 * Date: 1/20/2023
 *  Given length in inches, 
 *  your program should output the equivalent length 
 *  in feet and remaining inch(es). 
 */
public class ProgrammingProject {
    private static Scanner input = new Scanner (System.in);

    public static void main (String [] args){
        //Delcaring variables
        int inches;
        int feet;
        int remainder;

         System.out.print("Enter the length in inches: ");
        inches = input.nextInt();
        
        // Calculation
        feet = inches/12;
        remainder = inches%12;

        //Output
        System.out.println("\nEquivlent length in feet is = " + feet);
        System.out.println("\nThe Remainding in inches is = " + remainder);

    }
}