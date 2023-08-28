/* 
* Problem Statement: Inheritance and Polymorphism
* Author: TY
* Date: 3/29/2023
*/

package Lab9_2023;

public class Dictonary extends Book {

    private int definitions = 52500;

    //Setters
    public void setDefinitions(int numdefinitions) {
        this.definitions = numdefinitions;
    }

    //Getters
    public int getDefinitions() {
        return definitions;
    }

    public double computeRatio(){
        return definitions / pages;
    }
    
    
}
