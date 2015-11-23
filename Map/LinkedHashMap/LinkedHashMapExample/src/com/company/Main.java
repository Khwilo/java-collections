package com.company;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    /* declare a LinkedHashMap */
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        /* adding elements to the LinkedHashMap */
        linkedHashMap.put(3, "Khwilo");
        linkedHashMap.put(1, "Laboso");
        linkedHashMap.put(21, "Otieno");
        linkedHashMap.put(45, "Victor");
        linkedHashMap.put(67, "Chelimo");
        linkedHashMap.put(12, "Chelgut");

        /* generate a set of entries */
        Set set = linkedHashMap.entrySet();

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry mapEntry = (Map.Entry)iterator.next();
            System.out.print("Key is : " + mapEntry.getKey() + " & value is : ");
            System.out.println(mapEntry.getValue());
        }

    }
}
