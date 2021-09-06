/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import model.Box;
import model.classC;
import model.classB;

/**
 *
 * @author Realest
 */
public class BaiTapGeneric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box<classC> myBox  = new Box<classC>();
        myBox.set(new classC());
        classB b = myBox.get();
        System.out.println(b);

    }

}
