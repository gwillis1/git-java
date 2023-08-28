import java.util.Scanner;

public class Inches {
    public static void main (String [] args){
        //Delcaring variables
        int inches;
        int feet;
        int remainder;

         //Prompt user and get input
        Scanner input = new Scanner(System.in) {
            System.out.print("Enter the length in inches: ");
            inches = input.nextInt();
        }
        //Calculation
        feet = inches/12;
        remainder = inches%12;

        //Output
        System.out.println("\nEquivlent length in feet is = " + feet);
        System.out.println("\nThe Remainding in inches is = " + remainder);

    }
}
