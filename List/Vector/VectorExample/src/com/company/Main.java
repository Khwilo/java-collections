package com.company;

import javafx.beans.binding.ObjectExpression;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Main {

    /* Vector is used in thread safe environments as it is synchronized
    * unlike ArrayList which is used in non-thread safe environments as it is non-synchronized
    * */
    public static void main(String[] args) {
	    /* Vector of initial capacity of 2 */
        Vector<String> vector = new Vector<String>(2);

        /* Array list */
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Vegetable1");
        arrayList.add("Vegetable3");

        /* Adding elements to a vector */
        vector.addElement("Apple");
        vector.addElement("Orange");
        vector.addElement("Fig");
        vector.addElement("Mango");

        /* Check the size and capacity increment */
        System.out.println("Size is: " + vector.size());
        System.out.println("Default capacity increment is: " + vector.capacity());

        /* Add more elements */
        vector.addElement("Fruit1");
        vector.addElement("Fruit2");
        vector.addElement("Fruit3");

        /* Size and capacity increment after insertion */
        System.out.println("New size after insertions: " + vector.size());
        System.out.println("Capacity increment after insertions: " + vector.capacity());

        /* Display vector elements */
        Enumeration enumeration = vector.elements();
        System.out.println("\nElements are: ");
        while (enumeration.hasMoreElements()){
            System.out.print(enumeration.nextElement() + " ");
        }

        System.out.println();

        /* Check whether a particular element is present */
        Boolean isPresent = vector.contains("Mango");
        System.out.println("\nIs mango present in the vector ? " + isPresent);

        /* Add the array list to the vector */
        vector.addAll(arrayList);
        System.out.println("\nElements in the vector are: ");
        for (int i = 0; i < vector.size(); i++){
            System.out.println(vector.get(i));
        }

        /* Determine if all elements are present in the vector */
        Boolean contains = vector.containsAll(arrayList);
        System.out.println("\nAre all the array list items present in the vector? " + contains);

        /* Return an element present at a specified location */
        Object location = vector.elementAt(3);
        System.out.println("The element at index 3 is : " + location);

        /* getting the first and last elements */
        Object first = vector.firstElement();
        System.out.println("The first element is : " + first);
        Object last = vector.lastElement();
        System.out.println("The last element is : " + last);

        /* return the element at the specified index */
        Object index = vector.get(5);
        System.out.println("The element at index 5 is : " + index);

        /* To check whether the vector does not contain any element */
        Boolean empty = vector.isEmpty();
        System.out.println("Is the vector empty? " + empty);

        System.out.println();
        /* Remove an element from the vector */
        Boolean remove = vector.removeElement("Fruit2");
        for (int j = 0; j < vector.size(); j++){
            System.out.println("The elements of the vector are now: " + vector.get(j));
        }

        /* Remove all elements in the vector present in the collection */
        Boolean removeAll = vector.removeAll(arrayList);
        System.out.println("\nThe elements of the vector are now: ");
        for (int k = 0; k < vector.size(); k++){
            System.out.println(vector.get(k));
        }

        /* Updating an element at a specified location */
        vector.setElementAt("Avocado", 4);
        System.out.println("\nAfter updating the elements are now: ");
        for (int l = 0; l < vector.size(); l++){
            System.out.println(vector.get(l));
        }

        /* Set the size of the vector */
        vector.setSize(128);
        System.out.println("\nThe size of the vector is now: " + vector.size());
    }
}
