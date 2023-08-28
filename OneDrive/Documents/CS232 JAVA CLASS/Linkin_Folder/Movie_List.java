package Linkin_Folder;

public class Movie_List {
   //declare variables
 private String movieTitle;
 private String rating;
 private int year;
 private int runTime;
   // produce the constructors 
 public Movie_List(String title, String rating, int year, int runTime)
 {
    this.movieTitle = title;
    this.rating = rating;
    this.year = year;
    this.runTime = runTime;

 }
 //getters
 public String getMovieTitle()
 {
    return movieTitle;
 }
 //setters
 public void setMovieTitle(String value)
 {
    movieTitle = value;
 }
 //getters
 public String getRating()
 {
    return rating;
 }
 //setters
 public void setRating(String value)
 {
    rating = value;
 }
//getters
 public int getYear()
 {
    return year;
 }
 //setters
 public void setYear(int value)
 {
    year = value;
 }
 //getters
 public int getRunTime()
 {
    return runTime;
 }
 //setters
 public void setRunTime(int value)
 {
    runTime = value;
 }
 // toString() method
 public String toString()
 {
    return "Movie title: " + movieTitle +
            "\n Rating: " + rating +
            "\n Year: " + year +
            "\n Total runtime: " + runTime;
 }

}
