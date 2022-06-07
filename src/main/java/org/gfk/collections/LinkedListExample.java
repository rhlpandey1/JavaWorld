package org.gfk.collections;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        // Instantiate LinkedList named strLinkedList
        LinkedList<String> strLinkedList = new LinkedList<String>();

        // Add elements to the LinkedList using add()
        strLinkedList.add("This");
        strLinkedList.add("is");
        strLinkedList.add("a");
        strLinkedList.add("LinkedList");

        // The elements are retrieved using the get() method
        System.out.println("The contents of strLinkedList : ");
        for(int i = 0; i < strLinkedList.size(); i++)
        {
            System.out.print(strLinkedList.get(i) + " ");
        }

        // The elements are removed using remove()
        strLinkedList.remove(0);
        strLinkedList.remove(1);

        System.out.println("\n\nThe contents of strLinkedList after remove operation : ");
        for(int i = 0; i < strLinkedList.size(); i++)
        {
            System.out.print(strLinkedList.get(i) + " ");
        }

    }

}