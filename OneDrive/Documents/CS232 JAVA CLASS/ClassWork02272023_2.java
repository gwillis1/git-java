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

        while(var != sentinel){ //pretest
            System.out.println("You Entered: " + var);
            var = scanner.nextInt();
        }
        System.out.println("You entered 0 and the loop ended!");
        
        //posttest
        //do/while

        int sentinel2 = 0;
        int var2;

        do{
            var2 = scanner.nextInt();
            System.out.println("You Entered: " + var2);
        }while(var2 != sentinel2);
            System.out.println("You entered 0 and the loop ended!");

            //0, 1, 2, 3, 4 --> do while
            int num = 0;

            do {
                System.out.println(num);
               num++;
            }while(num < 5);


            //for loop
            for(int j =0;j < 5; j++){
                System.out.println(j);
            }

            //Nested loop
            //It is also possible to place a loop inside another loop.
            //This is called a nested loop

            for (int i = 1; i < 3; i++){
                for(int star=1; star <= 4; star++){// create each line for I
                System.out.print("*");
            } 
            System.out.print("\n");        
        }

        //For Each loop
        //is used exclusively to loop through elements in an array
        String[] names = {"arup", "matt", "ty", "willis"};
        for(String name : names) {
            System.out.println(name);
        }

        /*continue keyword
         *In Java, the continue keyword is used inside a loop to skip the current iteration and immediately
         start the next iteration of the loop. When the continue keyword is encountered, the remaining statements 
         in the current iteration are skipped, and the loop condition is checked again determine whether to continue 
         with the next iteration. 
         */

         //print all ood numbes between 0 and 100

        for(int k = 0; k <= 100; k++){
            /*
             *   if(k % 2 != 0){
                System.out.print(k + " ");
            }
        }
             */
            if(k % 2 == 0){
                continue;
            }
            System.out.print(k + " ");
        }
    }


}