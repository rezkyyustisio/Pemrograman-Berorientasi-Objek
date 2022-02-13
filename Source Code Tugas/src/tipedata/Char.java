/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipedata;

/**
 *
 * @author Rezky Yustisio
 */
public class Char {
    public static void main(String args[]) {
        // deklrasi variabel
        // char karakter, nilaiHuruf
        char karakter, nilaiHuruf;
        byte angka;
        // insialisasi variabel
        karakter = 'Z';
        nilaiHuruf = 'A';
        angka = (byte) karakter;
        // menampilkan nilai variabel ke layar output
        System.out.println(karakter);
        System.out.println(nilaiHuruf);
        System.out.println(angka);
        // modifikasi nilai variabel
        karakter = '1';
        nilaiHuruf = 'B';
        // casting tipe data
        karakter = (char) angka;
        // menampilkan nilai variabel ke layar output
        System.out.println(karakter);
        System.out.println(nilaiHuruf);
        System.out.println(angka);
    }
}
