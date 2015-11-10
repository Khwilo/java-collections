package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
    	/* Linked List Declaration */
        LinkedList<String> linkedList = new LinkedList<String>();

        /* declare an array list used to specify how to
        * add a collection to a linked list */
        ArrayList<String> arrayList = new ArrayList<String>();

        /* add elements to the linked list */
        linkedList.add("Item1");
        linkedList.add("Item2");
        linkedList.add("Item3");
        linkedList.add("Item4");
        linkedList.add("Item5");

        /* Display the contents of the linked list */
        System.out.println("Linked List contents : " + linkedList);

        /* add first and last element */
        linkedList.addFirst("First Item");
        linkedList.addLast("Last Item");
        System.out.println("Linked List contents after addition: " + linkedList);

        /* How to get and set values */
        Object firstVar = linkedList.get(0);
        System.out.println("First element is : " + firstVar);
        linkedList.set(0, "Changed first item");
        Object firstVar2 = linkedList.get(0);
        System.out.println("First element after update by set method: " + firstVar2);

        /* Remove first and last element */
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Linked list after deletion of first and last element: " + linkedList);

        /* Add to a position and remove from a position */
        linkedList.add(0, "Newly added item");
        linkedList.remove(2);
        System.out.println("Final content: " + linkedList);

        /* Add a collection to a linked list */
        arrayList.add("String1");
        arrayList.add("String2");
        linkedList.addAll(arrayList);

        System.out.println("Linked list after adding the array list collection to it: " + linkedList);

        /* Add all elements of the array list from a given index int the linked list */
        linkedList.addAll(4, arrayList);
        System.out.println("Add array list from a given index in the linked list : " + linkedList);

        /* Return a copy of the list */
        Object str = linkedList.clone();
        System.out.println("The copy of the linked list  is: " + str);

        /* Check whether the given item is in the list or not */
        boolean var = linkedList.contains("Item7");
        System.out.println("Does the linked list contain Item7 ? " + var);

        /* get first and last items*/
        Object varFirst = linkedList.getFirst();
        System.out.println("The first element is: " + varFirst);
        Object varLast = linkedList.getLast();
        System.out.println("The last element is: " + varLast);

        /* Position of elements*/
        int pos1 = linkedList.indexOf("Item3");
        System.out.println("Item3 is at index: " + pos1);
        int pos2 = linkedList.lastIndexOf("String1");
        System.out.println("The last occurrence of String1 is at index: " + pos2);

        /* Returning and removing the items in a list */
        Object o1 = linkedList.poll();
        System.out.println("First call after poll: " + o1);
        System.out.println("The linked list is now: " + linkedList);

        /* The same as o1 above */
        Object o2 = linkedList.pollFirst();
        System.out.println("Second call after poll: " + o2);
        System.out.println("The linked list is now: " + linkedList);

        /* Removing the first element in the list */
        linkedList.remove();
        System.out.println("The linked list is now: " + linkedList);

        /* Removing an element based on its occurence */
        linkedList.removeFirstOccurrence("String2");
        System.out.println("After removing the first occurrence of String2 the linked list becomes: " + linkedList);
        linkedList.removeLastOccurrence("String1");
        System.out.println("After removing the first occurrence of String1 the linked list becomes: " + linkedList);

        /* Determining the size of the linked list */
        int size = linkedList.size();
        System.out.println("The size of the linked list is: " + size);

        /* Removing all elements of the linked list */
        linkedList.clear();
        System.out.println("The linked list is now: " + linkedList);
    }
}
