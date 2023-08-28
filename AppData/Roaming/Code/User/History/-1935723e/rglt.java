package Linkin_Folder;

import java.util.Scanner;

public class Hospital_Stay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double medCharges = 0, labChanges = 0, hospitalCharges = 0, totalCost;

        String response = "";
        do{
            if(checkForOvernight() == true)
            {
                System.out.println("Enter the cost of the hospital stay:");
                hospitalCharges = in.nextDouble();
            }
            else
            {
                hospitalCharges = 0;
            }
            System.out.println("Enter the medication charges: ");
            medCharges = in.nextDouble();
            System.out.println("Enter the lab service cost: ");
            labChanges = in.nextDouble();
            totalCost = hospitalCharges + medCharges + labChanges;
            printTotal(totalCost);
            System.out.println("Do you have another patient? (y/n) ");
            response = in.next();
        }while(response.equalsIgnoreCase("y"));
        
    }
    public static boolean checkForOvernight()
    {
        Scanner in = new Scanner(System.in);
        String response = "";
        System.out.println("Is this an overnight stay? (y/n)");
        response = in.next();
        if(response.equalsIgnoreCase("y"))
            return true;
        else
            return false;
    }
    public static void printTotal(double totalCost)
    {
        System.out.printf("The total cost for this paitent is: $%6.2f", totalCost);
    }
}
