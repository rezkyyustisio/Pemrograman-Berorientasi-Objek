/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Rezky Yustisio
 */
public class ParentClass {
    public char a = 'a';
    protected char b = 'b';
    private char c = 'c';
    char d = 'd';
    
    public void showA(){
        System.out.println("Show A");
    }
    
    protected void showB(){
        System.out.println("Show B");
    }
    
    private void showC(){
        System.out.println("Show C");
    }
    
    void showD(){
        System.out.println("Show D");
    }
}
