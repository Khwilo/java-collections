package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("Element1");
        hashSet.add("Element2");
        hashSet.add("Element3");
        hashSet.add("Element4");
        hashSet.add("Element5");

        System.out.println("Contents of the HashSet include: " + hashSet);

        // create a List of HashSet elements
        List<String> list = new ArrayList<String>(hashSet);

        // displaying array list elements
        System.out.println("The ArrayList contains: " + list);
    }
}
