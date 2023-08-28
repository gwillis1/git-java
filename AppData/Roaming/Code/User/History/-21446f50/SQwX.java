/*Problem Statement:
 * Create a class named House that holds a house number, number of bedrooms,
 * number of baths, and price. Create a constructor that accepts values for
 * each data fields. Also create a get method for each field. Write an application
 * that creates three House objects. Then display data for all the House objects
 * Save the files as House.java and TestHouse.java.
 * Author: TY WILLIS
 * Date:2/17/2023
 */
package Houses;

public class Houses {
    //declare variables
    private int no_bedrooms;
    private int housenum;
    private int no_bathroom;
    private double price;

    //Constructors
    public Houses(int no_bedrooms, int housenum, int no_bathroom, double price) {
        this.no_bedrooms = no_bedrooms;
        this.housenum = housenum;
        this.no_bathroom = no_bathroom;
        this.price = price;
    }

    //Getters
    public int getNo_Bedrooms() {
        return this.no_bedrooms;
    }
    public int getNo_Bathroom() {
        return this.no_bathroom;
    }
    public double getPrice() {
        return this.price;
    }
    public int getHousenum() {
        return this.housenum;
    }

    /*
     * toString() method of Object class is used to provide string
     * representation of an object.
     * when a object is passed in print() method as an argument the compiler internally 
     * call toString() method on the object. It returns object representation
     * as classname @hexadecimal representation of hash code of the object.
     * 
     */

     public String toString(){
        String result = "Bathrooms: " + getNo_Bathroom() + "\n" + "Bedrooms: " + getNo_Bedrooms() + "\n" + "House number: " + getHousenum() + "\n" + "Prices: " + getPrice();
        return result;


     }

}
