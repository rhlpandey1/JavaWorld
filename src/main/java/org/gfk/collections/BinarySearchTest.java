package org.gfk.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("");
        al.add("hostname");
        al.add("P60896");
        al.add("P60895");
        al.add("P60894");
        al.add("P60893");
        al.add("P60892");
        al.add("P60891");
        al.add("P60890");
        al.add("E0345");
        al.add("E0346");
        al.add("E0313");
        Collections.sort(al);
        int index = Collections.binarySearch(al, "E0346");
        System.out.println(index);
    }
}
