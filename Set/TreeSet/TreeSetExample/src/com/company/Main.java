package com.company;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	    // TreeSet of String type
        TreeSet<String> treeSet1 = new TreeSet<String>();

        // adding elements to the TreeSet
        treeSet1.add("ABC");
        treeSet1.add("vile");
        treeSet1.add("Testing");
        treeSet1.add("Verbose");
        treeSet1.add("Ink");
        treeSet1.add("Pen");

        // displaying TreeSet
        System.out.println("The TreeSet contains the following items: " + treeSet1 );


        // TreeSet of integer type
        TreeSet<Integer> treeSet2 = new TreeSet<Integer>();

        treeSet2.add(908);
        treeSet2.add(342);
        treeSet2.add(12);
        treeSet2.add(86);
        treeSet2.add(67);

        System.out.println("The TreeSet now contains: " + treeSet2);
    }
}
