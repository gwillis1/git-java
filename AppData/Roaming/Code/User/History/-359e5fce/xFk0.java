package Linkin_Folder;
import java.util.Scanner;
public class Movie_Tester {
    private static Scanner in;

    public static void main(String[] args){
        in = new Scanner(System.in);
        //declare variables
        String movie, rating;
        int year, runtime;
        Movie_List favoriteMovie;

        //Prompt user for movie, rating, produced and runtime 
        System.out.println("Please enter movie title: ");
        movie = in.nextLine();
        System.out.println("Please enter movie rating: ");
        rating = in.nextLine();
        System.out.println("Please enter year produced: ");
        year = in.nextInt();
        System.out.println("Please enter total runtime: ");
        runtime = in.nextInt();

        //print results
        favoriteMovie = new Movie_List(movie, rating, year, runtime);
        System.out.println(favoriteMovie.toString());


    }

    
}
