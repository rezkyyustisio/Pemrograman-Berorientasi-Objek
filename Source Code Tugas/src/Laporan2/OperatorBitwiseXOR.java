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
public class OperatorBitwiseXOR {
    public static void main(String args[]){
        int x, y, z; 
        x = 2; y = 9; z = 4; 
        System.out.println("Operator Bitwise - XOR"); 
        System.out.println("Nilai x = " + x); 
        System.out.println("Nilai y = " + y); 
        System.out.println("Nilai z = " + z); 
        System.out.println("Hasil Operasi Bitwise: x ^ y = " + (x ^ y));  
        System.out.println("Hasil Operasi Bitwise: x ^ z = " + (x ^ z));  
        System.out.println("Hasil Operasi Bitwise: y ^ z = " + (y ^ z));
    }
}
