package HeatIndexCalculatorTester;

import java.util.Scanner;

public class HeatIndexCalculatorTester {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the current temperature in degree Fahrenheit: ");
      int temperature = scanner.nextInt();
      System.out.print("Enter the current humidity as a percentage: ");
      double humidity = scanner.nextDouble();
      HeatIndexCalculator calculator = new HeatIndexCalculator(temperature, humidity);
      double heatIndex = calculator.calculateHeatIndex();
      System.out.println("The heat index is: " + heatIndex);
   }
}



