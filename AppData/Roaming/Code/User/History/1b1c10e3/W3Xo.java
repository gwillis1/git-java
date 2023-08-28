package ProgrammingProject5;

import java.util.Scanner;

public class PrepareTax {

    private static Scanner scanner;

    public static void main(String[] args) {
        33scanner = new Scanner(System.in);
        
        System.out.print("Enter your Social Security number: ");
        String ssn = scanner.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter your street address: ");
        String streetAddress = scanner.nextLine();
        
        System.out.print("Enter your city: ");
        String city = scanner.nextLine();
        
        System.out.print("Enter your state: ");
        String state = scanner.nextLine();
        
        System.out.print("Enter your zip code: ");
        String zipCode = scanner.nextLine();
        
        System.out.print("Enter your annual income: ");
        double annualIncome = scanner.nextDouble();
        
        System.out.print("Enter your marital status (S for single, M for married): ");
        String maritalStatus = scanner.next();
        
        // Create the TaxReturn object
        TaxReturn taxReturn = new TaxReturn(ssn, lastName, firstName, streetAddress, city, state, zipCode, annualIncome, maritalStatus);
        
        // Display the tax liability
        System.out.println("Your tax liability is: $" + taxReturn.getTaxLiability());
    }
}
