package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("Khwilo");
        linkedList.add("Hilary");
        linkedList.add("Noel");
        linkedList.add("Kyla");

        System.out.println("Linked list elements: " + linkedList);

        // add an element to a linked list
        linkedList.add("Kate");

        System.out.println("Linked list elements: " + linkedList);

        // add an element to a specified index
        linkedList.add(5, "Philip");
        System.out.println("\nLinked list elements after addition: ");
        Iterator i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        // add an element at the beginning
        linkedList.addFirst("FIRST");
        System.out.println("\nLinked list elements: " + linkedList);

        // add an element at the end
        linkedList.addLast("LAST");
        System.out.println("Linked list elements: " + linkedList);

        // adding an element to the front(head) of a linked list
        linkedList.offerFirst("NEW ELEMENT");
        System.out.println("\nLinked list elements: "+ linkedList);
    }
}
