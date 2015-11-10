package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    // make the ArrayList to be of type String
        ArrayList<String> obj = new ArrayList<String>();

        // Adding elements to the ArrayList
        obj.add("Khwilo");
        obj.add("Dishon");
        obj.add("Frank");
        obj.add("Noel");
        obj.add("Joy");
        obj.add("Loraine");

        // displaying the elements
        System.out.println("Currently the array list has the following elements: " + obj);

        // add elements to the given index
        obj.add(0, "Grace");
        obj.add(1, "Wambo");

        // remove elements from the array list
        obj.remove("Dishon");
        obj.remove("Joy");

        System.out.println("Current array list is: " + obj);

        // remove an element from the given index
        obj.remove(1);

        System.out.println("Current array list is: " + obj);

        // updating an item in array list
        obj.set(1, "Watai");

        System.out.println("Current array list is: " + obj);

        // finding the index (position) of an object
        int pos  = obj.indexOf("Noel");

        System.out.println("Noel is at index: " + pos);

        // returning the object of the list present at the specified index
        // the return value is a string variable since our array list of type String
        String str = obj.get(4);

        System.out.println("The object at index four is: " + str);

        // determining the size of the array list
        int numberOfItems = obj.size();

        System.out.println("The size of the array list is: " + numberOfItems);

        // determining if a given element is present in the array list
        Boolean present = obj.contains("Frank");

        System.out.println("Is Frank present in the array list? " + present );

        // Removing elements in the array list in one go
        // obj.clear();

    }
}
