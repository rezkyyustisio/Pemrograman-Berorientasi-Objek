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
public class OperatorLogikaOR {
    public static void main(String args[]){
        int x, y, z; 
        x = 4; y = 8; z = 9; 
        System.out.println("Nilai Awal"); 
        System.out.println("x = " + x); 
        System.out.println("y = " + y); 
        System.out.println("z = " + z); 
        System.out.println("Operasi Logika ||"); 
        System.out.println("(x==y) || (++x==z) => " + ((x==y) || (++x==z)));
        System.out.println("x = " + x);  
        System.out.println("y = " + y);  
        System.out.println("z = " + z);
        System.out.println("(x==z) || (++x==z) => " + ((x==z) || (++x==z))); 
        System.out.println("x = " + x);  
        System.out.println("y = " + y);  
        System.out.println("z = " + z);
        x = 4; y = 8; z = 9; 
        System.out.println("Nilai Awal");
        System.out.println("x = " + x);  
        System.out.println("y = " + y);  
        System.out.println("z = " + z);
        System.out.println("Operasi Logika |"); 
        System.out.println("(x==y) | (++x==z) => " + ((x==y) | (++x==z)));  
        System.out.println("x = " + x);
        System.out.println("y = " + y); 
        System.out.println("z = " + z); 
        System.out.println("(x==z) | (++x==z) => " + ((x==z) | (++x==z)));  
        System.out.println("x = " + x); 
        System.out.println("y = " + y); 
        System.out.println("z = " + z); 
    }
}
