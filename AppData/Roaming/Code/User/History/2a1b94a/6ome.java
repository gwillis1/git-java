package TestWedding;

import java.time.LocalDate;

public class TestWedding {
    public static void main(String [] args){
        //Hanson/Ziller Wedding
        //Date: 2016-06-18   Location: Mayfair Country Club
        //Bride: Kimberly Hanson 1986-12-14
        //Groom: Mark Ziller 1984-03-08


        String couple_1 = "Hanson/Ziller Wedding";
        String couple_2 = "Hanson/Ziller wedding";
        LocalDate bday_addedDate = LocalDate.of(1980, 2, 14);
        LocalDate bday_addedDate2 = LocalDate.of(1970, 2, 4);
        LocalDate weddin_addedDate = LocalDate.of(2016, 06, 18);
      

        Person bride1 = new Person(couple_1, couple_1, bday_addedDate);
        Person groom1 = new Person(couple_2, couple_2, bday_addedDate2);

      
        


    }
}

