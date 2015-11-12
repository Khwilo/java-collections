package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("AA");
        linkedList.add("BB");
        linkedList.add("CC");
        linkedList.add("DD");

        System.out.println("Before appending: " + linkedList);

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Item1");
        arrayList.add("Item2");
        arrayList.add("Item3");

        // append the array list elements to the linked list
        linkedList.addAll(arrayList);

        System.out.println("After appending: " + linkedList);
    }
}
