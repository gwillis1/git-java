import java.util.Scanner;

/*
 * Write a program that takes as input any change expressed
 * in cents. It should then compute the number of half-dollars,
 * quarters, dimes, nickels, and pennies to be returned.
 * Author: TY
 * Date:1/27/2023
 */
public class MakeChange{
    public static void main(String [] args){
         //declare variables
         int amount = 0;
         int cents;
         int halfdollars;
         int quarters;
         int dimes;
         int nickels;
         int pennies;
         Scanner input = new Scanner(System.in);
         //Step 2: Prompt the user and get input
        System.out.println("How many cents do you have ? : ");
        cents = input.nextInt(); 

          //Step:3 Get the Calculation
          halfdollars = (int) (amount / 50) ;
          amount = (int) (halfdollars % 50);
          quarters = (int) (cents / 25);
          amount = (int) (quarters % 25);
          dimes =  (int) (cents / 10);
          amount = (int) (dimes % cents);
          nickels = (int) (cents / 5);
          amount = (int) (nickels % cents);
          pennies = (int) (cents / 1);
          amount = (int) (pennies % cents);

           //Step 4: Printing the results 
         System.out.println("\nThe Half-dollar returned is: " + halfdollars);
         System.out.println("\nThe Quarters returned is: " + quarters);
         System.out.println("\nThe Dimes returned is: " + dimes);
         System.out.println("\nThe Nickels returned is: " + nickels);
         System.out.println("\nThe Pennies returned is: " + pennies);
    }
}