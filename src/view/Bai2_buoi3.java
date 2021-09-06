/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.StudentList;
import model.Student;

/**
 *
 * @author Realest
 */
public class Bai2_buoi3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentList<Student> objStudent = new StudentList<Student>();
        objStudent.add(new Student("Pham Xuan Minh", "123", "Class1", 22));
        objStudent.add(new Student("Duong Mai Huong", "124", "class2", 20));
        objStudent.add(new Student("Tran Minh Tuan", "125", "Class1", 19));
        System.out.println(
                "Is the list empty?" + objStudent.checkEmpty());
        System.out.println(
                "Size of the list:" + objStudent.getSize());
        System.out.println("Student Details:");
        System.out.println("** *******");
        objStudent.display();
        System.out.println("\nFirst Record in the list: \n" + objStudent.grab());
    }

}
