package HeatIndexCalculatorTester;

import java.util.Scanner;

public class HeatIndexCalculatorTester {
   private static Scanner scanner;

   public static void main(String[] args) {
      //Prompt the user and get input
      scanner = new Scanner(System.in);
      System.out.print("Enter the current temperature in degree Fahrenheit: ");
      int temperature = scanner.nextInt();
      System.out.print("Enter the current humidity as a percentage: ");
      double humidity = scanner.nextDouble();
      //calculations for the heatindex formula 
      HeatIndexCalculator calculator = new HeatIndexCalculator(temperature, humidity);
      calculator.calculateHeatIndex();
      //print results
      System.out.println( "At a temperature of " + temperature + " " + "and a humidity of " + humidity  );
      System.out.println("Its actually feels like: " + calculator.calculateHeatIndex() );
   }
}



