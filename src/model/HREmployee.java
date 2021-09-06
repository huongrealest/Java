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
public class HREmployee extends Employee {

    private String deptName;
    private String deptCode;

    public HREmployee(String name, String no, String des, String deptName, String deptCode) {
        super(name, no, des);
        this.deptName = deptName;
        this.deptCode = deptCode;
    }

    @Override
    public String toString() {
        return super.toString() + "HREmployee{" + "deptName=" + deptName + ", deptCode=" + deptCode + '}';
    }

}
