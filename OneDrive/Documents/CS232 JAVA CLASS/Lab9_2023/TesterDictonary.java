/* 
* Problem Statement: Inheritance and Polymorphism
* Author: TY
* Date: 3/29/2023
*/
package Lab9_2023;

public class TesterDictonary {

    public static void main(String[] args){
    Dictonary webster = new Dictonary();


    System.out.println("Number of pages: " + webster.getPages());
    System.out.println("Number of definitions: " + webster.getDefinitions());
    System.out.println("Definitions per pages: " + webster.computeRatio());
    
    }
}
