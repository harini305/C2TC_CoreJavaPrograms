package com.tnsif.listsampleprogram;
import java.util.ArrayList;
import java.util.List;
public class ListAssignment {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(10);
        list.add("Hello");
        list.add(25.5);
        list.add(20);
        list.add(10);
        System.out.println("List elements: " + list);

        Object obj = list.get(1);
        System.out.println("Element at index 1: " + obj);

        list.remove(0);
        System.out.println("After removal: " + list);

        System.out.println("Size of list: " + list.size());
    }
}
