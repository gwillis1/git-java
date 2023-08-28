package Apartments;

import java.util.Scanner;

public class testapartments {

    private static Scanner input;

    public static void main(String[] args) {
    
        //
        apartment apartment1 = new apartment(6, 3, 1650.00);
        apartment apartment2 = new apartment(5, 2, 770.00);
        apartment apartment3 = new apartment(4, 4, 1220.00);
        apartment apartment4 = new apartment(3, 6, 550.00);
        apartment apartment5 = new apartment(2, 1, 2880.00);

        //Prompt user for num_bedrooms and rent
        input = new Scanner(System.in);
        System.out.print("Enter minimum number of bedrooms required: ");
        int num_bedrooms = input.nextInt();
        System.out.print("Enter maximum rent you are willing to pay: ");
        double rent = input.nextDouble();


        
        // Display apartments that meet user criteria
        display(apartment1, num_bedrooms, rent);
        display(apartment2, num_bedrooms, rent);
        display(apartment3, num_bedrooms, rent);
        display(apartment4, num_bedrooms, rent);
        display(apartment5, num_bedrooms, rent);
    }

        //Display
    public static void display(apartment apartment, int num_bedrooms, double rent) {
        if (apartment.getNum_bedrooms() >= num_bedrooms && apartment.getRent() <= rent) {
            System.out.println(apartment);
        }
    }
}
