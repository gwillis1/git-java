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
public class Friends {
    //define variables
    private String firstName;
    private String lastName;

    public static int totalFriends = 0;

    //constructor
    public Friends(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
        totalFriends++;
    }
    public static void printInformation(){
        System.out.println("This is a template that helps store info about friends. ");
    }
    
    public void setFirstName(String fName){
        this.firstName = fName;

    }
    
    public void setLastName(String lName){
        this.lastName = lName;


}
//Getters
public String getFirstName(){
    return this.firstName;


}
public String getLasttName(){
    return this.lastName;
}


}