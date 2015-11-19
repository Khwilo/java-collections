package com.company;

import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
	    // LinkedHashSet maintains the insertion order
        // Elements get sorted in the same sequence they were added to the Set

        LinkedHashSet<String> l_HashSet1 = new LinkedHashSet<String>();

        l_HashSet1.add("Z");
        l_HashSet1.add("PQ");
        l_HashSet1.add("N");
        l_HashSet1.add("O");
        l_HashSet1.add("KK");
        l_HashSet1.add("FGH");

        System.out.println("The LinkedHashSet of Strings contains the following items: " + l_HashSet1);

        LinkedHashSet<Integer> l_HashSet2 = new LinkedHashSet<Integer>();

        l_HashSet2.add(89);
        l_HashSet2.add(52);
        l_HashSet2.add(32);
        l_HashSet2.add(100);
        l_HashSet2.add(66);

        System.out.println("The LinkedHashSet of Integers contains the following items: " + l_HashSet2);

    }
}
