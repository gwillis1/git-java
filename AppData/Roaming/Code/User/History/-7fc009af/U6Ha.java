package BarChartss;

import java.util.Scanner;

public class BarCharts2 {
    private static Scanner input;

    public static void main(String[] args) {

         //Prompt user the input for the points

        input = new Scanner(System.in);
        System.out.print("Enter points scored by Art: ");
        int artPoints = input.nextInt();
        System.out.print("Enter points scored by Bob: ");
        int bobPoints = input.nextInt();
        System.out.print("Enter points scored by Cal: ");
        int calPoints = input.nextInt();
        System.out.print("Enter points scored by Dan: ");
        int danPoints = input.nextInt();
        System.out.print("Enter points scored by Eli: ");
        int eliPoints = input.nextInt();

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
        String asterisks = "";
        int numAsterisks = points / 5;
        for (int i = 0; i < numAsterisks; i++) {
            asterisks += "*";
        }
        return asterisks;
    }
}

