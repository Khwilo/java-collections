package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	    // HashSet declaration
        HashSet<String> hashSet = new HashSet<String>();

        // adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Mango");
        hashSet.add("Avocado");
        hashSet.add("Grapes");

        // addition of duplicate elements
        hashSet.add("Orange");
        hashSet.add("Avocado");

        // addition of null values
        hashSet.add(null);
        hashSet.add(null);

        System.out.println(hashSet);
    }
}
