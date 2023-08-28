import java.util.Scanner;

public class ClassWork02272023_2 {
    private static Scanner scanner;

    public static void main(String[] args){
        //while loop- counter controlled
        int counter = 0;
        int x;

        while(counter <= 5){
            x = counter++;
            System.out.println("counter: " + counter + "; x: " + x);
            //post increment 
        }

        //while loop - sentinel controlled 

        int sentinel = 0;
        int var;
        scanner = new Scanner(System.in);
        var = scanner.nextInt();

        while(var != sentinel){
            System.out.println("You Entered: " + var);
            var = scanner.nextInt();
        }
        System.out.println("You entered 0 and the loop ended!");
  
  
    }



}
