package Linkin_Folder;
import java.io.File;
import java.io.*;
import java.util.Scanner;

public class Loading_a_File {
    private static Scanner input;
    private static Scanner in;

    public static void main(String[] args){
          //open the input and output
        File menuItems = new File("menuNoPrices.txt");
        File menuPrices = new File("menuWithPrices.txt");
        String menuItem;
        double price;
        try{
            //process each line of the input file
            input = new Scanner(menuItems);
            PrintWriter output = new PrintWriter(menuPrices);
            in = new Scanner(System.in);
            while(input.hasNextLine())
            {
                //Print the line
                menuItem = input.nextLine();
                System.out.println("What is the price of this item:" + menuItem);
                price = in.nextDouble();
                in.nextLine();
                output.print(menuItem);
                output.print("\t");
                output.println(price);

            }
            output.close();
        } catch (Exception e)
        {
            //print error if file doesnt load 
            System.out.println("There was an error: "+ e.toString());
        }
    }
}
