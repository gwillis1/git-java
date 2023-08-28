import java.io.File;
import java.io.FileNotFoundException;
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
    }

}