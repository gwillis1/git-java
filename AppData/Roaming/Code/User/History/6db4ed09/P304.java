import java.util.Scanner;

public class Inches {
    public static void main (String [] args){
        //Delcaring variables
        int inches;
        int feet;
        float centimeter;

        //Prompt user and get input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter feets value: ");
        feet = input.nextInt();
        System.out.print("Enter inches value: ");
        inches = input.nextInt();

        //Calculation
        centimeter = (float) (((feet * 12) + inches) * 2.54);

        //Output
        System.out.println("\nEquivlent length in centimeters is = ");
        

    }
}
