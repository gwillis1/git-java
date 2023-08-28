package HeatIndexCalculatorTester;

import java.util.Scanner;

public class HeatIndexCalculatorTester {
   private static Scanner scanner;

   public static void main(String[] args) {
      scanner = new Scanner(System.in);
      System.out.print("Enter the current temperature in degree Fahrenheit: ");
      int temperature = scanner.nextInt();
      System.out.print("Enter the current humidity as a percentage: ");
      double humidity = scanner.nextDouble();
      HeatIndexCalculator calculator = new HeatIndexCalculator(temperature, humidity);
      calculator.calculateHeatIndex();
      System.out.println( "At a temperature of " + temperature );
      System.out.println( "and a humidity of " + humidity ); 
      System.out.println("\tIts actually feels like: " + calculator.calculateHeatIndex() );
   }
}



