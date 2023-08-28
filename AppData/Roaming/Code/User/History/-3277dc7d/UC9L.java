import java.util.Scanner;

/*
 * Write a program that takes as input any change expressed
 * in cents. It should then compute the number of half-dollars,
 * quarters, dimes, nickels, and pennies to be returned.
 * Author: TY
 * Date:1/27/2023
 */
public class MakeChange{
    private static Scanner input = new Scanner(System.in);

    public static void main(String [] args){
         //declare variables
         int amount;
         int cents;
         int halfdollars;
         int quarters;
         int dimes;
         int nickels;
         int pennies;
         //Step 2: Prompt the user and get input
        System.out.println("How many cents do you have ? : ");
        cents = input.nextInt(); 

          //Step:3 Get the Calculation
         amount = cents;
         halfdollars = amount / 50;
         amount = amount % 50;
        quarters = amount / 25;
        amount = amount % 25;
        dimes = amount / 10;
        amount = amount % 10;
        nickels = amount / 5;
        amount = amount % 5;
        pennies = amount;

           //Step 4: Printing the results 
         System.out.println("\nThe Half-dollar returned is: " + halfdollars);
         System.out.println("\nThe Quarters returned is: " + quarters);
         System.out.println("\nThe Dimes returned is: " + dimes);
         System.out.println("\nThe Nickels returned is: " + nickels);
         System.out.println("\nThe Pennies returned is: " + pennies);
    }
}