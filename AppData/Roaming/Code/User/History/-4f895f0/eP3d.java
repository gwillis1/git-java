
/*
 * Asks for Celsius to Fahrenheit
 * Author: TY
 * Date: 1/20/2023
 */
public class CelsiusToFahrenheit{
    public static void main(String[] args){
        // declare variables
        float Celsius = 0.0f;
        float Fahrenheit = 0.0f;
        Scanner inputDevice = new Scanner(System.in);
        
        System.out.println("Enter C value: ");
        
        Celsius = inputDevice.nextFloat();
        Fahrenheit = Celsius * 1.8f + 32f;
        System.out.println(Celsius +  "degrees Celisus = " + Fahrenheit + "degrees Fahrenheit");



    }
}