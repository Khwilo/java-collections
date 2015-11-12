package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("Cobol");
        linkedList.add("Java");
        linkedList.add("C++");
        linkedList.add("Ruby");
        linkedList.add("C#");

        System.out.println("Linked list elements:");
        for (String string1 : linkedList){
            System.out.println(string1);
        }

        // Removing fourth element
        Object o1 = linkedList.remove(3);
        System.out.println("\nElement " + o1 + " was removed from the list\n");

        System.out.println("Linked list elements after removal: ");
        for (String string2 : linkedList){
            System.out.println(string2);
        }
    }
}
