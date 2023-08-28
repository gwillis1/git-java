package Linkin_Folder;
import java.io.*;
import java.util.Scanner;

public class Loading_a_File {
    private static Scanner input;
    private static Scanner in;

    public static void main(String[] args){
        File menuItems = new File("C:/Users/gasho/OneDrive/Documents/CS232 JAVA CLASS/menuNoPrices.txt");
        File menuPrices = new File("C:/Users/gasho/OneDrive/Documents/CS232 JAVA CLASS/menuWithPrices.txt");
        
        String menuItem;
        double price;
        try{
            input = new Scanner(menuItems);
            PrintWriter output = new PrintWriter(menuPrices);
            in = new Scanner(System.in);
            while(input.hasNextLine())
            {
                menuItem = input.nextLine();
                System.out.println("What is the price of this item:" + menuItem);
                price = in.nextDouble();
                in.nextLine();
                output.print(menuItem);
                output.print("t");
                output.println(price);

            }
            output.close();
        } catch (Exception e)
        {
            System.out.println("There was an error: " + e.toString());
        }
    }
}
