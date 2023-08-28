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



    }
    
}
