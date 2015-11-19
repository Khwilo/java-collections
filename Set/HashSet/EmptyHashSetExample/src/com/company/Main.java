package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String >();

        hashSet.add("Element1");
        hashSet.add("Element2");
        hashSet.add("Element3");
        hashSet.add("Element4");
        hashSet.add("Element5");


        System.out.println("Before: HashSet contains: " + hashSet);

        // remove all elements
        hashSet.clear();

        System.out.println("After: HashSet contains: " + hashSet);
    }
}
