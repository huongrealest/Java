/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Realest
 */
public class Student {
    String name;
    String id;
    String description;
    int age;

    public Student(String name, String id, String description, int age) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", description=" + description + ", age=" + age + '}';
    }
}
