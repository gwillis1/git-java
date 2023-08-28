/*
 * Problem Statements:
 * Create a class named House that holds a house number, number of bedrooms,
 * number of baths, and price. Create a constructor that accepts values for
 * each data fields. Also create a get method for each field. Write an application
 * that creates three House objects. Then display data for all the House objects
 * Save the files as House.java and TestHouse.java.
 * 
 */

package Houses;

public class TestHouses {
    public static void main(String[] args) {
        Houses house1 = new Houses(2, 1000, 1, 199000);
        Houses house2 = new Houses(5, 600, 3, 450000.99);
        Houses house3 = new Houses(2, 45, 2, 210000.10);
        
       // System.out.println("Bathrooms: " + house1.getNo_Bathroom());
       // System.out.println("Bedrooms: " + house1.getNo_Bedrooms());
       // System.out.println("House number: " + house1.getHousenum());
       // System.out.println("Prices: " + house1.getPrice());

       // System.out.println("Bathrooms: " + house2.getNo_Bathroom());
       // System.out.println("Bedrooms: " + house2.getNo_Bedrooms());
       // System.out.println("House number: " + house2.getHousenum());
       // System.out.println("Prices: " +house2.getPrice());

       // System.out.println("Bathrooms: " + house3.getNo_Bathroom());
       // System.out.println("Bedrooms: " +house3.getNo_Bedrooms());
       // System.out.println("House number: " + house3.getHousenum());
       // System.out.println("Prices: " + house3.getPrice());

       // houseDisplay(house1);
        // houseDisplay(house2);
        // houseDisplay(house3);

        String name = " TY WILLIS";

        System.out.println(name);
        System.out.println(house1);
        System.out.println(house2);
        System.out.println(house3);




     }
    /*
     *  public static void houseDisplay(Houses house){
        System.out.println("Bathrooms: " + house.getNo_Bathroom());
        System.out.println("Bedrooms: " + house.getNo_Bedrooms());
        System.out.println("House number: " + house.getHousenum());
        System.out.println("Prices: " + house.getPrice());

    }
    */
    
    }
