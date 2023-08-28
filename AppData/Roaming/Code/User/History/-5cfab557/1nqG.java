package CollegeOfScienceAndMath;

import java.time.LocalDate;

public class Department {
    //declare variables
    private String name;
    private LocalDate dateAdded;
    private Employee emp1;
    private Employee emp2;
    public static int num_of_dept = 0;

    //constructor
    public Department(String name, LocalDate dateAdded, Employee emp1, Employee emp2){
        this.name = name;
        this.dateAdded = dateAdded;
        this.emp1 = emp1;
        this.emp2 = emp2; 
        num_of_dept++;   
    }
    // Getter
    public String getName(){
        return this.name;
    }
    public String getEmp1(){
        return emp1.getName();
    }
    public String getEmp2(){
        return emp2.getName();
    }
    public LocalDate getDateAdded(){
        return this.dateAdded;
    }

    public static void printClassInfo(){
        System.out.println("Department class creates a blueprint of Departments." );
    }

    }
