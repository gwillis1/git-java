package CollegeOfScienceAndMath;

public class Employee {
    //declare variables
    private String name;
    private int emp_num;

    //constructor
    public Employee(String name, int emp_num){
        this.name = name;
        this.emp_num = emp_num;    
    }
    //Getters
    public String getName(){
        return this.name;
    }
    public int getEmp_num(){
        return this.emp_num;
    }
    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setEmp_num(int emp_num){
        this.emp_num = emp_num;
    }

    public static void printClassInfo(){
        System.out.println("Employee class creates a blueprint of employees." );
    }
}
