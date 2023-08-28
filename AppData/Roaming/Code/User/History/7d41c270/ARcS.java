package ShapesTester;

public class ShapesTester {
    public static void main(String [] args){
        Circle circle1 = new Circle(24.5, "First Circle");
        circle1.printName();
        circle1.printArea();

        Rectangle rectangle1 = new Rectangle(5.6,6.5,"First Rectangle" );
        rectangle1.printName();
        rectangle1.printArea();

        Square square1 = new Square(5.6,6.5,"First Square" );
        square1.printName();
        square1.printArea();


    }
}
