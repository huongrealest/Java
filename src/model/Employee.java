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
public class Employee {
    private String name;
    private String no;
    private String des;

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", no=" + no + ", des=" + des + '}';
    }

    public Employee(String name, String no, String des) {
        this.name = name;
        this.no = no;
        this.des = des;
    }
}
