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
public class Latihan4 {
    public static void main(String[] args) {
        int total;
        int hasil[][] = new int[2][2];
        Scanner input = new Scanner(System.in);
        
        // menginputkan nilai-nilai matriks A
        int matriksA[][] = new int[2][2];
        System.out.println("Input nilai matriks A");
        // mengisi elemen matriks A
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[0].length; j++) {
                System.out.print("Matriks[" + i + "][" + j + "]: ");
                matriksA[i][j] = input.nextInt();
            }
        }
        System.out.println("");
        
        // menginputkan nilai-nilai matriks B
        int matriksB[][] = new int[2][2];
        System.out.println("Input nilai matriks B");
        for (int i = 0; i < matriksB.length; i++) {
            for (int j = 0; j < matriksB[0].length; j++) {
                System.out.print("Matriks[" + i + "][" + j + "]: ");
                matriksB[i][j] = input.nextInt();
            }
        }
        System.out.println("");
        
        // menampilkan elemen matriks A
        System.out.println("Matriks A");
        for (int i = 0; i < matriksA.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriksA[0].length; j++) {
                System.out.print(" " + matriksA[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("");
        
        // menampilkan elemen matriks B
        System.out.println("Matriks B");
        for (int i = 0; i < matriksB.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriksB[0].length; j++) {
                System.out.print(" " + matriksB[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("");
        
        // proses perkalian matriks A dan matriks B
        for (int baris_mat = 0; baris_mat < matriksA.length; baris_mat++) {
            for (int kolom_mat = 0; kolom_mat < matriksA[baris_mat].length; kolom_mat++) {
                total = 0;
                for (int indeks_mat = 0; indeks_mat < matriksA[baris_mat].length; indeks_mat++) {
                    total += matriksA[baris_mat][indeks_mat] * matriksB[indeks_mat][kolom_mat];
                    hasil[baris_mat][kolom_mat] = total;
                }
            }
        }
        
        // menampilkan hasil perkalian matriks A dan matriks B
        System.out.println("Hasil Perkalian matriks A dan matriks B");
        for (int a = 0; a < hasil.length; a++) {
            System.out.print("|");
            for (int b = 0; b < hasil[a].length; b++) {
                System.out.print(" " + hasil[a][b] + " ");
            }
            System.out.println("|");
        }
        
        input.close();
    }
}
