/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.accessmodifier;

/**
 *
 * @author Rezky Yustisio
 */
public class AccessModifier {
    // deklarasi variables atau attributes
    public char a = 'a'; // access modifier: public
    protected char b = 'b'; // access modifier: protected
    private char c = 'c'; // access modifier: private
    char d = 'd'; // access modifier: default
    
    // deklarasi methods
    public void showA(){
        System.out.println("Nilai a: " + a);
    }
    
    protected void showB(){
        System.out.println("Nilai b: " + b);
    }
    
    private void showC(){
        System.out.println("Nilai c: " + c);
    }
    
    void showD(){
        System.out.println("Nilai d: " + d);
    }
}
