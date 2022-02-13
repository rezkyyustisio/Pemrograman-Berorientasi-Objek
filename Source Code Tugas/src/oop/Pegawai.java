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
public class Pegawai extends Manusia {
    String nip = "9824501245";
    String jabatan = "Direktur";
    int gaji = 10000000;
    String bidang = "Akademik";
    
    public static void main(String args[]) {
        Pegawai pgw = new Pegawai();
        System.out.println("Nama: " + pgw.nama);
        System.out.println("NIP: " + pgw.nip);
        System.out.println("Jabatan: " + pgw.jabatan);
        System.out.println("Gaji: " + pgw.gaji);
        System.out.println("Bidang: " + pgw.bidang);
        pgw.berjalan();
        pgw.berlari();
        pgw.kerja();
    } 
    
    void kerja() {
        System.out.println(nama + " kerja");
    }
}
