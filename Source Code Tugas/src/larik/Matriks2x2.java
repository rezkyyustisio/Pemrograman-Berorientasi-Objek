/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package larik;

/**
 *
 * @author Rezky Yustisio
 */
public class Matriks2x2 {
    public static void main(String[] args) {
        int[][] matriks2x3 = new int[2][3];
        // mengisi elemen matriks
        matriks2x3[0][0] = 3;
        matriks2x3[0][1] = 2;
        matriks2x3[0][2] = 5;
        matriks2x3[1][0] = 0;
        matriks2x3[1][1] = 4;
        matriks2x3[1][2] = 8;
        // menampilkan atau mencetak elemen matriks ke layar console
        System.out.println("Matriks 2x3");
        System.out.print("| " + matriks2x3[0][0]);
        System.out.print(" " + matriks2x3[0][1]);
        System.out.println(" " + matriks2x3[0][2] + " |");
        System.out.print("| " + matriks2x3[1][0]);
        System.out.print(" " + matriks2x3[1][1]);
        System.out.println(" " + matriks2x3[1][2] + " |");
        // menampilkan elemen larik
        System.out.println("Matriks[0][0]: " + matriks2x3[0][0]);
        System.out.println("Matriks[0][1]: " + matriks2x3[0][1]);
        System.out.println("Matriks[0][2]: " + matriks2x3[0][2]);
        System.out.println("Matriks[1][0]: " + matriks2x3[1][0]);
        System.out.println("Matriks[1][1]: " + matriks2x3[1][1]);
        System.out.println("Matriks[1][2]: " + matriks2x3[1][2]);
    }
}
