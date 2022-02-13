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
public class OperatorKondisional {
    public static void main(String args[]){
        int x, y, z; 
        String hasil; 
        x = 5; y = 2; z = 2; 
        hasil = "Belum Diketahui"; 
        System.out.println("Nilai Awal"); 
        System.out.println("x = " + x); 
        System.out.println("y = " + y); 
        System.out.println("z = " + z); 
        System.out.println("hasil = " + hasil); 
        System.out.println("Operator Kondisional"); 
        System.out.println("Contoh 1:"); 
        System.out.println("hasil = (x > y) ? \"Benar\" : \"Salah\"");  hasil = (x > y) ? "Benar" : "Salah"; 
        System.out.println("Nilai variabel hasil = " + hasil);  System.out.println("Contoh 2:"); 
        System.out.println("hasil = (x > z) ? \"Benar\" : \"Salah\"");  hasil = (x > z) ? "Benar" : "Salah"; 
        System.out.println("Nilai variabel hasil = " + hasil); 
    }
}
