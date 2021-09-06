/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.classB;

/**
 *
 * @author Realest
 */
public class Box<T extends classB> {

    private T t;

    public Box(T t) {
        this.t = t;
    }

    public Box() {
        t = null;
    }

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
