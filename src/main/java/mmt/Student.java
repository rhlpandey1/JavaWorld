package mmt;

import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable<Student> {
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return this.roll-o.roll;
    }

    public static void main(String[] args) {
        Set<Student> set=new TreeSet<>();
        set.add(new Student(10,"Rahul"));
        set.add(new Student(30,"Rahul"));
        set.add(new Student(20,"Rahul"));
        set.add(new Student(45,"Rahul"));

        for(Student s:set)
            System.out.println(s.getRoll()+" "+s.getName());
    }
}
