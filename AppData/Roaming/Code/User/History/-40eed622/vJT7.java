import java.util.ArrayList;

public class ClassWork03152023_1 {
    public static void main(String[] args){
        //ArrayList - help you create resizeable array
        ArrayList<String> names = new ArrayList<String>();

        //Add items 
        names.add("Kai");
        names.add("Hunter");
        names.add("Kota");
        names.add("Kason");
        names.add("Brandi");

        System.out.println(names);

        //Access an element of the ArrayList
        System.out.println(names.get(3));

        //Update an element 
        names.set(0,"Ty");
        System.out.println(names);

        //Removing an element 
        names.remove(1);
        System.out.println(names);

        //Deleting an ArrayList
        //names.clear();
        //System.out.println(names);

        //Size of the given ArrayList
        names.size();
        System.out.println(names.size());


       



    }
    
}
