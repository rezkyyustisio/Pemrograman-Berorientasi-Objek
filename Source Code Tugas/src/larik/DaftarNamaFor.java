/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package larik;
import java.util.Scanner;
/**
 *
 * @author Rezky Yustisio
 */
public class DaftarNamaFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte jumlahNama;
        System.out.print("Input jumlah nama: ");
        jumlahNama = input.nextByte();
        String[] nama = new String[jumlahNama];
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Input Nama Ke-" + (i+1) + ": ");
            nama[i] = input.next();
        }
        System.out.println("Daftar Nama Mahasiswa: ");
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Nama Ke-" + (i+1) + ": " + nama[i]);
        }
        input.close();
    }
}
