package ClassWork03102023;

enum Level { // add a set of relative  constants in one place
    LOW,
    MEDIUM,
    HIGH,

}

public class enumExample {

    public static void main(String[] args){

        Level var = Level.HIGH;

        //switch-case: integral value - char, int, ..... enum

        switch(var){
            case LOW:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
        }
    }
    
}
