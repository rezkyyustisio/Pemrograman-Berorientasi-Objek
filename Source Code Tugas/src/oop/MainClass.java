/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;
// Instance Member
/**
 *
 * @author Rezky Yustisio
 */
public class MainClass {
    // method main
    public static void main(String args[]) {
        Manusia orang1; // deklarasi
        orang1 = new Manusia("Budi", 22, 168, 65); // pembuatan obyek
        orang1.berjalan();
        orang1.berlari();
        orang1.makan();
        orang1.minum();
        orang1.kecepatanBerlari();
        System.out.println("Nama: " + orang1.nama);
        System.out.println("Umur: " + orang1.umur);
        System.out.println("Tinggi Badan: " + orang1.tinggiBadan);
        System.out.println("Berat Badan: " + orang1.beratBadan);
        System.out.println("");
        
        Manusia orang2;
        orang2 = new Manusia("Cika", 23, 170, 70);
        orang2.berjalan();
        orang2.berlari();
        orang2.makan();
        orang2.minum();
        orang2.kecepatanBerlari();
        System.out.println("Nama: " + orang2.nama);
        System.out.println("Umur: " + orang2.umur);
        System.out.println("Tinggi Badan: " + orang2.tinggiBadan);
        System.out.println("Berat Badan: " + orang2.beratBadan);
        System.out.println("");
        
        Manusia orang3;
        orang3 = new Manusia("Rezky", 19, 165, 65);
        orang3.berjalan();
        orang3.berlari();
        orang3.makan();
        orang3.minum();
        System.out.println("Nama: " + orang3.nama);
        System.out.println("Umur: " + orang3.umur);
        System.out.println("Tinggi Badan: " + orang3.tinggiBadan);
        System.out.println("Berat Badan: " + orang3.beratBadan);
        System.out.println("");
        
        Manusia orang4;
        orang4 = new Manusia("Ali");
        orang4.berjalan();
        orang4.berlari();
        orang4.makan();
        orang4.minum();
        System.out.println("Nama: " + orang4.nama);
        System.out.println("Umur: " + orang4.umur);
        System.out.println("Tinggi Badan: " + orang4.tinggiBadan);
        System.out.println("Berat Badan: " + orang4.beratBadan);
    }
}
