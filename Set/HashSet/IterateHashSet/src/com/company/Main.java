package com.company;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("Khwilo");
        hashSet.add("Harvey");
        hashSet.add("Bumba");
        hashSet.add("Dejango");
        hashSet.add("Blacky");

        // iterate using iterator
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        // iterate using for loop
        for (String item : hashSet){
            System.out.println(item);
        }
    }
}
