package TestWedding;

import java.time.LocalDate;

public class TestWedding {
    public static void main(String[] args) {
        
        Person firstPerson = new Person("John", "Doe", LocalDate.of(1980, 1, 1));
        Person secondPerson = new Person("Jane", "Doe", LocalDate.of(1985, 2, 2));
        Couple couple = new Couple(firstPerson, secondPerson);

        Wedding wedding = new Wedding("Hawaii", couple, LocalDate.of(2021,01,11));




        System.out.println(wedding.getLocation());
        System.out.println(wedding.getCouple());
        System.out.println(wedding.getWeddingDate());
        System.out.println(wedding.getLocation());
    }
}
