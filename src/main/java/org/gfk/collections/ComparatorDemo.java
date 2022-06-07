package org.gfk.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int roll;
    String name,address;

    public Student(int roll, String name, String address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
class SortByRoll implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.roll-o2.roll;
    }
}
class SortByName implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {

        // Creating an empty ArrayList of Student type
        ArrayList<Student> ar = new ArrayList<Student>();

        // Adding entries in above List
        // using add() method
        ar.add(new Student(111, "Mayank", "london"));
        ar.add(new Student(131, "Anshul", "nyc"));
        ar.add(new Student(121, "Solanki", "jaipur"));
        ar.add(new Student(101, "Aggarwal", "Hongkong"));

        // Display message on console for better readability
        System.out.println("Unsorted");

        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        Collections.sort(ar,new SortByRoll());
        // Display message on console for better readability
        System.out.println("\nSorted by rollno");

        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        // Sorting student entries by name
        Collections.sort(ar, new SortByName());

        // Display message on console for better readability
        System.out.println("\nSorted by name");

        // // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}
