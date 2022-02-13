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
public class Soal3 {
    public static void main(String args[]){
        int golonganKaryawan, gajiPokok;
        double tunjangan, gajiTotal = 0;
        Scanner inputGolongan = new Scanner(System.in);
        System.out.print("Masukkan golongan ");
        golonganKaryawan = inputGolongan.nextInt();
        switch(golonganKaryawan){
            case 1: 
                gajiPokok = 1000000;
                tunjangan = 0.05;
                gajiTotal = gajiPokok + (gajiPokok * tunjangan);
            break;
            case 2: 
                gajiPokok = 1500000;
                tunjangan = 0.1;
                gajiTotal = gajiPokok + (gajiPokok * tunjangan);
            break;
            case 3: 
                gajiPokok = 2000000;
                tunjangan = 0.1;
                gajiTotal = gajiPokok + (gajiPokok * tunjangan);
            break;
            case 4: 
                gajiPokok = 2500000;
                tunjangan = 0.15;
                gajiTotal = gajiPokok + (gajiPokok * tunjangan);
            break;
            case 5: 
                gajiPokok = 3000000;
                tunjangan = 0.2;
                gajiTotal = gajiPokok + (gajiPokok * tunjangan);
            break;
        }
        System.out.println("Total gaji karyawan dengan golongan "
        +golonganKaryawan+" sebesar "+gajiTotal);
    }
}
