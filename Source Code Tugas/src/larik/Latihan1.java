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
public class Latihan1 {
    public static void main(String[] args) {
        int jumlahBilanganBulat, proses;
        Scanner input = new Scanner(System.in);
        System.out.print("Input jumlah bilangan bulat: ");
        jumlahBilanganBulat = input.nextInt();
        System.out.print("Input bilangan bulat: ");
        int bilanganBulat[] = new int[jumlahBilanganBulat];
        for (int i = 0; i < jumlahBilanganBulat; i++) {
            bilanganBulat[i] = input.nextInt();
        }
        
        // menampilkan panjang elemen larik
        System.out.println("");
        System.out.println("Panjang larik: " + bilanganBulat.length);
        
        // mengurutkan bilangan bulat dari yang terkecil ke terbesar
        // menggunakan algoritma insertion sort
        for (int i = 0; i < bilanganBulat.length - 1; i++) {
            proses = i + 1;
            for (int j = i + 1; j > 0; j--) {
                if (bilanganBulat[proses] < bilanganBulat[j-1]) {
                    int temp = bilanganBulat[proses];
                    bilanganBulat[proses] = bilanganBulat[j-1];
                    bilanganBulat[j-1] = temp;
                    proses = j - 1;
                }
            }
        }
        // menampilkan bilangan yang telah terurut
        System.out.print("Hasil bilangan terurut secara ascending: ");
        for (int i = 0; i < bilanganBulat.length; i++) {
            System.out.print(bilanganBulat[i]);
            System.out.print(" ");
        }
        
        System.out.println("");
        
        // mengurutkan bilangan bulat dari yang terbesar ke terkecil
        // menggunakan algoritma insertion sort
        for (int i = 0; i < bilanganBulat.length - 1; i++) {
            proses = i + 1;
            for (int j = i + 1; j > 0; j--) {
                if (bilanganBulat[proses] > bilanganBulat[j-1]) {
                    int temp = bilanganBulat[proses];
                    bilanganBulat[proses] = bilanganBulat[j-1];
                    bilanganBulat[j-1] = temp;
                    proses = j - 1;
                }
            }
        }
        // menampilkan bilangan yang telah terurut
        System.out.print("Hasil bilangan terurut secara descending: ");
        for (int i = 0; i < bilanganBulat.length; i++) {
            System.out.print(bilanganBulat[i]);
            System.out.print(" ");
        }
        
        System.out.println("");
    }
}
