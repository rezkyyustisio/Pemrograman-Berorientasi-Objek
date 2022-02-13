/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.accessmodifier;

import oop.ParentClass;
/**
 *
 * @author Rezky Yustisio
 */
public class ChildClass extends ParentClass {
    public ChildClass() {
        a = 'A';
        b = 'B';
        // c = 'C';
        // d = 'D';
    }
    
    void show() {
        showA();
        showB();
        // showC();
        // showD();
    }
}
