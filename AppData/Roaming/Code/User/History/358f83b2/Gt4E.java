import java.util.Scanner;


//Scholarship criteria: gpa>=  3.5 and sat >= 1500.
public class ClassWork02252023{
private static Scanner inputDevice;

public static void main(String[] args){
    //declare variables
    float gpa;
    int sat;
    inputDevice = new Scanner(System.in);



    //prompt inputs
    System.out.println("Enter GPA: ");
    gpa = inputDevice.nextFloat();
    System.out.println("Enter SAT score: ");
    sat = inputDevice.nextInt();


    //
    if((gpa >= 3.5) && (sat >=1500)) {
        System.out.println("Student is eligible for scholarship!");

    } else {
        System.out.println("Student is NOT eligible for scholarship!");
    }
    }
}