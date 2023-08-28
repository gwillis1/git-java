package ManageFriends;
/*
 * Create a java program (ManageFriends) that has two source flies
 * ManageFriends.java and Friends.java
 * Friends.java  has two private string variables:
 * firstname and lastname and following methods:
 * Friends(string first, string last) //constructor
 * printInformation() // A static method that explains what friends class does
 * Include your test code in ManagaFriends.java class
 *  create three friends instance . Also, implement your program
 * in such a way so that each instance can remember 
 * how many instances of friends class you have already created 
 * (Hint: your have to use static variables)
 * 
 * Author: TY
 * Date:2/1/2023
 */

public class ManageFriends {
    //Instantiate three objects of class Friends
    public static void main(String [] agrs){
        Friends friend1 = new Friends( "John", "Smith");
        Friends friend2 = new Friends( "TY", "Willis");
        Friends friend3 = new Friends( "Will", "Smith");

        System.out.println("My friends are:");
        System.out.println("\t" + friend1.getFirstName()+ " " + friend1.getLasttName() + " ");
        System.out.println("\t" + friend2.getFirstName()+ " " + friend2.getLasttName() + " ");
        System.out.println("\t" + friend3.getFirstName()+ " " + friend3.getLasttName() + " ");
        
    //Call the static method, printInformation()
    Friends.printInformation();

    //print out the total number of friends we created
    System.out.println("The Total number of friends: " + Friends.totalFriends);
    

    }

}
