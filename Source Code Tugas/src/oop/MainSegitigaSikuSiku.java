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
public class MainSegitigaSikuSiku {
    public static void main(String[] args){
        SegitigaSikuSiku sk;
        sk = new SegitigaSikuSiku(5, 8);
        System.out.println("OBJEK SEGITIGA SIKU SIKU");
        System.out.println("Alas: " + sk.getAlas());
        System.out.println("Tinggi: " + sk.getTinggi());
        System.out.println("Luas: " + sk.getLuas());
    }
}
