package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("Item1");
        hashSet.add("Item2");
        hashSet.add("Item3");
        hashSet.add("Item4");
        hashSet.add("Item5");

        System.out.println("HashSet contains: " + hashSet + "\n");

        // create an array
        String[] array = new String[hashSet.size()];
        hashSet.toArray(array);

        // display the array elements
        System.out.println("Array elements: ");
        for (String element : hashSet){
            System.out.println(element);
        }
    }
}
