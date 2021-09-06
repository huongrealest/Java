/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;

/**
 *
 * @author Realest
 */
public class StudentList<T> {

    ArrayList<T> listStudent;

    public StudentList() {
        listStudent = new ArrayList<T>();
    }

    public void add(T obj) {
        listStudent.add(obj);
    }

    public void display() {
        for (T objStudent : listStudent) {
            System.out.println(objStudent.toString());
        }
    }

    public int getSize() {
        return listStudent.size();
    }

    public boolean checkEmpty() {
        return (listStudent.size() == 0);
    }

    public T grab() {
        if (!checkEmpty()) {
            return listStudent.remove(0);
        } else {
            return null;
        }
    }
}
