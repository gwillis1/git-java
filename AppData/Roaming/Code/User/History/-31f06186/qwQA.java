public class ClassWork03292023_2{
    public static void main(String[] args){
        Animal myAnimal = new Animal(5);
        myAnimal.createSound();

        Animal myCow = new Cow(3, "Shelly");
        myCow.createSound();
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