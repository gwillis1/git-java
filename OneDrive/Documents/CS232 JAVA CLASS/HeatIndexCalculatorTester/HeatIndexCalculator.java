/*
 * Develop a Java application that calculates the
human-perceived equivalent temperature 
when the actual air temperature is combined with the relative humidity. 
The expression that you need to calculate the heat index 
is shown below along with the values of the constants that 
appear in this expression. 

Author: TY WILLIS
Date: 2/6/2023
 */

package HeatIndexCalculatorTester;

public class HeatIndexCalculator {
   //declare variables
   private int temperature;
   private double humidity;
   private double heatIndex;

     //Getters for the heatindex
   public double getHeatIndex() {
      return heatIndex;
   }
     //constructors for the heatindex
   public void setHeatIndex(double heatIndex) {
      this.heatIndex = heatIndex;
   }
     //constructors for the temperature and humidty
   public HeatIndexCalculator(int temperature, double humidity) {
      this.temperature = temperature;
      this.humidity = humidity;
   }
   
   public double calculateHeatIndex() {
      // formula to calculate heat index calculates
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
      //Printing the results for the heat index
   public static void printHeatIndex(HeatIndexCalculator heatIndexCalculator){
      double temp = heatIndexCalculator.temperature;
      System.out.println(temp); 
      
      double humid = heatIndexCalculator.humidity;
      System.out.println(humid);
   }
}