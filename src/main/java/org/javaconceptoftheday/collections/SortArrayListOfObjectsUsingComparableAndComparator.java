package org.javaconceptoftheday.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{

    int id;
    String name;
    int percentage;

    public Student(int id, String name, int percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    @Override
    public int compareTo(Student o) {
        return this.id-o.id;
    }

    @Override
    public String toString() {
        return "{ID : "+id+", Name : "+name+", Percentage : "+percentage+"}";
    }
}

public class SortArrayListOfObjectsUsingComparableAndComparator  {
    public static void main(String[] args) {

        List<Student> listOfStudents = new ArrayList<Student>();

        //Adding students to listOfStudents

        listOfStudents.add(new Student(123, "Student1", 62));

        listOfStudents.add(new Student(231, "Student2", 81));

        listOfStudents.add(new Student(85, "Student3", 79));

        listOfStudents.add(new Student(478, "Student4", 94));

        listOfStudents.add(new Student(365, "Student5", 62));

        System.out.println("listOfStudents Before Sorting :");

        System.out.println(listOfStudents);

        //Sorting the listOfStudents

        Collections.sort(listOfStudents);

        System.out.println("listOfStudents After Sorting :");

        System.out.println(listOfStudents);
    }

}
