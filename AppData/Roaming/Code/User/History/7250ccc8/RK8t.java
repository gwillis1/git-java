package HeatIndexCalculatorTester;

public class HeatIndexCalculatorTester {
    
        public static void main(String[] args) {
           HeatIndexCalculator calculator1 = new HeatIndexCalculator(80, 65);
          
           System.out.println("Please enter the current temperature in degree Fahrenheit: " + calculator1.calculateHeatIndex());
           System.out.println("Please enter the current humidity as a percentage: " + calculator1.calculateHeatIndex());
        }
     }
