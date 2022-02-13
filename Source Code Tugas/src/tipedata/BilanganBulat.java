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
public class BilanganBulat {

    public static void main(String args[]) {
        // Deklarasi variabel/state/atribut                        
        byte nilaiA;
        short nilaiB;
        int hargaA;
        long hargaB;
        // Inisialisasi variabel/state/atribut
        nilaiA = (byte)128;
        nilaiB = 30000;
        hargaA = 2000000000;
        hargaB = 3000000000L;
        // Menampilkan nilai dari variabel ke layar output
        System.out.println(nilaiA);
        System.out.println(nilaiB);
        System.out.println(hargaA);
        System.out.println(hargaB);
        // Casting tipe data ke variabel bertipe data yang lebih besar
        // Ukurannya ke variabel bertipe data yang lebih kecil
        // Casting tipe data
        nilaiA = (byte) nilaiB;
        // Casting tipe data secara otomatis
        nilaiB = nilaiA;
        // Menampilkan nilai dari variabel ke layar output
        System.out.println(nilaiA);
        System.out.println(nilaiB);
        System.out.println(hargaA);
        System.out.println(hargaB);
    }
}
