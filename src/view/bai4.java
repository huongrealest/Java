/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.EmployeeDetail;
import java.util.ArrayList;
import model.Employee;
import model.HREmployee;

/**
 *
 * @author Realest
 */
public class bai4 {

    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<Employee>(1);
        System.out.println("Employee Class Details: ");
        System.out.println("*************");
        emp.add(0, new Employee("Raphael John", "A001", "Team Lead"));
        emp.add(1, new Employee("Jenny Samuel", "A002", "Project Manager"));
        EmployeeDetail empObj = new EmployeeDetail();
        empObj.printCollection(emp);
//        System.out.print(emp);
        ArrayList<HREmployee> empHR = new ArrayList<HREmployee>(1);
        System.out.println("\nHREmployee Class Details: ");
        System.out.println("**********");
        empHR.add(0, new HREmployee("Angelina John", "A001", "Project Manager", "Operations", "01"));
        empHR.add(1, new HREmployee("Susan Pitt", "2002", "Team Leader",
                "Writing", "02"));
//        System.out.print(empHR);
        empObj.printCollection(empHR);
    }
}
