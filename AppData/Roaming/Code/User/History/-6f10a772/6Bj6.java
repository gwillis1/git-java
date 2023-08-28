import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ClassWork03172023 {
    /*
     * Problem Statement:
     *  Write a Java program that uses PrintStream and Scanner file input 
     * to read data from a text file, calculate the product of the numbers in each line, and
     * write the output to both the console and a file.
     * 
     * 
     * 2 3 4 1 = product = 24
     * 3 2 4 product = 18
     * 
     * Author: TY
     * Date:3/17/2023
     */


     public static void main(String[] args){
        try {
            //open the input and output
            Scanner inputFile = new Scanner(new File("ClassWork03172024.txt"));
            PrintStream ps = new PrintStream(new File("ClassWork03172024_out.txt"));

            // process each line of the input file
            while (inputFile.hasNextLine()){
                String line = inputFile.nextLine();
                Scanner lineScanner = new Scanner(line);
                

                int product = 1;

                // calculate the product of the numbers in the line
                while(lineScanner.hasNextInt()){
                    int num = lineScanner.nextInt();
                    product = product * num;

                }
                 //iterate through numbers in a specific line
                
                 //Print the line and its product to the console and output file
                 System.out.print(line + " Product = " + product);
                 ps.println(line + " Product =" + product);

                 //Close the line scanner 
                 lineScanner.close();
            }
            //Make sure you close the input and output file
                 inputFile.close();
                 ps.close();

            System.out.println("Data written to ClassWork03172024_out.txt");


        } catch (FileNotFoundException e) {
            // 
            System.out.println("File Not Found:"  + e.getMessage());
        }
     }
}
