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
public class Mahasiswa extends Manusia {
    String nim = "3201816021";
    float ipk = 3.74F;
    String prodi = "Teknik Informatika";
    String jurusan = "Teknik Elektro";
    String perguruanTinggi = "Politeknik Negeri Pontianak";
    String pembimbingAkademik = "Irawan";
    
    public static void main(String args[]) {
        Mahasiswa mhs = new Mahasiswa();
        System.out.println("Nama: " + mhs.nama);
        System.out.println("NIM: " + mhs.nim);
        System.out.println("IPK: " + mhs.ipk);
        System.out.println("Prodi: " + mhs.prodi);
        System.out.println("Jurusan: " + mhs.jurusan);
        System.out.println("Perguruan Tinggi: " + mhs.perguruanTinggi);
        System.out.println("Pembimbing Akademik: " + mhs.pembimbingAkademik);
        mhs.kuliah();
    } 
    
    void kuliah() {
        System.out.println(nama + " kuliah");
    }
}
