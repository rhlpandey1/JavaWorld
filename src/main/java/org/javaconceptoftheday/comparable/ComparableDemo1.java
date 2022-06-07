package org.javaconceptoftheday.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A comparable object is capable of comparing itself with another object.
 * The class itself must implement the java.lang.Comparable interface to compare its instances.
 * We can implement the compareTo() method only once
 * It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only.
 * Consider a Movie class that has members like rating, name, year, we can sort by either rating/name/year
 * Meant for default natural sorting order
 * present in java.lang package
 * All wrapper classes,User-defined class objects and String class uses this interface
 */

class Movie1 implements Comparable<Movie1>{

    private double rating;
    private String name;
    private int year;

    public Movie1(String name, double rating, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    @Override
    public int compareTo(Movie1 m) {
        return this.year-m.year;
    }

    //getter methods
    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }


}
public class ComparableDemo1 {
    public static void main(String[] args) {
        List<Movie1> list = new ArrayList<Movie1>();
        list.add(new Movie1("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie1("Return of the Jedi", 8.4, 1983));
        list.add(new Movie1("Force Awakens", 8.3, 2015));
        list.add(new Movie1("Star Wars", 8.7, 1977));

        //if we don't implement Comparable and try to sort directly we will get
        //"reason: no instance(s) of type variable(s) T exist so that Movie conforms to Comparable<? super T>"
        Collections.sort(list);
        for(Movie1 m:list){
            System.out.println(m.getName()+"\t"+m.getRating()+"\t"+m.getYear());
        }

    }
}
