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
public class OperatorSHIFT {
    public static void main(String args[]){
        int x, y, z; 
        x = 7; y = 3; z = 1; 
        System.out.println("Operator SHIFT"); 
        System.out.println("Nilai Awal"); 
        System.out.println("Nilai x = " + x); 
        System.out.println("Nilai y = " + y); 
        System.out.println("Nilai z = " + z);
        System.out.println("Hasil Operasi Right Shift: x >> 1 = " + (x >> 1)); 
        System.out.println("Hasil Operasi Left Shift: y << 1 = " + (y << 1)); 
        System.out.println("Hasil Operasi Unsigned Right Shift: z >>> 30 = " + (z >>> 30));
    }
}
