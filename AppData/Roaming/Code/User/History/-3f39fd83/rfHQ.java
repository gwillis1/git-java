import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ClassWork03152023_2 {
    public static void main(String[] args){
        try{
        File myFile = new File("Hello.java");
        Scanner scanner = new Scanner(myFile);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());

        }
        scanner.close();

        } catch(FileNotFoundException e){
            System.out.println("An error occurred. " + e);

    }
    try{
        File myFile2 = new File("Hello3.txt");
        PrintStream ps = new PrintStream(myFile2);
        ps.println("Hey this is your mom calling.");
        
        }catch(FileNotFoundException e){
        System.out.println("An error occurred. " + e);

        }
    }
}

