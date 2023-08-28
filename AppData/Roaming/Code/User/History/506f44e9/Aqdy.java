package ManageFriends;
/*
 * Create a java program that has two private string variables:
 * firstname and lastname and following methods:
 * friends(string first, string last) create three friends that
 * each instance can remember how many instances of friends class you 
 * have already created 
 * (Hint: your have to use static variables)
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
    }

}
