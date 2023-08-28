import java.util.Scanner;

/*
 * Write a program that takes as input given lengths
 * expressed in feet and inches and converts the output the
 * lengths in centimeters
 * 
 * Author: TY WIllis
 * Date:1/25/2023
 */
public class ConvertLength{
    private static Scanner input = new Scanner (System.in);

    public static void main(String[] args){
        //declares variables
        int inches;
        int feet;
        float centimeters;
        //prompt user to get input
        System.out.print("Enter the inches value: ");
        inches = input.nextInt();
        System.out.print("Enter the feet value: ");
        feet = input.nextInt();
        //calculations
        centimeters = (float) ((feet * 12 + inches)*2.54);
        //print results
        System.out.println("\nEquivlent length in centimneters is = "+ centimeters);

        


    }
}