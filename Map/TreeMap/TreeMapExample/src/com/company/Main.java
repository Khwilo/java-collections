package com.company;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        /* declaring a TreeMap */
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        /* adding elements to a TreeMap */
        treeMap.put(1, "Cornell");
        treeMap.put(12, "Nairobi");
        treeMap.put(4, "Lagos");
        treeMap.put(73, "Casablanca");
        treeMap.put(55, "Pretoria");

        /* display the contents of the TreeMap */
        Set set = treeMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("Key is: " + mentry.getKey() + " & value is: ");
            System.out.println(mentry.getValue());
        }

    }
}
