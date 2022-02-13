/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;
import java.util.Scanner;
/**
 *
 * @author Rezky Yustisio
 */
public class Soal1 {
    public static void main(String args[]){
        String namaKaryawan;
        int gajiKaryawan, pkp;
        double potongPajak, pajakKaryawan, totalGajiKaryawan;
        System.out.println("Masukkan gaji bersih karyawan ");
        Scanner inputGaji = new Scanner(System.in);
        gajiKaryawan = inputGaji.nextInt();
        if (gajiKaryawan <= 1000000){
            // Kategori PTKP
            System.out.println("Anda tidak wajib membayar pajak");
        } else if (gajiKaryawan > 1000000){
            // Kategori PKP
            pkp = gajiKaryawan - 100000;
            potongPajak = 0.1;
            pajakKaryawan = gajiKaryawan * potongPajak;
            System.out.println("Pajak yang harus di bayar sebesar "+pajakKaryawan);
            totalGajiKaryawan = gajiKaryawan - pajakKaryawan;
            System.out.println("Total gaji karyawan sebesar "+totalGajiKaryawan);
        }
    }
}
