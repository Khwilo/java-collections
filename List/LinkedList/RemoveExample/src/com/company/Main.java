package com.company;

import com.sun.corba.se.impl.orbutil.ObjectWriter;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("Item1");
        linkedList.add("Item2");
        linkedList.add("Item3");
        linkedList.add("Item4");
        linkedList.add("Item5");

        System.out.println("The items are: ");
        for (String str : linkedList){
            System.out.println(str);
        }

        // removing first element
        Object firstElement = linkedList.removeFirst();
        System.out.println("\nThe element removed: " + firstElement);

        // remove last element
        Object lastElement = linkedList.removeLast();
        System.out.println("The element removed: " + lastElement);

        System.out.println("Linked list after remove: ");
        for (String str2 : linkedList){
            System.out.println(str2);
        }
    }
}
