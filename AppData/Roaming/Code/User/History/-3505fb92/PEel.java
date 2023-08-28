package ManageFriends;
/*
 * Create a java program that has two private string variables:
 * firstname and lastname and following methods:
 * friends(string first, string last) create three friends that
 * each instance can remember how many instances of friends class you 
 * have already created 
 * (Hint: your have to use static variables)
 * 
 * Author: TY
 * Date:2/1/2023
 */

public class ManageFriends {
    //Instantiate three objects of class Friends

    public static void main(){
        Friends friend1 = new Friends( "John", "Smith");
        Friends friend2 = new Friends( "TY", "Willis");
        Friends friend3 = new Friends( "Will", "Smith");

        System.out.println("My friends are:");
        System.out.println("\t" + friend1.getFirstName()+ " " + friend1.getLasttName() + " ");
        System.out.println("\t" + friend2.getFirstName()+ " " + friend2.getLasttName() + " ");
        System.out.println("\t" + friend3.getFirstName()+ " " + friend3.getLasttName() + " ");
        
        
    

    }

}
