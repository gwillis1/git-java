package HeatIndexCalculatorTester;

public class HeatIndexCalculator {
   private int temperature;
   private double humidity;
   private double heatIndex;

   
   public double getHeatIndex() {
      return heatIndex;
   }

   public void setHeatIndex(double heatIndex) {
      this.heatIndex = heatIndex;
   }

   public HeatIndexCalculator(int temperature, double humidity) {
      this.temperature = temperature;
      this.humidity = humidity;
   }
   
   public double calculateHeatIndex() {
      // formula to calculate heat index
      double c1 = -42.379;
      double c2 = 2.04901523;
      double c3 = 10.14333127;
      double c4 = -0.22475541;
      double c5 = -6.83783e-03;
      double c6 = -5.481717e-02;
      double c7 = 1.22874e-03;
      double c8 = 8.5282e-04;
      double c9 = -1.99e-06;
   
      double T = this.temperature;
      double R = this.humidity;
   
      double heatIndex = c1 + c2 * T + c3 * R + c4 * T * R + c5 * T * T + c6 * R * R + c7 * T * T * R + c8 * T * R * R + c9 * T * T * R * R;
   
      return heatIndex;
   }
   public static void printHeatIndex(HeatIndexCalculator heatIndexCalculator){
      double temp = heatIndexCalculator.temperature;
      System.out.println(temp); 
      
      double humid = heatIndexCalculator.humidity;
      System.out.println(humid);
   }
}