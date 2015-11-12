package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	    // declare the linked list
        LinkedList<String> linkedList = new LinkedList<String>();

        // add items
        linkedList.add("Mango");
        linkedList.add("Orange");
        linkedList.add("Avocado");

        System.out.println("\n***Simple for loop***");
        for(int num = 0; num < linkedList.size(); num++){
            System.out.println(linkedList.get(num));
        }

        System.out.println("\n***Advanced for loop***");
        for(String str : linkedList){
            System.out.println(str);
        }

        System.out.println("\n***Iterator***");
        Iterator i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("\n***While loop***");
        int num = 0;
        while (linkedList.size() > num){
            System.out.println(linkedList.get(num));
            num++;
        }

    }
}
