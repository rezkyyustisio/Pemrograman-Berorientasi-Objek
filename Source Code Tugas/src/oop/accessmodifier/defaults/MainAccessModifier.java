/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.accessmodifier.defaults;

import oop.accessmodifier.AccessModifier;

/**
 *
 * @author Rezky Yustisio
 */
public class MainAccessModifier {
    public static void main(String args[]) {
        // deklarasi variabel untuk menampung
        // object dari class AccessModifier
        AccessModifier am;
        // pembuatan object dari class AccessModifier
        // yang kemudian di tampung atatu disimpan ke dalam 
        // variabel am
        am = new AccessModifier();
        System.out.println("Nilai a: " + am.a);
        // System.out.println("Nilai b: " + am.b);
        // System.out.println("Nilai c: " + am.c);
        // System.out.println("Nilai d: " + am.d);
        System.out.println("");
        am.showA();
        // am.showB();
        // am.showC();
        // am.showD();
    }
}
