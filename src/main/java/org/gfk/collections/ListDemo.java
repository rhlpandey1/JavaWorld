package org.gfk.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(0,1);
        list.add(1,3);
        list.add(2,4);
        System.out.println(list);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        list.addAll(l2);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(1,3);
        System.out.println(list);
    }
}
