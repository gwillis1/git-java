/*
 * Problem Statement: Inheritance and Polymorphism
 * Author: TY
 * Date: 3/31/2023
 */

public class ClassWork03292023_2{
    public static void main(String[] args){
        Animal myAnimal = new Animal(5);
        myAnimal.createSound();

        Animal myCow = new Cow(3, "Shelly");
        myCow.createSound();

        Animal myDuck = new Duck(3, "Sly");
        myDuck.createSound();

    //Polymorphism - "many forms"
    //it occurs when we have many classes that are related to each other by inheritance
    // int[] a = {5, 6, 2}
    Animal[] zoo = {myCow, new Cow(2, "Tommy"), new Duck(19, "JonJon"), new Animal(69)};

    for(Animal animal:zoo){
        animal.createSound();
    }
    System.out.println(myCow instanceof Cow);
    System.out.println(myCow instanceof Animal);
    System.out.println(myCow instanceof Duck);

    }
}

class Animal{
    protected int id;
    public Animal(int id){
        this.id = id;

    }

    public void createSound(){
        System.out.println("Animal noises");
    }
}

class Cow extends Animal{
    String name;
    public Cow(int id, String name){
        super(id);
        this.name = name;
    }

    public void createSound(){
        System.out.println("Cow Moo Moo moo");
    }
}

class Duck extends Animal{
    String name;
    public Duck(int id, String name){
        super(id);
        this.name = name;
    }

    public void createSound(){
        System.out.println("Duck Quack Quack quack");
    }
    
}

