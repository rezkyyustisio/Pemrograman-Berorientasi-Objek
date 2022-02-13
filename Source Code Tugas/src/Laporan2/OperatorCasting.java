/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laporan2;

/**
 *
 * @author Rezky Yustisio
 */
public class OperatorCasting {
    public static void main(String args[]){
        int x = 20; 
        int y = 121; 
        int a = 2; 
        System.out.println("Nilai Awal"); 
        System.out.println("Nilai x (bertipe int)  = " + x);  
        System.out.println("Nilai y (bertipe int)  = " + y);  
        System.out.println("Nilai a (bertipe byte) = " + a);  
        System.out.println("Operator Casting Tipe Data");  
        System.out.println("Contoh 1:"); 
        System.out.println("a = (byte) x"); 
        a = x;
        System.out.println("Nilai a = " + a); 
        System.out.println("Contoh 2:"); 
        System.out.println("a = (byte) y"); 
        a = y; 
        System.out.println("Nilai a = " + a); 
    }
}
