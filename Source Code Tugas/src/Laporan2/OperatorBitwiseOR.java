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
public class OperatorBitwiseOR {
    public static void main(String args[]){
        int x, y, z; 
        x = 42; y = 30; z = 30; 
        System.out.println("Operator Bitwise - OR"); 
        System.out.println("Nilai x = " + x); 
        System.out.println("Nilai y = " + y); 
        System.out.println("Nilai z = " + z); 
        System.out.println("Hasil Operasi Bitwise: x | y = " + (x | y));  
        System.out.println("Hasil Operasi Bitwise: x | z = " + (x | z));  
        System.out.println("Hasil Operasi Bitwise: y | z = " + (y | z));
    }
}
