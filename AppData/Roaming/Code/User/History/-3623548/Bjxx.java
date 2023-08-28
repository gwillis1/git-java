package CollegeOfScienceAndMath;

import java.time.LocalDate;

public class CollegeOfTester {
    public static void main(String [] args){
        String dept_name1 = "MCIS";
        LocalDate mcis_date_added = LocalDate.of(1980, 2, 14);
        Employee mcis_emp1 = new Employee("Dr.Willis", 56);
        Employee mcis_emp2 = new Employee("Dr.Willbert", 5);

        Department mcis = new Department(dept_name1, mcis_date_added, mcis_emp1, mcis_emp2);

        System.out.println(mcis.getName());
        System.out.println(mcis.getDateAdded());
        System.out.println(mcis.getEmp1());
        System.out.println(mcis.getEmp2());
        System.out.println(Department.num_of_dept);
        //System.out.println(

}
}