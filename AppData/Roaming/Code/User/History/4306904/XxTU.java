
package CarDemo;

public class CarTester{
   
    public static void main(String[] args){
     // CarTester CarObj = new CarTester();
    System.out.println(mySquare(67));
    System.out.println(mySquare(100));


    Car Car1 = new Car("Honda");
    Car1.printName();

    Car Car2 = new Car("Ford");
    Car2.printName();
    }
        //Calculation the square of a integar
        public static int mySquare(int num){
            int result = num * num;
            return result;
         }   
         public static float mySquare(float num){
           float result = num * num;
            return result;
         }   
    }