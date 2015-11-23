package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    /* declare a HashMap */
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        /* adding elements to the HashMap*/
        hashMap.put(4, "Noel");
        hashMap.put(6, "Marvin");
        hashMap.put(89, "Kyla");
        hashMap.put(12, "Cristine");
        hashMap.put(2, "Charles");

        /* display the contents using iterator */
        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: " + mentry.getKey() + " value is: ");
            System.out.println(mentry.getValue());
        }


        /* get values based on key */
        String var = hashMap.get(89);
        System.out.println("\nValue at index 89 is: " + var);

        /* remove values based on key */
        hashMap.remove(6);

        System.out.println("\nMap and key values after removal: \n");
        Set set2 = hashMap.entrySet();
        Iterator iterator1 = set2.iterator();
        while (iterator1.hasNext()){
            Map.Entry mentry1 = (Map.Entry)iterator1.next();
            System.out.print("key is: " + mentry1.getKey() + " value is : ");
            System.out.println(mentry1.getValue());
        }
    }
}
