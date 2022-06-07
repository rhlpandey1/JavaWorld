package org.gfk.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * We create multiple separate classes (that implement Comparator) to compare by different members.
 * We can implement compare() and equals() method
 * Consider a Movie class that has members like rating, name, year, we can sort by  rating/name/year
 * Meant for customized sorting order
 * present in java.util package
 * All User-defined class objects  uses this interface
 * if sorting of objects needs to be based on natural order then use Comparable whereas
 * if your sorting needs to be done on attributes of different objects, then use Comparator in Java.
 */
class Movie
{
    private double rating;
    private String name;
    private int year;

    public Movie(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName()   {  return name; }
    public int getYear()      {  return year;  }
}
// Class to compare Movies by ratings
class RatingCompare implements Comparator<Movie>
{
    public int compare(Movie m1, Movie m2)
    {
        if (m1.getRating() < m2.getRating()) return -1;
        if (m1.getRating() > m2.getRating()) return 1;
        else return 0;
    }
}
class NameCompare implements Comparator<Movie>
{
    public int compare(Movie m1, Movie m2)
    {
        return m1.getName().compareTo(m2.getName());
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        // Sort by rating : (1) Create an object of ratingCompare
        //                  (2) Call Collections.sort
        //                  (3) Print Sorted list
        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        //Call the overloaded sort() method, giving it both the list
        // and the instance of the class that implements Comparator.
        Collections.sort(list, ratingCompare);
        for (Movie movie: list)
            System.out.println(movie.getRating() + " " +
                    movie.getName() + " " +
                    movie.getYear());

        System.out.println("Sorted by name");
        NameCompare nameCompare = new NameCompare();
        //Call the overloaded sort() method, giving it both the list
        // and the instance of the class that implements Comparator.
        Collections.sort(list, nameCompare);
        for (Movie movie: list)
            System.out.println(movie.getRating() + " " +
                    movie.getName() + " " +
                    movie.getYear());



    }
}
