/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;

/**
 *
 * @author Realest
 */
public class bai3 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apples");
        list.add("bananas");
        list.add("grapes");
        list.add("pears");
        list.add("black plums");
        System.out.println("My array list currently includes:" + list);
        list.add(0, "watermelons");
        System.out.println("My array list now includes:" + list);
        list.add(3, "oranges");
        System.out.println("My array list now includes: " + list);
        System.out.println("grapes is an element in the list: " + list.contains("grapes"));
        System.out.println("'apricots' is an element in the list:" + list.contains("apricots"));
        System.out.println("Element at index 2 is:"
                + list.get(2));
        System.out.println( "Element at index 1 is:" + list.get(1));
        System.out.println("The array list is currently empty:" + list.isEmpty());
        System.out.println("size : " + list.size());
        list.clear();
        System.out.println("empty ? :" + list.isEmpty());
    }
}