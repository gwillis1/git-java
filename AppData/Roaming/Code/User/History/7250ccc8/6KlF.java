package HeatIndexCalculatorTester;

public class HeatIndexCalculatorTester {
    
        public static void main(String[] args) {
           HeatIndexCalculator calculator1 = new HeatIndexCalculator(80, 65);
           HeatIndexCalculator calculator2 = new HeatIndexCalculator(85, 70);
           HeatIndexCalculator calculator3 = new HeatIndexCalculator(90, 75);
           
           System.out.println("Heat Index 1: " + calculator1.calculateHeatIndex());
           System.out.println("Heat Index 2: " + calculator2.calculateHeatIndex());
           System.out.println("Heat Index 3: " + calculator3.calculateHeatIndex());
        }
     }
     

