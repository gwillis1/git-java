import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ClassWork03152023_2 {
    private static PrintStream ps;

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
        ps = new PrintStream(myFile2);
        ps.println("Hey this is your mom calling.");
        
        }catch(FileNotFoundException e){
        System.out.println("An error occurred. " + e);


        }
    }

}

/*
 * Java Exceptions
 * When executing Java code, different errors can occur:
 * coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.
 * When an errors occurs, java will normally stop and generate an error message. The technical term for this
 * an exception (throw an error).
 * 
 * Java try and catch
 * the try statement allows you to define a block of code to be tested for errors while it is being executed
 * 
 * the catch statement allows you to define a block of code to be executed, if an error occurrs in the try
 * the try and catch keywords come in pairs:
 * If an error occurs , we can use try... catch to chatch the error and execute some code to handle it.
 * 
 */

