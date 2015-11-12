package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("Item1");
        linkedList.add("Item2");
        linkedList.add("Item3");
        linkedList.add("Item4");
        linkedList.add("Item5");

        System.out.println("Before clear(): ");
        for (String str1 : linkedList){
            System.out.println(str1);
        }

        linkedList.clear();

        System.out.println("\nAfter clear(): ");
        for (String str2 : linkedList){
            System.out.println(str2);
        }

    }
}
