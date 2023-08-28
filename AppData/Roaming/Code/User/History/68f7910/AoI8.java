package BarChartss;
import java.util.Scanner;

public class BarChart {
    private static Scanner input;

    public static void main(String[] args) {
        //declare variables
         int artPoints;
         int bobPoints;
         int calPoints;
         int danPoints;
         int eliPoints;

        input = new Scanner(System.in);

        //Prompt user the input for the points

        System.out.print("Enter points scored by Art: ");
            artPoints = input.nextInt();
        System.out.print("Enter points scored by Bob: ");
            bobPoints = input.nextInt();
        System.out.print("Enter points scored by Cal: ");
            calPoints = input.nextInt();
        System.out.print("Enter points scored by Dan: ");
            danPoints = input.nextInt();
        System.out.print("Enter points scored by Eli: ");
            eliPoints = input.nextInt();

         //Display points on Bar Chart

        System.out.println("\nPoints Bar Chart:");
        System.out.println("Art   : " + printAsterisks(artPoints));
        System.out.println("Bob   : " + printAsterisks(bobPoints));
        System.out.println("Cal   : " + printAsterisks(calPoints));
        System.out.println("Dan   : " + printAsterisks(danPoints));
        System.out.println("Eli   : " + printAsterisks(eliPoints));
    }

        //for loop the asterisk for the points

    public static String printAsterisks(int points) {
        String asterisks = " ";
        for (int i = 0; i < points; i++) {
            asterisks += "*";
        }
        return asterisks;
    }
}
