/* Java Inheritance:
It is possible to inherit attributes and methods
from one class to another.

Superclass (parent) - the class being inherited from 
Subclass (child) - the class that inherits from the parent class

Use keyword "extends" to implement inheritance in Java.
*/ 


package Lab9_2023;

public class Book {

    protected String title = " no title"; // protected members can be accessed by child clasees 
    protected int booknumber = 0;
    protected int pages = 1500;

    //Setter
    public void setTitle(String title) {
        this.title = title;
    }
    public void setBooknumber(int booknumber) {
        this.booknumber = booknumber;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    //Getters
    public String getTitle() {
        return title;
    }
    public int getBooknumber() {
        return booknumber;
    }
    public int getPages() {
        return pages;
    }
    
}
