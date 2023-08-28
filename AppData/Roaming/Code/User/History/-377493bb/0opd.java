import java.util.Scanner;
/*
 * Name: Gashod Willis
 * Date:3/17/2023
 * Problem Statement: A personal phone directory contains room for first names,
 * addresses, and phone numbers for 6 people. Assign names and phone numbers for the first 4 people. 
 * Prompt the user for a name, and if the name is found in the list, 
 * display the corresponding address and phone number. If the name is not found in the list,
 * prompt the user for an address and phone number, 
 * and add the new name, address, and phone number to the list (use arrays).
 * Continue to prompt the user for names until the user enters quit. 
 * After the arrays are full (containing 6 names), do not allow the user to add new entries. 
 * Save the file as PhoneNumbers.java
 */

public class PhoneNumbers {
    private static Scanner scanner;

    public static void main(String[] args) {
        // Initialize arrays for first names, addresses, and phone numbers
        String[] names = new String[6];
        String[] addresses = new String[6];
        String[] phoneNumbers = new String[6];

        // Assign names and phone numbers for the first 4 people
        names[0] = "John";
        addresses[0] = "123 Main St";
        phoneNumbers[0] = "555-1234";

        names[1] = "Mary";
        addresses[1] = "456 Oak Ave";
        phoneNumbers[1] = "555-5678";

        names[2] = "Tom";
        addresses[2] = "789 Elm Blvd";
        phoneNumbers[2] = "555-9012";

        names[3] = "Jane";
        addresses[3] = "345 Maple St";
        phoneNumbers[3] = "555-3456";

        scanner = new Scanner(System.in);

        // Prompt the user for a name and display corresponding address and phone number
        String name;
        do {
            System.out.print("Enter a name (or quit to exit): ");
            name = scanner.nextLine();

            // Search for the name in the array of names
            int index = -1;
            for (int i = 0; i < names.length; i++) {
                if (names[i] != null && names[i].equals(name)) {
                    index = i;
                    break;
                }
            }

            // If the name is found, display the corresponding address and phone number
            if (index != -1) {
                System.out.println("Address: " + addresses[index]);
                System.out.println("Phone number: " + phoneNumbers[index]);
            } else if (!name.equalsIgnoreCase("quit")) {
                // If the name is not found and the user did not enter quit,
                // prompt the user for an address and phone number and add the new entry to the arrays
                boolean added = false;
                for (int i = 0; i < names.length; i++) {
                    if (names[i] == null) {
                        System.out.print("Enter the address: ");
                        String address = scanner.nextLine();
                        System.out.print("Enter the phone number: ");
                        String phoneNumber = scanner.nextLine();

                        names[i] = name;
                        addresses[i] = address;
                        phoneNumbers[i] = phoneNumber;
                        added = true;

                        System.out.println("Entry added.");
                        break;
                    }
                }
                // If the arrays are full and the user is trying to add a new entry,
                // display an error message
                if (!added) {
                    System.out.println("The phone directory is full.");
                }
            }
        } while (!name.equalsIgnoreCase("quit"));
    }
}

