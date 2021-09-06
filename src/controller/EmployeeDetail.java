/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Collection;
import model.Employee;

/**
 *
 * @author Realest
 */
public class EmployeeDetail {

    public EmployeeDetail() {
    }

    public void printCollection(Collection<?> collect) {
        for (Object obj : collect) {
            System.out.println(obj.toString());
        }
    }

    public void printDerivedCollection(Collection<? extends Employee> collection) {
        for (Object obj : collection) {
            System.out.println(obj.toString());
        }
    }
}
