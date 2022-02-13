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
public class Matriks2x2For {
    public static void main(String[] args) {
        byte jumlahBaris, jumlahKolom;
        Scanner input = new Scanner(System.in);
        // mengisi jumlah baris dan kolom matriks
        System.out.print("Input jumlah baris matriks: ");
        jumlahBaris = input.nextByte();
        System.out.print("Input jumlah kolom matriks: ");
        jumlahKolom = input.nextByte();
        int[][] matriks = new int[jumlahBaris][jumlahKolom];
        // mengisi elemen matriks
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                System.out.print("Matriks[" + i + "][" + j + "]: ");
                matriks[i][j] = input.nextInt();
            }
        }
        // menampilkan atau mencetak elemen matriks ke layar console
        System.out.println("Matriks " + jumlahBaris + "x" + jumlahKolom);
        for (int i = 0; i < matriks.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriks[0].length; j++) {
                System.out.print(" " + matriks[i][j] + " ");
            }
            System.out.println("|");
        }
        
        input.close();
    }
}
