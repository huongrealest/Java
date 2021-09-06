/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Realest
 */
public class bai5 {
    
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        int num1 = 11, num2 = 22, num3 = 33, num4 = 44;
        int size;
        Iterator iterator;
        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.add(num4);
        size = list.size();
        System.out.println("Linked list data :");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
        
        if (list.isEmpty()) {
            System.out.println("Trống");
        } else {
            System.out.println("Size: " + size);
        }
        System.out.println("Đang thêm 55 vào vị trí đầu tiên");
        list.addFirst(55);
        System.out.println("Giờ list chứa : ");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Đang thêm 66 vào vị trí cuối");
        list.addLast(66);
        System.out.println("Giờ list chứa : ");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Size : " + list.size());
        System.out.println("Đang thêm 99 vào vị trí thứ 3");
        list.add(2, 99);
        System.out.println("Giờ list chứa : ");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Size : " + list.size());
        System.out.println("dữ liệu đầu tiên : " + list.getFirst());
        System.out.println("dữ liệu cuối cùng : " + list.getLast());
        System.out.println("Dữ liệu ở vị trí thứ 4: " + list.get(3));
        int first = list.removeFirst();
        System.out.println("Dữ liệu đã xoá ở vị trí thứ 1 : " + first);
        System.out.println("Giờ list chứa : ");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
        int last = list.removeLast();
        System.out.println("Dữ liệu đã xoá ở vị trí cuối cùng : " + last);
        System.out.println("Giờ list chứa : ");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Size : " + list.size());
        int second = list.remove(1);
        System.out.println("Dữ liệu đã xoá ở vị trí thứ 2 : " + second);
        iterator = list.iterator();
        System.out.println("Giờ list chứa : ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Size : " + list.size());
        
        list.clear();
        if (list.isEmpty()) {
            System.out.println("Trống");
        } else {
            System.out.println("Size: " + size);
        }
    }
}
