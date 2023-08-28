package Linkin_Folder;
import java.util.Scanner;
public class SimplyCalculation {
    private static Scanner in;

    public static void main(String[] args){
    //declare variables
    double w, l, h;
    double numWin, winWidth, winHeight;
    double numDoors, doorWidth, doorHeight;
    double surfaceArea;
    //prompt inputs for variables width, length and height
    System.out.println("Please enter the width, length and height of " + "the house to be painted");
    in = new Scanner(System.in);
    w = in.nextDouble();
    l = in.nextDouble();
    h = in.nextDouble();
    //prompt inputs for variables the number of windows, width and height
    System.out.println("Please enter the number of windows, width and height");
    numWin = in.nextDouble();
    winWidth = in.nextDouble();
    winHeight = in.nextDouble();
    //prompt inputs for variables the number of doors, width and height
    System.out.println("Please enter the number of doors, width and height");
    numDoors = in.nextDouble();
    doorWidth = in.nextDouble();
    doorHeight = in.nextDouble();
    // calculations 
    surfaceArea = (w * h * 2 + l * h * 2) - (numWin * winWidth * winHeight + numDoors * doorWidth * doorHeight);
    //print results
    System.out.println("The total paintable surface area is: " + surfaceArea);

    } 
    
    
}
